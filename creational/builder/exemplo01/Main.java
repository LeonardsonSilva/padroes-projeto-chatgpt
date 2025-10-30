package creational.builder.exemplo01;

import creational.builder.exemplo01.classes.Carro;

public class Main {
    public static void main(String[] args) {
        Carro carroLuxo =  new Carro.CarroBuilder("V8 Potente")  // começa com o motor obrigatório
                                .comCor("Vermelho Ferrari")  // adiciona a cor
                                .comGPS()  // adiciona o GPS (não precisa de valor, pois o método já o define como true)
                                .comTetoSolar()  // adiciona o teto solar
                                .build();  // finaliza a construção e obtém o objeto Carro

        System.out.println("Configuração Carro Luxo:");
        System.out.println(carroLuxo);

        System.out.println("---");

        Carro carroBasico = new Carro.CarroBuilder("1.0 Econômico")
                                    .build();

        System.out.println("Configuração Carro Básico");
        System.out.println(carroBasico);
    }
}
