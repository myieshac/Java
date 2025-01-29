//Write a Program to Print the ASCII Value of a Character.
import java.util.Scanner;

public class AsciiVal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);
        
        int asciiValue = (int) ch;
        System.out.println("The ASCII value of '" + ch + "' is: " + asciiValue);
        
        sc.close();
    }
}
