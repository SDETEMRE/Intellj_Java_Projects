package Lab_3;

public class Question_14 {
    /*
    Given a string, return true if it ends in "ly".
endsLy("oddly") → true
endsLy("y") → false
endsLy("oddy") → false
     */
    public static void main(String[] args) {
        String str = "ly";

        if(str.length()<2){
            System.out.println(false);
            return;
        }
        if(str.substring(str.length()-2).equals("ly")){
            System.out.println(true);
        }else{
            System.out.println(false);
        }



    }
}
