package Day_35_Encapsulation;

public class Calculator {
    Carpet carpet; // Composition
    Floor floor;

    public Calculator(Carpet carpet, Floor floor) {
        this.carpet = carpet;
        this.floor = floor;
    }

    public double getTotalCost(){

     return carpet.getCost()*floor.getArea();
    }
}
