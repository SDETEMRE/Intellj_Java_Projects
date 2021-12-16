package week_5;

public class S06_StringCustomMethods {

    String str;

    public void setStr(String s) {
        if (s.isEmpty()) {
            return ;      // like break from the loop, same logic
        }
        str=s;
    }

    public String reverse() {      // I deleted static key word and turned it into instance method

        String reverseResult = "";

        for (int i = str.length()-1; i >= 0 ; i--) {
            reverseResult += str.charAt(i);
        }

        return  reverseResult;
    }



}
