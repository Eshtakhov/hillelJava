package exeptions;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ES on 05.11.2015.
 */
public class ExeptionsMain {
    public static void main(String[] args) throws Exception {
        Integer i = null;
        try {
            System.out.println("in try block before");
            getmethodOne(i);
            System.out.println("in try block after");
        } catch (NullPointerException e) {
            System.out.println("something wrong: " + e.getMessage() + e.toString());
        } catch (IndexOutOfBoundsException e) {
            System.out.println("something else wrong: " + e.toString());
        } catch (RuntimeException e) {
            System.out.println(e.getMessage() + " something else wrong: " + e.toString());
        }
    }

    public static void getmethodOne(Integer i) throws Exception {
        // List<Integer> integers=new ArrayList<>();
        //integers.get(1);
        if (true) {

            throw  new Exception("My exception");
        }

        if (true)
            throw new RuntimeException("my own exception");
        getMethodTwo(i);
    }

    public static void getMethodTwo(Integer i) {
        i.toString();
    }
}
