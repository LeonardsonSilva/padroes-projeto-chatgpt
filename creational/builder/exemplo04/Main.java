package creational.builder.exemplo04;

import creational.builder.exemplo04.classes.Car;
import creational.builder.exemplo04.classes.CarBuilder;
import creational.builder.exemplo04.classes.CarManualBuilder;
import creational.builder.exemplo04.classes.Director;
import creational.builder.exemplo04.classes.Manual;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();

        /*
         * O diretor obtém o objeto construtor concreto do cliente (código do
         * aplicativo). Isso ocorre porque o aplicativo sabe melhor qual
         * construtor usar para obter um produto específico.
         */

        CarBuilder builder = new CarBuilder();
        director.constructSportsCar(builder);

        /*
         * O produto final é frequentemente obtido a partir de um objeto
         * construtor, uma vez que o Director não tem conhecimento nem depende
         * de construtores e produtos concretos.
         */
        Car car = builder.getResult();
        System.out.println("Car built:\n" + car.getCarType());

        CarManualBuilder manualBuilder = new CarManualBuilder();
        director.constructSportsCar(manualBuilder);
        Manual carManual = manualBuilder.getResult();
        System.out.println("\nCar manual built:\n" + carManual.print());


    }
}
