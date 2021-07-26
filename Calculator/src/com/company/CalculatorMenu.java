package com.company;

import java.util.Scanner;

public class CalculatorMenu {

    public static void main(String[] args) {


        int choice = 0;

        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("\n,,,,,,,,,,,,,,Calculator Area ,,,,,,,,,,,,,,");
                System.out.println("------------------1) Circle--------------------");
                System.out.println("------------------2) Rectangle-----------------");
                System.out.println("------------------3) Triangle------------------");
                System.out.println("------------------4) Square--------------------");
                System.out.println("------------------5) Sphere--------------------");
                System.out.println("------------------6) Cylinder------------------");
                System.out.println("------------------7) Exit----------------------");

                System.out.print("Enter the number of your choice :-");
                choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        Circle circle = new Circle();
                        System.out.print("Enter Radius the :-");
                        double radius = sc.nextDouble();
                        circle.setRadius(radius);
                        circle.area();
                        circle.perimeter();
                        circle.volume();
                        break;


                    case 2:
                        Rectangle rectangle = new Rectangle();
                        System.out.print("Enter the Length :-");
                        double Length = sc.nextDouble();
                        System.out.print("enter the width: -");
                        double Width = sc.nextDouble();   //   todo
                        rectangle.setRectangle(Length, Length);
                        rectangle.getWidth();
                        rectangle.getLength();
                        rectangle.area();
                        rectangle.perimeter();
                        rectangle.volume();
                        break;

                    case 3:
                        Triangle triangle = new Triangle();
                        System.out.print("Enter the height :-");
                        double height = sc.nextDouble();
                        System.out.print("Enter the base :-");
                        double base = sc.nextDouble();
                        System.out.print("Enter the side :-");
                        double side = sc.nextDouble();
                        triangle.setHeight(height, base, side);
                        triangle.getHeight();
                        triangle.getBase();
                        triangle.getSide();
                        triangle.perimeter();
                        triangle.area();
                        break;

                    case 4:
                        Square square = new Square();
                        System.out.print("Enter the Square :-");
                        double sq = sc.nextDouble();
                        square.setSide(sq);
                        square.getSide();
                        square.area();
                        square.perimeter();

                        break;

                    case 5:
                        Sphere sphere = new Sphere();
                        System.out.print(" Enter the sphere value:-");
                        double sp = sc.nextDouble();
                        sphere.setRadius(sp);
                        sphere.getRadius();
                        sphere.area();
                        sphere.volume();
                        break;

                    case 6:
                        Cylinder cylinder = new Cylinder();
                        System.out.println(" Enter the of Cylinder value:- ");
                        System.out.print("Enter the Radius :-");
                        double Radius = sc.nextDouble();
                        System.out.print("enter the Height: -");
                        double Height = sc.nextDouble();
                        cylinder.setHeight(Radius, Height);
                        cylinder.getHeight();
                        cylinder.getRadius();
                        cylinder.area();
                        cylinder.volume();
                        break;

                    case 7:
                        System.out.print("your program exit :-");
                        System.exit(0);
                    default:
                        System.out.println("Invalid Your Choice  ");
                }

            } catch (TypeNotPresentException ex) {
                System.out.println("Please Input Your  Valid  Choice Number");
                ex.printStackTrace();
            }
        }

    }
}






