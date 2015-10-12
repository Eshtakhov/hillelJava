package homeWork5.animals;

/**
 * Created by Евгений on 12.10.2015.
 */
public class Lion extends Wild {
    public Lion(String id, int age, double weight, String color) {
        this.id = id;
        this.age = age;
        this.weight = weight;
        this.color = color;
        isPredator = true;

    }
}
