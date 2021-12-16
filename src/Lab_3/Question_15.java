package Lab_3;

public class Question_15 {
    public static void main(String[] args) {

        String str = "xbadxxx";

        if(str.length()<3){
            System.out.println(false);
            return;
        }

        if (str.substring(0,3).equals("bad")||str.substring(1,4).equals("bad")){
            System.out.println(true);
        }else{
            System.out.println(false);
        }



    }
}
