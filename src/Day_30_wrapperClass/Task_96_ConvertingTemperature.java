package Day_30_wrapperClass;

import java.util.Arrays;

public class Task_96_ConvertingTemperature {
    public static void main(String[] args) {

        String str1 = "Today weather is sunny and 72 degree. It is a perfect day to practice java.";

        String[] arr = str1.split("and ");
        arr = arr[1].split(" degree");

        String degree = arr[0];

        double degreeF= Double.parseDouble(degree);

        double degreeC = (degreeF - 32) * 5/9;

        System.out.println(degreeF + " degree is equal to " + Math.round(degreeC) + " celcius");



    }
}
