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
public interface SubjectValidation {//for subject
    public abstract boolean emptySubject(String Subject, JLabel errorsubject);
    public abstract void setError(JLabel label, String message);
    public abstract void clearError(JLabel label);
}
