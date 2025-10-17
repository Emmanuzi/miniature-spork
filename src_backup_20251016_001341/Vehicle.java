// Abstraction & Inheritance example
// Vehicle is an abstract class that defines common behavior for vehicles.
public abstract class Vehicle {
    // Encapsulation: keep fields private and expose safe operations (getters/setters)
    private String make;
    private String model;
    private int year;

    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    // Encapsulated accessors
    public String getMake() { return make; }
    public String getModel() { return model; }
    public int getYear() { return year; }

    public void setYear(int year) {
        if (year > 1885) { // basic validation
            this.year = year;
        }
    }

    // Abstraction: define an abstract method that concrete vehicles must implement
    public abstract void drive();

    // A shared concrete method
    public void info() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
}
