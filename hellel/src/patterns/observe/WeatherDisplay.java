package patterns.observe;

/**
 * Created by ES on 05.11.2015.
 */
public class WeatherDisplay {

    int temperation;
    int humplity;
    int prov;

    public void set(int temperation,int humplity, int prov){
        this.temperation=temperation;
        this.humplity=humplity;
        this.prov=prov;
    }

    public void print(){
        System.out.println("temeration "+ temperation + " humplity " + humplity+ " prov " + prov);
    }

}
