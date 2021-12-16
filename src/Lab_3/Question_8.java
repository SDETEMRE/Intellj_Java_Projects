package Lab_3;

public class Question_8 {
    public static void main(String[] args) {

        System.out.println(left2("Hello"));
        System.out.println(left2("java"));
        System.out.println("Hi");

    }
    public static String left2(String str){

        String str1 = str.substring(0,2);
        String str2 = str.substring(2);

        return  str2+str1;


    }
}
