package Reviews.week_6;

import java.util.Arrays;

public class A09_AddElementToArray {
    public static void main(String[] args) {

        String[] students = {"Erdem","Yasin","Recep","Hande","Selena"};

        students = addElement(students,"ibrahim");

        System.out.println(Arrays.toString(students));

    }
    public static String[] addElement(String[] arr,String element){
        String[] newArray = new String[arr.length+1];

        int i = 0;
        for(String each : arr){
            newArray[i++] = each;
        }
        newArray[i] = element;
        return newArray;
    }
}
