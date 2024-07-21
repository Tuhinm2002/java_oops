package src.com.demo.InterfacesClasses;

public class Car implements Brakes,Engine,Media{

    // Polymorphism
    @Override
    public void brake() {
        System.out.println("Car brakes");
    }

    @Override
    public void start() {
        System.out.println("Car starts");
    }

    @Override
    public void stop() {
        System.out.println("Car stops");

    }

    @Override
    public void acc() {
        System.out.println("Car accelerates");
    }
}
