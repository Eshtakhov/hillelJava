package homeWork5.animals;

/**
 * Created by Евгений on 12.10.2015.
 */
public class Cat extends Menage {

    public Cat(){}

    public Cat(String id, int age, double weight, String color, String name) {
        this.id = id;
        this.age = age;
        this.weight = weight;
        this.color = color;
        this.name = name;
        isVactinated = true;
    }


    @Override
    public String publishVoice() {
        String string = "Hello, my name is " + name + "\n" + "Meow";
        return string;

    }
}


