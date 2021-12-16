package Day_31_ArrayList;

import java.util.ArrayList;

public class arryaListIntro {
    public static void main(String[] args) {

        //creating an arrayList

        ArrayList<String > names = new ArrayList<>();
        ArrayList<Integer> nums = new ArrayList<>();

        //Assigning values to arrayList

        names.add("Mike");
        names.add("Smith");
        names.add("John");

        nums.add(99);
        nums.add(656);
        nums.add(new Integer("100"));

        // Reading from arrayList

        System.out.println(names.get(0));
        System.out.println(names.get(1));

        System.out.println("Names count: " + names.size());
        System.out.println("Nums count: " + names.size());

        System.out.println(names.toString());









    }
}
