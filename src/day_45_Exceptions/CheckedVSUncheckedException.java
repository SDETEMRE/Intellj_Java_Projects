package day_45_Exceptions;

public class CheckedVSUncheckedException {
    public static void main(String[] args) {

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
