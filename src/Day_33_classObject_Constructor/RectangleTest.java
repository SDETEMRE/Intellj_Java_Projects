package Day_33_classObject_Constructor;

public class RectangleTest {
    public static void main(String[] args) {

        Rectangle R1 = new Rectangle(5.4,3.2); // calling the constructor

        Rectangle R2 = new Rectangle();

        Rectangle R3 = new Rectangle();

        //new call the constructor and create the object
        //initialize object variables

        System.out.println(R1.length);  //0.0 as a default value but how?
        System.out.println(R1.width);

        R1.length=5.4;
        R1.width=3.2;

        R1.getArea();








    }
}
