package patterns.observe;

import collections.ListEllement;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ES on 05.11.2015.
 */
public class WeatherStatic {
    List<Integer> temperature= new ArrayList<>();
    List<Integer> humpliest= new ArrayList<>();
    List<Integer> prov =new ArrayList<>();


    public void set(int temperation,int humplity, int prov){
        temperature.add(temperation);        humpliest.add(humplity);
        this.prov.add(prov);
    }

    public void display(){
        System.out.println("temeration "+ temperature + " humplity " + humpliest+ " prov " + prov);
    }
}
