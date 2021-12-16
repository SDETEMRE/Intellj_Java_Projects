package Day_36_staticClassMembers;

public class CalculatorTest {
    public static void main(String[] args) {

        double result = Calculator.plus(55,7);  //static way
        System.out.println("Result: " + result);

        Calculator c = new Calculator();
        System.out.println("Result: " + c.plus(55,7));

        CalculatorTest.m1();

        CalculatorTest c1 = new CalculatorTest();
        c1.m1();

    }
    public static void m1(){
        System.out.println("hello");
    }
}
