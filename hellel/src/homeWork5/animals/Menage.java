package homeWork5.animals;

/**
 * Created by Евгений on 12.10.2015.
 */
public abstract class Menage extends animal {
    private boolean isVactinated;


    private String name;

    public Menage() {
        super();
    }

    public Menage(String id, Integer age, double weight, String color, String name, boolean isVactinated) {
        super(id, age, weight, color);
        this.isVactinated = isVactinated;
        this.name = name;

    }

    public String getName() {
        return name;
    }

    @Override
    public String publishVoice() {
        String string = "Hello, my name is " + name;
        return string;
    }
}
