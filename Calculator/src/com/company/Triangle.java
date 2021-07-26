package com.company;

public class Triangle implements ParameterBase {


    private double height;
    private double base;
    private double side;



    public double getHeight() {
        return height;
    }

    public double getBase() {
        return base;
    }

    public double getSide() {
        return side;
    }

    public void setHeight(double height, double base, double side) {
        this.height = height;
        this.base = base;
        this.side = side;
    }


    @Override
    public double perimeter() throws  ArithmeticException{
        double perimeter = (height+base+side);
        System.out.println("Perimeter of Triangle is  : "+perimeter);
        return 0;
    }

    @Override
    public double area() throws  ArithmeticException {
        double area =  (base*height/2);
        System.out.println("Area of Triangle is : "+area);
        return 0;
    }

    @Override
    public double volume() {
    
        return 0;
    }
}
