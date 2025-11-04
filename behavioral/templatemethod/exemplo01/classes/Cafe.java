package behavioral.templatemethod.exemplo01.classes;

public class Cafe extends BebidaCafeinada {

    @Override
    protected void adicionarIngredientePrincipal() {
        System.out.println("Adicionando Pó de Café na água fervente.");
    }

    @Override
    protected void adicionarCondimentos() {
        System.out.println("Adicionando açúcar e leite.");
    }

    // não sobrescreve o hook method, usando o padrão

}
