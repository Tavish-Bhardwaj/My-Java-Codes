import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the two Numbers: ");

        double k;

        int a = scan.nextInt();
        int b = scan.nextInt();
        for(int i= a; i<b; i++){
            int temp = i;
            double sum= 0;
            double count = 0;
            while(temp!=0){
                count++;
                temp/=10;
            }
              int l=i;
            while(l>0){
                k=l%10;
                l/=10;
                sum= sum+Math.pow(k, count);

            }
            if (sum==i){
                System.out.println(i+ " ");
            }

        }
    }
}