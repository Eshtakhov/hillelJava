package homework4;

import java.util.Scanner;

/**
 * Created by Евгений on 07.10.2015.
 */
public class Exampleimprovearray {
    public static void main(String[] args) {
        ImprovedArray array= new ImprovedArray();
        for (int i=0;i>7;i++){
            array.add("This is "+i);
        }
        System.out.println("Number of elements in the array is "+ array.size());
        Scanner enter=new Scanner(System.in);
        System.out.println("What element in the array you want&");
        int n =enter.nextInt();
        System.out.println(array.get(n));
        System.out.println(array.toString());





    }
}
