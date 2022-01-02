package Day_43_polymorphism;

public class AppleWatch extends AppleDevice{
    @Override
    public void use() {
        System.out.println("Apple watch | Sport");
    }
    public void wear(){
        System.out.println("wearing appleWatch");
    }
}
