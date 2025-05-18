/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

    public class Database {
    public static Connection conn (){
        Connection con = null;
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            con= DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "");
        } catch (ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
       return con;     
        }
    }