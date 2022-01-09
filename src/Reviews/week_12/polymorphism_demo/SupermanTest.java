package week_12.polymorphism_demo;

public class SupermanTest {
    public static void main(String[] args) {

        Father spMan1 = new Superman();
        spMan1.playWithKid();
        spMan1.raiseKid();
        spMan1.feedKid();

        ((Superman)spMan1).work("SDET");
        ((Superman)spMan1).getPaid();

        Worker spMan2 = new Superman();
        spMan2.work("QA");
        spMan2.getPaid();
        ((Father)spMan2).feedKid();
        ((Father)spMan2).raiseKid();
        ((Father)spMan2).playWithKid();

        Superman spMan3 = new Superman();
        spMan3.feedKid();
        spMan3.work("DevOPS");




    }
}
