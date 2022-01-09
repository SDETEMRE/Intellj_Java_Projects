package Reviews.week_8;

import java.util.*;


public class R01_ArrayListWarmUp {
    public static void main(String[] args) {

      //  System.out.println(listGenerator());






    }

    public static ArrayList<Integer> listGenerator() {
        Scanner scan = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();

        while (true) {
            System.out.println("enter a number");
            list.add(scan.nextInt());
            System.out.println("Do you want to enter another number?");
            String response = scan.next();
            if (response.toLowerCase().equals("no"))
                break;

        }

    return list;
}
}

