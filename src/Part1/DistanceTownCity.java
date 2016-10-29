/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Part1;

import static Part1.Words.response;
import javax.swing.JOptionPane;

/**
 *
 * @author 1609963
 */
public class DistanceTownCity {

    private static int[] distance = new int[6 * 6];
    private static String[] townCity = new String[6];
    private static int replyFirst;
    private static int replySecond;

    public static void main(String[] args) {

        for (int i = 0; i < 6; i++) {
            townCity[i] = JOptionPane.showInputDialog("Enter Town/City");
        }

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (i != 0 && j != 0) {
                    distance[i * j] = Integer.parseInt(JOptionPane.showInputDialog("Enter distance: "));
                } else if (i == 0) {
                    distance[j] = Integer.parseInt(JOptionPane.showInputDialog("Enter distance: "));
                } else if (j == 0) {
                    distance[i] = Integer.parseInt(JOptionPane.showInputDialog("Enter distance: "));
                }
            }
        }

        for (int j = 0; j < 6; j++) {
            response = response + j + " " + townCity[j] + "\n";
        }
        replyFirst = Integer.parseInt(JOptionPane.showInputDialog(response + "Enter first Town/City number"));
        replySecond = Integer.parseInt(JOptionPane.showInputDialog(response + "Enter first Town/City number"));

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (i == replyFirst && j == replySecond) {
                    if (replyFirst != 0 && replySecond != 0) {
                        JOptionPane.showMessageDialog(null, "Distance between "
                                + townCity[replyFirst] + " and " + townCity[replySecond] + " is " + distance[replyFirst * replySecond]);
                    } else if (replyFirst == 0) {
                        JOptionPane.showMessageDialog(null, "Distance between "
                                + townCity[replyFirst] + " and " + townCity[replySecond] + " is " + distance[replySecond]);
                    } else if (replySecond == 0) {
                        JOptionPane.showMessageDialog(null, "Distance between "
                                + townCity[replyFirst] + " and " + townCity[replySecond] + " is " + distance[replyFirst]);
                    }
                }
            }
        }
    }
}
