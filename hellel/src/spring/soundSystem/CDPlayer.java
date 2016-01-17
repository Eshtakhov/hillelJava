package spring.soundSystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Created by ES on 11.01.2016.
 */
@Component
@Scope("prototype")
public class CDPlayer {
    @Autowired
    private CD disk;

    /*
    public CDPlayer(CD disk) {
        this.disk = disk;
    }*/

    public void play(){
        disk.play();
    }
}
