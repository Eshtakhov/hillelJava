package patterns.comporator;

import OOP.Cat;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * Created by ES on 29.10.2015.
 */
public class CatComporator {
    public static void main(String[] args) {

        Cat tom= new Cat(false,4,"Tom","Black");
        Cat murzik=new Cat(true,4,"Murzik","White");
        Cat catt=new Cat(false,6,"Black","Black");
        List<Cat> cats=new ArrayList<>();
        cats.add(tom);
        cats.add(murzik);
        cats.add(catt);
        System.out.println("Before sort " + cats);

        Collections.sort(cats);

        System.out.println("after sort " + cats);


    }
}
