package generica;

import collections.ListEllement;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

/**
 * Created by ES on 03.12.2015.
 */
public class Main {
    public static void main(String[] args) {
        Employee e = new Manager("Ivan", 500);
        ArrayList<Employee> arrayList = new ArrayList<>();
        List<Employee> list = arrayList;


    }
    public static <K,V> void copy(Pair<K,V> source,Pair<K,V> target){
        target.key=source.key;
        target.value=source.value;

    }



    public static void addEmployee(List<? super Employee> list) {
        list.add(new Employee("Ivan", 999));

    }

    public static void print(List<? extends Employee> list) {
        for (Employee e : list) {
            System.out.println(e);
        }
    }

    public static <T> List<? super T> copy(List<? extends T> source, List<? super T> target) {
        target.addAll(source);
        return target;
    }


    public static void typeOfgenericExample() {
        Employee e = new Manager("Ivan", 500);
        ArrayList<Employee> arrayList = new ArrayList<>();
        List<Employee> list = arrayList;
        Collection<Employee> collection = list;

        list.add(new Employee("Ivan", 500));
        list.add(new Manager("petro", 1000));

        Person p = new Employee("Ivam", 500);

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Ivan", 4500));
        employeeList.add(new Manager("Petro", 5500));

        for (Employee r : employeeList) {
            System.out.println(r);

        }
        List personList = employeeList;

        //for(Objects )
    }

    public static void pairExample() {
        List<Person> list = new ArrayList();

        list.add(new Person("Valya"));
        // list.add(new Object());

        Person valay = (Person) list.get(0);
        Object c = list.get(0);

        list.add(new Employee("petr", 150));

        Pair<Employee, Manager> pair = new Pair();
    }
}
