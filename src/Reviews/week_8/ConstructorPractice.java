package Reviews.week_8;

public class ConstructorPractice {

    public ConstructorPractice() {
        System.out.println("a");
    }
    public ConstructorPractice(int num ){  //call no argument constructor from here
        this();
        System.out.println("b");

    }
    public ConstructorPractice(String str){
        this(10);
        System.out.println("c");
    }


        public static void main(String [] args){

        new ConstructorPractice("hello");



        }




}
