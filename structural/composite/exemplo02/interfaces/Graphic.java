package structural.composite.exemplo02.interfaces;


// interface comum para folhas (shapes) e compósitos (groups)
public interface Graphic {

    void draw();

    void move(int dx, int dy);

    // métodos para manipular filhos: por padrão lançam exceção
    // com isso, folhas não precisam implementar esses métodos
    default void add(Graphic g) {
        throw new UnsupportedOperationException("add não suportado");
    }

    default void remove(Graphic g) {
        throw new UnsupportedOperationException("remove não suportado");
    }

    default Graphic getChild(int index) {
        throw new UnsupportedOperationException("getChild não suportado");
    }

}
