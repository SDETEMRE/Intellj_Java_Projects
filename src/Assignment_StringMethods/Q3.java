package Assignment_StringMethods;

public class Q3 {

    public static void main(String[] args) {

        wordSamples("oak");
        wordSamples("javav");  // 4--> 1,2
        wordSamples("#");
        wordSamples("q");
        wordSamples("java");
        wordSamples("apples"); // 6--->2,3
        wordSamples("#$%^&*!%"); //8--->3,4
        wordSamples("@@");

    }

    public static void wordSamples(String str) {

        if (str.length() % 2 != 0 && str.length() >= 3) {
            System.out.println(str.charAt(str.length() / 2));
        }else if(str.length() % 2 != 0 && str.length()==1){
            System.out.println(str+str+str);
        }else if(str.length() % 2 == 0 && str.length()>= 4){
            System.out.println("");                                 //middle characters???
        }else if(str.length() % 2 == 0 && str.length()==2){
            System.out.println(str+str);
        }
    }
}













