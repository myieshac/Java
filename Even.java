//This program checks if a number is even or odd.

import java.util.Scanner;
public class Even{
   public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        if (num%2==0){
            System.out.println("Number is Even");
        }
        else{
           System.out.println("Number is Odd");
        }
   }
}
