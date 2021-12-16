package Assignment_StringMethods;

public class Q12 {
    public static void main(String[] args) {

        xX("xHiX");
        xX("apple");
        xX("xUxL");
        xX("JavaX");
    }

    public static void xX(String str) {


        if (str.startsWith("x")||str.startsWith("X"))
            str = str.substring(1);
        if (str.endsWith("x")||str.endsWith("X"))
            str = str.substring(0, str.length() - 1);
        System.out.println(str);

        }
        }


