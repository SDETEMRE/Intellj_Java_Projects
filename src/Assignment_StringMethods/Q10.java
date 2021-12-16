package Assignment_StringMethods;

import java.util.Locale;

public class Q10 {
    public static void main(String[] args) {
/*
Sample Output:
     Input: craig_federighi@apple.com
    Output:
           First name: Craig
           Last name: Federighi
           Domain: apple
           Top-Level Domain: com
 */
        String  mail = "craig_federighi@apple.com";
        int underScore = mail.indexOf('_');
        int at = mail.indexOf('@');
        int dot = mail.indexOf('.');
        String name = mail.substring(0,underScore);
        String fullName = name.substring(0,1).toUpperCase()+name.substring(1);
        String surName = mail.substring(underScore+1,at);
        String fullSurname = surName.substring(0,1).toUpperCase()+surName.substring(1);
        System.out.println("First name: " + fullName);
        System.out.println("Last name: " + fullSurname);
        System.out.println("Domain :" + mail.substring(at+1,dot));
        System.out.println("Top-Level Domain: " + mail.substring(dot+1));



    }
}
