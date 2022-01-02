package Day_34_Constructors;

public class ThisConfusion {
    int a;
    int b;

    public ThisConfusion(int a,int b){
        this.a = a;
        this.b = b;
    }

    public static void main(String[] args) {
        ThisConfusion obj = new ThisConfusion(5,4);
        System.out.println(obj.a+ obj.b);
    }
}
