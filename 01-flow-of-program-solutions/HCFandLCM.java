import java.util.Scanner;

public class HCFandLCM {
    //take two numbers and find their hcf and lcm
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        //now hcf is the greatest number which exactly divides both the numbers
        System.out.println("Enter first  Number: ");
        int num1 = scan.nextInt();
        System.out.println("Enter Second Number: ");
        int num2 = scan.nextInt();
        int i,l;
        if(num1>num2){
             i=  num2;
             l= num1;
        }
        else{
             i= num1;
             l= num2;
        }
        for(int j=i; j>=1; j--){
            if(num1%j==0 && num2%j==0){
                System.out.println("HCF of the two Numbers is: "+j);
                break;
            }
            else{
                continue;
            }
        }
        //lcm of two numbers is the smallest number which is completely divisible by both the given numbers.
        for(int k=l;k>=l;k++){
            if(k%num1==0 && k%num2==0){
                System.out.println("LCM of two numbers is: "+k);
                break;
            }
            else{
                continue;
            }
        }
    }
}
