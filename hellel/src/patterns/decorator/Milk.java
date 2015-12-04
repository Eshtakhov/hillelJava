package patterns.decorator;

/**
 * Created by ES on 12.11.2015.
 */
public class Milk extends BeverageDecorator {
    public Milk(Beverage revarage) {
        super(revarage);
        setCost(5);
        setDescription("Milk");
    }
}
