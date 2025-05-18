/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Validation;

import javax.swing.JLabel;

/**
 *
 * @author User
 */
public interface SectionValidation { //for section
    public abstract boolean emptySection(String section, JLabel errorsection);
    public abstract void setError(JLabel label, String message);
    public abstract void clearError(JLabel label);
}
