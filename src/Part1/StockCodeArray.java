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
public class StockCodeArray {

    private static String[] productName = new String[4];
    private static double[] unitCost = new double[4];

    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            System.out.print("Enter Product Name: ");
            productName[i] = new Scanner(System.in).nextLine();
            System.out.print("Enter Unit Cost: ");
            unitCost[i] = new Scanner(System.in).nextDouble();
        }
        
        System.out.println("-------------------------------------------------");
        System.out.println("    Stock Code      Product Name      Unit Cost  ");
        System.out.println("+---------------+-----------------+-------------+");
        for (int i = 0; i < 4; i++) {
            System.out.print("|     " + i + "     ");
            System.out.print("       |" + productName[i].trim() + "|    ");
            System.out.println("        " + unitCost[i] + "  |");
            if (i == 3) {
                System.out.println("-------------------------------------------------");
            } else {
                System.out.println("+---------------+-----------------+-------------+");
            }
            
        }
    }
}
