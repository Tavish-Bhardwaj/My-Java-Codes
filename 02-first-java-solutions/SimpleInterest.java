import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Principal Amount:");
        int p = scan.nextInt();
        System.out.println("Enter Rate of Interest:");
        int r = scan.nextInt();
        System.out.println("Enter Time Period");
        int t = scan.nextInt();
        int si;
        si= (p*r*t)/100;
        System.out.println("Simple Interest according to the given data is:" +si);
    }
}
