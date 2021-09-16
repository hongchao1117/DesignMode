package Factory;

public class ColorFactory extends Factory {
    @Override
    public Color getColor(String color) {
        if (color == null){
            return null;
        }else if(color.equalsIgnoreCase("red")){
            return new Red();
        }
        return null;
    }

    @Override
    public Shape getShape(String shape) {
        return null;
    }
}
