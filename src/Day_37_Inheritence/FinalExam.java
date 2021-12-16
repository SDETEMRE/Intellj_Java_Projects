package Day_37_Inheritence;

public class FinalExam extends GradeActivity {

    private int numQuestions;
    private double pointEach;
    private int numMissed;

    public FinalExam (int numQuestions, int numMissed){

        double numericScore;
        this.numQuestions=numQuestions;
        this.numMissed = numMissed;

        pointEach = 100.0 / numQuestions;
        numericScore = 100.0 - (numMissed * pointEach);

        setScore(numericScore);

    }




}
