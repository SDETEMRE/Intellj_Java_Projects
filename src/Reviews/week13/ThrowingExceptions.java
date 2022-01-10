package week13;

public class ThrowingExceptions {
    public static void main(String[] args) {

        //exceptions are objects and can be manually created
        RuntimeException e = new RuntimeException();
       // throw e;

        String userName = "";
        if(userName.isEmpty()){
        //    throw e;
        }
// exception object created by JVM, by the compiler
        String turkeyCitizenshipNumber = "123123123";
        try {
            System.out.println(turkeyCitizenshipNumber.charAt(10));
        }catch(IndexOutOfBoundsException exp) {
            System.out.println("exp.getMessage() = " + exp.getMessage());

        }



    }
}
