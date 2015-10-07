import jdk.nashorn.internal.runtime.regexp.joni.ScanEnvironment;

import java.util.Scanner;


public class Calculator {
    public static void main(String[] args) {
        boolean stop = true;
        while (stop) {
            System.out.println("Selecting one of the function");
            System.out.println("1. Calculator");
            System.out.println("2. Action on real numbers");
            System.out.println("3. Type of the number");
            System.out.println("4. Escape");
            Scanner enter = new Scanner(System.in);
            int n = enter.nextInt();
            switch (n) {
                case 1:
                    calculator();
                    break;
                case 2:
                    realnumbers();
                    break;
                case 3:
                    types();
                    break;
                case 4:
                    stop = false;
                    break;
                default:
                    System.out.println("Input Error ");
                    break;
            }
        }
    }

    private static void calculator() {
        System.out.println("Enter Calculator operation");
        Scanner enter = new Scanner(System.in);
        String calculation = enter.nextLine();
        String[] massive = new String[3];
        massive = calculation.split(" ");
        double firstnumber = convert(massive[0]);
        double secondnumber = convert(massive[2]);
        switch (massive[1]) {
            case "+":
                addition(firstnumber, secondnumber);
                break;
            case "-":
                subtraction(firstnumber, secondnumber);
                break;
            case "*":
                multi1plication(firstnumber, secondnumber);
                break;
            case "/":
                division(firstnumber, secondnumber);
                break;
            case "%":
                remainder(firstnumber, secondnumber);
                break;
        }
    }

    private static void remainder(double firstnumber, double secondnumber) {
        System.out.println(firstnumber % secondnumber);
    }

    private static void division(double firstnumber, double secondnumber) {
        System.out.println(firstnumber / secondnumber);
    }

    private static void multi1plication(double firstnumber, double secondnumber) {
        System.out.println(secondnumber * firstnumber);
    }

    private static void subtraction(double firstnumber, double secondnumber) {
        System.out.println(firstnumber - secondnumber);
    }

    private static void addition(double firstnumber, double secondnumber) {
        System.out.println(firstnumber + secondnumber);

    }

    private static double convert(String number) {
        return Double.parseDouble(number);
    }

    private static void types() {
        System.out.println("Enter number");
        Scanner enter = new Scanner(System.in);
        double number = enter.nextDouble();
        if (number - (int) number != 0) {
            System.out.printf("Type of the number %.3f is Double\n", number);
        } else if ((number >= Byte.MIN_VALUE) && (number <= Byte.MAX_VALUE)) {
            System.out.printf("Type of the number %.0f is Byte\n", number);
        } else if ((number >= Short.MIN_VALUE) && (number <= Short.MAX_VALUE)) {
            System.out.printf("Type of the number %.0f is Short\n", number);
        } else if ((number >= Integer.MIN_VALUE) && (number <= Integer.MAX_VALUE)) {
            System.out.printf("Type of the number %.0f is Integer\n", number);
        } else if ((number >= Long.MIN_VALUE) && (number <= Long.MAX_VALUE)) {
            System.out.printf("Type of the number %.0f is Long\n", number);
        } else
            System.out.printf("Type of the number %.0f is Double\n", number);
    }

    private static void realnumbers() {
        System.out.println("Enter real number");
        Scanner enter = new Scanner(System.in);
        double number = enter.nextDouble();
        System.out.println("Selecting one of the function");
        System.out.println("1. The whole part of the real numbers");
        System.out.println("2. The fractional part of a real number");
        int n = enter.nextInt();
        switch (n) {
            case 1:
                System.out.println("The whole part of the real numbers " + (int) number);
                break;
            case 2:
                System.out.printf("The fractional part of a real number %.4f \n", (number - (int) number));
                break;
            default:
                System.out.println("Input Error ");
                break;
        }
    }
}