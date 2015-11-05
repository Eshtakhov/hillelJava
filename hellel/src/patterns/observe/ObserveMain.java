package patterns.observe;

/**
 * Created by ES on 05.11.2015.
 */
public class ObserveMain {
    public static void main(String[] args) {
        WeatherStation station=new WeatherStation();
        station.setTemperation(20);
        station.setHumplity(50);
        station.setProv(10);

        station.meashureChanched();

        station.setTemperation(15);
        station.setHumplity(35);
        station.setProv(5);

        station.meashureChanched();

    }
}
