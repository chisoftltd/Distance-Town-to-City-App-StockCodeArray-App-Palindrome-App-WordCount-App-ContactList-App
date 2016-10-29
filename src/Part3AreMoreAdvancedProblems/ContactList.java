/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Part3AreMoreAdvancedProblems;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author 1609963 (Benjamin Chinwe)
 * 
 * (a) We will look at a class called ArrayList in s couple of weeks time. 
 * But for now, consider the following Java program, and try to explain what 
 * you think it does.
 * 
 * (c) Extend the main method so that after the contacts have been added, 
 * a loop is used to ask the user to enter an integer index (or -1 to quit)
 * if a valid index is entered, ask the user to enter a new number for the
 * corresponding contact, then replace the existing number with the new number,
 * and redisplay the list of contacts and numbers
 * 
 */
public class ContactList {

    private static int option;

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        ArrayList<String> numbers = new ArrayList<>();
        String response = "";
        int num;
        while (JOptionPane.showConfirmDialog(null, "Add a contact?") == 0) {
            response = JOptionPane.showInputDialog("Enter contact name");
            names.add(response);
            response = JOptionPane.showInputDialog("Enter contact number");
            numbers.add(response);
        }

        JOptionPane.showMessageDialog(null, printList(names, numbers));
        /* Extend the main method so that after the contacts have been added, a loop is used
    * to ask the user to enter an integer index (or -1 to quit)
    * if a valid index is entered, ask the user to enter a new number for the
    * corresponding contact, then replace the existing
    *
         */
        option = Integer.parseInt(JOptionPane.showInputDialog("Enter a number (-1 to Quit): "));
        while (option != -1) {
            if ((option < numbers.size())) {
                response = JOptionPane.showInputDialog("Enter contact number");
                numbers.add(response);
                numbers.set(option, response);
                JOptionPane.showMessageDialog(null, printList(names, numbers));
                option = Integer.parseInt(JOptionPane.showInputDialog("Enter a number (-1 to Quit): "));
            } 
        }
        
    }

    static String printList(ArrayList<String> nam, ArrayList<String> num) {
        String output = "";
        for (int i = 0; i < nam.size(); i++) {
            output += (i) + " " + nam.get(i) + " " + num.get(i) + "\n";
        }
        return output;
    }
}
