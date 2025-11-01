package structural.facade.exemplo01;

import structural.facade.exemplo01.classes.ComputerFacade;

public class Main {
    public static void main(String[] args) {
        // o cliente só interage com a classe facade
        ComputerFacade facade = new ComputerFacade();

        // a mágica acontece aqui
        // o cliente chama apenas um método simples para realizar
        // toda a sequência complexa. Ele não precisa saber sobre
        // CPU, Memory ou HardDrive
        facade.ligarComputador();

        // ele usa outro método simples para desligar
        facade.desligarComputador();
    }
}
