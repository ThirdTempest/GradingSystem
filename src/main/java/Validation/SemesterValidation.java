/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Validation;

import javax.swing.JComboBox;
import javax.swing.JLabel;

/**
 *
 * @author User
 */
public interface SemesterValidation {
    public abstract boolean emptysemester(String semester,JComboBox<String> comboBox,JLabel errorsemester, JLabel errorsection);
    public abstract void setError(JLabel label, String message);
    public abstract void clearError(JLabel label);
}
