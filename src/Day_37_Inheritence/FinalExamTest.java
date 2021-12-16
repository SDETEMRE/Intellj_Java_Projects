package Day_37_Inheritence;

import java.util.Scanner;

public class FinalExamTest{
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        System.out.println("How many questions is the exam");
        int questions = sc.nextInt();
        System.out.println("How many questions missed");
        int missed = sc.nextInt();
        FinalExam exam = new FinalExam(questions,missed);

        System.out.println("Your grade is: " + exam.getGrade() );



    }
}
