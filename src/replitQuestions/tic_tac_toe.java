package replitQuestions;

import java.util.Scanner;

public class tic_tac_toe {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char[] game = new char[9];
        for (int i = 0; i < game.length; i++) {
            char[] games = new char[0];
            games[i] = in.next().charAt(0);
        }

        System.out.println(won(game));
    }


    public static String won(char[] x) {

        String X = "Player X won";
        String O = "Player O won";

        if (x[0] == 'X' && x[1] == 'X' && x[2] == 'X') {
            return X;
        } else if (x[3] == 'X' && x[4] == 'X' && x[5] == 'X') {
            return X;
        } else if (x[6] == 'X' && x[7] == 'X' && x[8] == 'X') {
            return X;
        } else if (x[0] == 'O' && x[1] == 'O' && x[2] == 'O') {
            return O;
        } else if (x[3] == 'O' && x[4] == 'O' && x[5] == 'O') {
            return O;
        } else if (x[6] == 'O' && x[7] == 'O' && x[8] == 'O') {
            return O;
        }
return X;
    }


}