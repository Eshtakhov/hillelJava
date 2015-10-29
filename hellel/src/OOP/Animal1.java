package OOP;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by ES on 08.10.2015.
 */
public abstract class Animal1 implements Vaccinable {
    private String name;
    private int age;
    private String[] vactions = new String[3];
    private int counterVaction = 0;

    public Animal1() {
    }

    public int getAge() {
        return age;
    }

    public Animal1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void vaction(String string) {
        vactions[counterVaction] = string;
        counterVaction++;

    }

    @Override
    public String toString() {
        String result = "name: " + name;
        result += "age: " + age;
        result += "vactions: " + Arrays.toString(vactions);

        return result;
    }

    public abstract String getSound();

    public String getName() {
        return name;
    }
}
