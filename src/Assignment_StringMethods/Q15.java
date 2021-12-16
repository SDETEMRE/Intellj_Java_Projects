package Assignment_StringMethods;

public class Q15 {
    public static void main(String[] args) {

        System.out.println(catDog("catdog"));
        System.out.println(catDog("catcat"));
        System.out.println(catDog("cat-cheetah-dog-cat"));
    }
    public static boolean catDog(String str) {
        int counterCat = 0;
        int counterDog = 0;
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.substring(i, i + 3).equals("cat")) {
                counterCat++;
            }
            if (str.substring(i, i + 3).equals("dog")) {
                counterDog++;
            }
        }
        if (counterCat == counterDog) {
            return true;
            }else{
            return false;
        }
    }
}
