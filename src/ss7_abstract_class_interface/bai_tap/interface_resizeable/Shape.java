package src.ss7_abstract_class_interface.bai_tap.interface_resizeable;

import src.ss7_abstract_class_interface.bai_tap.interface_colorable.IColorable;

public abstract class Shape implements IResizeable {

    public Shape() {
    }

    @Override
    public void resize(double percent) {

    }

    public float getArea() {
        return 0;
    }

    public String getName() {
        return null;
    }
    public void howToColor(){

    }
}
