package homeWorkCollection;

import java.lang.reflect.Array;
import java.util.*;

/**
 * Created by Евгений on 26.10.2015.
 */
public class Main {
    public static void main(String[] args) {
        float [] array=new float[10];
        System.out.println("Enter your number");
        Scanner scanner=new Scanner(System.in);
        for (int i=0;i<array.length;i++){
            array[i]=scanner.nextFloat();
        }
        float [] integralPart= Arrays.copyOf(array,array.length);
        for(int i=0;i<integralPart.length;i++){
            //0.32f

        }


    }
}
