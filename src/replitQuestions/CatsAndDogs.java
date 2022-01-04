package replitQuestions;

import java.util.Scanner;

public class CatsAndDogs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int countOfCats = 0;
        int countOfDogs = 0;
        String word = scan.next();

        int countCat=0;
        int countDog=0;
        int lastIndexOfCat=0;
        int lastIndexOfDog = 0;

        while(lastIndexOfCat != -1){

            lastIndexOfCat = word.indexOf("cat",lastIndexOfCat);

            if(lastIndexOfCat != -1){
                countCat++;
                lastIndexOfCat+="cat".length();

            }
        }
        while(lastIndexOfDog != -1){

            lastIndexOfDog = word.indexOf("dog",lastIndexOfDog);

            if(lastIndexOfDog != -1){
                countDog++;
                lastIndexOfDog+="dog".length();

            }
        }

        if(countCat==countDog){
            System.out.println("true");
        }else{
            System.out.println("false");
        }



    }
}
