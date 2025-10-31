package structural.bridge.exemplo02;

import structural.bridge.exemplo02.classes.BlueColor;
import structural.bridge.exemplo02.classes.Circle;
import structural.bridge.exemplo02.classes.Rectangle;
import structural.bridge.exemplo02.classes.RedColor;
import structural.bridge.exemplo02.classes.Shape;
import structural.bridge.exemplo02.interfaces.Color;

public class Main {
    public static void main(String[] args) {
        Color red = new RedColor();
        Color blue = new BlueColor();

        Shape redCircle = new Circle(5.0, red);
        Shape blueRectangle = new Rectangle(4.0, 6.0, blue);

        redCircle.draw();
        blueRectangle.draw();

        // podemos mudar a implementação em tempo de execução
        redCircle.setColor(blue);
        redCircle.draw();
    }
}
