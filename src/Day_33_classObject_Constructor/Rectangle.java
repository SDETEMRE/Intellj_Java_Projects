package Day_33_classObject_Constructor;

public class Rectangle {

    double length;
    double width;

    public void getArea(){
        System.out.println(length*width);
    }
    // constructor, class name and doesn't have return type,no arguments



    // with argument
    public Rectangle(double a, double b){
        length=a;
        width=b;

    }
    public Rectangle(){   //if no parameters constructor your variables are fixed
        length=5.4;
        width=2.7;
    }

    public Rectangle(int a,float b){

    }

}
