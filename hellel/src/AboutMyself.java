/**
 * Created by shah on 21.09.2015.
 */
public class AboutMyself
{
    public static void main(String[] args) {
        final String firstname = "Eugene";
        final String surname = "Shtakhov";
        System.out.println("First method:" + firstname + ' ' + surname);
        System.out.print("Second method");
        System.out.print(firstname);
        System.out.print(' ');
        System.out.print(surname);
        System.out.println(' ');
        String name=firstname +' '+ surname;
        System.out.println("Third method:"+ name );
        final int yearofbirth=1991;
        int currentyear=2015;
        int myage=currentyear-yearofbirth;
        System.out.println("My age is "+ myage);
    }
}
