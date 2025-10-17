// Encapsulation example: fields are private and accessed via getters/setters
// Polymorphism example: this class implements Speakable so it can be used interchangeably
public class Girl implements Speakable {
    private String name;
    private int age;
    private String hairColor;
    private String bodyType;

    public Girl() { }

    public Girl(String name, int age, String hairColor, String bodyType) {
        this.name = name;
        this.age = age;
        this.hairColor = hairColor;
        this.bodyType = bodyType;
    }

    // Encapsulated accessors
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }
    public void setAge(int age) { if (age >= 0) this.age = age; }

    public String getHairColor() { return hairColor; }
    public void setHairColor(String hairColor) { this.hairColor = hairColor; }

    public String getBodyType() { return bodyType; }
    public void setBodyType(String bodyType) { this.bodyType = bodyType; }

    // Speakable implementation (polymorphism)
    @Override
    public void speak() {
        System.out.println("The girl is talking.");
    }

    public void walk() {
        System.out.println("The girl is walking.");
    }
}
// Encapsulation example: fields are private and accessed via getters/setters
// Polymorphism example: this class implements Speakable so it can be used interchangeably
public class Girl implements Speakable {
    private String name;
    private int age;
    private String hairColor;
    private String bodyType;

    public Girl() { }

    public Girl(String name, int age, String hairColor, String bodyType) {
        this.name = name;
        this.age = age;
        this.hairColor = hairColor;
        this.bodyType = bodyType;
    }

    // Encapsulated accessors
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }
    public void setAge(int age) { if (age >= 0) this.age = age; }

    public String getHairColor() { return hairColor; }
    public void setHairColor(String hairColor) { this.hairColor = hairColor; }

    public String getBodyType() { return bodyType; }
    public void setBodyType(String bodyType) { this.bodyType = bodyType; }

    // Speakable implementation (polymorphism)
    @Override
    public void speak() {
        System.out.println("The girl is talking.");
    }

    public void walk() {
        System.out.println("The girl is walking.");
    }
}
