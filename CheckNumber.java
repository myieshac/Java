//Write a Java program that takes an integer as input and checks whether the number is positive, negative, or zero.
import java.util.Scanner;

public class CheckNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();
        
        if (num > 0) {
            System.out.println(num + " is a positive number.");
        } else if (num < 0) {
            System.out.println(num + " is a negative number.");
        } else {
            System.out.println("The number is zero.");
        }
        
        sc.close();
    }
}
