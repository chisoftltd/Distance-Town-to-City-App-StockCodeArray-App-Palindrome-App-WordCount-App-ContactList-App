package Part2WorkingwithStringsandmethodsfromtheStringclass;

import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author 1609963
 */
public class Palindrome {

    private static String word;

    public static void main(String[] args) {
        word = JOptionPane.showInputDialog("Enter a word: ").toLowerCase();
        JOptionPane.showMessageDialog(null, "Is " + word + " a Palindrome: " + palindrome(word));
    }

    private static String palindrome(String text) {
        for (int index = 0; index < text.length() / 2; index++) {
            if (text.charAt(index) != text.charAt(text.length() - index - 1)) {
                return "No!";
            }
        }
        return "Yes!";

    }
}
