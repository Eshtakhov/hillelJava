package spring.medival;

import org.springframework.beans.factory.annotation.Autowired;
import spring.medival.Quest;

/**
 * Created by User on 28.12.2015.
 */
public class DamselRescuingKnight {

    private Quest quest;

    @Autowired

    public void setQuest(Quest quest) {
        this.quest = quest;
    }

    public void embarkQuest(){
        quest.embark();
    }
    @Deprecated
    public void deplicatedMethod(){
        System.out.println("deplicate is made");
    }
}