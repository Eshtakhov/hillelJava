import jdk.nashorn.internal.runtime.regexp.joni.ScanEnvironment;

import java.util.Scanner;

/**
 * Created by shah on 29.09.2015.
 */
public class Calculator {
    public static void main(String[] args) {
        boolean stop=true;
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
                   // calculator();
                    break;
                case 2:
                    realnumbers();
                    break;
                case 3:
                    types();
                    break;
                case 4:
                    stop=false;
                default:
                    System.out.println("Input Error ");
                    break;
            }
        }
    }

    private static void types() {
        System.out.println("Enter number");
        Scanner enter = new Scanner(System.in);
        double number = enter.nextDouble();
        if (number - (int) number != 0) {
            System.out.printf("Type of the number %.3f is Double\n", number);
        } else if ((number > -128) && (number < 128)) {
            System.out.printf("Type of the number %.0f is Byte\n", number);
        } else if ((number > -32769) && (number < 32769)) {
            System.out.printf("Type of the number %.0f is Short\n", number);
        } else if ((number > Integer.MIN_VALUE) && (number < Integer.MAX_VALUE)) {
            System.out.printf("Type of the number %.0f is Integer\n", number);
        } else if ((number > Long.MIN_VALUE) && (number < Long.MAX_VALUE)) {
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
        System.out.println("3. Both part of number");
        int n = enter.nextInt();
        switch (n) {
            case 1:
                System.out.println("The whole part of the real numbers " + (int) number);
                break;
            case 2:
                System.out.printf("The fractional part of a real number %.4f \n" ,(number - (int) number));
                break;
            case 3:
                System.out.printf("The whole part is %f and the fractional part is %.3f of real number \n", (int) number, (number - (int) number));
                break;
            default:
                System.out.println("Input Error ");
                break;


        }
    }
}