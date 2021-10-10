package me.eltacshikhsaidov;

import me.eltacshikhsaidov.external.beautifier.FlipTable;

import java.util.*;

public class Main {

    public static void main(String[] args) {

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

                    if ((row + column) % 2 == 0) {
                        time_table[row][column] = "area: " + 1 + ", time, week_day";
                    } else {
                        time_table[row][column] = "area: " + 2 + ", time, week_day";
                    }
                }
            }
        }

        // Separating headers and data for beautifying

        String[] headers = new String[time_table[0].length];

        for (int i = 0; i < time_table[0].length; i++) {
            headers[i] = time_table[0][i];
        }

        String[][] data  = new String[time_table.length - 1][time_table[0].length];

        for (int i = 1; i < time_table.length; i++) {
            for (int j = 0; j < time_table[0].length; j++) {
                data[i - 1][j] = time_table[i][j];
            }
        }

        System.out.println(FlipTable.of(headers, data));

        // ----------------------------------------------------------------


    }
}
