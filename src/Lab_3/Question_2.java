package Lab_3;

public class Question_2 {
    public static void main(String[] args) {

        System.out.println( abba("Hi","Bye"));
        System.out.println(abba("Yo","Alice"));
        System.out.println(abba("What","Up"));

    } public static String abba(String str, String str2){

        return str.concat(str2).concat(str2).concat(str);

    }
}
