package me.eltacshikhsaidov;

import me.eltacshikhsaidov.external.beautifier.FlipTable;
import me.eltacshikhsaidov.external.color.Colors;
import me.eltacshikhsaidov.external.random.Generate;
import me.eltacshikhsaidov.external.time.Time;

import java.text.ParseException;
import java.util.*;

public class Main {

    public static void main(String[] args) throws ParseException {

        final int TIME_INTERVAL = 15; // minutes
        final String[] WEEKDAYS = {
                "Monday",
                "Tuesday",
                "Wednesday",
                "Thursday",
                "Friday",
                "Saturday",
                "Sunday"
        };
        int week_index = 0;
        int AREA;

        Scanner s = new Scanner(System.in);

        System.out.print("How many airplanes are there: ");
        int number_of_airplanes = s.nextInt();
        String[] airplanes = new String[number_of_airplanes];

        for (int i = 0; i < number_of_airplanes; i++) {
            System.out.print("Enter name of plane " + i + " : ");
            airplanes[i] = s.next();
        }

        System.out.println("-----------------------------");
        System.out.print("How many cities are there: ");
        int number_of_cities = s.nextInt();
        String[] cities = new String[number_of_cities];

        for (int i = 0; i < number_of_cities; i++) {
            System.out.print("Enter name of city " + i + " : ");
            cities[i] = s.next();
        }

        System.out.println("-----------------------------");

        System.out.print("When the first plane starts its flight: ");
        String startTimeForFirstPlane = s.next();
        System.out.println("-----------------------------");

        // get data for reaching hours for each city

        // get data for week days
        String[][] weekDays = new String[number_of_airplanes][number_of_cities];

        String[][] arrivingHours = new String[number_of_airplanes][number_of_cities];
        for (int i = 0; i < number_of_airplanes; i++) {
            for (int j = 1; j < number_of_cities; j++) {
                System.out.print("Enter arriving hour from " + cities[0] + " to " + cities[j] +
                        " for " + airplanes[i] + ": ");
                int minutes = s.nextInt() * 60; // converting hours to minutes automatically

                if (i % 2 == 0) {
                    if (i == 0) {
                        arrivingHours[i][0] = Time.add(startTimeForFirstPlane, 0);
                    } else {
                        arrivingHours[i][0] = Time.add(arrivingHours[i - 2][0], TIME_INTERVAL);
                    }
                } else {
                    if (i == 1) {
                        arrivingHours[i][0] = Time.add(startTimeForFirstPlane, 0);
                    } else {
                        arrivingHours[i][0] = Time.add(arrivingHours[i - 2][0], TIME_INTERVAL);
                    }
                }
                arrivingHours[i][j] = Time.add(arrivingHours[i][j - 1],
                        2 * minutes + Generate.random()); // random generates between 30 - 90 minutes
                weekDays[i][0] = WEEKDAYS[0];// Monday 00:00 -> Tuesday 00:00 -> Wednesday

                if ((minutes / 60) < 12) {
                    if (Time.compare(arrivingHours[i][j - 1], arrivingHours[i][j])) {

                        week_index++;

                        if (week_index >= 7) {
                            week_index = 0;
                            System.out.println(Colors.TEXT_RED +
                                    "It is not possible to make all flights in the same week!"
                                    + Colors.TEXT_RESET);
                        }
                    }
                } else {
                    week_index += 2;
                    if (week_index >= 7) {
                        week_index = 0;
                        System.out.println(Colors.TEXT_RED +
                                "It is not possible to make all flights in the same week!"
                                + Colors.TEXT_RESET);

                    }
                }


                weekDays[i][j] = WEEKDAYS[week_index];
            }

            week_index = 0;

        }


        String[][] time_table = new String[number_of_airplanes + 1][number_of_cities + 1];

        for (int row = 0; row < number_of_airplanes + 1; row++) {
            for (int column = 0; column < number_of_cities + 1; column++) {
                if (row == 0 && column == 0) {
                    time_table[0][0] = " -- ";
                } else if (column != 0 && row == 0) {
                    time_table[0][column] = cities[column - 1].toUpperCase();
                } else if (column == 0) {
                    time_table[row][0] = airplanes[row - 1].toUpperCase();
                } else {

                    if ((row + column) % 2 == 0) {
                        AREA = 1;
                    } else {
                        AREA = 2;
                    }

                    time_table[row][column] = "Area: "
                            + AREA
                            + ", Time: "
                            + arrivingHours[row - 1][column - 1]
                            + ", Week Day: "
                            + weekDays[row - 1][column - 1];

                }
            }
        }


        String[] headers = new String[time_table[0].length];
        System.arraycopy(time_table[0], 0, headers, 0, time_table[0].length);
        String[][] data = new String[time_table.length - 1][time_table[0].length];
        for (int i = 1; i < time_table.length; i++) {
            System.arraycopy(time_table[i], 0, data[i - 1], 0, time_table[0].length);
        }

        System.out.println(FlipTable.of(headers, data));
    }
}
