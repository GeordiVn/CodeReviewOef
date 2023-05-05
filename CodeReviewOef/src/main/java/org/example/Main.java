package org.example;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        String password = JOptionPane.showInputDialog("Type uw wachtwoord in: ");

        int totalNumbersInPassword = 0;

        for (char c : password.toCharArray()) {


            try {
                Integer.parseInt(String.valueOf(c));
                totalNumbersInPassword++;
            } catch (NumberFormatException e) {
                //System.out.println("geen nummer!");
            }
        }

        System.out.println(totalNumbersInPassword);
        if (password.length() < 8) {
            System.out.println("Password must be at least 8 characters!");
        } else if (totalNumbersInPassword < 2) {
            System.out.println("Password must contain 2 numbers!");
        } else if (totalNumbersInPassword < 2 || password.length() < 8) {
            System.out.println("Password must be at least 8 characters and have 2 numbers!!");
        }


    }
}