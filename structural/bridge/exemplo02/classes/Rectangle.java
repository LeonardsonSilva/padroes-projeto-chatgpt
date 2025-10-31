package structural.bridge.exemplo02.classes;

import structural.bridge.exemplo02.interfaces.Color;

// RefinedAbstraction: uma forma concreta - Retângulo
public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height, Color color) {
        super(color);
        this.width = width;
        this.height = height;
    }

    // implementação da operação de alto nível
    @Override
    public void draw() {
        System.out.println("Desenhando um retângulo " + width + " x " + height + " e " + color.applyColor());
    }

}
