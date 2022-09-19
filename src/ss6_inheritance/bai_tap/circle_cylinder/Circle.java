package src.ss6_inheritance.bai_tap.circle_cylinder;

public class Circle {
    private float radius;
    private String color;

    public Circle() {
    }

    public Circle(float radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public float getArea(){
        final float PI = (float) 3.14;
        return (float) (Math.pow(this.radius,2)*PI);
    }
    public String toString(){
        return  "Radius : "+ this.radius +" Color : "+ this.color;
    }
}
