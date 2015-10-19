package homeWork5.animals.objectsarray;

import java.util.Arrays;

/**
 * Created by Евгений on 19.10.2015.
 */
public class SortingAnArray {
    public void sortjne(int[] massive) {
        for (int i = massive.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (massive[j] > massive[j + 1]) {
                    int min = massive[j];
                    massive[j] = massive[j + 1];
                    massive[j + 1] = min;
                }
            }
        }
    }
    public void sort2(int [] massive){
        for (int i = 0; i < massive.length; i++) {
            int min = massive[i];
            int min_i = i;
            for (int j = i + 1; j < massive.length; j++) {
                if (massive[j] < min) {
                    min = massive[j];
                    min_i = j;
                }
            }
            if (i != min_i) {
                int tmp = massive[i];
                massive[i] = massive[min_i];
                massive[min_i] = tmp;
            }
        }
    }
    public void sort3(int [] massive){
        Arrays.sort(massive);
    }

}
