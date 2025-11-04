package behavioral.templatemethod.exemplo01.classes;

// classe abstrata: define o esqueleto (Template) do algoritmo
public abstract class BebidaCafeinada {

    public final void prepararReceita() {
        ferverAgua(); // passo concreto
        adicionarIngredientePrincipal();  // passo abstrato (varia)
        despejarNoCopo();
        if (clienteQuerCondimentos()) {
            adicionarCondimentos();  // passo abstrato (varia)
        }
    }

    private void ferverAgua() {
        System.out.println("Fervendo a água...");
    }

    private void despejarNoCopo() {
        System.out.println("Despejando a bebida no copo.");
    }

    protected abstract void adicionarIngredientePrincipal();
    protected abstract void adicionarCondimentos();

    // método gancho (hook method): um método opcional com implementação padrão
    // as subclasses podem sobrescrever este método para adicionar um ponto de
    // decisão no algoritmo (e.g perguntar ao cliente se ele quer condimentos).
    protected boolean clienteQuerCondimentos() {
        return true;  // padrão: assume que o cliente quer condimentos (açúcar, limão etc)
    }
}
