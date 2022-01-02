package Day_44_oopReview.shapes;

import java.util.ArrayList;
import java.util.List;

import static Day_44_oopReview.shapes.ShapeManager.*;

public class shapeActions {
    public static void main(String[] args) {

        drawSquare((Square)buildShape("square"));
        drawShape(buildShape("shape"));

        List<Shape> myList = new ArrayList<>();
        myList.add(new Shape());
        myList.add(new Square());
        myList.add(new Shape());
        myList.add(new Square());
        myList.add(new Diomand());


        drawShape(myList);
    }
}
