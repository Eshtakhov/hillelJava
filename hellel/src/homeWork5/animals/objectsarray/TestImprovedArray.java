package homeWork5.animals.objectsarray;

import homeWork5.animals.Wolf;
import homeWork5.animals.animal;
import homework4.ImprovedArray;
import homeworkAbstrackInterface.*;

import javax.swing.plaf.synth.SynthOptionPaneUI;

/**
 * Created by Евгений on 21.10.2015.
 */
public class TestImprovedArray {
    public static void main(String[] args) {
        ImprovedArray array = new ImprovedArray();
        Figure rect = new Rectangle(5, 7);
        Figure elli = new Ellipse(10, 5);
        Figure squ = new Square(9);
        Figure tria = new Triangle(5, 6, 7);
        Figure trap = new Trapeze(3, 5, 2, 4);
        Figure paral = new Parallelogram(7, 6, 60);
        Figure cir = new Circle(6);
        array.add(rect);
        array.add(squ);
        array.add(elli);
        array.add(tria);
        array.add(trap);
        array.add(paral);
        array.add(cir);
        System.out.println(array.size());
        System.out.printf("%.2f %.2f %.2f %.2f %.2f %.2f %.2f", rect.area(), squ.area(), elli.area(), tria.area(), trap.area(), paral.area(), cir.area());

        System.out.println(array.toString());
        animal wolf = new Wolf();
        if (array.contains(wolf)) {
            System.out.println("Wolf in the array");

        } else System.out.println("Error wolf don't find");
        if (array.contains(squ))
            System.out.println("Yes it's an element of array");
        else System.out.println("Error don't find the element");
      //  array.remove(squ);
        System.out.println(array.size());
        System.out.println(array.toString());
        array.remove(3);
        System.out.println(array.size());
        System.out.println(array.toString());
        array.insert(squ, 3);
        System.out.println(array.size());
        System.out.println(array.toString());
        array.substitution(trap, 3);
        System.out.println(array.size());
        System.out.println(array.toString());
        if (array.checkIsempty()) {
            System.out.println("ImprovedArray is empty");

        } else System.out.println("ImprovedArray is not empty");
        array.purification();
        if (array.checkIsempty()) {
            System.out.println("ImprovedArray is empty");

        } else System.out.println("ImprovedArray is not empty");
     //   array.sort();
        System.out.println(array.toString());


    }
}
