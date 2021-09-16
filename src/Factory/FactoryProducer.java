package Factory;

public class FactoryProducer {
    public static Factory getInstance(String choice) {
        if ("".equals(choice) || choice == null) {
            return null;
        }else if(choice.equalsIgnoreCase("color")){
            return new ColorFactory();
        }else if(choice.equalsIgnoreCase("shape")){
            return new ShapeFactory();
        }
        return null;

    }
}
