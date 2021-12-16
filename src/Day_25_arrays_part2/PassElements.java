package Day_25_arrays_part2;

public class PassElements {
    public static void main(String[] args) {

        int[] numbers = {5,10,15,20,25,30};

        for(int value : numbers){
            showValue(value);
        }
    }
    public static void showValue(int n){
        System.out.print(n + " ");
    }
}
