package polymorphism;

public class Bike extends Vehicle{
    @Override
    public void run() { // overriding run method from parent class Vehicle
        System.out.println("Bike is running");
    }
}
