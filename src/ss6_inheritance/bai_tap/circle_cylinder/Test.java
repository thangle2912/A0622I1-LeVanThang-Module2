package src.ss6_inheritance.bai_tap.circle_cylinder;

public class Test {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setRadius(5);
        circle.setColor("Blue");
        System.out.println(circle.toString());
        System.out.println("Area : " + circle.getArea());

        Cylinder cylinder = new Cylinder();
        cylinder.setHeight(10);
        cylinder.setColor("Red");
        cylinder.setRadius(5);
        System.out.println(cylinder.toString());
        System.out.println("Volume : "+cylinder.getVolume());
    }
}
