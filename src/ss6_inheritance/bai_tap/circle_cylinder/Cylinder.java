package src.ss6_inheritance.bai_tap.circle_cylinder;

public class Cylinder extends Circle{
    private float height;

    public Cylinder() {
    }

    public Cylinder(float radius, String color, float height) {
        super(radius, color);
        this.height = height;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getVolume(){
        return getArea()*this.height;
    }
    public String toString(){
        return "Radius : "+ getRadius() +" Color : "+ getColor() + " Height : "+this.height;
    }
}
