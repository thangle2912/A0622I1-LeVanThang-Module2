package src.ss5_access_modifier_staric.bai_tap;

public class Circle {
    private String color="red";
    private double radius = 1.0;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    public double getArea(){
        final double PI =3.14;
        double area = PI*Math.pow(this.radius,2);
        return area;
    }
    public static void main(String[] args) {
        Circle circle = new Circle(2);
        System.out.println("Radius :"+circle.getRadius());
        System.out.println("Area : "+ circle.getArea());
    }
}
