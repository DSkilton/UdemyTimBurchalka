package com.TimBuchalka;

//Write a method named area with one double parameter named radius. The method
// needs to return a double value that represents the area of a circle. If the
// parameter radius is negative then return -1.0 to represent an invalid value.
//Write another overloaded method with 2 parameters x and y (both doubles),
// where x and y represent the sides of a rectangle. The method needs to
// return an area of a rectangle. If either or both parameters is/are a negative
// return -1.0 to indicate an invalid value.
//
//For formulas and PI value please check the tips below.
//Examples of input/output:
//* area(5.0); should return 78.53975
//* area(-1);  should return -1 since the parameter is negative
//* area(5.0, 4.0); should return 20.0 (5 * 4 = 20)
//* area(-1.0, 4.0);  should return -1 since first the parameter is negative

public class AreaCalculator {

    public static double area (double radius){
        if(radius < 0){
            System.out.println("That's a negative, over");
            return -1.0;
        }

        System.out.println("Radius is " + radius);
        return radius * radius * Math.PI;
    }

    public static double area(double x, double y){
        if((x < 0) || (y < 0)){
            System.out.println("That's a negative, over");
            return -1.0;
        }

        System.out.println("Parameter is " + x * y);
        return x * y;
    }

//    public static double area(double radius){
//        return radius < 0 ? -1 : radius * radius * Math.PI;
//    }
//
//    public static double area(double x, double y){
//        return (x < 0 || y < 0) ? -1 : x * y;
//    }
}
