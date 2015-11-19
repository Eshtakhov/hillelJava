package patterns.decorator;

/**
 * Created by ES on 12.11.2015.
 */
public abstract class BeverageDecorator extends Beverage {

    private Beverage beverage;

    public BeverageDecorator(Beverage revarage) {
        this.beverage =revarage;

    }

    @Override
    public int cost() {
        return beverage.cost()+ cost;
    }

    @Override
    public String description() {
        return beverage.description()+description;
    }
}
