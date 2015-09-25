import java.util.Scanner;

/**
 * Created by shah on 25.09.2015.
 */
public class Homework2 {
    public static void main(String[] args) {
        System.out.println("Выберите каккую функцию хотите использывать:");
        System.out.println("1.Проверка целого числа на четность");
        System.out.println("2 Вывод на экран ближайшее к 10 из двух чисел.");
        System.out.println("3.Вычисление сторон прямоугольника, если известны его площадь и периметр");
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
                    System.out.println("Вы ввели не верное число");
            }
        }
    }

    private static void pram() {
        System.out.println("Введите площадь прямоугольника");
        Scanner vvod=new Scanner(System.in);
        int sqr= vvod.nextInt();
        System.out.println("Введите периметр");
        int perim= vvod.nextInt();
        if (Math.sqrt(Math.pow(perim,2)/4-4*sqr)<0)
            System.out.println("Прямоугольника с такими параметрами не существует");
        else {
            double a, b;
            b = (perim / 2 + Math.sqrt(Math.pow(perim, 2) / 4 - 4 * sqr)) / 2;
            a = sqr / b;
            if ((b > 0) && (a > 0))
                System.out.printf("Стороны прямоугольника %f и %f \n", a, b);
            else {
                b = (perim / 2 - Math.sqrt(Math.pow(perim, 2) / 4 - 4 * sqr)) / 2;
                a = sqr / b;
                if ((b > 0) && (a > 0))
                    System.out.printf("Стороны прямоугольника %f и %f \n", a, b);
                else
                    System.out.println("Прямоугольника с такими параметрами не существует");
            }
        }
    }

    private static void sravn() {
        System.out.println("Введите первое целое число");
        Scanner vvod=new Scanner(System.in);
        int first= vvod.nextInt();
        System.out.println("Введите второе целое число");
        int second= vvod.nextInt();
        if(Math.abs(first-10)>Math.abs(second-10))
            System.out.printf("Число %f ближе к 10 \n",first);
        else
            System.out.printf("Число %f ближе к 10 \n",second);
    }

    private static void chetnost() {
        System.out.println("Введите целое число");
        Scanner vvod=new Scanner(System.in);
        int n=vvod.nextInt();
        if(n%2==0)
            System.out.printf("Число %f являеться четным \n",n);
        else
            System.out.printf("Число %f являеться нечетным \n",n);
    }
}

