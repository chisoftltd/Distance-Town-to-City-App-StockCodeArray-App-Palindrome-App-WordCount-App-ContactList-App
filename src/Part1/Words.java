/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Part1;

import javax.swing.JOptionPane;

/**
 *
 * @author 1609963
 */
public class Words {

    static String response = "";
    private static int reply;
    private static String[] words2;
    private static String temp;

    public static void main(String[] args) {
        String[] words = new String[5];

        int num = 0;
        do {
            response = JOptionPane.showInputDialog("Enter a Word");
            words[num] = response.toUpperCase();
            num++;
        } while (!(response.equals("end") || (num >= words.length)));
        printWords(words);
        manipulateWords(words);
    }

    public static void printWords(String[] array) {
        String output = "";
        for (int i = 0; i < array.length; i++) {
            output = output + (i) + " " + array[i] + "\n";
        }
        JOptionPane.showMessageDialog(null, "Words are:\n" + output);
    }

    private static void manipulateWords(String[] words) {

        reply = Integer.parseInt(JOptionPane.showInputDialog("Enter an integer (-1 to Quit)"));
        
        while (reply != -1) {
            words2 = new String[reply + 1];
            response = JOptionPane.showInputDialog("Enter a Word");
            if (reply <= response.length()) {
                words2[reply] = response.toUpperCase();
                temp = words[reply];
                words[reply] = words2[reply];
                String output = "";
                for (int i = 0; i < words.length; i++) {
                    output = output + (i) + " " + words[i] + "\n";
                }
                JOptionPane.showMessageDialog(null, "Words are:\n" + output);

            } else {
                System.out.println("Out of bound index!");
            }
            reply = Integer.parseInt(JOptionPane.showInputDialog("Enter an integer (-1 to Quit)"));
        }
    }
}
