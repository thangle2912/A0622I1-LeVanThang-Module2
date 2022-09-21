package src.ss7_abstract_class_interface.bai_tap.interface_resizeable;

public class Circle  extends Shape implements  IResizeable{
    private float radius;

    public Circle() {
    }

    public Circle(float radius) {
        this.radius = radius;
    }

    public float getArea(){
        return (float) (Math.PI* Math.pow(this.radius,2));
    }
    @Override
    public void resize(double percent) {
        this.radius*=percent;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
    public String getName(){
        return this.getClass().getSimpleName();
    }
}
