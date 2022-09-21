package src.ss7_abstract_class_interface.bai_tap.interface_resizeable;

public class Rectangle  extends Shape implements IResizeable{
    private float length;
    private float width;

    public Rectangle() {
    }

    public Rectangle(float length, float width) {
        this.length = length;
        this.width = width;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }
    public float getArea(){
        return this.length*this.width;
    }

    @Override
    public void resize(double percent) {
        this.width *=percent;
        this.length*=percent;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }
    public String getName(){
        return this.getClass().getSimpleName();
    }
}
