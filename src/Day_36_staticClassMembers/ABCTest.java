package Day_36_staticClassMembers;

public class ABCTest {
    public static void main(String[] args) {

        ABC.m1();

        ABC o1 = new ABC();
        o1.m1();

    }

    public static void print(){
       // static int a=5;   local variables can not be static
    }

}
