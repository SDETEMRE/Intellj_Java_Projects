package replitQuestions;

import java.util.Scanner;

public class MiddleOne {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //YOUR CODE HERE

        if(word.length()%2==1 && word.length()>=3){
            System.out.println(word.charAt(word.length()/2));
        }else if(word.length()==1){
            System.out.println(word+word+word);
        }else if(word.length()%2==0 && word.length()>=4){
            System.out.println(word.charAt(word.length()/2-1) + "" + word.charAt(word.length()/2));
        }else if(word.length()==2){
            System.out.println(word+word);
        }



    }
}
