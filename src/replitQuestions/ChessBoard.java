package replitQuestions;

import java.util.Arrays;

public class ChessBoard {
    public static void main(String[] args) {
        String[][] chessBoard = new String[8][8];
        //WRITE YOUR CODE HERE

        for(int i =0; i<8; i++){

            for(char alphabet ='a'; alphabet <= 'h'; alphabet ++){

                int col = alphabet-97;
                chessBoard[i][col] = i+1 + "" + alphabet;
            }

        }


        //DO NOT CHANGE
        System.out.println(Arrays.deepToString(chessBoard));
    }
}
