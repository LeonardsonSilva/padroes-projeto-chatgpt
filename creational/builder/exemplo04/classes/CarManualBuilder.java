package creational.builder.exemplo04.classes;

import creational.builder.exemplo04.enums.CarType;
import creational.builder.exemplo04.enums.Transmission;
import creational.builder.exemplo04.interfaces.Builder;


/*
 * Ao contrário de outros padrões de criação, o Builder pode construir produtos
 * não relacionados, que não possuem uma interface comum.
 *
 * Neste caso criamos um manual do usuário para um carro, seguindo os mesmo
 * passos utilizados na construção do próprio carro. Isso permite produzir
 * manuais para modelos de carros específicos, configurados com diferentes
 * recursos.
 */

public class CarManualBuilder implements Builder {
    private CarType type;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private TripComputer tripComputer;
    private GPSNavigator gpsNavigator;

    @Override
    public void setCarType(CarType type) {
        this.type = type;
    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    @Override
    public void setTripComputer(TripComputer tripComputer) {
        this.tripComputer = tripComputer;
    }

    @Override
    public void setGPSNavigator(GPSNavigator gpsNavigator) {
        this.gpsNavigator = gpsNavigator;
    }

    public Manual getResult() {
        return new Manual(type, seats, engine, transmission, tripComputer, gpsNavigator);
    }

}
