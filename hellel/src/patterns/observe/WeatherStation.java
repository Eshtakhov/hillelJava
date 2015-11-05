package patterns.observe;

/**
 * Created by ES on 05.11.2015.
 */
public class WeatherStation {
    int temperation;
    int humplity;
    int prov;

    WeatherDisplay display=new WeatherDisplay();

    WeatherStatic aStatic= new WeatherStatic();

    public void meashureChanched(){
        display.set(this.getTemperation(),this.getHumplity(),this.getProv());

        display.print();
        aStatic.set(temperation,humplity,prov);
        aStatic.display();

    }

    public int getTemperation() {
        return temperation;
    }

    public void setTemperation(int temperation) {
        this.temperation = temperation;
    }

    public int getHumplity() {
        return humplity;
    }

    public void setHumplity(int humplity) {
        this.humplity = humplity;
    }

    public int getProv() {
        return prov;
    }

    public void setProv(int prov) {
        this.prov = prov;
    }
}
