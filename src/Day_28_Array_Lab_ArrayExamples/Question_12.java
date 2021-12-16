package Day_28_Array_Lab_ArrayExamples;

public class Question_12 {
    public static void main(String[] args) {

            int[] x = {1,2,3};
            int[] y = {1,3};

            int[] a = {7,2,3};
            int[] b = {1};

            int[] t = {3,2,4};
            int[] z = {4,3,4};

        System.out.println(haveOne(x,y));
        System.out.println(haveOne(a,b));
        System.out.println(haveOne(t,z));

    }
    public static int haveOne(int[] arr1, int[] arr2){
        int counter =0;
        if(arr1[0]==1){
            counter++;
        }
        if(arr2[0]==1){
            counter++;
        }
        return counter;
    }


}
