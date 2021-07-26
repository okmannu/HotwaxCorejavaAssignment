package com.company;

public class Square implements ParameterBase {

    private double side;


    public void setSide(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    @Override
    public double perimeter() {
        try {
            double perimeter = 4 * side;
            System.out.println("Perimeter of Square is:  " + perimeter);
            return 0;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }

    }

    @Override
    public double area() {
        try {
            double area = (side * side);
            System.out.println("Area of Square is here :  " + area);
            return 0;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    @Override
    public double volume() {
        // TODO Auto-generated method
        return 0;
    }
}
