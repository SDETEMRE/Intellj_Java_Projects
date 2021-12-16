package Day_31_ArrayList;

import java.util.ArrayList;

public class arrayListExample {

    public static void main(String[] args) {

        //languages
        //Print size arrayList
        //read couple of elements


        ArrayList<String > languages = new ArrayList<>();
        languages.add("English");
        languages.add("French");
        languages.add("Spanish");

        System.out.println(languages.size());
        System.out.println(languages.get(0));
        System.out.println(languages.get(1));

        System.out.println(languages.toString());
        languages.add("Russian");

        System.out.println(languages.toString());

        languages.remove(0);
        System.out.println(languages.toString());










    }
}
