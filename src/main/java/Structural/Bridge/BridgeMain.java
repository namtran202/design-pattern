package Structural.Bridge;

public class BridgeMain {
    public static void main(String[] args) {
        Shape redCircle = new Circle(new RedCircle());
        redCircle.draw();
        Shape greenCircle = new Circle(new GreenCircle());
        greenCircle.draw();
    }
}
