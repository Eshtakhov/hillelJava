package patterns.decorator;

/**
 * Created by ES on 12.11.2015.
 */
public abstract class Revarage {
    private int cost;


    private boolean hasMilk;
    private boolean hasCream;

    private int milkCost = 5;
    private int creamCost = 5;

    public Revarage(int cost, String description) {
        this.cost = cost;
        this.description = description;
    }

    private String description;

    public int cost() {
        int total = cost;
        cost=total;

        if (hasMilk) {
            total += milkCost;
        }

        if (hasCream) {
            total += creamCost;
        }
        cost=total;
        return total;
    }

    public String description() {
        return description;
    }

    public void setCream(boolean hasCream) {
        this.hasCream = hasCream;
    }

    public void setMilk(boolean hasMilk) {
        this.hasMilk = hasMilk;
    }

}
