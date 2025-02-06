//This program demonstrates data type conversion in java
public class TypeConversion {
    public static void main(String[] args) {
        int intValue = 100;
        long longValue = intValue;
        float floatValue = longValue;
        double doubleValue = floatValue;

        System.out.println("Implicit Type Conversion:");
        System.out.println("Integer value: " + intValue);
        System.out.println("Converted to Long: " + longValue);
        System.out.println("Converted to Float: " + floatValue);
        System.out.println("Converted to Double: " + doubleValue);

        doubleValue = 9.78;
        floatValue = (float) doubleValue;
        longValue = (long) floatValue;
        intValue = (int) longValue;

        System.out.println("\nExplicit Type Conversion:");
        System.out.println("Double value: " + doubleValue);
        System.out.println("Converted to Float: " + floatValue);
        System.out.println("Converted to Long: " + longValue);
        System.out.println("Converted to Integer: " + intValue);
    }
}
