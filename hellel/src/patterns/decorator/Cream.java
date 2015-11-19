package patterns.decorator;

/**
 * Created by ES on 12.11.2015.
 */
public class Cream extends BeverageDecorator

{
    public Cream(Beverage revarage) {
        super(revarage);
        setCost(6);
        setDescription("cream");
    }
}
