package Reviews.week_11;

public class BMW extends Car {

    public BMW(String model, String make, String color, int year) {
        super(model,color, year);
        super.make = make;
    }

    @Override
    public void start() {

        System.out.println("Push the start button");

    }

}
