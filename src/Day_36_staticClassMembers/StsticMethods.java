package Day_36_staticClassMembers;

import java.awt.print.Pageable;

public class StsticMethods {

    static String name = "Apple";
    int age = 10;


    public static void show1(){
        show4(); //you can call static method from static method but cannaot call instance nethod from static method
        System.out.println(name);
    }
    public void show2(){
        show1(); // you can call static from instance method
        System.out.println(name);
        System.out.println(age);
    }
    public void show3(){
        show2();
        show1();

    }
    public static void show4(){

    }
}
