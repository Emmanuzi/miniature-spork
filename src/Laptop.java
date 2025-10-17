public class Laptop {
    String brand;
    String model;
    int ram; // in GB
    int storage; // in GB
    double price;
    boolean isOn;
    String color;

    void powerOn() {
        isOn = true;
        System.out.println("Laptop is now ON.");
    }
}
