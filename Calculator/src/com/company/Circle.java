package com.company;





public class Circle implements ParameterBase {

    private double radius;

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }


    @Override
    public double perimeter() {
        try {
            double perimeter = 2 * 3.14 * (radius);
            System.out.println("Perimeter of Circle is: " + perimeter);
            return 0;
        } catch (ArithmeticException e) {
            e.printStackTrace();
            return 0;
        }
    }

    @Override
    public double area() {
        try {
            double area = 3.14 * (radius * radius);
            System.out.println("Area of Circle is : " + area);
            return 0;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }


    @Override
    public double volume() {
        // TODO Auto-generated method stub
        return 0;
    }

}

