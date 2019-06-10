package com.TimBuchalka;

//​NOTE:  Leap Year coding exercise earlier in the course created the isLeapYear method. You can use that solution.
//
//Write another method getDaysInMonth with two parameters month and year. Both of type int.
//
//If parameter month is < 1 or > 12 return -1. If parameter year is < 1 or > 9999 then return -1.
//
//This method needs to return the number of days in the month. Be careful about leap years they have 29 days
//in month 2 (February). You should check if the year is a leap year using the method isLeapYear described above.
//
//Examples of input/output:
//* getDaysInMonth(1, 2020); → should return 31 since January has 31 days.
//* getDaysInMonth(2, 2020); → should return 29 since February has 29 days in a leap year and 2020 is a leap year.
//* getDaysInMonth(2, 2018); → should return 28 since February has 28 days if it's not a leap year and 2018 is not
// a leap year.
//* getDaysInMonth(-1, 2020); → should return -1 since the parameter month is invalid.
//* getDaysInMonth(1, -2020); → should return -1 since the parameter year is outside the range of 1 to 9999.
//
//HINT: Use the switch statement.
//
//NOTE: Methods isLeapYear and getDaysInMonth need to be public static like we have been doing so far in the course.

public class NumberOfDaysInMonth {

    public static int getDaysInMonth (int month, int year) {

        if((month < 1) || (month > 12) || (year < 1) || (year > 9999)){
            System.out.println("-1");
            return -1;
        }

        switch (month) {
            case 1:
                System.out.println("31");
                break;
            case 2:
                if((month == 2) && LeapYearCalculator.isLeapYear(year)){
                    System.out.println("29");
                } else
                System.out.println("28");
                break;
            case 3:
                System.out.println("31");
                break;
            case 4:
                System.out.println("30");
                break;
            case 5:
                System.out.println("31");
                break;
            case 6:
                System.out.println("30");
                break;
            case 7:
                System.out.println("31");
                break;
            case 8:
                System.out.println("31");
                break;
            case 9:
                System.out.println("30");
                break;
            case 10:
                System.out.println("31");
                break;
            case 11:
                System.out.println("30");
                break;
            case 12:
                System.out.println("31");
                break;
        }

        System.out.println("1");
        return 0;
    }
}
