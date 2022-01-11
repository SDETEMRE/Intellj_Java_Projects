package Day_48_Collection_part3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {

        List<Integer> items2 = new ArrayList<>();
        items2.add(10);


        Map<String,Double> items = new HashMap<>();
        items.put("Apple",3.49);
        items.put("Flowers",10.99);
        items.put("Eggs",4.99);
        items.put("Milk",6.0);
        items.put("Cherries",5.99);
        items.put("Apple",5.49);


        System.out.println(items.size());
        System.out.println(items.toString());
        System.out.println(items.isEmpty());

        System.out.println(items.get("Apple"));
        System.out.println(items.get("Milk"));



    }
}
