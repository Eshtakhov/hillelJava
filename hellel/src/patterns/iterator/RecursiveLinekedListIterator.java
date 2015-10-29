package patterns.iterator;

import collections.ListEllement;
import collections.RecursiveLinkedList;

import java.util.Iterator;

/**
 * Created by ES on 29.10.2015.
 */
public class RecursiveLinekedListIterator implements Iterator {
    private final RecursiveLinkedList list;
    ListEllement element;

    public RecursiveLinekedListIterator(RecursiveLinkedList list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        if (element == null) {

            return list.getHead() != null;
        }
        return element.next != null;
    }


    @Override
    public Object next() {
        if(element ==null){
        element=list.getHead();}
        else {

        }
    }
}
