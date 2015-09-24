import java.net.SocketPermission;
import java.util.Scanner;

/**
 * Created by ES on 24.09.2015.
 */
public class Wiorkflowcontrol {
    public static void main(String[] args) {
        int age=33;

     //   else {            System.out.println("not young");        }
        if(age<10)
            System.out.println("kid");
        else if (age<20)
        {
            System.out.println("you are young");
        }else
        if(age<50)
            System.out.println("you are not old");
        else
            System.out.println("you are old");

    }
    public static void another(){

        Scanner scanner= new Scanner(System.in);
       // int age=scanner
        if((age<10)&&(age>0))
        System.out.println("kid");
        if((age>10)&& (age<20))

        {
            System.out.println("you are young");
        }else
        if((age>20)&&(age<50))
            System.out.println("you are not old");
        if((age>50))
            System.out.println("you are old");

    }

}
