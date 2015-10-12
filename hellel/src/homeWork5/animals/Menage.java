package homeWork5.animals;

/**
 * Created by Евгений on 12.10.2015.
 */
public abstract class Menage extends animal {
    public boolean isVactinated;
    public String name;

    @Override
    public String publishVoice() {
        String string = "Hello, my name is " + name;
        return string;
    }
}
