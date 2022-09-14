package src.ss4_class_object_java.bai_tap;

public class Fan {
    private final int SLOW =1;
    private final int MEDIUM =2;
    private final int FAST =3;
    private int speed =SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color= "blue";

    public Fan() {
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public String toString(){
        String mess;
        if (on){
            mess= "Speed :"+this.speed+" Color: "+this.color+" Radius: "+this.radius+" fan is on";
        }else {
            mess= " Color: "+this.color+" Radius: "+this.radius+" fan is off";
        }
        return mess;
    }

    public static void main(String[] args) {
        Fan fan1 = new Fan();
        Fan fan2 = new Fan();
        fan1.setSpeed(3);
        fan1.setColor("Yellow");
        fan1.setRadius(10);
        fan1.setOn(true);
        fan2.setSpeed(2);
        fan2.setColor("Blue");
        fan2.setRadius(5);
        fan2.setOn(false);
        System.out.println(fan1.toString());
        System.out.println(fan2.toString());
    }
}
