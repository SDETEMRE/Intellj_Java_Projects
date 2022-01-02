package Day_44_oopReview.callcenter;

public interface VoiceCallable {

    boolean CAN_CALL = true; // public static final

    //abstract method
    void call(String contact); // public abstract void call

    //static method
    public static void  decline(){
        System.out.println("Mike decline voice call...");

    }

    //default method
    public default void accept(){
        System.out.println("Mike finally accepted voice call...");
    }

}
