package me.eltacshikhsaidov.external.random;

import java.util.Random;

public class Generate {
    public static int random() {
        Random random = new Random();
        int low = 30; // from one hour
        int high = 90; // to two hours
        return random.nextInt(high - low) + low;
    }
}
