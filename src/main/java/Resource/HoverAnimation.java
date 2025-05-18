/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Resource;

import java.awt.Color;
import javax.swing.JButton;

/**
 *
 * @author User
 */
public class HoverAnimation {

    public static void HoverAnimation(JButton jlogin) { // for LOGIN

        Color normalBg = new Color(25,101,179);    // Background color (normal)
        Color hoverBg = new Color(0, 150, 255);    // Background color (hover)
        Color normalFg = Color.BLACK;                // Text color (normal)
        Color hoverFg = Color.WHITE;                 // Text color (hover)

        jlogin.setBackground(normalBg);
        jlogin.setForeground(normalFg);
        jlogin.setFocusPainted(false);
        jlogin.setBorderPainted(false);
        jlogin.setOpaque(true);

        jlogin.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jlogin.setBackground(hoverBg);//set color when hover
                jlogin.setForeground(hoverFg); 
            }

            @Override
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jlogin.setBackground(normalBg);//set color when not hover
                jlogin.setForeground(normalFg); 
            }
        });
    }
    
    public static void HoverAnimationSection(JButton jbutton){ //FOR EVERYTHING EXCEPT LOGIN
                Color normalBg = new Color(0,90,172);    // Background color (normal)
        Color hoverBg = new Color(0, 150, 255);    // Background color (hover)
        Color normalFg = new Color(181,183,16);               // Text color (normal)
        Color hoverFg = new Color(255,255,102);                // Text color (hover)

        jbutton.setBackground(normalBg);
        jbutton.setForeground(normalFg);
        jbutton.setFocusPainted(false);
        jbutton.setBorderPainted(false);
        jbutton.setOpaque(true);

        jbutton.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbutton.setBackground(hoverBg);
                jbutton.setForeground(hoverFg);
            }

            @Override
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbutton.setBackground(normalBg);
                jbutton.setForeground(normalFg); 
            }
        });
    }
}
