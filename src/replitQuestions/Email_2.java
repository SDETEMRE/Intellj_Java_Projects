package replitQuestions;

import java.util.Locale;
import java.util.Scanner;

public class Email_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String email = scan.next();

        //Input: craig_federighi@apple.com
        //Output:
        //First name: Craig
        //Last name: Federighi
        //Domain: apple

        String firstName = email.toUpperCase().substring(0,1).concat(email.substring(1,email.indexOf('_')));
        String lastName = email.toUpperCase().substring(email.indexOf("_")+1,email.indexOf("_")+2).concat(email.substring(email.indexOf("_")+2,email.indexOf("@")));
        String domain = email.substring(email.indexOf("@")+1,email.indexOf("."));
        System.out.println("First name: " + firstName);
        System.out.println("Last name: " + lastName);
        System.out.println("Domain: " + domain);


    }
}