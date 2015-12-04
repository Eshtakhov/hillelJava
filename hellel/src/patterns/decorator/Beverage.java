package patterns.decorator;

/**
 * Created by ES on 12.11.2015.
 */
public abstract class Beverage {
    protected int cost;


    public void setCost(int cost) {
        this.cost = cost;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    protected String description;

    public int cost() {
        return cost();
    }

    public String description() {
        return description;
    }



}
