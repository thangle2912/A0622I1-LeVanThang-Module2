package src.ss4_class_object_java.bai_tap;

import java.util.Scanner;

public class QuadraticEquation {
    private double a,b,c;

    public QuadraticEquation() {
    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }
    public float getDiscriminant(){
        float delta = (float) (Math.pow(this.b,2)-4*this.a*this.c);
        return delta;
    }
    public float  getRoot1(){
        float root = (float) ((float) (-this.b+Math.sqrt(getDiscriminant()))/2*this.a);
        return root;
    }
    public float  getRoot2(){
        float root = (float) ((float) (-this.b-Math.sqrt(getDiscriminant()))/2*this.a);
        return root;
    }
    public float getRoot(){
        float root = (float) ((-this.b)/2*this.a);
        return root;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a, b, c : ");
        double a,b,c;
        a = scanner.nextDouble();
        b = scanner.nextDouble();
        c = scanner.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a,b,c);
        if (quadraticEquation.getDiscriminant() >0){
            System.out.println("The equation has two roots : "+quadraticEquation.getRoot1()+" "+quadraticEquation.getRoot2());
        }else if (quadraticEquation.getDiscriminant() == 0){
            System.out.println("Equation has one root : " + quadraticEquation.getRoot());
        }else {
            System.out.println("The equation has no real roots");
        }
    }
}
