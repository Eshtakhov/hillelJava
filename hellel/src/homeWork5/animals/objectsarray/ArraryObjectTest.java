package homeWork5.animals.objectsarray;

import OOP.Cat;
import OOP.Employee;
import OOP.Human;
import homeWork5.animals.Dog;

/**
 * Created by Евгений on 14.10.2015.
 */
public class ArraryObjectTest {

    public static void main(String[] args) {
        Arrayobject example = new Arrayobject();
        example.add("Example");
        example.add("example 2");
        Cat catexample = new Cat(false, 3, "tom", "Grey");
        Cat cat = new Cat();
        Dog dog = new Dog("212", 5, 23, "Brown", "rex");
        example.add(cat);
        example.add(catexample);
        example.add(dog);
        Employee someone = new Employee();
        Human man = new Employee();
        example.add(man);
        example.add(someone);
        for (int i = 0; i < example.size(); i++) {
            System.out.println(example.get(i));
        }
        System.out.println(example.contains("Example"));
        System.out.println(example.contains(System.in));
        example.remove(4);
        for (int i = 0; i < example.size(); i++) {
            System.out.println(example.get(i));
        }
        example.remove(man);
        for (int i = 0; i < example.size(); i++) {
            System.out.println(example.get(i));
        }
    }

}


