package Reviews.week_11;

public abstract class Exercise {

    public void start() {
        System.out.println("Warming up and starting the exercise");
    }

    public abstract void perform();

    public abstract int getCaloriesCount(int minutes);
}
