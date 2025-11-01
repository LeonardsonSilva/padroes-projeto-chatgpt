package structural.composite.exemplo02.classes;

import structural.composite.exemplo02.interfaces.Graphic;

public class Circle implements Graphic {
    private int x, y;  // coordenadas do centro
    private int radius;

    public Circle(int x, int y, int radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Circle: center=("+ x + ", " + y +"), r=" + radius);
    }

    // move as coordenadas do centro
    @Override
    public void move(int dx, int dy) {
        x += dx;
        y += dy;
        System.out.println("Circle movido para (" + x + ", " + y + ")");
    }

    // métodos add/remove/getChild ficam com o comportamento padrão (lançam exceção)
}
