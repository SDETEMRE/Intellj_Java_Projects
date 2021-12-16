package Lab_3;

public class Question_4 {
    public static void main(String[] args) {
        System.out.println(shortenString("Hello"));
        System.out.println(shortenString("abcdefg"));
        System.out.println(shortenString("ab"));
        System.out.println(shortenString(""));
        System.out.println(shortenString("a"));


    }
    public static String shortenString(String str){

        if(str.length()<2){
            return str;
        }else if (str.isEmpty()){
            return "";
        }else {
            return str.substring(0,2);
        }
    }
}
