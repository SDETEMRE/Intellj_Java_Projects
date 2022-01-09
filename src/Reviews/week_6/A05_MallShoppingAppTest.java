package Reviews.week_6;

import java.util.Arrays;

public class A05_MallShoppingAppTest {
    public static void main(String[] args) {
        String[] items = {"Shoes", "Jacket", "Gloves", "Airpods", "ipad", "iphone 12 case"};
        double[] prices = {99.99, 150.0, 9.99, 179.99, 249.9, 39.99};
        int[] itemIDs = {12345, 123456, 12347, 12348, 12349, 12350};

        System.out.println("--------Find the index of gloves in the shopping items-----------");
        System.out.println("--------for each loop example----------");
        int j = 0;
        for (String item : items) {
            if (item.equals("Gloves")) {
                System.out.println("index of the item : " + j);
            }
            j++;
        }
        System.out.println("--------for loop example---------");
        for (int i = 0; i < items.length; i++) {
            if (items[i].equals("Gloves")) {
                System.out.println("index of the item : " + i);
                break;
            }
        }

        System.out.println("-----------------Set a boolean variable true if iPad is found--------");
        boolean iPadexists = false;
        for (String item : items) {
            if (item.equalsIgnoreCase("ipad")) {
                iPadexists = true;
                break;
            }
        }
        System.out.println("Boolean variables : " + iPadexists);
        System.out.println(Arrays.toString(items).contains("ipad"));

        System.out.println("------Print a report of each shopping item--------");


        for (int i = 0; i < items.length; i++) {
            System.out.println(items[i] + " - " + prices[i] + " Euro - #" + itemIDs[i]);
        }

        System.out.println("--------------Look for a Jacket in items and print all details------");


        for (int i = 0; i < items.length; i++) {
            if (items[i].equalsIgnoreCase("jacket")) {
                System.out.println(items[i] + " - " + prices[i] + " Euro - #" + itemIDs[i]);
            }


        }
    }
}