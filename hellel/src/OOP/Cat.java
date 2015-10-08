package OOP;

/**
 * Created by ES on 08.10.2015.
 */
public class Cat extends Animal1 {
    public static final boolean domestic = true;
    public static final boolean predoctor = true;

    boolean pet;
    String color;

    public Cat() {
    }

    public Cat(boolean pet, int age, String name, String color) {
        this.pet = pet;
        this.age = age;
        this.name = name;
        this.color = color;
    }

    @Override
    public String getSound() {
        return "may";
    }

    @Override
    public boolean equals(Object otherCat) {
        if (!(otherCat instanceof Cat)) return false;
        Cat other = (Cat) otherCat;
        if (this.pet != other.pet) return false;
        if (age != other.age) return false;
        if (!name.equals(other.name)) return false;
        if (!color.equals(other.color)) return false;
        return true;
    }

    @Override
    public String toString() {
        return "Cat{}";
    }
}