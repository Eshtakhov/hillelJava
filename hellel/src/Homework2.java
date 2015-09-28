import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        System.out.println("Selecting one of the programs:");
        System.out.println("1.Program checks whether an even integer or odd");
        System.out.println("2 Program that displays on the screen closest to the 10 of the two numbers");
        System.out.println("3.program that calculates the sides of the rectangle , if you know the area and perimeter");
        Scanner vvod=new Scanner(System.in);
        int n=vvod.nextInt();
        if(n==1){
            chetnost();}
        else {
            if (n == 2)
                sravn();
            else {
                if (n == 3)
                    pram();
                else
                    System.out.println("Not entered the correct number");
            }
        }
    }

    private static void pram() {
        System.out.println("Enter the area of a rectangle");
        Scanner vvod=new Scanner(System.in);
        int sqr= vvod.nextInt();
        System.out.println("Enter the perimeter of the rectangle");
        int perim= vvod.nextInt();
        if (Math.sqrt(Math.pow(perim,2)/4-4*sqr)<0)
            System.out.println("Rectangle with such parameters does not exist");
        else {
            double a, b;
            b = (perim / 2 + Math.sqrt(Math.pow(perim, 2) / 4 - 4 * sqr)) / 2;
            a = sqr / b;
            if ((b > 0) && (a > 0))
                System.out.printf("The sides of the rectangle are %f and %f \n", a, b);
            else {
                b = (perim / 2 - Math.sqrt(Math.pow(perim, 2) / 4 - 4 * sqr)) / 2;
                a = sqr / b;
                if ((b > 0) && (a > 0))
                    System.out.printf("The sides of the rectangle are %f and %f \n", a, b);
                else
                    System.out.println("Rectangle with such parameters does not exist");
            }
        }
    }

    private static void sravn() {
        System.out.println("Enter the first numdber");
        Scanner vvod=new Scanner(System.in);
        int first= vvod.nextInt();
        System.out.println("Enter the second number");
        int second= vvod.nextInt();
        if(Math.abs(first-10)>Math.abs(second-10))
            System.out.printf("Number %f closer 10 \n",first);
        else
            System.out.printf("Number %f closer 10 \n",second);
    }

    private static void chetnost() {
        System.out.println("Enter the number");
        Scanner vvod=new Scanner(System.in);
        int n=vvod.nextInt();
        if(n%2==0)
            System.out.printf("Number %f is even \n",n);
        else
            System.out.printf("Number %f is odd \n",n);
    }
}

