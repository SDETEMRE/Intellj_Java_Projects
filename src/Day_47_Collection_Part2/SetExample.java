package Day_47_Collection_Part2;

import java.util.HashSet;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {

        Set<Integer> mySet = new HashSet<>();
        mySet.add(100);
        mySet.add(500);
        mySet.add(800);
        mySet.add(900);
        mySet.add(1000);
        mySet.add(1000);
        mySet.add(1000);
        System.out.println(mySet.toString());



    }
}
