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
public interface RegistrationValidation { // for Registration teacher
    public abstract boolean registrationvalidation(String username, String password, String firstname, String middlename, String lastname, String email, String phone,
            JLabel erroruser, JLabel errorpass, JLabel errorfirst, JLabel errormiddle, JLabel errorlast, JLabel erroremail, JLabel errorphone );
    public abstract boolean isAlpha(String str);
    public abstract boolean ValidEmail(String email);
    public abstract void setError(JLabel label, String message);
    public abstract void clearError(JLabel label);
    public abstract boolean isNumeric(String str);
}
