package collections;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by ES on 26.10.2015.
 */
public class RecursiveLinkedListTest {


    @Test

    public void isChangeONAdd(){
        RecursiveLinkedList list=new RecursiveLinkedList();

        Assert.assertEquals(0, list.size());
        list.add(1);
        Assert.assertEquals(1, list.size());
        list.add(1);
        Assert.assertEquals(2, list.size());
    }
    @Test
    public void  getReturnAdd(){
        RecursiveLinkedList list=new RecursiveLinkedList();
        list.add(1);
        list.add(2);
        list.add(3);

        Assert.assertEquals(1,list.get(0));
        Assert.assertEquals(2,list.get(1));
        Assert.assertEquals(3,list.get(2));

    }
}


