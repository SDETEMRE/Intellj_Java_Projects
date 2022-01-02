package Day_42_Interface;

public interface Electric {

    public static final boolean HAS_BATTERIES = true;
    boolean HAS_BATTERIES2 = false;  // public static final

    public abstract void charge(); // if you do not write it, it is public abstract
    void charge2(); // public abstract

    public default void methodA(){

    }
    public static void methodB(){


    }

}
