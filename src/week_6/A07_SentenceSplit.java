package week_6;

public class A07_SentenceSplit {
    public static void main(String[] args) {

        String amazonResult = "1-48 of over 6,000 results for Java";



        String [] resultArray = amazonResult.split(" ");
        System.out.println(resultArray.length);
        System.out.println("How many results are there in my search: "+ resultArray[3]);
        System.out.println("First element : " + resultArray[0]);
        System.out.println("Second element : " + resultArray[1]);









    }
}
