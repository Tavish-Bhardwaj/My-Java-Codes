import java.util.Scanner;

public class CurrencyConversion {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Amount in Rupees");
        float a = scan.nextInt();
        float usd= a/82.820f;
        System.out.println("Amount in USD will be: "+ usd);

    }
}
