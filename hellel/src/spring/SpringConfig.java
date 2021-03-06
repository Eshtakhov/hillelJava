package spring;

import org.springframework.context.annotation.*;
import spring.medival.DamselRescuingKnight;
import spring.medival.DamselRescuingQuest;
import spring.medival.DragonSlayQuest;
import spring.soundSystem.CDPlayer;
import spring.soundSystem.YellowSunbmarineCD;

/**
 * Created by User on 28.12.2015.
 */
@Configuration
@ComponentScan
public class SpringConfig {

    @Bean
    @Scope("prototype")
    public DamselRescuingKnight knight() {
        DamselRescuingKnight knight = new DamselRescuingKnight();
        return knight;
    }

    @Bean
    public DamselRescuingQuest quest(){
        return new DamselRescuingQuest();
    }

    @Bean
    @Primary
    public DragonSlayQuest dragonSlayQuest(){
        return new DragonSlayQuest();
    }

   /* @Bean
    YellowSubmarineCd yellowSubmarineCd(){
        return new YellowSubmarineCd();
    }
    @Bean
    CdPlayer cdPlayer(){
        return new CdPlayer(yellowSubmarineCd());
    }*/

}