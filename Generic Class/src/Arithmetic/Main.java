package Arithmetic;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        String input1 = scanner.nextLine();

        System.out.print("Enter the second number: ");
        String input2 = scanner.nextLine();

        System.out.println("");

        Number num1 = parseNumber(input1);
        Number num2 = parseNumber(input2);

        Arithmetic<Number, Number> arithmetic = new Arithmetic<>(num1, num2);

        System.out.println("Addition: " + arithmetic.add());
        System.out.println("Subtraction: " + arithmetic.subtract());
        System.out.println("Multiplication: " + arithmetic.multiply());
        System.out.println("Division: " + arithmetic.divide());
        System.out.println("Minimum: " + arithmetic.getMin());
        System.out.println("Maximum: " + arithmetic.getMax());

        scanner.close();
    }

    public static Number parseNumber(String input) {
        try {
            return Double.parseDouble(input);
        } catch (NumberFormatException e1) {
            try {
                return Float.parseFloat(input);
            } catch (NumberFormatException e2) {
                try {
                    return Long.parseLong(input);
                } catch (NumberFormatException e3) {
                    try {
                        return Integer.parseInt(input);
                    } catch (NumberFormatException e4) {
                        return Short.parseShort(input);
                    }
                }
            }
        }
    }


}


