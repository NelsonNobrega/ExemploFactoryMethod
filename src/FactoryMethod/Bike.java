package FactoryMethod;

class Bike implements Vehicle {
    @Override
    public void drive(int miles) {
        System.out.println("Drive the Bike: " + miles + " km");
    }
}
