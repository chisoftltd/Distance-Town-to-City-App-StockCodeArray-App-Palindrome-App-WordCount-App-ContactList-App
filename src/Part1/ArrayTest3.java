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
public class ArrayTest3 {

    private static int n;
    private static int[] num;
    private static int[] numsq;
    private static int sumNum;
    private static int sumNumSq;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        System.out.println("Enter a number: ");
        n = new Scanner(System.in).nextInt();
        num = new int[n];
        numsq = new int[n];

        for (int i = 0; i < n; i++) {
            num[i] = num[i] + n;
            numsq[i] = numsq[i] + (n * n);
        }

        for (int i = 0; i < n; i++) {
            sumNum += num[i];
            sumNumSq += numsq[i];
        }
        System.out.println("Sum of elements in num[]: " + sumNum);
        System.out.println("Sum of elements in numsq[]: " + sumNumSq);
    }
}
