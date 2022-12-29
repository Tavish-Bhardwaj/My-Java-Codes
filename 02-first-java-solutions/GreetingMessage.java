import java.util.Scanner;

public class GreetingMessage {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Your Name:");
        String name= scan.next();
        System.out.println("Hello "+name);

    }
}
