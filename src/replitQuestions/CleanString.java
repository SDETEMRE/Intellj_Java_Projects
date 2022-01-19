package replitQuestions;

import java.util.*;

public class CleanString {
    public static String clean(String text, String badWord) {

     ArrayList<String> str = new ArrayList<>();
     String[] first = text.split(" ");
        for (int i = 0; i < first.length; i++) {
            str.add(first[i]);

        }

        for(int j=0; j< first.length; j++){
            if(str.get(j).equals(badWord)){
                str.remove(str.get(j));
            }
        }
        return str.toString();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(in.nextLine() + in.nextLine());
    }
}