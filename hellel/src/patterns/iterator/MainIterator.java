package patterns.iterator;

import OOP.Cat;
import collections.RecursiveLinkedList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by ES on 29.10.2015.
 */
public class MainIterator {

    public static void main(String[] args) {
        Cat tom= new Cat(false,4,"Tom","Black");
        Cat murzik=new Cat(true,4,"Murzik","White");
        Cat catt=new Cat(false,6,"Black","Black");
        RecursiveLinkedList cats=new RecursiveLinkedList();
        cats.add(tom);
        cats.add(murzik);
        cats.add(catt);



        for (int i=0;i<cats.size();i++){
            cats.get(i);
        }
    }
}
