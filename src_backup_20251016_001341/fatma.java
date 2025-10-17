import java.util.Scanner;
public class fatma {
    public static void main(String[] args) {
       System.out.println("This is my java program"); 
       int age = 35;
       double price = 1500.78;
       String name = "Fatma";

       Scanner scanner = new Scanner(System.in);
       System.out.print("Enter your name?");
       String name1 = scanner.next();

       scanner.close();
    }
}
