package patterns.ducks;

/**
 * Created by ES on 26.10.2015.
 */
public abstract class Duck {

    FlybeHyrear flybeHyrear;

    QuackBehirear quackBehirear;


    public String qruack() {
        return quackBehirear.quack();
    }

    public abstract String display();

    public String fly() {
        return flybeHyrear.fly();
    }

    public String swim() {
        return "i can swim";
    }


}
