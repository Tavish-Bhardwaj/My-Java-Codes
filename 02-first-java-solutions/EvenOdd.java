import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int n= scan.nextInt();
        if(n%2==0){
            System.out.println("The Number is Even");
        }
        else{
            System.out.println("The Number is Odd");
        }
    }
}
