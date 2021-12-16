package Day_29_Lab4;

public class Question_21 {
    public static void main(String[] args) {

        int[] x = {2, 3, 2, 2, 4, 2};
        int[] y = {1,2,3,4};
        System.out.println(sumOfTwo(x));
        System.out.println(sumOfTwo(y));
    }

    public static boolean sumOfTwo(int[] arr) {
        int counter = 0;
        for (int value : arr) {
            if (value == 2) {
                counter++;
            }
        }if(counter==4){
            return true;
        }else {
            return false;
        }

    }

}