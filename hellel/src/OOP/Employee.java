package OOP;

import java.util.Arrays;

/**
 * Created by ES on 12.10.2015.
 */
public class Employee extends Human implements Vaccinable{
    private String poitions;
    private String[] vactions = new String[3];
    private int counterVaction = 0;

    public void vaction(String string) {
        vactions[counterVaction] = string;
        counterVaction++;

    }

    @Override
    public String toString() {
        return "Employee{" +
                "poitions='" + poitions + '\'' +
                ", vactions=" + Arrays.toString(vactions) +
                ", counterVaction=" + counterVaction +
                '}'+ super.toString();
    }
}
