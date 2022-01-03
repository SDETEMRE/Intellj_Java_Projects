package day_45_Exceptions;

public class TryCatch {
    public static void main(String[] args) {

        try{
            String str = "Java";
            System.out.println(str.charAt(0));
            System.out.println(str.charAt(1)); //problem here
            System.out.println(str.charAt(8)); //will not be executed

        }catch(Exception e){
            System.out.println("Exception happened in try block and was caught");
        }
        System.out.println("After try catch block");



    }
}
