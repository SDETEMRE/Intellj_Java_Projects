package day_19_StringManipulation_part1;

import java.util.Scanner;

public class Task_75 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your name");
        String name = scan.next();
        System.out.println("Please enter your last name");
        String surname = scan.next();

        System.out.println("Total characters in your first and last name is "+ (name.length() + surname.length()));



    }
}
