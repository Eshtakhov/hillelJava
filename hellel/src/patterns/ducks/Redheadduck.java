package patterns.ducks;

/**
 * Created by ES on 26.10.2015.
 */
public class Redheadduck extends Duck {
    public Redheadduck() {
        flybeHyrear = new Fly();
        quackBehirear = new Qrauck();
    }

    public String display() {
        return "Redhead duck";
    }


}
