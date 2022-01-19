package Lab_3;

public class Question_2 {
    public static void main(String[] args) {

        /*
        Create a method that accepts two strings, a and b, return the result of
putting them together in the order abba, e.g. "Hi" and "Bye" returns
"HiByeByeHi".
makeAbba("Hi", "Bye") → "HiByeByeHi"
makeAbba("Yo", "Alice") → "YoAliceAliceYo"
makeAbba("What", "Up") → "WhatUpUpWhat"
         */

        System.out.println( abba("Hi","Bye"));
        System.out.println(abba("Yo","Alice"));
        System.out.println(abba("What","Up"));

    } public static String abba(String str, String str2){

        return str.concat(str2).concat(str2).concat(str);

    }
}
