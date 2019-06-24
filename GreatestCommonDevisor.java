package com.TimBuchalka;

//Write a method named getGreatestCommonDivisor with two parameters of type int named first and second.
//If one of the parameters is < 10, the method should return -1 to indicate an invalid value. The method
//should return the greatest common divisor of the two numbers (int). The greatest common divisor is
//the largest positive integer that can fully divide each of the integers (i.e. without leaving a
//remainder).
//
//For example 12 and 30:
//12 can be divided by 1, 2, 3, 4, 6, 12
//30 can be divided by 1, 2, 3, 5, 6, 10, 15, 30
//The greatest common divisor is 6 since both 12 and 30 can be divided by 6, and there is no resulting remainder.
//
//EXAMPLE INPUT/OUTPUT:
//* getGreatestCommonDivisor(25, 15); should return 5 since both can be divided by 5 without a remainder
//* getGreatestCommonDivisor(12, 30); should return 6 since both can be divided by 6 without a remainder
//* getGreatestCommonDivisor(9, 18); should return -1 since the first parameter is < 10
//* getGreatestCommonDivisor(81, 153); should return 9 since both can be divided by 9 without a remainder

public class GreatestCommonDevisor {

    public static int getGreatestCommonDivisor (int first, int second) {
        int greatest = 0;

        if(first > 10 && second > 10){

            for(int i = 1; ((i <= first) && (i <=second)); i++ ){
                if((first % i == 0) && (second % i == 0)){
                    greatest = i;
                }
            }
            System.out.println(greatest);

        return 1;

        } else
            System.out.println("-1");
        return -1;
    }
}
