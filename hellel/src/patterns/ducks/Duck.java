package patterns.ducks;

/**
 * Created by ES on 26.10.2015.
 */
public abstract class Duck {


    public String qruack() {
        return "qruack";
    }

    public abstract String display();

    public  String fly(){
        return "i'm flying";
    }

    public String swim(){
        return "i can swim";
    }


}
