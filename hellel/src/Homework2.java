import java.util.Scanner;

/**
 * Created by shah on 25.09.2015.
 */
public class Homework2 {
    public static void main(String[] args) {
        System.out.println("�������� ������ ������� ������ ������������:");
        System.out.println("1.�������� ������ ����� �� ��������");
        System.out.println("2 ����� �� ����� ��������� � 10 �� ���� �����.");
        System.out.println("3.���������� ������ ��������������, ���� �������� ��� ������� � ��������");
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
                    System.out.println("�� ����� �� ������ �����");
            }
        }
    }

    private static void pram() {
        System.out.println("������� ������� ��������������");
        Scanner vvod=new Scanner(System.in);
        int sqr= vvod.nextInt();
        System.out.println("������� ��������");
        int perim= vvod.nextInt();
        if (Math.sqrt(Math.pow(perim,2)/4-4*sqr)<0)
            System.out.println("�������������� � ������ ����������� �� ����������");
        else {
            double a, b;
            b = (perim / 2 + Math.sqrt(Math.pow(perim, 2) / 4 - 4 * sqr)) / 2;
            a = sqr / b;
            if ((b > 0) && (a > 0))
                System.out.printf("������� �������������� %f � %f \n", a, b);
            else {
                b = (perim / 2 - Math.sqrt(Math.pow(perim, 2) / 4 - 4 * sqr)) / 2;
                a = sqr / b;
                if ((b > 0) && (a > 0))
                    System.out.printf("������� �������������� %f � %f \n", a, b);
                else
                    System.out.println("�������������� � ������ ����������� �� ����������");
            }
        }
    }

    private static void sravn() {
        System.out.println("������� ������ ����� �����");
        Scanner vvod=new Scanner(System.in);
        int first= vvod.nextInt();
        System.out.println("������� ������ ����� �����");
        int second= vvod.nextInt();
        if(Math.abs(first-10)>Math.abs(second-10))
            System.out.printf("����� %f ����� � 10 \n",first);
        else
            System.out.printf("����� %f ����� � 10 \n",second);
    }

    private static void chetnost() {
        System.out.println("������� ����� �����");
        Scanner vvod=new Scanner(System.in);
        int n=vvod.nextInt();
        if(n%2==0)
            System.out.printf("����� %f ��������� ������ \n",n);
        else
            System.out.printf("����� %f ��������� �������� \n",n);
    }
}

