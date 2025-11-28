package structural.composite.exemplo03_use_cabeca.classes;

import java.util.Iterator;
import java.util.Stack;

/**
 * Como em todos os iteradores, estamos implementando a interface java.util.Iterator.
 */
public class CompositeIterator implements Iterator<MenuComponent> {

    Stack<Iterator<MenuComponent>> stack = new Stack<>();

    /**
     * O iterador do componente de nível mais alto que será submentido à iteração é passado e colocado numa estrutura de dados em pilha.
     */
    public CompositeIterator(Iterator<MenuComponent> iterator) {
        stack.push(iterator);
    }

    @Override
    public boolean hasNext() {
        /**
         * Para determinar se há mais algum elemento, verificamos se a pilha está vazia. Nesse caso, não há mais elementos.
         */
        if (stack.empty()) {
            return false;
        } else {
            /**
             * Caso ao contrário,pegamos o iterador no topo da pilha e verificamos se ele possui um próximo elemento.
             * Se tiver, nós a removeremos da pilha e chamamos hasNext() recursivamente.
             */
            Iterator<MenuComponent> iterator = stack.peek();
            if (!iterator.hasNext()) {
                stack.pop();
                return hasNext();
            } else {
                /**
                 * Por outro lado, se ele tiver um próximo elemento, nós retornamos "true".
                 */
                return true;
            }
        }
    }

    @Override
    public MenuComponent next() {
        /**
         * Quando o cliente quiser obter o próximo elemento, primeiramente chamamos hasNext para verificar se há mais algum elemento.
         */
        if (hasNext()) {
            Iterator<MenuComponent> iterator = stack.peek();
            /**
             * Se houver o próximo elemento, pegamos o iterador corrente na pilha e o aplicamos a esse elemento.
             */
            MenuComponent component = iterator.next();
            /**
             * Se o elemento for um menu, temos outro composto que precisa ser incluído na iteração. Portanto, nós o
             * colocamos na pilha. Em qualquer um dos casos, retornamos o componente.
             */
            if (component instanceof Menu) {
                stack.push(component.createIterator());
            }
            return component;
        } else {
            return null;
        }
    }

}
