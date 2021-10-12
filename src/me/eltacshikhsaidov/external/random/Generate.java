package me.eltacshikhsaidov.external.random;

import java.util.Random;

public class Generate {
    public static int random() {
        Random random = new Random();
        int low = 60;
        int high = 120;
        return random.nextInt(high - low) + low;
    }

    public static String weekDay(String[] weekDays) {
        int random = new Random().nextInt(weekDays.length);
        return weekDays[random];
    }
}
