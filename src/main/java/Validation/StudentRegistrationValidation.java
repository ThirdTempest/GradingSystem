/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Validation;

import javax.swing.JLabel;

public class StudentRegistrationValidation {

    public static boolean validateStudentInput( // for Student Registration
            String first, String middle, String last, String course, String age, String address, String email,
            JLabel errorfirst, JLabel errormiddle, JLabel errorlast, JLabel errorcourse,
            JLabel errorage, JLabel erroraddress, JLabel erroremail
    ) {
        boolean valid = true;

        // First Name
        if (first.isEmpty()) {
            setError(errorfirst, "First name cannot be empty.");
            valid = false;
        } else if (!isAlpha(first)) {
            setError(errorfirst, "First name must not contain numbers.");
            valid = false;
        } else {
            clearError(errorfirst);
        }

        if (middle != null && !middle.trim().isEmpty()) {
            if (!isAlpha(middle)) {
                setError(errormiddle, "Middle name must not contain numbers.");
                valid = false;
            } else {
                clearError(errormiddle);
            }
        } else {
            clearError(errormiddle); // No error if middle name is blank
        }

        // Last Name
        if (last.isEmpty()) {
            setError(errorlast, "Last name cannot be empty.");
            valid = false;
        } else if (!isAlpha(last)) {
            setError(errorlast, "Last name must not contain numbers.");
            valid = false;
        } else {
            clearError(errorlast);
        }

        // Course
        if (course.isEmpty()) {
            setError(errorcourse, "Course cannot be empty.");
            valid = false;
        } else {
            clearError(errorcourse);
        }

        // Age
        if (age.isEmpty()) {
            setError(errorage, "Age cannot be empty.");
            valid = false;
        } else if (!isNumeric(age)) {
            setError(errorage, "Age must be a valid number.");
            valid = false;
        } else {
            clearError(errorage);
        }

        // Address
        if (address.isEmpty()) {
            setError(erroraddress, "Address cannot be empty.");
            valid = false;
        } else {
            clearError(erroraddress);
        }

        // Email
        if (email.isEmpty()) {
            setError(erroremail, "Email cannot be empty.");
            valid = false;
        } else if (!isValidEmail(email)) {
            setError(erroremail, "Invalid email format.");
            valid = false;
        } else {
            clearError(erroremail);
        }

        return valid;
    }

    private static boolean isNumeric(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static boolean isAlpha(String str) {
        // Allows only uppercase/lowercase letters and spaces
        return str != null && str.matches("^[A-Za-z ]+$");
    }

    private static boolean isValidEmail(String email) {
        return email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$");
    }

    private static void setError(JLabel label, String message) {
        label.setText(message);
        label.setForeground(java.awt.Color.RED);
    }

    private static void clearError(JLabel label) {
        label.setText("");
    }
}
