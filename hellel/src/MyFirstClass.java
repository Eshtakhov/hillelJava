/**
 * Created by ES on 17.09.2015.
 */
public class MyFirstClass
{
    public static void main(String[] args)
    {
        sayhello();
        int ags=2015;
        int yearbirthday = 1991;
         int n=5;

        System.out.println("I'm " + age(yearbirthday,ags));
        String aerd []= new String [n];
        aerd[0]="ade";
        for (int i=0;i<n;i++)
           sayhello();


}


    public static void sayhello()
    {
        String helloMessedge="Hello world";
        System.out.println(helloMessedge);
    }
    public static int age(int yob, int cy)
    {
        return cy-yob;
    }
}
