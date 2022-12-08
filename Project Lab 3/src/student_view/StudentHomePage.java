/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package student_view;

import view.LoginForm;
import controller.AccountInforMap;
import controller.ExitOptionBackup;
import model.MapStaffAndStudent;

/**
 *
 * @author kuriy
 */
public class StudentHomePage extends javax.swing.JFrame {

    /**
     * Creates new form HomePage
     */
    public StudentHomePage() {
        initComponents();
        this.setSize(400, 300);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.nameJlabel.setText(AccountInforMap.getName(LoginForm.getUserName()));
        ExitOptionBackup.exitOption(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        menuInternalFrame = new javax.swing.JInternalFrame();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        messMenuItem = new javax.swing.JMenuItem();
        maintenanceMenuItem = new javax.swing.JMenuItem();
        guestRoomMenuItem = new javax.swing.JMenuItem();
        welcomeLabel = new javax.swing.JLabel();
        nameJlabel = new javax.swing.JLabel();
        logoutButton = new javax.swing.JButton();

        jButton1.setText("jButton1");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        menuInternalFrame.setBorder(null);
        menuInternalFrame.setVisible(true);

        jMenu1.setText("Submit Form");

        messMenuItem.setText("Mess");
        messMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                messMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(messMenuItem);

        maintenanceMenuItem.setText("Maintainance");
        maintenanceMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maintenanceMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(maintenanceMenuItem);

        guestRoomMenuItem.setText("Booking guest room");
        guestRoomMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guestRoomMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(guestRoomMenuItem);

        jMenuBar1.add(jMenu1);

        menuInternalFrame.setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout menuInternalFrameLayout = new javax.swing.GroupLayout(menuInternalFrame.getContentPane());
        menuInternalFrame.getContentPane().setLayout(menuInternalFrameLayout);
        menuInternalFrameLayout.setHorizontalGroup(
            menuInternalFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 406, Short.MAX_VALUE)
        );
        menuInternalFrameLayout.setVerticalGroup(
            menuInternalFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        welcomeLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        welcomeLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        welcomeLabel.setText("WELCOME");

        nameJlabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        nameJlabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        logoutButton.setText("Logout");
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(menuInternalFrame)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(logoutButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(251, 251, 251)
                        .addComponent(welcomeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE))
                    .addComponent(nameJlabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(welcomeLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nameJlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(menuInternalFrame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 154, Short.MAX_VALUE)
                .addComponent(logoutButton)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    
    private void messMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_messMenuItemActionPerformed
        new MessForm().setVisible(true);
    }//GEN-LAST:event_messMenuItemActionPerformed

    private void maintenanceMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maintenanceMenuItemActionPerformed
        new MaintenanceForm().setVisible(true);
    }//GEN-LAST:event_maintenanceMenuItemActionPerformed

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        new LoginForm().setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_logoutButtonActionPerformed

    private void guestRoomMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guestRoomMenuItemActionPerformed
        new BookingGuestRoomForm(MapStaffAndStudent.mapStudentAccount.get(LoginForm.getUserName())).setVisible(true);
    }//GEN-LAST:event_guestRoomMenuItemActionPerformed

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
            java.util.logging.Logger.getLogger(StudentHomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentHomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentHomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentHomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentHomePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem guestRoomMenuItem;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JButton logoutButton;
    private javax.swing.JMenuItem maintenanceMenuItem;
    private javax.swing.JInternalFrame menuInternalFrame;
    private javax.swing.JMenuItem messMenuItem;
    private javax.swing.JLabel nameJlabel;
    private javax.swing.JLabel welcomeLabel;
    // End of variables declaration//GEN-END:variables
}
