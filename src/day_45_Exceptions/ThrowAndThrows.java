package day_45_Exceptions;

public class ThrowAndThrows {

    public static void main(String[] args) throws Exception {

        System.out.println("Hello World");

      //  throw new RuntimeException("This is some exception");

       //throw new Exception("Another exception"); //checked exception you need to handle for it

        String username = "";

        if(username.isEmpty()){
            throw new RuntimeException("User name can not be empty");
        }else{
            System.out.println("Valid username");
        }
    }
}
