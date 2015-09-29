import java.net.SocketPermission;

/**
 * Created by ES on 24.09.2015.
 */
public class Operations {
    public static void main(String[] args) {
        int res=94;
        res++;

        res+=5;
        ++res;
        boolean paid= true;
        boolean rekl= false;boolean flag= paid() || advert();
      //  System.out.print("May be here" + flag);
        boolean has_knowledge= true;
        flag= paid() && advert();
         res=10|5;
        int message =100;
        int key=31;
        int secret=message^key;
        System.out.print(secret);

    }

    public static boolean paid()
    {
        System.out.println("paid");
        return  true;
    }
    public static boolean advert()
    {
        System.out.println("advert");
        return  false;
    }
    public static boolean knowledge()
    {
        System.out.println("knowledge");
        return  false;
    }
    public  static  void Print(int a)
    {
        System.out.println(a);
    }

}
