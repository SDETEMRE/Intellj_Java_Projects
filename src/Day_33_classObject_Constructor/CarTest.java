package Day_33_classObject_Constructor;

public class CarTest {
    public static void main(String[] args) {

        car c1 = new car();
        car c2 = new car("Honda", "Civic", 2020,5000,"white");

        car c3 = new car();

        System.out.println(c1.model);
        System.out.println(c2.model);


    }
}
