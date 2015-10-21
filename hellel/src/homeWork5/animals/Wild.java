package homeWork5.animals;

/**
 * Created by Евгений on 12.10.2015.
 */
public abstract class Wild extends animal {

    private boolean isPredator;

    public Wild(){
        super();
    }

    public Wild(String id, Integer age, double weight, String color,boolean isPredator) {

        super(id,age,weight,color);
        this.isPredator=isPredator;

    }

    public boolean isPredator() {
        return isPredator;
    }

    @Override
    public String publishVoice() {
        if (isPredator) return "Hello I am a wild animal and I am angry";
        else
            return "Hello I am a wild animal";
    }
}
