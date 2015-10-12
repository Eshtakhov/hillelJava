package homeWork5.animals;

/**
 * Created by Евгений on 12.10.2015.
 */
public class Hamster extends Menage {
    public Hamster(String id, int age, double weight, String color, String name) {
        this.id = id;
        this.age = age;
        this.weight = weight;
        this.color = color;
        this.name = name;
        isVactinated = false;
    }
}
