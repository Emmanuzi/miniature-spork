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
        // Vehicle is the abstract parent; car extends Vehicle and overrides drive().
        // We can refer to a Car as a Vehicle and still call the overridden method.
        // ----------------------
        Vehicle v = myCar; // polymorphism: a Car is-a Vehicle
        v.drive(); // calls Car.drive() at runtime

        // ----------------------
        // Abstraction example
        // Speakable is an interface (abstraction). girl implements Speakable.
        // We interact with Speakable without needing internal details.
        // ----------------------
        Girl myGirl = new Girl();
        myGirl.setName("Katy");
        myGirl.setAge(18);
        myGirl.setHairColor("Black");
        myGirl.setBodyType("petite");

        Speakable s = myGirl; // use the abstraction type
        s.speak(); // calls girl's speak()
        myGirl.walk();

        // Print a summary using encapsulated getters
        System.out.println("My woman is " + myGirl.getName() + ", she is " + myGirl.getAge() + " years old, has " + myGirl.getHairColor() + " hair and a " + myGirl.getBodyType() + " body type.");

        Laptop myLaptop = new Laptop();
        myLaptop.brand = "Dell";
        myLaptop.model = "XPS 13";
        myLaptop.ram = 16;
        myLaptop.storage = 512;
        myLaptop.price = 999.99;
        myLaptop.color = "Silver";
        myLaptop.powerOn();

        Laptop officeLaptop = new Laptop();
        officeLaptop.brand = "HP";
        officeLaptop.model = "EliteBook";
        officeLaptop.ram = 8;  
        officeLaptop.storage = 256;

        Employee employee = new Employee();
        employee.name = "Alice";
        employee.id = 101;
        System.out.println("Employee Name: " + employee.name);

        Phone myPhone = new Phone();
        myPhone.brand = "Apple";
        myPhone.model = "iPhone 13";
        myPhone.price = 999.99;
        myPhone.color = "Black";
        myPhone.storage = 128;
        myPhone.powerOn();
        System.out.println("Phone Model: " + myPhone.model);

        Phone workPhone = new Phone();
        workPhone.brand = "Samsung";
        workPhone.model = "Galaxy S21";
        workPhone.price = 799.99;
        workPhone.color = "White";
        workPhone.storage = 256;
        workPhone.powerOn();

        movies movie1 = new movies();
        movie1.title = "Inception";
        movie1.genre = "Sci-Fi";
        movie1.duration = 148;
        movie1.director = "Christopher Nolan";
        /*  */movie1.releasedyear = 2010;
        movie1.play();
        movie1.pause();
        System.out.println("Movie Title: " + movie1.title);


        movies movie2 = new movies();
        movie2.title = "The Godfather";
        movie2.genre = "Crime";
        movie2.duration = 17;
        movie2.director = "Francis Ford Coppola";
        movie2.releasedyear = 1972;
        movie2.play();
        movie2.pause();
        System.out.println("Movie Title: " + movie2.title);

        Animal animal1 = new Animal() {
            @Override
            public void sound() {
                System.out.println("Roar");
            }
        };
        animal1.name = "Lion";
        animal1.age = 5;
        animal1.type = "Wild";

        Animal animal2 = new Animal() {
            @Override
            public void sound() {
                System.out.println("Bark");
            }
        };
        animal2.name = "Dog";
        animal2.age = 3;
        animal2.type = "Domestic";

        animal1.sound();
        animal2.sound();

    }
}


