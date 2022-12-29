import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
//input a year and find  whether it is a leap year or not
        //take input of year and check if it is divisble by four or not if it is then it is a leap year else not.
        System.out.println("Enter the Year: ");
        Scanner scan= new Scanner(System.in);
        int year= scan.nextInt();
        if(year%4==0){
            System.out.println("Leap Year");

        }
        else{
            System.out.println("Not a Leap Year");
        }
    }
}
