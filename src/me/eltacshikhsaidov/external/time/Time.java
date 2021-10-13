package me.eltacshikhsaidov.external.time;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Time {

    public static String add(String time, int minutes) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm");
        Date date = dateFormat.parse(time);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.MINUTE, minutes);

        return dateFormat.format(calendar.getTime());
    }

    public static boolean compare(String time1, String time2) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm");
        Date date1 = dateFormat.parse(time1);
        Date date2 = dateFormat.parse(time2);
        //                                Monday  Monday Tuesday

        int flag = date1.compareTo(date2);

        return !(flag <= 0);
    }

    public static void main(String[] args) throws ParseException {
        System.out.println(compare("10:00", "17:00"));
    }


}
