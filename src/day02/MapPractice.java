package day02;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapPractice {

    public static void main(String[] args) {

        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();

        map.put("John", 100000);
        map.put("Bella", 110000);
        map.put("Alex", 120000);
        map.put("Max", 130000);

        System.out.println(map);

        System.out.println("----------------------------------");
        // iterate the map by keys

        for (String each : map.keySet()) {
            System.out.println(each);
        }

        System.out.println("----------------------------------");
        // iterate the map by values

        for (Integer each : map.values()) {
            System.out.println(each);
        }

        System.out.println("----------------------------------");
        // iterate the map by pairs

        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            //System.out.println(pair);
            System.out.println(pair.getKey() +" : "+pair.getValue());
        }

        System.out.println("----------------------------------");
        // lambda:

        map.forEach( (k,v) -> System.out.println(k+" : "+v) );




    }

}
