package FactoryMethod;

public class Scooter implements Vehicle {
    @Override
    public void drive(int miles) {
        System.out.println("Drive the Scooter: " + miles + " km");
    }
}