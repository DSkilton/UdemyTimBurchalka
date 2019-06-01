package com.TimBuchalka;

public class SecondsAndMinutes {

    public static String getDurationString (int minutes, int seconds) {
        if((minutes < 0) || (seconds < 0 ) || (seconds > 59)){
            return "Invalid value";
        }

        int hours = minutes / 60;
        int minutesRemaining = minutes % 60;

        return hours + "h " + minutesRemaining + "m " + seconds + "s ";
    }

//second method for just seconds but will still return hours, minutes, seconds
    public static String getDurationString (int seconds){
        if(seconds < 0){
            return "Invalid value";
        }

        int minutes = seconds / 60;
        int secondsRemaining = seconds % 60;

        return getDurationString(minutes, secondsRemaining);
    }
}
