/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Part1;

/**
 *
 * @author 1609963 (Benjamin Chinwe)
 * 
 * Write a simple application that uses a pair of nested for-loops to fill a 2 
 * dimensional array with the results of arithmetic multiplication tables for 
 * the numbers 0 to 12.
 * Then use another pair of nested for-loops to printout the contents 
 * (and hence check that the array is properly filled).
 * 
 */
public class Arithmetic {

    private static int[] mult = new int[12 * 12];

    public static void main(String[] args) {

        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                mult[i * j] = i * j;
            }
        }

        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                if (i * j < 10) {
                    System.out.print("0" + i * j + " |   ");
                } else {
                    System.out.print(i * j + " |   ");
                }
            }
            System.out.println();
        }
    }
}
