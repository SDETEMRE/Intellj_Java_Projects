package Day_42_Interface;

public class TeslaTruck extends TeslaSemi{ //concrete class (but not first concrete class)

    public TeslaTruck(String model, double price, String color, double engineSize) {
        super(model, price, color, engineSize);
    }
}
