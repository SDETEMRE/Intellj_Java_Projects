package Assignment_StringMethods;

import java.util.Locale;

public class Q8 {
    public static void main(String[] args) {

     //   important project, Alejandro we refer to you this
       nameContains("dear alejandro.....a lot of text");
        nameContains("thunder blaz is the best drink in the galaxy...");
        nameContains("important project, Alejandro we refer to you this ....");


    }
    public static void nameContains(String str){
        if(str.toUpperCase().contains("ALEJANDRO")){
            System.out.println("read");
        }else{
            System.out.println("do not read");

        }
      }
    }

