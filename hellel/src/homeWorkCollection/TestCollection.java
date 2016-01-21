package homeWorkCollection;

import java.lang.reflect.Array;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.TreeSet;

/**
 * Created by Евгений on 26.10.2015.
 */
public class TestCollection {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();
        TreeSet<String> treeSet = new TreeSet<>();

        WorkWithCollection.fill(arrayList);
        WorkWithCollection.fill(linkedList);
        WorkWithCollection.fill(treeSet);
        String s = "add to the end";
        Instant begin = Instant.now();
        arrayList.add(s);
        Instant end = Instant.now();
        Duration milliseconds = Duration.between(begin, end);
        System.out.println("time is used to add element in ArrayList at the end is " + milliseconds.getSeconds());
        begin = Instant.now();
        linkedList.add(s);
        end = Instant.now();
        milliseconds = Duration.between(begin, end);
        System.out.println("time is used to add element in LinkedList at the end is " + milliseconds.getSeconds());
        begin = Instant.now();
        treeSet.add(s);
        end = Instant.now();
        milliseconds = Duration.between(begin, end);
        System.out.println("time is used to add element in TreeSet is " + milliseconds.getSeconds());

        s = "add at begin";
        begin = Instant.now();
        arrayList.add(3, s);
        end = Instant.now();
        milliseconds = Duration.between(begin, end);
        System.out.println("time is used to add element in ArrayList at the begining is " + milliseconds.getSeconds());

        begin = Instant.now();
        linkedList.add(3, s);
        end = Instant.now();
        milliseconds = Duration.between(begin, end);
        System.out.println("time is used to add element in LinkedList at the begining is " + milliseconds.getSeconds());


        begin = Instant.now();
        arrayList.get(322556);
        end = Instant.now();
        milliseconds = Duration.between(begin, end);
        System.out.println("time is used to find element by index in ArrayList is " + milliseconds.getSeconds());

        begin = Instant.now();
        linkedList.get(322556);
        end = Instant.now();
        milliseconds = Duration.between(begin, end);
        System.out.println("time is used to find element by index in LinkedList is " + milliseconds.getSeconds());

        s="This is 995776 element of collection";

        begin = Instant.now();
        arrayList.indexOf(s);
        end = Instant.now();
        milliseconds = Duration.between(begin, end);
        System.out.println("time is used to find index of element in ArrayList is " + milliseconds.getSeconds());

        begin = Instant.now();
        linkedList.indexOf(s);
        end = Instant.now();
        milliseconds = Duration.between(begin, end);
        System.out.println("time is used to find index of element in LinkedList is " + milliseconds.getSeconds());

        begin = Instant.now();
        arrayList.remove(3);
        end = Instant.now();
        milliseconds = Duration.between(begin, end);
        System.out.println("time is used to remove element by index in ArrayList at the begin is " + milliseconds.getSeconds());

        begin = Instant.now();
        linkedList.remove(3);
        end = Instant.now();
        milliseconds = Duration.between(begin, end);
        System.out.println("time is used to remove element by index in LinkedList at the begin is " + milliseconds.getSeconds());

        begin = Instant.now();
        arrayList.remove(495897);
        end = Instant.now();
        milliseconds = Duration.between(begin, end);
        System.out.println("time is used to remove element by index in ArrayList at the middle is " + milliseconds.getSeconds());

        begin = Instant.now();
        linkedList.remove(495897);
        end = Instant.now();
        milliseconds = Duration.between(begin, end);
        System.out.println("time is used to remove element by index in LinkedList at the middle is " + milliseconds.getSeconds());

        begin = Instant.now();
        arrayList.remove(995897);
        end = Instant.now();
        milliseconds = Duration.between(begin, end);
        System.out.println("time is used to remove element by index in ArrayList at the end is " + milliseconds.getSeconds());

        begin = Instant.now();
        linkedList.remove(995897);
        end = Instant.now();
        milliseconds = Duration.between(begin, end);
        System.out.println("time is used to remove element by index in LinkedList at the end is " + milliseconds.getSeconds());

        begin = Instant.now();
        arrayList.remove(s);
        end = Instant.now();
        milliseconds = Duration.between(begin, end);
        System.out.println("time is used to remove element by element in ArrayList is " + milliseconds.getSeconds());

        begin = Instant.now();
        linkedList.remove(s);
        end = Instant.now();
        milliseconds = Duration.between(begin, end);
        System.out.println("time is used to remove element by element in LinkedList is " + milliseconds.getSeconds());

        begin = Instant.now();
        treeSet.remove(s);
        end = Instant.now();
        milliseconds = Duration.between(begin, end);
        System.out.println("time is used to remove element by element in TreeSet is " + milliseconds.getSeconds());


    }


}
