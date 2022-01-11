package Day_48_Collection_part3;

import java.util.HashMap;
import java.util.Map;

public class LoopMap {
    public static void main(String[] args) {

        Map<String ,String> dataMap = new HashMap<>();

        dataMap.put("url","qa3.vytrack.com");
        dataMap.put("username","user66");
        dataMap.put("password","abc66");
        dataMap.put("browser","chrome");
        dataMap.put("truckdriver","Bob");
        dataMap.put("storemanager","John");

        //keyset -> returns set with all the keys in the map
        //values -> returns with all the values in the map

        System.out.println("++++++KEYS++++++");
        for (String key : dataMap.keySet()) {
            System.out.println(key);

        }
        System.out.println("++++++VALUES+++++");
        for (String value : dataMap.keySet()) {
            System.out.println(value);
        }
        System.out.println("+++++KEY | VALUES++++");
        for (String key : dataMap.keySet()) {
            System.out.println(key + "|" + dataMap.get(key));
        }

    }
}
