package Lab_3;

public class Question_9 {
    public static void main(String[] args) {

        System.out.println(right2("Hello"));
        System.out.println(right2("java"));
        System.out.println(right2("Hi"));

    }
    public static String right2(String str){
     return   str.substring(str.length()-2).concat(str.substring(0,str.length()-2));


    }
}
