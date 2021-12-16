package Day_36_staticClassMembers;

public class DinnerTest {
    public static void main(String[] args) {

        Dinner mom = new Dinner();
        Dinner kid = new Dinner();
        Dinner dad = new Dinner();

        System.out.println("Total slices:" + Dinner.pizzaSlice);

        dad.takeASLice();
        kid.takeASLice();
        mom.takeASLice();

        System.out.println(Dinner.pizzaSlice);

        kid.takeASLice(3);
        dad.takeASLice(2);

        System.out.println(Dinner.pizzaSlice);


    }
}
