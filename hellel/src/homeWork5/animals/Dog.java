package homeWork5.animals;

/**
 * Created by ������� on 12.10.2015.
 */
public class Dog extends Menage {

    public Dog(){};

    public Dog(String id, int age, double weight, String color, String name) {
        this.id = id;
        this.age = age;
        this.weight = weight;
        this.color = color;
        this.name = name;
        isVactinated = true;
    }

    @Override
    public String publishVoice() {
        String string = "Hello, my name is " + name + "\n" + "Woof";
        return string;

    }
}
