package structural.bridge.exemplo02.classes;

import structural.bridge.exemplo02.interfaces.Color;

// abstraction: representa a forma que usa uma "implementação" Color
public abstract class Shape {
    protected Color color;

    protected Shape(Color color) {
        this.color = color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public abstract void draw();
}
