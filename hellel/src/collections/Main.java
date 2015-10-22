package collections;

import OOP.Cat;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by ES on 22.10.2015.
 */
public class Main {
    public static void main(String[] args) {

        ArrayList<Cat> cats = new ArrayList<>();
        cats.add(new Cat(true, 3, "tom", "grey"));
       // List
        Set<Cat> set =new TreeSet<>();
        set.add(new Cat(true, 3, "tom", "grey"));
        set.add(new Cat(false,4,"tmo","brown"));
        set.add(new Cat(false,4,"tme","brown"));
        set.add(new Cat(false,4,"tmf","brown"));
        set.add(new Cat(false,4,"tmw","brown"));
        set.forEach(System.out::println);

    }

    public static void freshList() {
        ArrayList list = new ArrayList();
        list.add(new Cat(true, 3, "tom", "grey"));
        list.add(10);
        list.add("word");

        for (Object o : list) {
            System.out.println(o);
        }

        //Catlist.forEach(System.out.println);
        Cat cat = (Cat) list.get(0);

        Integer i = (Integer) list.get(0);
        String s = (String) list.get(2);
    }
}
