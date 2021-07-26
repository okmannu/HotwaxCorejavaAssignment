package com.company;

public class Sphere implements ParameterBase{

    private double radius;

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }


    @Override
    public double perimeter() {

        return 0;
    }

    @Override
    public double area() {

        double area = 4*3.14*(radius*radius);
        System.out.println("Area of Sphere is: "+area);
        return 0;

    }

    @Override
    public double volume() throws  ArithmeticException {
        double volume = (4/3)*3.14*(radius*radius*radius);
        System.out.println("Volume of Sphere is: "+volume);
        return 0;
    }
}
