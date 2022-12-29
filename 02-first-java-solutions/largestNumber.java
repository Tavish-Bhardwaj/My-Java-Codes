import java.util.Scanner;

public class largestNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        int a = scan.nextInt();
        System.out.println("Enter Second Number: ");
        int b = scan.nextInt();
        if(a>b){
            System.out.println(a+" is Greater");
        }
        else{
            System.out.println(b+" is Greater");
        }

    }
}
