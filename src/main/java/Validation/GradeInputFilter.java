/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Validation;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;

public class GradeInputFilter extends DocumentFilter { //restriction all character except "/" and "."
    @Override
    public void insertString(FilterBypass fb, int offset, String string, AttributeSet attr)
            throws BadLocationException {
        if (isValidInput(fb.getDocument().getText(0, fb.getDocument().getLength()) + string)) {
            super.insertString(fb, offset, string, attr);
        }
    }

    @Override
    public void replace(FilterBypass fb, int offset, int length, String string, AttributeSet attrs)
            throws BadLocationException {
        if (isValidInput(fb.getDocument().getText(0, fb.getDocument().getLength() - length) + string)) {
            super.replace(fb, offset, length, string, attrs);
        }
    }

    private boolean isValidInput(String text) {
        return text.matches("^\\d*(\\.\\d+)?(/\\d*(\\.\\d+)?)?$");
    }
}