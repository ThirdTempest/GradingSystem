/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Validation;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class CustomCellEditor extends DefaultCellEditor { // for feature "10/10" grade in first row
    private String denominator = "";

    public CustomCellEditor() {
        super(new JTextField());
        JTextField textField = (JTextField) getComponent();

        textField.addKeyListener(new KeyAdapter() { // handle typing
            @Override
            public void keyTyped(KeyEvent e) {
                int slashIndex = textField.getText().indexOf('/');
                if (slashIndex != -1) {
                    if (textField.getCaretPosition() >= slashIndex) { // prevent typing after the slash
                        e.consume();
                    }
                }
            }
        });
    }

    @Override
    public Component getTableCellEditorComponent(JTable table, Object value,
            boolean isSelected, int row, int column) {

        String val = value != null ? value.toString() : "";

        if (val.matches("^(--|\\d+)/\\d+$")) { //extract denominator
            denominator = val.substring(val.indexOf('/')); // includes '/'
        } else {
            denominator = "";
        }

        JTextField editor = (JTextField) super.getTableCellEditorComponent(table, value, isSelected, row, column);

        if (val.contains("/")) { // set only the numerator in editor
            editor.setText(val.substring(0, val.indexOf('/')));
        } else {
            editor.setText(val);
        }

        return editor;
    }

    @Override
    public Object getCellEditorValue() {
        String numerator = ((JTextField) getComponent()).getText().trim();
        if (!numerator.isEmpty() && denominator.startsWith("/")) {
            return numerator + denominator;
        }
        return numerator;
    }
}
