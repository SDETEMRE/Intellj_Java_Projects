package Day_28_Array_Lab_ArrayExamples;

public class Question_16 {
    public static void main(String[] args) {

        int[] x = {2,1,2,3,4};
        int[] y = {2,2,0};
        int[] z = {1,3,5};
        int[] w = {0};

        System.out.println(evenNumbers(x));
        System.out.println(evenNumbers(y));
        System.out.println(evenNumbers(w));

    }

    public static int evenNumbers(int[] arr){
        int counter = 0;
        for(int i =0; i<arr.length;i++){
            if(arr[i]%2==0){
                counter++;

            }
        }
        return counter;


    }
}
