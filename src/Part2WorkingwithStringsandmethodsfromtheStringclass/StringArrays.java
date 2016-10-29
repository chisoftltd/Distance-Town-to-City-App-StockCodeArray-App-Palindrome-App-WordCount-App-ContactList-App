/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Part2WorkingwithStringsandmethodsfromtheStringclass;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author 1609963 (Benjamin Chinwe)
 *
 * Write a program (just one class containing method public static void main()
 * and using methods from the Arrays class described in Lecture 5A) that
 *
 * · Prompts the user for an integer N 
 * · Constructs an array-of-Strings with N elements 
 * · prompts for a list of N strings, and stores them in the array 
 * · sorts the array into order using the Arrays.sort() method 
 * · prints out the “ordered” array 
 * · prompts user for a string, searches the array to see if it occurs, and if 
 *   it does will display the appropriate index number
 *
 * Test the code by entering strings of upper and lower case, so see if the sort
 * method is really a true alphabetical sorter.
 */
public class StringArrays {
    
    private static int answer;
    private static String searchString;

    public static void main(String[] args) {
        answer = Integer.parseInt(JOptionPane.showInputDialog("Enter a number: "));
        String[] stringArray = new String[answer];
        
        for (int i = 0; i < answer; i++) {
            stringArray[i] = JOptionPane.showInputDialog("Enter a string: ");
        }
        
        Arrays.sort(stringArray);
        
        JOptionPane.showMessageDialog(null, stringArray);
        
        searchString = JOptionPane.showInputDialog("Enter a search string: ");
        
        for (int i = 0; i < answer; i++) {
            if (searchString == null ? stringArray[i] == null : searchString.equals(stringArray[i])) {
                JOptionPane.showMessageDialog(null, searchString + " oocurs at index " + i);
                break;
            }else{
                JOptionPane.showMessageDialog(null, searchString + " is not the astring array ");
                break;
            }
        }
    }
}
