package src.ss7_abstract_class_interface.bai_tap.interface_colorable;

import src.ss7_abstract_class_interface.bai_tap.interface_resizeable.Circle;
import src.ss7_abstract_class_interface.bai_tap.interface_resizeable.Rectangle;
import src.ss7_abstract_class_interface.bai_tap.interface_resizeable.Shape;
import src.ss7_abstract_class_interface.bai_tap.interface_resizeable.Square;

public class Test {
    public static void main(String[] args) {
        Shape[] objects = new Shape[4];
        objects[0] = new Square(5);
        objects[1] = new Rectangle(7, 4);
        objects[2] = new Square(5);
        objects[3] = new Circle(3);

        for (Shape object : objects) {
            System.out.println(object.getName());
            object.howToColor();
            System.out.println(object.getArea());

        }
    }
}
