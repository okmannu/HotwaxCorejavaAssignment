package com.company;

public class Cylinder implements ParameterBase{


    private double radius;
    private double height;


    public  double getRadius(){
        return radius;
    }

    public double getHeight(){
        return height;
    }

    public void setHeight(double radius, double height) {
       this.radius = radius;
       this.height = height;

    }

    @Override
    public double perimeter() {
        // TODO Auto-generated method
        return 0;
    }

    @Override
    public double  area(){
        double area  = (2*3.14*(radius*radius))+(2*3.14*radius*height);  // ( whole surface)
        System.out.println("Area of Cylinder is : " +area);
        return 0;
        }


    @Override
    public double volume() {
        double volume = 3.14*(radius*radius)*height;
        System.out.println("Volume of Cylinder is : " +volume);
        //	pi × radius2 × height
        return 0;
    }
}
