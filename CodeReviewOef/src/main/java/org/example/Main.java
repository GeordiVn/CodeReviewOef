package org.example;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        String password = JOptionPane.showInputDialog("Type uw wachtwoord in: ");

        int totalNumbersInPassword = 0;
        boolean hasCaptial = false;
        boolean hasSpecialChar = false;
        for (char c : password.toCharArray()) {

            boolean isLetter = true;
            boolean isNumber = true;

            isLetter = Character.isLetter(c);
            isNumber = Character.isDigit(c);

            if (isNumber == false && isLetter == false) {
                hasSpecialChar = true;
            }

            if (Character.isUpperCase(c)) {
                hasCaptial = true;
            }

            try {
                Integer.parseInt(String.valueOf(c));
                totalNumbersInPassword++;
            } catch (NumberFormatException e) {
                //System.out.println("geen nummer!");
            }
        }


        if (password.length() < 8) {
            System.out.println("Password must be at least 8 characters!");
        } else if (totalNumbersInPassword < 2) {
            System.out.println("Password must contain at least 2 numbers!");

        } else if (password.length() >= 8 && totalNumbersInPassword < 2) {
            System.out.println("Password must be at least 8 characters and have 2 numbers!!");
        } else if (hasCaptial == false) {
            System.out.println("password must contain a capital letter!");
        } else if (hasSpecialChar == false) {
            System.out.println("password must have a special character!");
        }

        System.out.println("Uw wachtwoord : "+ password + " voldoet aan de eisen!");
    }
}