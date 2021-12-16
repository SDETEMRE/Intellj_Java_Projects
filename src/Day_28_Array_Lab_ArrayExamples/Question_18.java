package Day_28_Array_Lab_ArrayExamples;

public class Question_18 {
    public static void main(String[] args) {

        int[] x = {1,2,2,1};
        int[] y = {1,1};
        int[] a = {1,2,2,1,13,9,9};

        System.out.println(unluckyNumber(a));
        System.out.println(unluckyNumber(x));
        System.out.println(unluckyNumber(y));

    }
    public static int unluckyNumber(int[] arr){
        int sum = 0;
        for(int i=0; i<arr.length;i++){
            if(arr[i]!=13){
                sum = sum + arr[i];
            }else{
                break;
            }

        }
        return sum;
    }
}
