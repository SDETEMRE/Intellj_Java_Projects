package Lab_3;

public class Question_1 {
    public static void main(String[] args) {

        /*
        Create a method that accepts 1 string, e.g. "Bob", return a greeting of
the form "Hello Bob!".
helloName("Bob") → "Hello Bob!"
helloName("Alice") → "Hello Alice!"
helloName("X") → "Hello X!"
         */

        System.out.println(greetings("Bob"));
        System.out.println(greetings("Alice"));
        System.out.println(greetings("X"));

    }public static String greetings (String helloName){

        return  "Hello ".concat(helloName).concat("!");

    }
}
