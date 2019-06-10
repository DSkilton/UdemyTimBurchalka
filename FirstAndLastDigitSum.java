package com.TimBuchalka;

//Write a method named sumFirstAndLastDigit with one parameter of type int called number. The method needs to
//find the first and the last digit of the parameter number passed to the method, using a loop and return the
//sum of the first and the last digit of that number. If the number is negative then the method needs to
//return -1 to indicate an invalid value.
//
//Example input/output
//* sumFirstAndLastDigit(252); → should return 4, the first digit is 2 and the last is 2 which gives us
//        2+2 and the sum is 4.
//* sumFirstAndLastDigit(257); → should return 9, the first digit is 2 and the last is 7 which gives us
//        2+7 and the sum is 9.
//* sumFirstAndLastDigit(0); → should return 0, the first digit and the last digit is 0 since we only have
//        1 digit, which gives us 0+0 and the sum is 0.
//* sumFirstAndLastDigit(5); → should return 10, the first digit and the last digit is 5 since we only have
//        1 digit, which gives us 5+5 and the sum is 10.
//* sumFirstAndLastDigit(-10); → should return -1, since the parameter is negative and needs to be positive.

public class FirstAndLastDigitSum {

    public static int sumFirstAndLastDigit(int number) {
//        number = Math.abs(number);
//        int number1 =(int) Math.floor(number / Math.pow(10, Math.floor(Math.log10(number))));
//        System.out.println(number1);
//        return number1;

        int lastDigit = 0;
        if(number >= 0){
            lastDigit = number % 10;

            while (number > 9){
                number = number / 10;
            }

            System.out.println("First Number " + number + " Last Number " + lastDigit + " Total = " + (number + lastDigit));
            return 0;
        } else

        System.out.println("-1");
        return -1;
    }

}
