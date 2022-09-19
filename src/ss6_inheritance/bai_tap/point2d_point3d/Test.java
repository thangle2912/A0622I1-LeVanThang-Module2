package src.ss6_inheritance.bai_tap.point2d_point3d;

public class Test {
    public static void main(String[] args) {
        Point2D point2D = new Point2D();
        point2D.setXY(2,3);
        for (float element : point2D.getXY()){
            System.out.println(element);
        }
        System.out.println( point2D.toString());

        Point3D point3D = new Point3D();
        point3D.setXYZ(3,4,5);
        for (float element : point3D.getXYZ()){
            System.out.println(element);
        }
        System.out.println(point3D.toString());
    }
}
