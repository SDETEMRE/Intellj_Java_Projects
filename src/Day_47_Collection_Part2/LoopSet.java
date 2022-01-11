package Day_47_Collection_Part2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LoopSet {
    public static void main(String[] args) {

        Set<Integer> numSet = new HashSet<>();

        numSet.add(50);
        numSet.add(543);
        numSet.add(1150);
        numSet.add(550);
        numSet.add(570);
        numSet.add(93);
        numSet.add(5000);
        numSet.add(950);

        for(Integer n : numSet){
            System.out.print(n + "|");
        }
        System.out.println();

        numSet.forEach(n-> System.out.print(n + "|"));






    }
}
