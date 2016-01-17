package spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import spring.medival.DamselRescuingKnight;
import spring.medival.DamselRescuingQuest;
import spring.soundSystem.CDPlayer;

/**
 * Created by User on 28.12.2015.
 */
@Configuration
@ComponentScan
public class SpringConfig {

    @Bean
    public DamselRescuingKnight knight() {
        DamselRescuingKnight knight = new DamselRescuingKnight();
        return knight;
    }


    @Bean
    @Primary
    public DamselRescuingQuest quest() {
        return new DamselRescuingQuest();
    }
}
