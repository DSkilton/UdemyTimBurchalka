package com.TimBuchalka;

public class MegaBytesConverter {
    public static void printMegaBytesAndKiloBytes (int kiloBytes) {
        int MB;
        int KB;
        MB = kiloBytes / 1024;
        KB = kiloBytes % 1024;

        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            System.out.println(kiloBytes + " KB = " + MB + " MB and " + KB + " KB");
        }
    }



}
