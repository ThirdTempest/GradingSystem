/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Dashboard;

import SessionID.*;
import Login.Database;
import Login.Login;
import Resource.HoverAnimation;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User
 */
public class Subject extends javax.swing.JFrame {

    String id;
    String first;
    String middle;
    String last;
    String section;
    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;

    public Subject() {
        initComponents();
        conn = Database.conn();
        table();
        ImageIcon logo = new ImageIcon(getClass().getResource("/Resource/aclclogo.png"));//Image
        jimage.setIcon(logo);
        ImageIcon icon = new ImageIcon(getClass().getResource("/Resource/aclcicon.png"));
        setIconImage(icon.getImage());

    }

    Subject(String sectionname, String id, String firstname, String middlename, String lastname) {
        this();
        jsection.setText(sectionname);
        this.section = sectionname;
        this.id = id;
        this.first = firstname;
        this.middle = middlename;
        this.last = lastname;
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                new Section(id, firstname, middlename, lastname).setVisible(true);
                dispose();
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jsection = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jimage = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jback = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Subject");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jTable1.setForeground(new java.awt.Color(0, 90, 172));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "E-Code", "SubjectCode", "Subject"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setRowHeight(30);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 640, 510));

        jsection.setFont(new java.awt.Font("Segoe UI", 3, 48)); // NOI18N
        jsection.setText("Section(name)");
        getContentPane().add(jsection, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, -1, -1));

        jPanel1.setBackground(new java.awt.Color(0, 90, 172));

        jimage.setText("jLabel1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jimage, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(729, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jimage, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 140));

        jPanel2.setBackground(new java.awt.Color(0, 71, 171));

        jback.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jback.setText("Back");
        jback.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(70, Short.MAX_VALUE)
                .addComponent(jback, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(422, Short.MAX_VALUE)
                .addComponent(jback, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 130, 240, 520));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        if (evt.getClickCount() == 2 && jTable1.getSelectedRow() != -1) {//clicking Jtable row fuction
            int selectedRow = jTable1.getSelectedRow();
            String subjectName = jTable1.getValueAt(selectedRow, 1).toString(); // from Jtable column

            int sectionID = SessionSection.AccessID;//from SessionSection from SessionID

            try {
                String sql = "SELECT SubjectID FROM subject WHERE SectionID = ? AND SubjectName = ?"; // getting the correct SubjectID based on subject name and section
                pst = conn.prepareStatement(sql);
                pst.setInt(1, sectionID);
                pst.setString(2, subjectName);
                rs = pst.executeQuery();

                if (rs.next()) {
                    String SubjectID = rs.getString("SubjectID");
                    int subjectID = getSubjectID(Integer.parseInt(SubjectID));
                    SessionSubject.SubjectID = subjectID;
                    new Student(subjectName, this.section, this.id, this.first, this.middle, this.last).setVisible(true);
                    this.setVisible(false);
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Subject not found.");
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(rootPane, e);
            }
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbackActionPerformed
        new Section(this.id, this.first, this.middle, this.last).setVisible(true); // Going back to Section form
        this.setVisible(false);
    }//GEN-LAST:event_jbackActionPerformed
    private void table() { // displaying data in Jtable
        int sectionid = SessionSection.AccessID; // from SessionSection in SessionID package
        try {
            String sql = "SELECT * FROM `subject` WHERE `SectionID`=?";
            pst = conn.prepareStatement(sql);
            pst.setInt(1, sectionid);
            rs = pst.executeQuery();
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.setRowCount(0);
            while (rs.next()) {
                model.addRow(new String[]{rs.getString("E-Code"),rs.getString("SubjectCode"),rs.getString("SubjectName")});
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }

    public int getSubjectID(int SubjectID) { // for SessionSubject in SessionID. (SubjectID) becomes static
        String sql = "SELECT * FROM `subject` WHERE `SectionID` = ?";

        try {
            pst = conn.prepareStatement(sql);
            pst.setInt(1, SubjectID);
            rs = pst.executeQuery();

            if (rs.next()) {
                SubjectID = rs.getInt("SubjectID");
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error retrieving SubjectID: " + e.getMessage());
        }

        return SubjectID;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Subject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Subject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Subject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Subject.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Subject().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jback;
    private javax.swing.JLabel jimage;
    private javax.swing.JLabel jsection;
    // End of variables declaration//GEN-END:variables
}
