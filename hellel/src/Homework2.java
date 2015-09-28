import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        System.out.println("Selecting one of the programs:");
        System.out.println("1.Program checks whether an even integer or odd");
        System.out.println("2 Program that displays on the screen closest to the 10 of the two numbers");
        System.out.println("3.program that calculates the sides of the rectangle, if you enter the area and perimeter");
        Scanner enter = new Scanner(System.in);
        int n = enter.nextInt();
        if (n == 1) {
            parity();
        } else if (n == 2) {
            comparison();
        } else if (n == 3) {
            rectangle();
        } else {
            System.out.println("Not entered the correct number");
        }

    }
    

    private static void rectangle() {
        System.out.println("Enter the area of a rectangle");
        Scanner enter = new Scanner(System.in);
        double area = enter.nextDouble();
        System.out.println("Enter the perimeter of the rectangle");
        double perimetre = enter.nextInt();
        if
                (Math.sqrt(Math.pow(perimetre, 2) / 4 - 4 * area) < 0) {
            System.out.println("Rectangle with such parameters does not exist");
        } else {
            double a, b;
            b = (perimetre / 2 + Math.sqrt(Math.pow(perimetre, 2) / 4 - 4 * area)) / 2;
            a = area / b;
            if ((b > 0) && (a > 0)) {
                System.out.printf("The sides of the rectangle are %f and %f \n", a, b);
            } else {
                b = (perimetre / 2 - Math.sqrt(Math.pow(perimetre, 2) / 4 - 4 * area)) / 2;
                a = area / b;
                if ((b > 0) && (a > 0)) {
                    System.out.printf("The sides of the rectangle are %f and %f \n", a, b);
                } else {
                    System.out.println("Rectangle with such parameters does not exist");
                }
            }
        }
    }

    private static void comparison() {
        System.out.println("Enter the first numdber");
        Scanner enter = new Scanner(System.in);
        int first = enter.nextInt();
        System.out.println("Enter the second number");
        int second = enter.nextInt();
        if (Math.abs(first - 10) > Math.abs(second - 10)) {
            System.out.printf("Number %f closer 10 \n", first);
        } else {
            System.out.printf("Number %f closer 10 \n", second);
        }
    }

    private static void parity() {
        System.out.println("Enter the number");
        Scanner enter = new Scanner(System.in);
        int n = enter.nextInt();
        if (n % 2 == 0) {
            System.out.printf("Number %f is even \n", n);
        } else {
            System.out.printf("Number %f is odd \n", n);
        }
    }
}

