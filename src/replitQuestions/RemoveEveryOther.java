package replitQuestions;

import java.util.ArrayList;
import java.util.Scanner;

public class RemoveEveryOther {


    class Main {

        public ArrayList<String> removeEveryOther(ArrayList<String> words) {

            ArrayList<String> lst = new ArrayList<>();

            for(String value : words){
                lst.add(value);

            }for (int i=0;i<lst.size();i++){
                lst.remove(0);
            }


            return lst;

        }


    }



        // Do not touch below

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int size = in.nextInt();
            ArrayList<String> list = new ArrayList<>();
            for(int i=0; i < size; i++) {
                list.add(in.next());
            }

            System.out.println("");

        }

    }

