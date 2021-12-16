package Assignment_StringMethods;

import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String start = input.nextLine();
        String finish = input.nextLine();
        input.close();

        routeInstructions(start, finish);
    }

    public static void routeInstructions(String start, String end) {

        String [] arr = {"A","B","C","D","A","B","C","D"};
        String directions="";
        String result="";

        if(!start.equalsIgnoreCase(end)) {

            for(int i=0; i<8; i++) {

                if(arr[i].equals(start)) {
                    switch(start) {
                        case "A": directions = " right >"; break;
                        case "B": directions = " down >"; break;
                        case "C": directions = " left >"; break;
                        case "D": directions = " up >";

                    }
                    result += directions;
                    start = arr[i+1];
                    if(start.equals(end)) {
                        System.out.println(result.substring(1,result.length()-1) + ": " + end + " found");
                        break;
                    }
                }

            }

        } else {
            System.out.println(start + " found");
        }

    }

}

