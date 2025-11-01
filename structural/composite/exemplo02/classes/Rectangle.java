package structural.composite.exemplo02.classes;

import structural.composite.exemplo02.interfaces.Graphic;


// leaf: representa um retângulo simples com canto superior esquerdo (x,y) e largura e altura
public class Rectangle implements Graphic {
    private int x, y;  // canto superior esquerdo
    private int width, height;

    public Rectangle(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Rectangle: top-left=("+ x + ", " + y +"), w=" + width + ", h=" + height);
    }

    // move as coordenadas do centro
    @Override
    public void move(int dx, int dy) {
        x += dx;
        y += dy;
        System.out.println("Rectangle movido para (" + x + ", " + y + ")");
    }

    // métodos add/remove/getChild ficam com o comportamento padrão (lançam exceção)
}
