/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package DashboardAdmin;

import Dashboard.*;
import SessionID.SessionSection;
import Login.Database;
import Login.Login;
import SessionID.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Resource.HoverAnimation;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *
 * @author User
 */
public class SectionAdmin extends javax.swing.JFrame {

    String id;
    String first;
    String middle;
    String last;
    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;

    public SectionAdmin() {
        initComponents();
        conn = Database.conn();
        table(); // table
        ImageIcon logo = new ImageIcon(getClass().getResource("/Resource/aclclogo.png"));//Image
        jimage.setIcon(logo);
        ImageIcon icon = new ImageIcon(getClass().getResource("/Resource/aclcicon.png"));
        setIconImage(icon.getImage());
        HoverAnimation.HoverAnimationSection(jaddsection);//HoverAnimation in HoverAnimation class in Resource Package
        HoverAnimation.HoverAnimationSection(jedit);
        HoverAnimation.HoverAnimationSection(jdelete);
    }

    public SectionAdmin(String TeacherID, String firstname, String middlename, String lastname) {
        this();
        this.id = TeacherID;
        this.first = firstname;
        this.middle = middlename;
        this.last = lastname;
        jid.setText(TeacherID);
        jname.setText(first + " " + middle + " " + last + "!");

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                new SemesterSelectionAdmin(TeacherID, firstname, middlename, lastname).setVisible(true);
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

        jimage = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jid = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jname = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jaddsection = new javax.swing.JButton();
        jedit = new javax.swing.JButton();
        jdelete = new javax.swing.JButton();
        jLogout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Section");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jimage.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        getContentPane().add(jimage, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 150, 130));

        jTable1.setBackground(new java.awt.Color(242, 242, 242));
        jTable1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTable1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jTable1.setForeground(new java.awt.Color(0, 90, 172));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Sections"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
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
        jScrollPane3.setViewportView(jTable1);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 167, 590, 480));

        jid.setFont(new java.awt.Font("Segoe UI", 0, 1)); // NOI18N
        jid.setText("jLabel1");
        getContentPane().add(jid, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 280, 60, 40));

        jPanel2.setBackground(new java.awt.Color(0, 90, 172));

        jname.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jname.setText("placeholder(name)");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel3.setText("Assigning Section");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setText("for");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(239, 239, 239)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jname, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(233, 233, 233)
                        .addComponent(jLabel3)))
                .addContainerGap(176, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jname, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 170));

        jPanel3.setBackground(new java.awt.Color(0, 71, 171));

        jaddsection.setBackground(new java.awt.Color(0, 90, 172));
        jaddsection.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jaddsection.setForeground(new java.awt.Color(255, 255, 102));
        jaddsection.setText("Add Section");
        jaddsection.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jaddsection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jaddsectionActionPerformed(evt);
            }
        });

        jedit.setBackground(new java.awt.Color(0, 90, 172));
        jedit.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jedit.setForeground(new java.awt.Color(181, 183, 16));
        jedit.setText("Edit");
        jedit.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jeditActionPerformed(evt);
            }
        });

        jdelete.setBackground(new java.awt.Color(0, 90, 172));
        jdelete.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jdelete.setText("Delete");
        jdelete.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jdelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jdeleteActionPerformed(evt);
            }
        });

        jLogout.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLogout.setText("Back");
        jLogout.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jdelete, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jedit, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jaddsection, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(jLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jaddsection, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(jedit, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addComponent(jdelete, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addComponent(jLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 170, 290, 480));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        if (evt.getClickCount() == 2 && jTable1.getSelectedRow() != -1) { //clicking Jtable row function
            int selectedRow = jTable1.getSelectedRow();
            String sectionname = (String) jTable1.getValueAt(selectedRow, 0);

            try {
                String sql = "SELECT * FROM `section` WHERE `SectionName`=?";

                pst = conn.prepareStatement(sql);
                pst.setString(1, sectionname);
                rs = pst.executeQuery();

                while (rs.next()) {
                    String sectionid = rs.getString("SectionID");
                    String id = jid.getText();
                    String firstname = first;
                    String middlename = middle;
                    String lastname = last;
                    int SectionID = getSectionID(Integer.parseInt(sectionid));
                    SessionSection.AccessID = SectionID;
                    new SubjectAdmin(sectionname, id, firstname, middlename, lastname).setVisible(true);
                    this.setVisible(false);
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(rootPane, e);
            }

        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jaddsectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jaddsectionActionPerformed
        new SectionRegistration(this.id, this.first, this.middle, this.last).setVisible(true); // adding new section
        this.setVisible(false);
    }//GEN-LAST:event_jaddsectionActionPerformed

    private void jeditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jeditActionPerformed
        int selectedRow = jTable1.getSelectedRow(); // editing existing section
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(null, "Please select a section to edit.");
            return;
        }

        String selectedSectionName = jTable1.getValueAt(selectedRow, 0).toString(); //  only 1 column
        String newSectionName = JOptionPane.showInputDialog("Enter new section name:");// Asking new name of section

        if (newSectionName == null || newSectionName.trim().isEmpty()) {
            return; // cancelled or empty input
        }
        try {
            String getIDSql = "SELECT SectionID FROM section WHERE SectionName = ?"; //getting sectionID
            pst = conn.prepareStatement(getIDSql);
            pst.setString(1, selectedSectionName);
            rs = pst.executeQuery();

            if (rs.next()) {
                int sectionID = rs.getInt("SectionID");

                String updateSql = "UPDATE section SET SectionName = ? WHERE SectionID = ?";//Updating the section name in database
                pst = conn.prepareStatement(updateSql);
                pst.setString(1, newSectionName);
                pst.setInt(2, sectionID);

                int rowsAffected = pst.executeUpdate();
                if (rowsAffected > 0) {
                    JOptionPane.showMessageDialog(null, "Section name updated successfully.");
                    table(); // refresh the table
                } else {
                    JOptionPane.showMessageDialog(null, "Update failed.");
                }

            } else {
                JOptionPane.showMessageDialog(null, "Could not find the selected section in the database.");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jeditActionPerformed

    private void jdeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jdeleteActionPerformed
        int selectedRow = jTable1.getSelectedRow(); // Deleting section
        if (selectedRow != -1) {
            String sectionName = jTable1.getValueAt(selectedRow, 0).toString();
            try {
                String getIdSQL = "SELECT SectionID FROM section WHERE SectionName = ? AND TeacherID = ?";//get sectionID
                pst = conn.prepareStatement(getIdSQL);
                pst.setString(1, sectionName);
                pst.setInt(2, SessionTeacher.loggedInTeacherId); // from SessionID package
                rs = pst.executeQuery();

                if (rs.next()) {
                    int sectionId = rs.getInt("SectionID");

                    int confirm = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete section '" + sectionName + "'?", "Confirm Delete", JOptionPane.YES_NO_OPTION);//confirmation
                    if (confirm == JOptionPane.YES_OPTION) {
                        String deleteSQL = "DELETE FROM section WHERE SectionID = ?";//delete the section
                        pst = conn.prepareStatement(deleteSQL);
                        pst.setInt(1, sectionId);
                        int rowsAffected = pst.executeUpdate();

                        if (rowsAffected > 0) {
                            JOptionPane.showMessageDialog(null, "Section deleted successfully.");
                            table(); // Refresh table after delete
                        } else {
                            JOptionPane.showMessageDialog(null, "Section not found or could not be deleted.");
                        }
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Section ID not found.");

                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please select a section to delete.");
        }
    }//GEN-LAST:event_jdeleteActionPerformed

    private void jLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLogoutActionPerformed
        new SemesterSelectionAdmin(this.id, this.first, this.middle, this.last).setVisible(true); // going back function
        this.setVisible(false);
    }//GEN-LAST:event_jLogoutActionPerformed

    public int getSectionID(int SectionID) { // get SectionID for SessionSection in SessionID. (SectionID) becomes static
        String sql = "SELECT * FROM `section` WHERE `SectionID` = ?";

        try {
            pst = conn.prepareStatement(sql);
            pst.setInt(1, SectionID);
            rs = pst.executeQuery();

            if (rs.next()) {
                SectionID = rs.getInt("SectionID");
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error retrieving SubjectID: " + e.getMessage());
        }

        return SectionID;
    }

    private void table() { //displaying the Jtable
        int teacherId = SessionTeacher.loggedInTeacherId; // from session
        int semesterId = SessionSemester.SemesterID; // make sure semesterID is stored and passed correctly

        try {
            String sql = "SELECT * FROM `section` WHERE `TeacherID` = ? AND `SemesterID` = ?";
            pst = conn.prepareStatement(sql);
            pst.setInt(1, teacherId);
            pst.setInt(2, semesterId);

            rs = pst.executeQuery();

            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.setRowCount(0); // clear table

            while (rs.next()) {
                model.addRow(new String[]{
      
                    rs.getString("SectionName")
                });
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(rootPane, "Error loading table: " + e.getMessage());
        }

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
            java.util.logging.Logger.getLogger(SectionAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SectionAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SectionAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SectionAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SectionAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton jLogout;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jaddsection;
    private javax.swing.JButton jdelete;
    private javax.swing.JButton jedit;
    private javax.swing.JLabel jid;
    private javax.swing.JLabel jimage;
    private javax.swing.JLabel jname;
    // End of variables declaration//GEN-END:variables
}
