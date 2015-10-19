package homework4.wearatos;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.Objects;

/**
 * Created by ES on 19.10.2015.
 */
public class Main {
    public static void main(String[] args) {
        int iprimitive=1;
        Integer first=iprimitive
                ;
        Integer second=1;
        Double d=2.3;
        Boolean bool=false;
        System.out.println(first==second);
        first=128;
        second=128;
        System.out.println(first.equals(second));

        Object [] ints= new Object[5];
        ints[0]=1;
        ints[1]=new Integer(12);

    }

    }
