/**
 * Created by ES on 21.09.2015.
 */
public class DataTypes {
    public static void main(String[] args) {
        int age=23;
        int days=age*365;
        int hours=days*24;
        int sec= hours*3600;
        long msec=sec*1000L;
        System.out.println(msec);
        long longsec=msec/1000;
        double d= 3.54;
        long l =100L;
        int  i=10;
        float f=2.5f;
        sec=(int)(msec/999);
       // sec=(int)(longsec);
        System.out.println(sec);

    }

}
