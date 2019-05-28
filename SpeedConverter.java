package com.TimBuchalka;

public class SpeedConverter {
    static long toMilesPerHour(double kilometersPerHour)
    {
        double toRound = kilometersPerHour/1.609;
        long rounded = Math.round(toRound);

        if(rounded < 0 ){
            rounded = -1;
            System.out.println("Rounded " + rounded);
            return  rounded;
        } else {
            System.out.println("Rounded " + rounded);
            return rounded;
        }
    }
}
