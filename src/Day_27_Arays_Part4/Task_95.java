package Day_27_Arays_Part4;

public class Task_95 {
    public static void main(String[] args) {

        int[][] grades = {{68,75,54,80},{100,64,20,50},{10,35,40,90}};
        int avg = 0;
        for(int i =0;i<grades[0].length;i++){

            avg = avg+ grades[0][i];

        }System.out.println(avg/grades[0].length);

        int  total = 0;
        for(int i = 0; i<grades.length;i++){
           total = total+ grades[i][0];

        }System.out.println(total);


    }
}
