package FactoryMethod;

public class Main {
    public static void main(String[] args) {
        VehicleFactory factory = new ConcreteVehicleFactory();

        Vehicle scooter = factory.getVehicle("Scooter");
        scooter.drive(10);

        Vehicle bike = factory.getVehicle("Bike");
        bike.drive(20);
    }
}
