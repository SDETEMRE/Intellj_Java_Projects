package Reviews.week_5;

public class S07_ExamplesWithCustomClassMethods {
    public static void main(String[] args) {

        S06_StringCustomMethods methods = new S06_StringCustomMethods();

        methods.setStr("JAVA");
        System.out.println(methods.reverse());

        methods.str = "Oscar";
        System.out.println(methods.reverse());

        methods.setStr("");
        System.out.println(methods.reverse());

    }
}
