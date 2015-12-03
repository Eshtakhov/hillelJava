package generica;

import collections.ListEllement;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Created by ES on 03.12.2015.
 */
public class Main {
    public static void main(String[] args) {
        List<Person> list=new ArrayList();

        list.add( new Person("Valya"));
       // list.add(new Object());

        Person valay=(Person)list.get(0);
        Object c =list.get(0);

        list.add(new Employee("petr",150));
        
        Pair<Employee, Manager> pair=new Pair();
        
    }
}
