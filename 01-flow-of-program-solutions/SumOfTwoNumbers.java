import java.util.Scanner;

public class SumOfTwoNumbers {
    //take two numbers and print the sum of both
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first Number: ");
       int num1= scan.nextInt();
        System.out.println("Enter the Second Number: ");
        int num2=  scan.nextInt();
        int sum=  num1+num2;
        System.out.println("The Sum of the above two Integers is: "+sum);

    }
}
