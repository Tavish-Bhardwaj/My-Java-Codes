import java.util.Scanner;

public class SumOfNIntegers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum=0;
        System.out.println("Enter all the Numbers and then 0 to get the total.");
        for(int i=0; i>=0; i++){

            int n= scan.nextInt();
           if(n == 0){
               break;
           }
            sum= sum+n;

        }
        System.out.println("The Total is: "+sum);
    }
}
