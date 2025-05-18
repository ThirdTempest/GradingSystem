/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Validation;

import javax.swing.JLabel;

/**
 *
 * @author User
 */
public class LoginValidation { //for Login

    public static boolean validateLoginInput(String username, String password, JLabel userError, JLabel passError) {
        boolean isValid = true;

        if (username.isEmpty()) {
            setError(userError, "Username cannot be empty.");
            isValid = false;
        } else {
            clearError(userError);
        }

        if (password.isEmpty()) {
            setError(passError, "Password cannot be empty.");
            isValid = false;
        } else {
            clearError(passError);
        }

        return isValid;
    }

    private static void setError(JLabel label, String message) {
        label.setText(message);
        label.setForeground(java.awt.Color.RED);
    }

    private static void clearError(JLabel label) {
        label.setText("");
    }
}

