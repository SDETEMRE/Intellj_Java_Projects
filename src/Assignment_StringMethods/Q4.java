package Assignment_StringMethods;

public class Q4 {
    public static void main(String[] args) {

        middleThree("fifteen");
        middleThree("apple");
        middleThree("hey");
        middleThree("java");
        middleThree("whatsup");
        middleThree("$");

        }
        public static void middleThree(String str){

            if(str.length()%2!=0 && str.length()>=5){

                System.out.println(str.charAt(str.length()/2-1)+""+str.charAt(str.length()/2)+str.charAt(str.length()/2+1));

            }else{
                System.out.println("invalid");
            }

        }

    }

