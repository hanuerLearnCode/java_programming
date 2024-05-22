package DesignPatterns;

public class DeriveAttribute {
    private double area;

    private double h;
    private double w;

    public double getArea() {
        return area;
    }

    public double calculateArea() {
        return w*h;
    }
}
