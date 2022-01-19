package Lab_3;

public class Question_15 {
    public static void main(String[] args) {
        /*
        Given a string, return true if "bad" appears starting at index 0 or 1 in the string, such as
with "badxxx" or "xbadxx" but not "xxbadxx". The string may be any length, including 0.
hasBad("badxx") → true
hasBad("xbadxx") → true
hasBad("xxbadxx") → false
         */

        String str = "xbadxxx";
        String str1 ="xbadxx";
        String str2 ="xxbadxx";

        if(str2.indexOf("bad")<2){
            System.out.println("true1");
        }else{
            System.out.println("false1");
        }
//        if(str.length()<3){
//            System.out.println(false);
//            return;
//        }
//
//        if (str.substring(0,3).equals("bad")||str.substring(1,4).equals("bad")){
//            System.out.println(true);
//        }else{
//            System.out.println(false);
//        }
//


    }
}
