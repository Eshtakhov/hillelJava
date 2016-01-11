package spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring.medival.DamselRescuingKnight;
import spring.soundSystem.CDPlayer;

/**
 * Created by User on 28.12.2015.
 */
public class SpringMain {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        DamselRescuingKnight knight = context.getBean(DamselRescuingKnight.class);
        context.getBean(CDPlayer.class).play();
        CDPlayer player1=context.getBean(CDPlayer.class);
        player1.play();
        CDPlayer player2=context.getBean(CDPlayer.class);
        player2.play();
        if(player1==player2){
            System.out.printf("singleton");
        }else{
            System.out.println("prototype");
        }

        knight.embarkQuest();
    }
}