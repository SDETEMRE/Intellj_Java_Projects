package Assignment_StringMethods;

public class Q5 {
    public static void main(String[] args) {

        System.out.println(combineWords("aok","lol"));
        System.out.println(combineWords("ear","pie"));
        System.out.println(combineWords("java","wow"));


    }
    public static String combineWords(String word1, String word2){
        String dummy = "";
        if(word1.length()!=3 || word2.length()!=3){
            System.out.println("cannot merge");

        }else{
            for(int i=0;i<word1.length();i++){
                dummy = dummy.concat(word1.charAt(i)+""+word2.charAt(i));
            }
        }
        return dummy;

    }
}
