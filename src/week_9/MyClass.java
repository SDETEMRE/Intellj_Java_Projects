package week_9;

public class MyClass {
    public int count;

    public void myMethod(MyClass ref) {
       ref.count++;
    }
}
    class Test{
        public static void main(String[] args) {
           MyClass myclass = new MyClass();
           myclass.count=1;
           myclass.myMethod(myclass);
           System.out.println(myclass.count);
        }
    }

