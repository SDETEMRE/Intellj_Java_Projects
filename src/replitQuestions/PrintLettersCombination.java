package replitQuestions;

public class PrintLettersCombination {
    public static void main(String[] args) {
        char[] letters = {'z', 'y', 'x', 'w', 'v'};
        for (int i = 0; i < 5; i++) {
            for (int x = 0; x < 5; x++) {
                System.out.print(letters[i]);
                System.out.println(letters[x]);
            }
        }
    }
}