package OOP;

import java.util.Objects;

/**
 * Created by ES on 08.10.2015.
 */
public class Zoo {
    public static void main(String[] args) {
        Cat tomCat = new Cat(true,3,"Tom","grey");
        String sound=tomCat.getSound();
        System.out.println(sound);
        Animal animal=new Animal();
        Cat cat=new Cat();
        Animal1 animalcat=new Cat();
        sound=animalcat.getSound();
        System.out.println(sound);
        Object objects=new Cat();
        System.out.print(animalcat.equals(cat));
        System.out.println(cat.toString());

    }

}
