package src.ss6_inheritance.bai_tap.point_moveable_point;

public class Test {
    public static void main(String[] args) {
        Point point = new Point();
        point.setXY(2,3);
        System.out.println(point.toString());

        MovablePoint movablePoint = new MovablePoint();
        movablePoint.setXY(5,6);
        movablePoint.setSpeed(5,5);
        System.out.println(movablePoint.toString());
        movablePoint.move();
        System.out.println(movablePoint.toString());
    }
}
