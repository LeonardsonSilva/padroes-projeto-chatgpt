package creational.builder.exemplo04.interfaces;

import creational.builder.exemplo04.classes.Engine;
import creational.builder.exemplo04.classes.GPSNavigator;
import creational.builder.exemplo04.classes.TripComputer;
import creational.builder.exemplo04.enums.CarType;
import creational.builder.exemplo04.enums.Transmission;


// a interface Builder define todas as possíveis maneiras para configurar um produto
public interface Builder {
    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}
