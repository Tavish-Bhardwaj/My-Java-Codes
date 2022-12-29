import java.util.Scanner;

public class Operation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        int a= scan.nextInt();
        System.out.println("Enter the Operator: ");
        char b = scan.next().charAt(0);
        System.out.println("Enter Second Number: ");
        int c = scan.nextInt();
        if(b=='+') {
            System.out.println("Your Answer is: " +(a+c));
        }
        if(b=='-') {
            System.out.println("Your Answer is: "+(a-c));
        }
        if(b=='*') {
            System.out.println("Your Answer is: " +a*c);
        }
        if(b=='/') {
            System.out.println("Your Answer is: "+a/c);
        }
        if(b=='%') {
            System.out.println("Your Answer is: " +a%c);
        }
    }
}
