package Day_30_wrapperClass;

public class boxing {
    public static void main(String[] args) {
        // autoboxing --> primitive to object
        Integer num1 = 1234;
        int n = 5;
        Integer num2 =n;

        //unboxing

        Double d1 = new Double(34.2);
        double d2 = d1;
        System.out.println("di:" + d1);
        System.out.println("d2:" + d2);

        long l1 = new Long(60000L); //unboxing
        Long l2 = new Long(34234234);// no boxing

        long l3 = l2;  //unboxing

        int x =345;
        double y = x;  //casting

        Integer num3 = Integer.valueOf(345);
      //  Double d3 = num3; //casting is not possible for wrapper class






    }
}
