package ShapeFactory;

import CircleShape.CircleShape;
import RectangularShape.RectangularShape;
import Shape.Shape;
import TriangularShape.TriangularShape;

public class ShapeFactory{
    public Shape getShape(String type){
        if(type==null)
            return null;
        else if(type.equalsIgnoreCase("CircularShape"))
            return new CircleShape();
        else if(type.equalsIgnoreCase("RectangularShape"))
            return new RectangularShape();
        else if(type.equalsIgnoreCase("TriangularShape"))
            return new TriangularShape();
        else
            return null;
    }
}