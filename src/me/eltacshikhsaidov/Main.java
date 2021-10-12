package me.eltacshikhsaidov;

import me.eltacshikhsaidov.external.beautifier.FlipTable;
import me.eltacshikhsaidov.external.color.Colors;
import me.eltacshikhsaidov.external.random.Generate;
import me.eltacshikhsaidov.external.time.Time;

import java.text.ParseException;
import java.util.*;

public class Main {

    public static void main(String[] args) throws ParseException {

        final int TIME_INTERVAL = 15;
        final String[] WEEKDAYS = {
                "Monday",
                "Tuesday",
                "Wednesday",
                "Thursday",
                "Friday",
//                "Saturday",
//                "Sunday"
        };
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
        String[][] arrivingHours = new String[number_of_airplanes][number_of_cities];
        for (int i = 0; i < number_of_airplanes; i++) {
            for (int j = 1; j < number_of_cities; j++) {
                System.out.print("Enter arriving hour from " + cities[0] + " to " + cities[j] +
                        " for " + airplanes[i] + ": ");
                int minutes = s.nextInt() * 60; // converting hours to minutes automatically
                arrivingHours[i][0] = Time.add(startTimeForFirstPlane, TIME_INTERVAL * i);
                arrivingHours[i][j] = Time.add(arrivingHours[i][j - 1],
                        minutes * 2 + Generate.random());
            }
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
                            + Generate.weekDay(WEEKDAYS);

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
