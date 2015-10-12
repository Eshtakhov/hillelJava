package homeWork5.animals;

/**
 * Created by Евгений on 12.10.2015.
 */
public abstract class Wild extends animal {
    public boolean isPredator;

    @Override
    public String publishVoice() {
        if (isPredator) return "Hello I am a wild animal and I am angry";
        else
            return "Hello I am a wild animal";
    }
}
