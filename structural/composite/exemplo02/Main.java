package structural.composite.exemplo02;

import structural.composite.exemplo02.classes.Circle;
import structural.composite.exemplo02.classes.Group;
import structural.composite.exemplo02.classes.Rectangle;
import structural.composite.exemplo02.interfaces.Graphic;

public class Main {
    public static void main(String[] args) {
        Graphic circle1 = new Circle(10, 10, 5);
        Graphic rect1 = new Rectangle(0, 0, 20, 10);
        Graphic circle2 = new Circle(50, 50, 10);

        Group groupA = new Group("A");
        groupA.add(circle1);
        groupA.add(rect1);

        Group groupB = new Group("B");
        groupB.add(groupA);
        groupB.add(circle2);

        System.out.println("\n === Desenhar árvore ===");
        groupB.draw();

        System.out.println("\n=== Mover grupo B por (5,5) ===");
        groupB.move(5, 5);

        System.out.println("\n=== Desenhar a árvore após mover ===");
        groupB.draw();

        System.out.println("\n=== Remover circle2 de B e desenhar de novo ===");
        groupB.remove(circle2);
        groupB.draw();

    }

}
