package patterns.ducks;

/**
 * Created by ES on 26.10.2015.
 */
public class Decoy extends Duck {

    public Decoy() {
        flybeHyrear = new Fly();
        quackBehirear = new Qrauck();
    }

    @Override
    public String display() {
        return "Decoy";
    }
}
