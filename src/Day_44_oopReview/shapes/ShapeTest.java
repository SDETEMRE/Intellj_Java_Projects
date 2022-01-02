package Day_44_oopReview.shapes;

public interface ShapeTest {
    public static void main(String[] args) {

        Shape square = new Square();
        Shape diomand = new Diomand();
        Object shapeObject = new Shape();

        square.draw();
        diomand.draw();

        ((Square)square).squareMethod();




    }
}
