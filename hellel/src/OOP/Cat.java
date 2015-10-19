package OOP;

/**
 * Created by ES on 08.10.2015.
 */
public class Cat extends Animal1 implements Comparable<Cat> {
    public static final boolean domestic = true;
    public static final boolean predoctor = true;
    public String somefield="Cat's field";

    private boolean pet;
    private String color;

    public Cat() {
    }

    public Cat(boolean pet, int age, String name, String color) {
        super(name,age);
        this.pet = pet;
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
        if(!super.equals(other)) return false;
        if (this.pet != other.pet) return false;
        if (!color.equals(other.color)) return false;
        return true;
    }
    public static String getTypeName(){
        return "Cat";
    }
    @Override
    public String toString() {
        return "Cat{}";
    }

    @Override
    public int compareTo(Cat o) {
        this.getName().compareTo(o.getName());

        return 0;
    }
}
