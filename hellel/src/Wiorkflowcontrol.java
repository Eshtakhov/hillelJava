import java.net.SocketPermission;
import java.util.Scanner;

public class Wiorkflowcontrol {
    public static void main(String[] args) {



    }

    public static void termoryexemple() {
        //switchsase2();
        int number = 5;
        String flag = isevan(number);
        /*if (flag)
            System.out.println("even");
        else
            System.out.print(" odd ");*/
        flag = number % 2 == 0 ? "yes":"no";
    }

    public static String isevan(int number) {
        String flag;
        if (number % 2 == 0)
            flag = "yes";
        else
            flag = "no";

        return flag;
    }

    public static void switchsase2() {
        int age = 33;
        int mounth = 12;
        switch (mounth) {
            case 1:
            case 2:
            case 12:
                System.out.println("winter");
                break;
        }

        if (age < 10)
            System.out.println("kid");
        else if (age < 20) {
            System.out.println("you are young");
        } else if (age < 50)
            System.out.println("you are not old");
        else
            System.out.println("you are old");
    }

    public static void another() {
        switch ("oct") {
            case "jan":
                System.out.println("1");
                break;
            case "feb":
                System.out.println("2");
                break;
            case "may":
                System.out.println("5");
                break;
            case "oct":
                System.out.println("10");
                break;
            case "dec":
                break;

        }

        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        if ((age < 10) && (age > 0))
            System.out.println("kid");
        if ((age > 10) && (age < 20))

        {
            System.out.println("you are young");
        } else if ((age > 20) && (age < 50))
            System.out.println("you are not old");
        if ((age > 50))
            System.out.println("you are old");

    }

}
