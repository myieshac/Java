//THIS PROGRAM RETURNS THE MAXIMUM, MINIMUM AND TOTAL OF THREE NUMBERS.

import java.util.Scanner;
public class MaxMinTotal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  
        System.out.println("Enter num 1: ");
        int num1 = sc.nextInt();
        System.out.println("Enter num 2: ");
        int num2 = sc.nextInt();
        System.out.println("Enter num 3: ");
        int num3 = sc.nextInt();
        int max = Math.max(num1, Math.max(num2, num3));
        int min = Math.min(num1, Math.min(num2, num3));
        int total = num1 + num2 + num3;
        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
        System.out.println("Total: " + total);
        sc.close();
    }
}
