// Inheritance & Polymorphism example
// Car extends Vehicle and provides a concrete implementation of drive().
public class Car extends Vehicle {
    private String color;
    private double price;

    public Car(String make, String model, int year, String color, double price) {
        super(make, model, year);
        this.color = color;
        this.price = price;
    }

    // Encapsulated accessors for Car-specific fields
    public String getColor() { return color; }
    public double getPrice() { return price; }

    public void setPrice(double price) {
        if (price >= 0) this.price = price;
    }

    // Polymorphism: this method fulfills the abstract contract from Vehicle.
    @Override
    public void drive() {
        System.out.println("The car is driving.");
    }

    public void brake() {
        System.out.println("The car is braking.");
    }
}
 