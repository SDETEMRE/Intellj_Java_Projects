package Day_27_Arays_Part4;

import java.util.Arrays;

public class Pizza2D_Array {
    public static void main(String[] args) {

        String [][] pizzas = {
                {"pineapple","pepperoni"},
                {"anch","mushrooms","olive"},
                {"4chees"},
                {"chicken","tomatoes","onion"},
                {"green papers","zuccini","brocoli","spinac","shrimp"}

        };
        System.out.println(Arrays.toString(pizzas[0]));

        for(String[] pizza : pizzas){
            System.out.print(pizza.length + "-");
            System.out.println(Arrays.toString(pizza));
        }


        for(String piz : pizzas[3]){
            System.out.println(piz);


            int[][] students = {{4,5,6},{12,5,7},{23,56,12,55,3}};

            for(int[] group : students){
                for(int studentID : group){
                    System.out.println(studentID);
                }
            }











        }

    }
}
