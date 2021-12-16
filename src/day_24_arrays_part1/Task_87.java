package day_24_arrays_part1;

import java.util.Scanner;

public class Task_87 {
    public static void main(String[] args) {

        String[] days = new String[7];
        days[0] = "Sunday";
        days[1] = "Monday";
        days[2] = "Tuesday";
        days[3] = "Wednesday";
        days[4] = "Thursday";
        days[5] = "Friday";
        days[6] = "Saturday";

        Scanner sc = new Scanner(System.in);
        System.out.print("enter index number of days ");
        int day = sc.nextInt();

        System.out.println("Day is " + days[day]);


    }
}
