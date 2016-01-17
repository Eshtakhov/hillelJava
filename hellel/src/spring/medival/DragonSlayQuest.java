package spring.medival;

/**
 * Created by Евгений on 17.01.2016.
 */
public class DragonSlayQuest implements Quest {
    @Override
    public void embark() {
        System.out.println("Dragon slay quest embarked!");
    }
}