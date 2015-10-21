package homeWork5.animals;

/**
 * Created by Евгений on 12.10.2015.
 */
public class GuideDog extends Menage {
    private boolean isTrained;

    public GuideDog(){

    }

    public GuideDog(String id, int age, double weight, String color, String name, boolean isVactinated, boolean isTrained) {
        super(id, age, weight, color, name, isVactinated);
        this.isTrained = isTrained;
    }

    private boolean comeHome() {
        if (isTrained) return true;
        else return false;
    }


    @Override
    public String publishVoice() {
        if (comeHome()) {
            String string = "Hello, my name is " + this.getName() + "\n" + "I can take you home"+"\n" + "Woof";
            return string;
        } else {
            String string = "Hello, my name is " + this.getName() + "\n" + "Woof"+"\n";
            return string;
        }
    }

}


