package src.ss7_abstract_class_interface.bai_tap.interface_resizeable;

import src.ss7_abstract_class_interface.bai_tap.interface_colorable.IColorable;

public class Square extends Shape implements IResizeable, IColorable {
    private float side;

    public Square() {
    }

    public Square(float side) {
        this.side = side;
    }

    public float getSide() {
        return side;
    }

    public void setSide(float side) {
        this.side = side;
    }
    public float getArea(){
        return (float)Math.pow(this.side,2);
    }

    @Override
    public void resize(double percent) {
        this.side*=percent;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                '}';
    }
    public String getName(){
        return this.getClass().getSimpleName();
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides !");
    }
}
