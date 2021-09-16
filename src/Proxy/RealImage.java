package Proxy;

public class RealImage implements Image {
    private final String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void displayImage() {
        System.out.println("display " + fileName);
    }
}
