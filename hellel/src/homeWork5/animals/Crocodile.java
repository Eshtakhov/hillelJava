package homeWork5.animals;

/**
 * Created by Евгений on 12.10.2015.
 */
public class Crocodile extends Wild {
    public Crocodile(String id, int age, double weight, String color) {
        this.id = id;
        this.age = age;
        this.weight = weight;
        this.color = color;
        isPredator = true;

    }
}
