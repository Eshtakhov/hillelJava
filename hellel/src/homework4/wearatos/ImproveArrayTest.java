package homework4.wearatos;

import homework4.ImprovedArray;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Евгений on 10.11.2015.
 */
public class ImproveArrayTest {
    @Test
    public void sizeGetAddMethodImpArr() {
        ImprovedArray improvedArray = new ImprovedArray();
        Assert.assertEquals("size is broken", improvedArray.size(), 0);
        improvedArray.add(1);
        Assert.assertEquals("add is broken", improvedArray.size(), 1);
        improvedArray.add(2);
        improvedArray.add(3);
        improvedArray.add(4);
        Assert.assertEquals("size is broken", improvedArray.size(), 4);
        Assert.assertEquals("get is broken", improvedArray.get(1), 2);

    }

    @Test
    public void toStringEqualsContains() {
        ImprovedArray array = new ImprovedArray();
        array.add(1);
        array.add(2);
        array.add(3);
        array.add(4);
        ImprovedArray improvedArray = new ImprovedArray();
        improvedArray.add(1);
        improvedArray.add(2);
        improvedArray.add(3);
        improvedArray.add(4);

        Assert.assertEquals("equals is broken", array.equals(improvedArray),true);

        Assert.assertEquals("toString is broken",array.toString()," 1, 2, 3, 4, ");

        Assert.assertEquals("Contains is breoken",array.contains(2),true);


    }
}
