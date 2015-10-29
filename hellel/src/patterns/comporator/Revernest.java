package patterns.comporator;

import OOP.Cat;

import java.util.Comparator;

/**
 * Created by ES on 29.10.2015.
 */
public class Revernest implements Comparator<Cat> {

    Comparator<Cat> comparator;

    public Revernest(Comparator<Cat> comparator){
        this.comparator=comparator;

    }
    @Override
    public int compare(Cat o1, Cat o2) {

        return 0;
    }
}
