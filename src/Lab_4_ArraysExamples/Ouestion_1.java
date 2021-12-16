package Lab_4_ArraysExamples;

public class Ouestion_1 {

    public static void main(String[] args) {

        int[] x = {1,2,6};
        int[] y = {6,1,2,3};
        int[] z = {13,6,1,2,3};
        System.out.println(firstOrLastElement(x));
        System.out.println(firstOrLastElement(y));
        System.out.println(firstOrLastElement(z));

    }
    public static boolean firstOrLastElement( int[] arr ){

        if(arr.length<1){
            return false;
        }
        if(arr[0]==6||arr[arr.length-1]==6){
            return true;
        }else
            return false;

    }
}
