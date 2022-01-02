package replitQuestions;

import java.util.ArrayList;
import java.util.Scanner;

public class EqualsJavaPython {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String sentence = scan.nextLine();

        int countJava=0;
        int countPython=0;

        String[] st = sentence.split(" ");
       for(int i=0; i< st.length; i++){
           if(st[i].toLowerCase().contains("java")){
               countJava++;
           }else if(st[i].toLowerCase().contains("python")){
               countPython++;
           }
       }
        if (countJava==countPython){
            System.out.println("true");
        }else{
            System.out.println("false");
        }


    }

}
