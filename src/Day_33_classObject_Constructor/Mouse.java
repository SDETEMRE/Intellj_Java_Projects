package Day_33_classObject_Constructor;

public class Mouse {

    int numTeeth;
    int numberWhiskers;
    int weight;
// 1
    public Mouse(int weight) {
        this(30,weight);
        this.weight = weight;
        System.out.println("JAVA");


    }
//2
    public Mouse(int numTeeth, int weight) {
        this(numTeeth,20,weight);
        this.numTeeth = numTeeth;
        this.weight = weight;
        System.out.println("JS");
    }
//3
    public Mouse(int numTeeth, int numberWhiskers, int weight) {
        this.numTeeth = numTeeth;
        this.numberWhiskers = numberWhiskers;
        this.weight = weight;
        System.out.println("C");
    }

    public void print(){
        System.out.println(weight + " " + numTeeth + " " + numberWhiskers);
    }



}
