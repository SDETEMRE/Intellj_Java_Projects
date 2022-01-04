package day_45_Exceptions;

public class ThrowAndThrows {

    public static void main(String[] args) {

        System.out.println("Hello World");

      //  throw new RuntimeException("This is some exception");

       //throw new Exception("Another exception"); //checked exception you need to handle for it

        String username = "";

        if(username.isEmpty()){
            throw new RuntimeException("User name can not be empty");
        }else{
            System.out.println("Valid username");
        }


        try {
            sleep3(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static void sleep(int seconds) throws InterruptedException {
        Thread.sleep(1000);
    }

    public static void sleep2(int seconds) throws InterruptedException {
        sleep(seconds);
    }

    public static void sleep3(int seconds) throws InterruptedException {
       sleep2(seconds);
        }
    }

