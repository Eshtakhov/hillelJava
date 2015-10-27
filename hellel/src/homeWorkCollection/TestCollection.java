package homeWorkCollection;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.TreeSet;

/**
 * Created by Евгений on 26.10.2015.
 */
public class TestCollection {
    public static void main(String[] args) {
        Collection<String> arrayList=new ArrayList<>();
        Collection<String> linkedList=new LinkedList<>();
        Collection<String> treeSet= new TreeSet<>();

        WorkWithCollection.fill(arrayList);
        WorkWithCollection.fill(linkedList);
        WorkWithCollection.fill(treeSet);



    }



}
