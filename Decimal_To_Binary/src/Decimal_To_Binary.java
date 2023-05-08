import java.util.Scanner;

public class Decimal_To_Binary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //input any decimal no.
        System.out.println("Enter any decimal number");
        int x= sc.nextInt();
        // conversion of decimal to binary no.
        System.out.println("The binary conversion of "+ x + " is " + Integer.toBinaryString(x));
    }
}
