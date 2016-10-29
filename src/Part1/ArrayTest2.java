/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Part1;

import java.util.Scanner;

/**
 *
 * @author 1609963
 */
public class ArrayTest2 {

    private static int number;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] data;
        data = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a number: ");
            number = new Scanner(System.in).nextInt();
            data[i] = number;
        }

        for (int i = 0; i < 5; i++) {
            System.out.print("Data[" + i + "]: " + data[i]+" ");
        }
    }

}
