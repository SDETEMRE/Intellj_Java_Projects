package Day_29_Lab4;

public class Question_22 {
    public static void main(String[] args) {

        int[] x = {1, 4, 1};
        int[] y = {1, 4, 1, 4};
        int[] a = {1,1};
        System.out.println(oneFour(x));
        System.out.println(oneFour(y));
        System.out.println(oneFour(a));
    }

    public static boolean oneFour(int[] arr) {
        int count1 = 0;
        int count4 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                count1++;
            } else if (arr[i] == 4) {
                count4++;
            }
        }
        if (count1 > count4) {
            return true;
        } else {
            return false;
        }
    }
}