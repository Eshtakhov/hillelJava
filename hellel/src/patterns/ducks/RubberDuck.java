package patterns.ducks;

/**
 * Created by ES on 26.10.2015.
 */
public class RubberDuck extends Duck{
    @Override
    public String display() {
        return "Rubber Duck";
    }

    @Override
    public String qruack() {
        return "squick";
    }

    @Override
    public String fly() {
        return "fly no way";
    }
}
