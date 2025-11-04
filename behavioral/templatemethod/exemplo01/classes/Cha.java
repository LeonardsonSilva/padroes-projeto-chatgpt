package behavioral.templatemethod.exemplo01.classes;

public class Cha extends BebidaCafeinada {

    @Override
    protected void adicionarIngredientePrincipal() {
        System.out.println("Adicionando saquinho de Chá em infusão.");
    }

    @Override
    protected void adicionarCondimentos() {
        System.out.println("Adicionando Limão.");
    }

    @Override
    protected boolean clienteQuerCondimentos() {
        System.out.println(">> Cliente não quer condimento no chá.");
        return false;
    }

}
