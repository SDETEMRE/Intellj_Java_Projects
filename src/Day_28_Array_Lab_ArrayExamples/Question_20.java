package Day_28_Array_Lab_ArrayExamples;

public class Question_20 {
    public static void main(String[] args) {

        int[] x = {1,2,2};
        int[] y = {1,2,1,2};
        int[] a = {2,1,2};
        int[] b = {2,2,1,2};
        System.out.println(twinTwo(x));
        System.out.println(twinTwo(y));
        System.out.println(twinTwo(a));
        System.out.println(twinTwo(b));


    }
    public static boolean twinTwo(int[] arr){
        for(int i=0;i<arr.length-1;i++){

            if(arr[i] == 2 && arr[i+1]==2){
                return true;

            }
        }
        return false;
    }
}
