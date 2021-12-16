package Lab_3;

public class Question_5 {
    public static void main(String[] args) {

        System.out.println(firstHalf("WooHoo"));
        System.out.println(firstHalf("HelloThere"));
        System.out.println(firstHalf("abcdef"));
        System.out.println(firstHalf("avf"));

    }
    public static String firstHalf(String str){
        if(str.length()%2!=0){
            return "Not a even String";
        }else{
            return str.substring(0,str.length()/2);

        }

    }
}
