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
 * Write a Java program that reads a string from the user and count the number 
 * of vowels and consonants that it contains. (N.B. a vowel is any of the 
 * letters 'a', 'e', 'i', 'o', 'u'; a consonant is any other letter of the 
 * alphabet). Assume the input string only contains lower case letters.
 * 
 */
public class WordCount {

    private static String word;
    private static int countVowels;
    private static int countConsonants;

    public static void main(String[] args) {
        word = JOptionPane.showInputDialog("Enter a word: ").toLowerCase();
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == 'a' || word.charAt(i) == 'e'
                    || word.charAt(i) == 'i' || word.charAt(i) == 'o'
                    || word.charAt(i) == 'u') {
                countVowels = countVowels + 1;
            } else {
                countConsonants = countConsonants + 1;
            }
        }
        JOptionPane.showMessageDialog(null, "Vowels : " + countVowels
                + " and Consonants : " + countConsonants);
    }
}
