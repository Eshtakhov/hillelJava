package OOP;

/**
 * Created by ES on 08.10.2015.
 */
public class OOP {
    static String sharedstring;//поле класса

    public static void main(String[] args) {
        int i = 10;
        sharedstring = "share string in maind";
        add(i);
        System.out.println(sharedstring);
        int[] ints = {1, 2, 5};
        add(ints);
        //  System.out.println(Arrays.toString(ints)+" "+sharedstring);
        //sharedstring="some string";
    }

    private static void add(int[] ints) {
        ints[0] = 3;
        ints[1] = 5;
        ints[2] = 115;
        sharedstring = "share string after add ints[] method";
    }

    private static void add(int i) {
        i++;
        sharedstring = "share string after add int method";
    }

    public static void printScipt() {
        System.out.println(sharedstring);
    }
}

