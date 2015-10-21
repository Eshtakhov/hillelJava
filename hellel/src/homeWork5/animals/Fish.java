package homeWork5.animals;

/**
 * Created by Евгений on 12.10.2015.
 */
public class Fish extends Menage {

    public Fish(){

    }
    public Fish(String id, int age, double weight, String color, String name,boolean isVactinated) {
        super(id, age, weight, color,name,isVactinated);

    }

    public String publishVoice() {
        return "....";
    }
}
