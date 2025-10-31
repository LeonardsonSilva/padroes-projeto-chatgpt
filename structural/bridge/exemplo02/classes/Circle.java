package structural.bridge.exemplo02.classes;

import structural.bridge.exemplo02.interfaces.Color;

// RefinedAbstraction: uma forma concreta - Círculo
public class Circle extends Shape {
    private double radius;

    public Circle(double radius, Color color) {
        super(color);
        this.radius = radius;
    }

    // implementação da operação de alto nível
    @Override
    public void draw() {
        System.out.println("Desenhando um círculo de raio " + radius + " e " + color.applyColor());
    }

}
