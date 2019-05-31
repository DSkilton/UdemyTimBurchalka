package com.TimBuchalka;

//Write a method areEqualByThreeDecimalPlaces with two parameters of type double.
//The method should return boolean and it needs to return true if two double numbers are the same up to three decimal places. Otherwise, return false.
//
//EXAMPLES OF INPUT/OUTPUT:
//* areEqualByThreeDecimalPlaces(-3.1756, -3.175); → should return true since numbers are equal up to 3 decimal places.
//* areEqualByThreeDecimalPlaces(3.175, 3.176); → should return false since numbers are not equal up to 3 decimal places
//* areEqualByThreeDecimalPlaces(3.0, 3.0); → should return true since numbers are equal up to 3 decimal places.
//* areEqualByThreeDecimalPlaces(-3.123, 3.123); → should return false since numbers are not equal up to 3 decimal places.

public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double one, double two) {
        int a = (int) one * 1000;
        int b = (int) two * 1000;

        if(a == b){
            System.out.println(true);
            return true;
        }
        else

            System.out.println(false);
        return false;
    }
}
