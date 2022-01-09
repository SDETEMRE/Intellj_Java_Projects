package Reviews.week_6;

import java.util.Arrays;

public class A01_ArraysFundemantals {
    public static void main(String[] args) {
        int count;
        String[] cities = new String [3];
        System.out.println(cities[0] = "New York");
        cities[0] = "New York";
        cities[1] = "Ankara";
        cities[2] = "London";

        String[] citiesMore = {"Istanbul", "Baku", "Berlin"};
        for(String cite : citiesMore){
            System.out.println(cite);
        }

        String[] citiesEvenMore = new String[] {"Izmir", "Amsterdam"};

        System.out.println("The size of citiesMore: " + citiesMore.length);

        System.out.println("If you want to reach first element of citiesMore : " + citiesMore[0]);

        System.out.println("If you want the last element : " + citiesMore[citiesMore.length-1]);

        count = citiesMore[0].length();
        System.out.println("The size of the first element of citiesMore : "+count);

        // default values of arrary data types
        int [] arr1 = new int[3];
        // if you want to print out an array we Arrays.toString from Arrays class
        //for int : 0
        //for double : 0.0, String : null
        System.out.println(Arrays.toString(arr1)); //[0,0,0]






    }
}
