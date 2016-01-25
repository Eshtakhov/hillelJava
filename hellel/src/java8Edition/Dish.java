package java8Edition;

import javax.xml.crypto.Data;

/**
 * Created by ES on 25.01.2016.
 */
public class Dish {
    private String name;
    private int calories;
    private boolean vegearians;
    private DishType type;

    public Dish() {
        this("fregated potato", 400,true, DishType.OTHER);
        System.out.println("in default Dish constructor");
    }

    public Dish(String name, int calories, boolean vegearians, DishType type) {
        this.name = name;
        this.calories = calories;
        this.vegearians = vegearians;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Dish{" +
                "name='" + name + '\'' +
                ", calories=" + calories +
                ", vegearians=" + vegearians +
                ", type=" + type +
                '}';
    }

    public int getCalories() {
        System.out.println("getCalories called");
        return calories;
    }

    public boolean isVegearians() {
        return vegearians;
    }

    public DishType getType() {
        return type;
    }
}
