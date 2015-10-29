package patterns.ducks;

/**
 * Created by ES on 26.10.2015.
 */
public class Mullarduck extends Duck {

    public Mullarduck() {
        flybeHyrear = new Fly();
        quackBehirear = new Qrauck();
    }

    public String display() {
        return "mullar dock";
    }


}
