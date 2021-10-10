package me.eltacshikhsaidov;

import me.eltacshikhsaidov.external.beautifier.FlipTable;
import me.eltacshikhsaidov.external.time.Time;

import java.text.ParseException;
import java.util.*;

public class Main {

    public static void main(String[] args) throws ParseException {

        final int TIME_INTERVAL = 15;

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
        // row                    column
        String[][] time_table = new String[number_of_airplanes + 1][number_of_cities + 1];

        for (int row = 0; row < number_of_airplanes + 1; row++) {
            for (int column = 0; column < number_of_cities + 1; column++) {
                if (row == 0 && column == 0) {
                    time_table[0][0] = " -- ";
                } else if (column != 0 && row == 0) {
                    time_table[0][column] = cities[column - 1]; // [0][1]=[0], [0][2]=[1], [0][3]=[2]
                } else if (row != 0 && column == 0) {
                    time_table[row][0] = airplanes[row - 1];
                } else {
//                    time_table[row][column] = "a, t, w_d";
                    String newTime = Time.add(startTimeForFirstPlane,
                            TIME_INTERVAL * (row - 1));;

                    if ((row + column) % 2 == 0) {
                        if (column == 1) {
                            time_table[row][column] = "area: " + 1
                                    + ", time: " + newTime
                                    + ", week_day";
                        } else {
                            time_table[row][column] = "area: " + 1 + ", time, week_day";
                        }
                    } else {
                        if (column == 1) {
                            time_table[row][column] = "area: " + 1
                                    + ", time: " + newTime
                                    + ", week_day";
                        } else {
                            time_table[row][column] = "area: " + 2 + ", time, week_day";
                        }
                    }
                }
            }
        }

        // Separating headers and data for beautifying

        String[] headers = new String[time_table[0].length];

        System.arraycopy(time_table[0], 0, headers, 0, time_table[0].length);

        String[][] data = new String[time_table.length - 1][time_table[0].length];

        for (int i = 1; i < time_table.length; i++) {
            System.arraycopy(time_table[i], 0, data[i - 1], 0, time_table[0].length);
        }

        System.out.println(FlipTable.of(headers, data));

        // ----------------------------------------------------------------


    }
}
