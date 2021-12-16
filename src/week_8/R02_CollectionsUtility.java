package week_8;

import jdk.jfr.Frequency;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class R02_CollectionsUtility {
    public static void main(String[] args) {

        ArrayList<Character> list = new ArrayList<>();
        list.addAll(Arrays.asList('j','a','v','a','i','s','f','u','n'));

        System.out.println(list.size());
        System.out.println(list);

        //we can reverse this Arraylist
        Collections.reverse(list);
        System.out.println("Reversed list: " + list);

        int freq = Collections.frequency(list,'a');
        System.out.println(freq);

        ArrayList<Integer> nums = new ArrayList<>();
        nums.addAll(Arrays.asList(10,35,100,-23,1000,564));

        System.out.println("Max Number : " + Collections.max(nums));
        System.out.println("Mın Number : " + Collections.min(nums));

        // max and min for characters

        System.out.println("Max Char : " + Collections.max(list));
        System.out.println("Mın Char : " + Collections.min(list));




    }
}
