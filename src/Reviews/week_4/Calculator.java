package Reviews.week_4;

public class Calculator {
    public static void main(String[] args) {
        add(5, 6);
        subtract(9,3);
        multiply(8,5);
        divide(4,2);
        System.out.println(add(5, 6));
        System.out.println(subtract(9,3));
        System.out.println(multiply(8,5));
        System.out.println(divide(4,2));
    }

    public static double add(double num1, double num2) {
        double result = num1 + num2;
        return result;

    }

    public static double subtract(double num1, double num2) {
        double result = num1 - num2;
        return result;
    }

    public static double multiply(double num1, double num2) {
        double result = num1 * num2;
        return result;
    }

    public static double divide(double num1, double num2) {
        double result = num1 * num2;
        return result;
    }
}