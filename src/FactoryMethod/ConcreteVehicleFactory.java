package FactoryMethod;

public class ConcreteVehicleFactory extends VehicleFactory {
    @Override
    public Vehicle getVehicle(String vehicle) {
        switch (vehicle) {
            case "Scooter":
                return new Scooter();
            case "Bike":
                return new Bike();
            default:
                throw new IllegalArgumentException("Vehicle " + vehicle + " cannot be created");
        }
    }
}
