package AssignmentOnArray;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {

        short [] scores = {51, 85, 32, 0, 98, 157, 82, 101, 64, 249};
        for(int i=0;i<scores.length;i++){

            if(scores[i]>=50 && scores[i]<100){
                System.out.println("half-century");
            }else if(scores[i]>=100 &&scores[i]<200){
                System.out.println("century");
            }else if(scores[i]>=200){
                System.out.println("double-century");
            }
        }
    }
}
