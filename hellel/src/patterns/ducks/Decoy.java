package patterns.ducks;

/**
 * Created by ES on 26.10.2015.
 */
public class Decoy extends Duck {
    @Override
    public String fly() {
        return "can't fly";
    }

    @Override
    public String display() {
        return "Decoy";
    }
}
