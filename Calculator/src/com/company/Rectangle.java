package com.company;

import java.util.Scanner;

public class Rectangle implements ParameterBase {


    private double width;
    private double length;

    public void setRectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }


    @Override
    public double perimeter()  {
        double perimeter = 2 * (length + width);
        System.out.println(" Perimeter of Rectangle is:- " + perimeter);
        return 0;
    }

    @Override
    public double area() throws ArithmeticException {
        double area = (length * width);
        System.out.println(" Area of Rectangle is:- " + area);
        return 0;

    }

    @Override
    public double volume() {
        // TODO Auto-generated method
        return 0;
    }
}
