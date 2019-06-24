package com.TimBuchalka;

//Write a method called numberToWords with one int parameter named number. The method should
//print out the passed number using words for the digits. If the number is negative, print
//"Invalid Value". To print the number as words, follow these steps: 1. Extract the last
//digit of the given number using the remainder operator. 2. Convert the value of the digit
//found in Step 1 into a word. There are 10 possible values for that digit, those being 0,
//1, 2, 3, 4, 5, 6, 7, 8, 9. Print the corresponding word for each digit, e.g. print "Zero"
//if the digit is 0, "One" if the digit is 1, and so on. 3. Remove the last digit from the
//number. 4. Repeat Steps 2 through 4 until the number is 0.
//
//The logic above is correct, but in its current state, the words will be printed in reverse
//order. For example, if the number is 234, the logic above will produce the output
//"Four Three Two" instead of "Two Three Four". To overcome this problem, write a second
//method called reverse. The method reverse should have one int parameter and return the
//reversed number (int). For example, if the number passed is 234, then the reversed number
//would be 432. The method  reverse should also reverse negative numbers.
//
//Use the method reverse within the method numberToWords in order to print the words in the
//correct order. Another thing to keep in mind is any reversed number with leading zeroes
//(e.g. the reversed number for 100 is 001). The logic above for the method numberToWords
//will print "One", but that is incorrect. It should print "One Zero Zero". To solve this
//problem, write a third method called getDigitCount. The method getDigitCount should have
//one int parameter called number and return the count of the digits in that number. If the
//number is negative, return -1 to indicate an invalid value. For example, if the number has
//a value of 100, the method getDigitCount should return 3 since the number 100 has 3 digits
//(1, 0, 0).
//
//Example Input/Output - getDigitCount method
//* getDigitCount(0); should return 1 since there is only 1 digit
//* getDigitCount(123); should return 3
//* getDigitCount(-12); should return -1 since the parameter is negative
//* getDigitCount(5200); should return 4 since there are 4 digits in the number

//Example Input/Output - reverse method
//* reverse(-121); should  return -121
//* reverse(1212); should return  2121
//* reverse(1234); should return 4321
//* reverse(100); should return 1
//
//Example Input/Output - numberToWords method
//* numberToWords(123); should print "One Two Three".
//* numberToWords(1010); should print "One Zero One Zero".
//* numberToWords(1000); should print "One Zero Zero Zero".
//* numberToWords(-12); should print "Invalid Value" since the parameter is negative.
//

public class NumberToWords {
    public static int numberToWords(int number){

        while(number != 0) {
            int temp = number % 10;

            switch(temp) {
                case 1:
                    System.out.println("one");
                    break;
                case 2:
                    System.out.println("two");
                    break;
                case 3:
                    System.out.println("three");
                    break;
                case 4:
                    System.out.println("four");
                    break;
                case 5:
                    System.out.println("five");
                    break;
                case 6:
                    System.out.println("six");
                    break;
                case 7:
                    System.out.println("seven");
                    break;
                case 8:
                    System.out.println("eight");
                    break;
                case 9:
                    System.out.println("nine");
                    break;
                case 0:
                    System.out.println("zero");
                    break;
            }
            number /= 10;

        }
        return -1;
    }

    public static int reverse(int num){
        int newNum = 0;

        while(num != 0) {
            newNum = num % 10;
            newNum = (newNum*10)+num;

            num /=10;
            System.out.println(num);
        }



        return -1;
    }

    public static int getDigitCount(int number){

        return -1;
    }

}
