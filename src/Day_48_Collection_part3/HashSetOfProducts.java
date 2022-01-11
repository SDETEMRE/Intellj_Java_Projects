package Day_48_Collection_part3;

import Day_46_Collection_Part1.Product;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class HashSetOfProducts {
    public static void main(String[] args) {

        Set<Product> prodSet = new HashSet<Product>();
        prodSet.add(new Product("book",25.99));
        prodSet.add(new Product("book",25.99));
        prodSet.add(new Product("magazine",7.99));

        System.out.println(prodSet.toString());

        for (Product p : prodSet) {
            System.out.println(p);
            System.out.println(p.getPrice());

        }
        System.out.println("=================================");
        //printing each product by using forEach method
        prodSet.forEach(x-> System.out.println(x.getName()));


    }
}
