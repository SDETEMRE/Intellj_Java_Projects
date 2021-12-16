package replitQuestions;

public class SprintPrintPattern {
    public static void printHollowRect(int h, int w){

        for(int i=1; i<=h; i++)
        {
            for(int j=1; j<=w; j++)
            {
                if (j==1|| j==w || i==1 || i==h )
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
    }
    }
    public static void main(String[] args) {
        printHollowRect(5,5);
    }

}