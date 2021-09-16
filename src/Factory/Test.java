package Factory;

public class Test {
    public static void main(String[] args) {
        Factory colorFactory = FactoryProducer.getInstance("color");
        colorFactory.getColor("red").fill();

    }
}
