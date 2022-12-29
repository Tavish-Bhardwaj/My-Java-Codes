import java.util.Scanner;

public class FibbonacciSeries {
    public static void main(String[] args) {
//program to print fibonacci series upto n.
        System.out.println("Enter the number of terms you want to print fibonacci series:");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int a = 0;
        int b= 1;
        System.out.println(a);
        System.out.println(b);

        for(int i=2; i<n; i++){
            int c= a+b;
            int temp = b;
            a= temp;
            b= c;
            System.out.println(c);
        }
    }
}
