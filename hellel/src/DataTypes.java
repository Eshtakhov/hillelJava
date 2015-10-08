
public class DataTypes {
    public static void main(String[] args) {
        byte b=120;
        short s=b;
        long l=s;
        double d=l;
        l=15;
        int MaxVaue= Integer.MAX_VALUE;
        System.out.println("Interger max value is " + MaxVaue);
        long intMaxValue=MaxVaue;
        long inOverflow=intMaxValue +1;

        int i=(int)inOverflow;
                System.out.println(i);
        d=Math.E;
        i=(int)d;
        System.out.println(i);
    }

    public static void realnumbercompiresent() {
        if(1.1 +2.2 == 3.3){
            System.out.print(("they are egent"));}
            else
            System.out.print(("they aren't egent"));
    }


    public static void primitivedatatimes() {
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
        // char f='8';
        String s= "Hello World";
        s.length();
    }

}
