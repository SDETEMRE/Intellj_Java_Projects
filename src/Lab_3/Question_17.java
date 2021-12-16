package Lab_3;

public class Question_17 {

    public static void main(String[] args) {

        String str = "madam"; //str.length()

        String backward="";

        for(int i=str.length()-1; i>=0; i--){
            backward = backward + str.charAt(i);
        }
        if (backward.equals(str)){
            System.out.println(true);

        }else {
            System.out.println(false);
        }


    }
}
