package homeWork5.animals;

/**
 * Created by Евгений on 12.10.2015.
 */
public class Dog extends Menage {

    public Dog(){
        super();
    };

    public Dog(String id, int age, double weight, String color, String name,boolean isVactinated) {
        super(id, age, weight, color,name,isVactinated);
    }

    @Override
    public String publishVoice() {
        String string = "Hello, my name is " + this.getName() + "\n" + "Woof";
        return string;

    }
}
