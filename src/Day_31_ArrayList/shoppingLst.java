package Day_31_ArrayList;

import java.util.ArrayList;

public class shoppingLst {

    public static void main(String[] args) {

        ArrayList<String> shoppingList = new ArrayList<>();

        shoppingList.add("paper towel");
        shoppingList.add("dish soap");
        shoppingList.add("trash bag");
        shoppingList.add("clorox");
        shoppingList.add("gloves");
        shoppingList.add("shovel");

        //print number of items
        int count =shoppingList.size();
        System.out.println(count);

        //prnt all items in single line

        System.out.println(shoppingList.toString());
        //print first and last item single line

        System.out.println(shoppingList.get(0) + "|" + shoppingList.get(count-1));

        shoppingList.remove("paper towel");
        shoppingList.remove("shovel");

        System.out.println(shoppingList.toString());
        System.out.println(shoppingList.get(0));

        shoppingList.remove(0);
        System.out.println(shoppingList.toString());

        //print each item
        for(String item : shoppingList){
            System.out.println(item);
        }
        //remove all items at once
        shoppingList.clear();
        System.out.println(shoppingList.toString());



























    }
}
