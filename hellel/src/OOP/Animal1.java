package OOP;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by ES on 08.10.2015.
 */
public abstract class Animal1 implements Vaccinable {
    String name ;
    int age;
    private String[] vactions = new String[3];
    private int counterVaction = 0;

    public void vaction(String string) {
        vactions[counterVaction] = string;
        counterVaction++;

    }
@Override
    public String toString() {
        String result = "name: "+name;
        result+="age: "+ age;
        result+="vactions: "+ Arrays.toString(vactions);

        return result;
    }
    public abstract String  getSound();
}
