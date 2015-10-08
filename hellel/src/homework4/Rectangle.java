package homework4;

import java.util.Scanner;

/**
 * Created by Евгений on 07.10.2015.
 */
public class Rectangle {
    public static final int degree=90;
    public static final String figure="Quadrilateral paralelogram";

    private double a;
    private double b;
    public Rectangle(double s,double p){
        RectangleTask constr= new RectangleTask(s,p);
        Rectangle rec=constr.getRectangle();
    }


    public static void main(String[] args) {
        System.out.println("Enter the area of a rectangle");
        Scanner enter = new Scanner(System.in);
        double area = enter.nextDouble();
        System.out.println("Enter the perimeter of the rectangle");
        double perimetre = enter.nextInt();
        Rectangle example=new Rectangle(area,perimetre);
        System.out.printf("The sides of the rectangle are %.2f and %.2f \n", example.a, example.b);

    }

}
