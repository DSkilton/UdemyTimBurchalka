package com.TimBuchalka;

//Write a method called isOdd with an int parameter and call it number. The method
//needs to return a boolean. Check that number is > 0, if it is not return false.
//If number is odd return true, otherwise  return false. Write a second method
//called sumOdd that has 2 int parameters start and end, which represent a range
//of numbers. The method should use a for loop to sum all odd numbers  in that
//range including the end and return the sum. It should call the method isOdd to
//check if each number is odd. The parameter end needs to be greater than or
//equal to start and both start and end parameters have to be greater than 0.
//
//If those conditions are not satisfied return -1 from the method to indicate
//invalid input.
//
//Example input/output:
//* sumOdd(1, 100); → should return 2500
//* sumOdd(-1, 100); →  should return -1
//* sumOdd(100, 100); → should return 0
//* sumOdd(13, 13); → should return 13 (This set contains one number, 13, and it is odd)
//* sumOdd(100, -100); → should return -1
//* sumOdd(100, 1000); → should return 247500

public class SumOdd {

    public static boolean isOdd(int number){
        if(number > 0 ){
            if(number % 2 == 0){
                System.out.println(true);
                return true;
            }
        }
        System.out.println(false);
        return false;
    }

    public static boolean isOdd(int start, int end){
        int odds = 0;
        for(int i = start  ; i <= end ; i++){
            if(i % 2 != 0){
                odds += i;
            }
        }
        System.out.println("I = " + odds);;
        return true;
    }
}
