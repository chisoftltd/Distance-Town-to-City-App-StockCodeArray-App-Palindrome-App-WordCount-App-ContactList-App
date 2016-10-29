/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Part3AreMoreAdvancedProblems;

import java.util.Arrays;

/**
 *
 * @author 1609963 (Benjamin Chinwe)
 * 
 * Design, code and test an application that
 * (a) fills an array of doubles called data[] with a set of random numbers.
 * a random double between 0 and 1 can be generated using the Math.random() class
 * method from the java Math class
 * 
 * (b) using a helper method, create and display a second array datareversed[] that has the
 * same numbers as in array data[], but in reverse order,
 * 
 * (c) using a helper method, create and display a third array datasorted[] that has the same
 * numbers as in array data[] but in ascending order
 * 
 * (d) using helper methods, create and display two double variables max and min that equal
 * the largest and smallest values in data[]
 * 
 */
public class RandomDouble {

    private static final double[] data = new double[10];
    private static double min;

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            data[i] = 0 + Math.random() * ((1 - 0) + 1) + 0;
            System.out.println("Data[" + i + "]: " + data[i]);
        }
        helper(data);
        helper2(data);
        helper3(data);

    }

    private static void helper(double[] datareversed) {
        for (int i = 9; i > 0; i--) {
            System.out.println("Datareversed[" + i + "]: " + datareversed[i]);
        }
    }

    private static void helper2(double[] datasorted) {
        Arrays.sort(datasorted);
        System.out.println("Sorted");
        for (double d : datasorted) {
            System.out.println(d);
        }
    }

    private static void helper3(double[] data) {
        double max = 0;
        double min = data[0];

        for (int i = 0; i < data.length; i++) {
            data[i] = max;
            data[i] = min;

            for (int j = i + 1; j < data.length; j++) {
                if (data[j] > max) {
                    max = data[j];

                }
                if (data[j] < min) {
                    min = data[j];
                }
            }
        }

        System.out.println("Max element: " + max + " and min element : " + min);
    }
}
