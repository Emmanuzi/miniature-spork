// This App demonstrates the four pillars of OOP with simple examples and comments.
public class App {
    public static void main(String[] args) throws Exception {

        // ----------------------
        // Encapsulation example
        // We use constructors and getters/setters to access private fields.
        // ----------------------
        Car myCar = new Car("Toyota", "Camry", 2020, "Red", 25000.00);
        myCar.info(); // prints make, model, year (defined in Vehicle)
        System.out.println("Color: " + myCar.getColor());
        System.out.println("Price: " + myCar.getPrice());
        myCar.drive();

        // ----------------------
        // Inheritance & Polymorphism example
        // Vehicle is the abstract parent; Car extends Vehicle and overrides drive().
        // We can refer to a Car as a Vehicle and still call the overridden method.
        // ----------------------
        Vehicle v = myCar; // polymorphism: a Car is-a Vehicle
        v.drive(); // calls Car.drive() at runtime

        // ----------------------
        // Abstraction example
        // Speakable is an interface (abstraction). Girl implements Speakable.
        // We interact with Speakable without needing internal details.
        // ----------------------
        Girl myGirl = new Girl();
        myGirl.setName("Katy");
        myGirl.setAge(18);
        myGirl.setHairColor("Black");
        myGirl.setBodyType("petite");

        Speakable s = myGirl; // use the abstraction type
        s.speak(); // calls Girl.speak()
        myGirl.walk();

        // Print a summary using encapsulated getters
        System.out.println("My woman is " + myGirl.getName() + ", she is " + myGirl.getAge() + " years old, has " + myGirl.getHairColor() + " hair and a " + myGirl.getBodyType() + " body type.");
    }
}
