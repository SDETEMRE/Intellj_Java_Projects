package Day_28_Array_Lab_ArrayExamples;

public class Question_10 {
    public static void main(String[] args) {

        int[] x = {2,2};
        int[] y = {3,3};
        int[] a ={2,3};

        System.out.println(includesdouble(x));
        System.out.println(includesdouble(y));
        System.out.println(includesdouble(a));

    }
    public static boolean includesdouble(int[] arr){
        int counter2 = 0;
        int counter3 = 0;
        for(int i = 0;i<arr.length;i++){
            if(arr[i] == 2){
                counter2++;
            }else if(arr[i]==3){
                counter3++;
            }
        }if(counter2==2||counter3==2){
            return true;
        }else{
            return false;
        }

    }
}
