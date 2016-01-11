package spring;

/**
 * Created by ES on 28.12.2015.
 */
public class DamperReacquireKnight {
    private Quest quest= new DamelReacquireQuest();

    public void setQuest(Quest quest) {
        this.quest = quest;
    }

    public  void startQuest(){
        quest.emberk();
    }
}
