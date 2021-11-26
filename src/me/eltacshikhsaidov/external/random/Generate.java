package me.eltacshikhsaidov.external.random;

import java.util.Random;

public class Generate {
    public static int random() {
        Random random = new Random();
        int low = 15; // from half hour 30 minutes
        int high = 18; // to one hour and half 90 minutes
        return random.nextInt(high - low) + low;
    }
}
