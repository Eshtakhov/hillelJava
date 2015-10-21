package homeWork5.animals;

/**
 * Created by Евгений on 12.10.2015.
 */
public class Cat extends Menage {

    public Cat() {
        super();
    }

    public Cat(String id, Integer age, double weight, String color, String name,boolean isVactinated) {
        super(id, age, weight, color,name,isVactinated);

    }


    @Override
    public String publishVoice() {
        String string = "Hello, my name is " + getName() + "\n" + "Meow";
        return string;

    }
}


