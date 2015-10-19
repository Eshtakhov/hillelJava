package TDD;

import org.junit.Assert;
import org.junit.Test;

import java.sql.SQLOutput;
import java.util.Arrays;

/**
 * Created by ES on 19.10.2015.
 */
public class SourtingTest {

    @Test
    public void sortInAsemeOrder(){
        Integer [] intarray={111,999,555,777,333,888,666,222,444};

        Sorted sorter= new Sorted();
        sorter.sort(intarray);

        Integer [] expected={111,222,333,444,555,666,777,888,999};
        Assert.assertArrayEquals("Sorting is broken",expected,intarray);

    }
    @Test
    public void sortArray(){
        Integer [] intarray={111,999,555,777,333,888,666,222,444};
        Sorted sorter= new Sorted();
        sorter.sort(intarray);

        Integer [] expected={111,222,333,444,555,666,777,888,999};
        Assert.assertArrayEquals("Sorting is broken",expected,intarray);

    }
}
