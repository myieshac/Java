class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double divide(int a, int b) {
        if (b == 0) {
            System.out.println("Error: Division by zero.");
            return 0; 
        }
        return (double) a / b;
    }
}

public class CalculatorApp {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println("Addition of 5 and 10: " + calculator.add(5, 10));
        System.out.println("Addition of 5, 10, and 15: " + calculator.add(5, 10, 15));
        System.out.println("Addition of 5.5 and 10.5: " + calculator.add(5.5, 10.5));

        System.out.println("Subtraction of 10 from 20: " + calculator.subtract(20, 10));

        System.out.println("Multiplication of 5 and 4: " + calculator.multiply(5, 4));

        System.out.println("Division of 20 by 4: " + calculator.divide(20, 4));
        System.out.println("Division of 20 by 0: " + calculator.divide(20, 0)); 
    }
}