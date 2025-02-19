//This program returns prime number occuring in the entered range.
import java.util.Scanner;

public class PrimeInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the starting number (n1): ");
        int n1 = sc.nextInt();
        System.out.print("Enter the ending number (n2): ");
        int n2 = sc.nextInt();
        System.out.println("Prime numbers between " + n1 + " and " + n2 + ":");
        for (int i = n1; i <= n2; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        sc.close();
    }

    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
