package patterns.ducks;

/**
 * Created by ES on 29.10.2015.
 */
public class FlyNoWay implements FlybeHyrear {
    @Override
    public String fly() {
        return "i'm not fly";
    }
}
