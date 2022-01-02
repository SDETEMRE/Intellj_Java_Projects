package replitQuestions;

import java.util.Scanner;

public class ReverseIt {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //WRITE YOUR CODE HERE
        String flag="";
        if(word.length()<5){
            System.out.println("Too short!");
        }else if(word.length()>5){
            System.out.println("Too long!");
        }else{
            for(int i= word.length()-1; i>=0; i--){
              flag = flag + word.charAt(i);
            }
            System.out.println(flag);
        }




    }
}
