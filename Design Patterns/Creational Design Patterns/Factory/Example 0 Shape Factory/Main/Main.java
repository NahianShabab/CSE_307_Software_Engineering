package Main;

import Shape.Shape;
import ShapeFactory.ShapeFactory;

public class Main {
    public static void main(String[] args) {
        ShapeFactory shapeFactory=new ShapeFactory();
        Shape shapes[]=new Shape[3];
        shapes[0]=shapeFactory.getShape("CircularShape");
        shapes[1]=shapeFactory.getShape("TriangularShape");
        shapes[2]=shapeFactory.getShape("RectangularShape");
        for(Shape s:shapes)
            s.drawShape();
    }
}
