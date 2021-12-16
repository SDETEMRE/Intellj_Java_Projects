package replitQuestions;
import java.util.*;
public class BlackJack {
}

class Main {
    public static void main(String[] args) {
        //DO NOT TOUCH THESE LINES. TEACHER NEEDS THEM TO TEST YOUR CODE:
        // Variables are already declared and given
        Scanner s = new Scanner(System.in);

        int house = s.nextInt();
        int player = s.nextInt();

        if (house + player > 21) {
            System.out.println("player bust");
        } else if (house > player) {
            System.out.println("player loss");
        } else if (player == house) {
            System.out.println("its a tie");
        } else if (player > house) {
            System.out.println("player win");
        }
    }
}