package week_11;

public class AtTheGym {
    public static void main(String[] args) {

        FreeWeight freeWeight = new FreeWeight();

        freeWeight.start();
        System.out.println("I lifted weight for 30 minutes : "
                + freeWeight.getCaloriesCount(30) + "Calories");

    }
}
