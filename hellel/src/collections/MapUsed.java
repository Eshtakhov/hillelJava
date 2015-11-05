package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;


public class MapUsed {
    public static void main(String[] args) {
        Map<String,Integer>  nameToSalary= new HashMap<>();
        nameToSalary.put("VAsya",52);
        nameToSalary.put("Kolya", 200);
        nameToSalary.put("Tolya", 50);
        nameToSalary.put("Petya", 100);

        System.out.println(nameToSalary.get("Kolya"));

        System.out.println(nameToSalary.keySet());

        for (String name: nameToSalary.keySet()){
            Integer salary= nameToSalary.get(name);
            System.out.println(name + " "+ salary);
        }

        for(Map.Entry<String,Integer> entry: nameToSalary.entrySet()){
            String name=entry.getKey();
            Integer salary = entry.getValue();
            System.out.println(name + " "+ salary);


        }
    }
}
