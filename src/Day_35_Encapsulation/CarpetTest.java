package Day_35_Encapsulation;

public class CarpetTest {
    public static void main(String[] args) {
       Floor f = new Floor(10,20);
       Carpet c = new Carpet(5.2);

        Calculator cal = new Calculator(c,f);

        System.out.println(cal.getTotalCost());


    }
}
