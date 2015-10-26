package patterns.ducks;

/**
 * Created by ES on 26.10.2015.
 */
public class Lake {
    public static void main(String[] args) {
        Duck duck=new RubberDuck();
        System.out.println(duck.display());
        System.out.println(duck.fly());
        System.out.println(duck.qruack());
    }
}
