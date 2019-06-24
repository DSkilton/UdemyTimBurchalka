package com.TimBuchalka;

//Write a method named hasSharedDigit with two parameters of type int. Each
//number should be within the range of 10 (inclusive) - 99 (inclusive). If one
//of the numbers is not within the range, the method should return false.
//
//The method should return true if there is a digit that appears in both
//numbers, such as 2 in 12 and 23; otherwise, the method should return false.
//
//EXAMPLE INPUT/OUTPUT:
//* hasSharedDigit(12, 23); → should return true since the digit 2 appears in both numbers
//* hasSharedDigit(9, 99); → should return false since 9 is not within the range of 10-99
//* hasSharedDigit(15, 55); → should return true since the digit 5 appears in both numbers

public class SharedDigit {

    public static boolean hasSharedDigit (int a, int b) {
        if(a <= 9 || a >= 99 || b <= 9 || b >= 99) {
            while(a != 0){
                int check = a % 10;
                a /= 10;

                while(b != 0 ){
                    if(b % 10 == check){
                        System.out.println("true");
                        return true;
                    }

                    b /= 10;
                }
            }
        }
        System.out.println("false");
        return false;
    }
}
