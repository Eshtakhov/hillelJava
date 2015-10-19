package homeWork5.animals.objectsarray;

import java.util.Random;

/**
 * Created by Евгений on 19.10.2015.
 */
public class Examplesort {
    public static void main(String[] args) {
        int [] mas1=new int[20];
        int [] mas2=new int[20];
        int [] mas3=new int[20];
        for (int i = 0; i < mas1.length; i++) {
            mas1[i] = (int) (Math.random() * 100);
            System.out.print(mas1[i] + " ");
        }
        System.out.print("\n");
        Random rand=new Random();
        for (int i = 0; i < mas2.length; i++) {
            mas2[i] = rand.nextInt(500);
            System.out.print(mas2[i] + " ");
        }
        System.out.print("\n");
        for (int i = 0; i < mas3.length; i++) {
            mas3[i] = (int) (Math.random() * 100);
            System.out.print(mas3[i] + " ");
        }
        System.out.print("\n");
        SortingAnArray sortingAnArray=new SortingAnArray();
        sortingAnArray.sortOne(mas1);
        for (int i = 0; i < mas1.length; i++) {
            System.out.print(mas1[i] + " ");
        }
        System.out.print("\n");
        sortingAnArray.sort2(mas2);
        for (int i = 0; i < mas2.length; i++) {
            System.out.print(mas2[i] + " ");
        }
        System.out.print("\n");
        sortingAnArray.sort3(mas3);
        for (int i = 0; i < mas3.length; i++) {
            System.out.print(mas3[i] + " ");
        }
        System.out.print("\n");



    }
}
