package behavioral.command.exemplo02;

import behavioral.command.exemplo02.classes.AparelhoDeSom;
import behavioral.command.exemplo02.classes.ControleRemoto;
import behavioral.command.exemplo02.classes.DesligarSomCommand;
import behavioral.command.exemplo02.classes.LigarSomCommand;
import behavioral.command.exemplo02.interfaces.Command;

public class Main {
    public static void main(String[] args) {
        AparelhoDeSom salaDeEstar = new AparelhoDeSom("Sala de Estar");

        Command ligarSom = new LigarSomCommand(salaDeEstar);
        Command desligarSom = new DesligarSomCommand(salaDeEstar);

        ControleRemoto controle = new ControleRemoto();

        System.out.println("--- Teste 1: Configurar para ligar ---");
        // o cliente configura o Invocador com o Comando para "Ligar"
        controle.setCommand(ligarSom);
        // o Invocador executa o Comando configurado
        controle.apertarBotao();

        System.out.println("\n--- Teste 2: Configurar para desligar ---");
        // o cliente configura o Invocador com o Comando para "Ligar"
        controle.setCommand(desligarSom);
        // o Invocador executa o Comando configurado
        controle.apertarBotao();
        /*
         * Se tivéssemos um "Ventilador", bastaria criar:
         * 1. class Ventilador (Receiver)
         * 2. class LigarVentiladorCommand (ConcreteCommand)
         * 3. e setar no controle: controle.setCommand(new LigarVentiladorCommand(ventilador));
         * O ControleRemote NUNCA precisaria ser alterado!
         */
    }
}
