package Factory;

public class ShapeFactory extends Factory{

    @Override
    public Color getColor(String color) {
        return null;
    }

    @Override
    public Shape getShape(String shape) {
        if (shape == null) {
            return null;
        }else if(shape.equalsIgnoreCase("circle")){
            return new Circle();
        }
        return null;
    }
}
