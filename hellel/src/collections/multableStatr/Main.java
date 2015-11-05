package collections.multableStatr;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by ES on 02.11.2015.
 */
public class Main {
    public static void main(String[] args) {
        Set<Car> dreamList=new TreeSet<>(new CarComporator());

        Car ivanDream=new Car("Audi", 2012);
        Car peterDream=new Car("Mercedes",2014);
        Car alexDream=new Car("Porsche", 2000);

        dreamList.add(ivanDream);
        dreamList.add(peterDream);
        dreamList.add(alexDream);

        System.out.println(dreamList);

        dreamList.remove(alexDream);

        //alexDream.model="Accra";


        dreamList.add(alexDream);


        System.out.println("ivan dream is in the list " + dreamList.contains(ivanDream));
        System.out.println("peter dream is in the list " + dreamList.contains(peterDream));
        System.out.println("alex dream is in the list " + dreamList.contains(alexDream));

        System.out.print(dreamList);

        dreamList.remove(alexDream);

        alexDream=new Car("Porsche", 2010);

        dreamList.add(alexDream);

        String a=  "add";
        a +="ASD";

        Set<Car> hashCare = new HashSet<>();
        hashCare.add(alexDream);
        hashCare.add(ivanDream);
        hashCare.add(peterDream);
        System.out.println(" hash code is" +  hashCare.hashCode());
        System.out.println("hash set caontains produckt " + hashCare.contains(new Car("Porsche",2010)));


    }



}
