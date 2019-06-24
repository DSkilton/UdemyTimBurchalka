package com.TimBuchalka;

//Write a method named hasSameLastDigit with three parameters of type int. Each number should be within
//the range of 10 (inclusive) - 1000 (inclusive). If one of the numbers is not within the range, the
//method should return false. The method should return true if at least two of the numbers share the same
//rightmost digit; otherwise, it should return false.
//
//EXAMPLE INPUT/OUTPUT:
//* hasSameLastDigit (41, 22, 71); → should return true since 1 is the rightmost digit in numbers 41 and 71
//* hasSameLastDigit (23, 32, 42); → should return true since 2 is the rightmost digit in numbers 32 and 42
//* hasSameLastDigit (9, 99, 999); → should return false since 9 is not within the range of 10-1000
//
//Write another method named isValid with one parameter of type int. The method needs to return true if
//the number parameter is in range of 10(inclusive) - 1000(inclusive), otherwise return false.
//
//EXAMPLE INPUT/OUTPUT
//* isValid(10); → should return true since 10 is within the range of 10-1000
//* isValid(468); → should return true since 468 is within the range of 10-1000
//* isValid(1051); → should return false since 1051 is not within the range of 10-1000

public class hasSameLastDigit {

    public static boolean hasSameLastDigit(int a, int b, int c){

        int lastA = a % 10;
        int lastB = b % 10;
        int lastC = c % 10;

        if(a >= 10 && a <= 1000 && b >= 10 && b <= 1000 && c >= 10 && c <= 1000){

            if (lastA == lastB || lastA == lastC || lastB == lastC ) {
                System.out.println("True");
                return true;
            }
        }

        System.out.println("False");
        return false;
    }

    public static boolean isValid (int a) {
        return (a >= 10 && a <= 1000);
    }
}
