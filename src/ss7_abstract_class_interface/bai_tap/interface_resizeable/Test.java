package src.ss7_abstract_class_interface.bai_tap.interface_resizeable;


public class Test {
    public static void main(String[] args) {
        Shape[] objects = new Shape[3];
        objects[0] = new Square(5);
        objects[1] = new Rectangle(7, 4);
        objects[2] = new Circle(3);
        System.out.println("Area :");
        for (Shape object : objects){
            System.out.printf(object.getName() +" : ");
            System.out.println( object.getArea());
        }
        for (Shape object : objects){
            float random = (float) (Math.random() * 100)+1;
            object.resize(random);
        }
        System.out.println("After Resize :");
        System.out.println();
        for (Shape object : objects){
            System.out.printf(object.getName()+" : ");
            System.out.println( object.getArea());
        }
    }
}
