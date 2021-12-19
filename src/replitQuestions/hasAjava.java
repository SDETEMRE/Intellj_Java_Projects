package replitQuestions;

import java.util.Scanner;

public class hasAjava {
    public static void main(String[] args) {
        boolean exists = false;
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //input: javapython

        if(word.indexOf("java")==0 ||word.indexOf("java")==1){
            System.out.println("true");
        }else{
            System.out.println("false");
        }


    }

}
