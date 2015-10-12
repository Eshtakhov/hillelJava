package homeWork5.animals;

import OOP.Animal;
import OOP.Animal1;
import OOP.Employee;
import OOP.Vaccinable;

/**
 * Created by ES on 12.10.2015.
 */
public class AbstrackZooExample {
    public static void main(String[] args) {
        animal cat=new Cat();
        Employee employee=new Employee();
        vacinated(employee);
        System.out.println(employee);

    }
    public  static  void vacinated(Vaccinable animal1){
        animal1.vaction("ASD-1");
    }
    public static  void printSound(animal animal){
        System.out.println(animal.publishVoice());
    }
}
