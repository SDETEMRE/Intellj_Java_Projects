package Lab_3;

public class Question_1 {
    public static void main(String[] args) {

        System.out.println(greetings("Bob"));
        System.out.println(greetings("Alice"));
        System.out.println(greetings("X"));

    }public static String greetings (String helloName){

        return  "Hello ".concat(helloName).concat("!");

    }
}
