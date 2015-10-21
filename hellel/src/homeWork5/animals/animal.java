package homeWork5.animals;

import OOP.Animal;

/**
 * Created by Евгений on 12.10.2015.
 */
public abstract class animal implements Comparable<animal> {
    private String id;


    private Integer age;
    private double weight;
    private String color;

    public animal() {

    }

    public animal(String id, Integer age, double weight, String color) {
        this.id = id;
        this.age = age;
        this.weight = weight;
        this.color = color;
    }



    public String getId() {
        return id;
    }

    public double getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }
   

    public abstract String publishVoice();

    public int compareTo(animal o) {
        return this.getAge().compareTo(o.getAge());
    }


    public Integer getAge() {
        return age;
    }
}
