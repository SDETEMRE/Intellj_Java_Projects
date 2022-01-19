package Lab_3;

public class Question_13 {
    public static void main(String[] args) {
        /*
        Given a string, return a string where for every char in the original, there are two chars.
doubleChar("The") → "TThhee"
doubleChar("AAbb") → "AAAAbbbb"
doubleChar("Hi-There") → "HHii--TThheerree"
         */

        String str = "The";
        String newstr="";


        for (int i=0; i<str.length();i++){
            newstr = newstr+str.substring(i,i+1).concat(str.substring(i,i+1));

        }
        System.out.print(newstr);

    }
}
