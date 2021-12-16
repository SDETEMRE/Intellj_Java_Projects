package Day_28_Array_Lab_ArrayExamples;

public class Question_4 {
    public static void main(String[] args) {
int[] x = {1,2,3};
int[] y = {5,11,2};

        System.out.println(sum(y));

    }
    public static int sum(int[] arr){
        int sum =0;
        for(int x : arr){
           sum = sum + x;
        }
return sum;
    }
}
