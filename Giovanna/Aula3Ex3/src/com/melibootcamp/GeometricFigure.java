package com.melibootcamp;

public abstract class GeometricFigure {
    private double area;
    public abstract double area ();

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "A area calculada eh" + area;
    }
}
