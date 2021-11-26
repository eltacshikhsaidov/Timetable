package me.eltacshikhsaidov.external.random;

import java.util.Random;

public class Generate {
    public static int random() {
        Random random = new Random();
        int low = 16;
        int high = 17;
        return random.nextInt(high - low) + low;
    }
}
