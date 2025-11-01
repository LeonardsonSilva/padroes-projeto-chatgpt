package structural.composite.exemplo02.classes;

import java.util.ArrayList;
import java.util.List;

import structural.composite.exemplo02.interfaces.Graphic;

// composite. Pode conter vários Graphic (Circles, Rectangles, outros Groups)
public class Group implements Graphic {

    private String name;
    private final List<Graphic> children = new ArrayList<>();

    public Group(String name) {
        this.name = name;
    }

    // adiciona um filho ao grupo
    @Override
    public void add(Graphic g) {
        children.add(g);
    }

    @Override
    public void remove(Graphic g) {
        children.remove(g);
    }

    @Override
    public Graphic getChild(int index) {
        return children.get(index);
    }

    // desenha o grupo: desenha a própria "marca" e delega aos filhos
    @Override
    public void draw() {
        System.out.println("Group " + name + " contém: ");
        for (Graphic g : children) {
            g.draw();
        }
    }

    @Override
    public void move(int dx, int dy) {
        System.out.println("Movendo Group "+ name + " por ( "+ dx + "," + dy +")");
        for (Graphic g : children) {
            g.move((dx), dy);
        }
    }

}
