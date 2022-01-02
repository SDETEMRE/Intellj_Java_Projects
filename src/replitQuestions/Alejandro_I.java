package replitQuestions;

import java.util.Scanner;

public class Alejandro_I {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();
//a = "dear alejandro.....alot of text"
//
//output: "read"
        //your code here

    if(a.toLowerCase().contains("alejandro")){
        System.out.println("read");
    }else{
        System.out.println("don't read");
    }

    }
}
