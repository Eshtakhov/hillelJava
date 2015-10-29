package patterns.comporator;

import OOP.Cat;

import java.util.Comparator;

/**
 * Created by ES on 29.10.2015.
 */
public class SortByAge implements Comparator<Cat> {
    @Override
    public int compare(Cat o1, Cat o2) {
        if(o1.getAge()>o2.getAge())
        return 1;
        if (o1.getAge()<o2.getAge())
            return -1;
        else return 0;
    }
}
