/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Part2WorkingwithStringsandmethodsfromtheStringclass;

import javax.swing.JOptionPane;

/**
 *
 * @author 1609963
 */
public class StringTest {

    public static void main(String[] args) {
        String s = "abcdef";
        for (int i = 0; i < s.length(); i++) {
            System.out.println(s.charAt(i) + " ");
        }

        String s1 = JOptionPane.showInputDialog(null,
                "Please answer question 1");
        String s2 = JOptionPane.showInputDialog(null,
                "Please answer question 2");
        if (s1 == s2) {
            System.out.println("s1 and s2 contain the same string values");
        } else {
            System.out.println("s1 and s2 contain different string values");
        }

        System.out.println("\"abdef\".toUpperCase(): " + "abdef".toUpperCase());
        System.out.println("\"Java CMM001\".toLowerCase() " + "Java CMM001".toLowerCase());;
        System.out.println("\"blue\".equals(\"black\"): " + "blue".equals("black"));;
        System.out.println("\"Java CMM001\".replace(\"001\", \"023\") : " + "Java CMM001".replace("001", "023"));
        String replace = "Java CMM001".replace("007", "023");
        System.out.println("Replace: " + replace);
        String[] spilt = "23-10-2015".split(" - ");
        System.out.println("Lenght :" + spilt.length);
        if ("123 ".equals("123")) {
            System.out.println("True");
        } else {
            System.out.println("Fslse");
        }
        System.out.println("\"abcdefghijklmnopqrstuvwxyz\".substring(4, 10 : " + "abcdefghijklmnopqrstuvwxyz".substring(4, 10));
        System.out.println("\"abcdefghijklmnopqrstuvwxyz\".indexOf(\"c\")" + "abcdefghijklmnopqrstuvwxyz".indexOf("c"));
        System.out.println("\"Java is the best\".startsWith(\"jav\"): " + "Java is the best".startsWith("jav"));
        System.out.println("\"Java is the best\".endsWith(\"st\"): " + "Java is the best".endsWith("st"));

    }
}
