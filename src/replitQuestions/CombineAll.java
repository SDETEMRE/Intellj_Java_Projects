package replitQuestions;

import java.util.ArrayList;
import java.util.Scanner;

public class CombineAll {
    //create your method below
    public static ArrayList<String> combineAL(ArrayList<String> wordList1, ArrayList<String> wordList2){

        ArrayList<String> combine = new ArrayList<>();

        for (int i = 0; i<wordList1.size(); i++){
            combine.add(wordList1.get(i));

        }for (int i = 0; i<wordList2.size(); i++){
            combine.add(wordList2.get(i));

        }
        return combine;

    }








    // Do not touch below


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int size2 = in.nextInt();
        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        for(int i=0; i < size; i++) {
            list.add(in.nextLine());
        }
        for(int i=0; i < size2; i++) {
            list2.add(in.nextLine());
        }

        System.out.println(combineAL(list, list2));

    }
}
