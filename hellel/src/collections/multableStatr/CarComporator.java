package collections.multableStatr;

import patterns.comporator.CatComporator;

import java.util.Comparator;

/**
 * Created by ES on 02.11.2015.
 */
public class CarComporator implements Comparator<Car> {
    @Override
    public int compare(Car o1, Car o2) {
        return o1.model.compareTo(o2.model);
    }
}
