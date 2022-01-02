package replitQuestions;

import java.util.Scanner;

public class Email_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String email = scan.next();

        //input: mike_tyson@gmail.com
        //
        //output: tyson_mike@gmail.com

        if(email.contains("_")){
            System.out.println(email.substring(email.indexOf("_")+1,email.indexOf('@')) + "_" + (email.substring(0,email.indexOf('_'))) + "@gmail.com");
        }else{
            System.out.println(email);
        }



    }
}
