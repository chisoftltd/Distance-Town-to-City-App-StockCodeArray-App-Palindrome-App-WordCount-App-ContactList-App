/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Part2WorkingwithStringsandmethodsfromtheStringclass;

import javax.swing.JOptionPane;

/**
 *
 * @author 1609963 (Benjamin Chinwe)
 * 
 * Write a Java program that reads a string from the user and replaces all 
 * occurrences of vowels with an asterisk. For example the input string 
 * "abcdefghijk" will be displayed as "*bcd*fgh*jk".
 * 
 */
public class VowelForAsterisk {
    private static String word;
    public static void main(String[] args) {
        word = JOptionPane.showInputDialog("Enter a word: ").toLowerCase();
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == 'a' || word.charAt(i) == 'e'
                    || word.charAt(i) == 'i' || word.charAt(i) == 'o'
                    || word.charAt(i) == 'u') {
                word = word.replace(String.valueOf(word.charAt(i)), "*");
            } 
        }
        JOptionPane.showMessageDialog(null, "Word without Vowels : " + word);
    }
}
