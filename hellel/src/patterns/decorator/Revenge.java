package patterns.decorator;

/**
 * Created by ES on 12.11.2015.
 */
public abstract class Revenge {
    private int cost;

    public Revenge(int cost, String description) {
        this.cost = cost;
        this.description = description;
    }

    private String description;

    public int cost(){
        return cost;
    }

    public String description(){
        return  description;
    }

}
