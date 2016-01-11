package spring;

import javafx.application.Application;

/**
 * Created by ES on 28.12.2015.
 */
public class SpringMain {
    public static void main(String[] args) {
        //ApplicationContext
        DamperReacquireKnight knight=new DamperReacquireKnight();
        knight.setQuest(new DamelReacquireQuest());
        knight.startQuest();

    }
}
