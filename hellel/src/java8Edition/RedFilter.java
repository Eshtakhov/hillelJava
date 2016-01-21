package java8Edition;

import java.util.logging.Filter;

/**
 * Created by ES on 14.01.2016.
 */
public class RedFilter implements filtrator {
    @Override
    public boolean test(Apple apple) {
        if (apple.getColor().equals("Red")) {
            return true;
        }
        return false;
    }
}
