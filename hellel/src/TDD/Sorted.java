package TDD;

import java.lang.reflect.Array;

/**
 * Created by ES on 19.10.2015.
 */
public class Sorted {

    public void sort(Integer[] array) {
        //if(true) return array;
        for(int i=0;i<array.length;i++)
            for(int j=i;j<array.length;i++)
        {
            if (array[j] > array[j + 1]) {
                int min = array[j];
                array[j] = array[j + 1];
                array[j + 1] = min;
            }
        }
       // return array;
    }
}
