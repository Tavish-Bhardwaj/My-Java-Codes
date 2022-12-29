import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int num= scan.nextInt();
        int i;
        System.out.println("The Multiplication Table of "+num+" is: ");
        for (i=1; i<=20; i++){
            System.out.println(num+"*"+i+"="+num*i);
        }
    }
}
