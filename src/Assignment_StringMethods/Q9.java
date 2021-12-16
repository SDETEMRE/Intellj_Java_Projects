package Assignment_StringMethods;

public class Q9 {
    public static void main(String[] args) {

        String email = "mike_tyson@gmail.com";


        if(email.contains("_")){
           int at = email.indexOf('@');
           int underScore = email.indexOf('_');
           String adress = email.substring(at);
           String surName = email.substring(0,underScore);
           String name = email.substring(underScore+1,at);
            System.out.println(name + "_" + surName + adress);
        }else{
            System.out.println(email);
        }

    }

}
