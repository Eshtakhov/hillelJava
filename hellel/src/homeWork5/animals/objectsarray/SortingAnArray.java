package homeWork5.animals.objectsarray;

import java.util.Arrays;

/**
 * Created by Åâãåíèé on 19.10.2015.
 */
public class SortingAnArray {
    public void sortOne(int[] array) {
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int min = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = min;
                }
            }
        }
    }
    public void sort2(int [] array){
        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            int min_i = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    min_i = j;
                }
            }
            if (i != min_i) {
                int tmp = array[i];
                array[i] = array[min_i];
                array[min_i] = tmp;
            }
        }
    }
    public void sort3(int [] array){
        Arrays.sort(array);
    }

}
