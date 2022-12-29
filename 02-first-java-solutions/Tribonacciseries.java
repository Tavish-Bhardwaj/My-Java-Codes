import java.util.Scanner;

public class Tribonacciseries {



        public static void main(String[] args) {
//program to print fibonacci series upto n.
            System.out.println("Enter the number of terms you want to print Tribonacci series:");
            Scanner scan = new Scanner(System.in);
            int n = scan.nextInt();
            int a = 0;
            int b= 0;
            int c= 1;
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);

            for(int i=3; i<n; i++){
                int d= a+b+c;

                a= b;
                b= c;
                c=d;
                System.out.println(d);
            }
        }
    }


