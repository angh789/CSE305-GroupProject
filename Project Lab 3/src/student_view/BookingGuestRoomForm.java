/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package student_view;

import staff_view.RoomStatus;
import staff_view.AdministratorForm;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Student;
import model.Hall;
import model.MapStaffAndStudent;
import static staff_view.HallManagerView.studentTable;
import static staff_view.RoomStatus.roomStatusTable;

/**
 *
 * @author CNTT
 */
public class BookingGuestRoomForm extends javax.swing.JFrame {

    RoomStatus roomStatus;

    public BookingGuestRoomForm(Student student) {
        this.roomStatus = new RoomStatus();
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(this);
        this.setTextField(student);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bookRoomButton = new javax.swing.JButton();
        createStudentAccountLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        idTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        surNameTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        lastNameTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        dobTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        emailTextField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        seniorityTextField = new javax.swing.JTextField();
        hallLabel = new javax.swing.JLabel();
        hallTextField = new javax.swing.JTextField();
        checkButton = new javax.swing.JButton();
        roomTextField = new javax.swing.JTextField();
        roomLabel = new javax.swing.JLabel();
        majorTextField = new javax.swing.JTextField();
        genderTextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        bookRoomButton.setText("Book Room");
        bookRoomButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookRoomButtonActionPerformed(evt);
            }
        });

        createStudentAccountLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        createStudentAccountLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        createStudentAccountLabel.setText("Create Student Room");

        jLabel1.setText("ID: ");

        idTextField.setEditable(false);

        jLabel2.setText("Sur Name: ");

        surNameTextField.setEditable(false);

        jLabel3.setText("Last Name: ");

        lastNameTextField.setEditable(false);

        jLabel4.setText("Date Of Birth: ");

        dobTextField.setEditable(false);

        jLabel5.setText("Gender: ");

        jLabel6.setText("Email: ");

        emailTextField.setEditable(false);

        jLabel7.setText("Major: ");

        jLabel8.setText("Seniority:");

        seniorityTextField.setEditable(false);

        hallLabel.setText("Hall:");

        hallTextField.setEditable(false);

        checkButton.setText("Check");
        checkButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkButtonActionPerformed(evt);
            }
        });

        roomTextField.setEditable(false);

        roomLabel.setText("Room: ");

        majorTextField.setEditable(false);

        genderTextField.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(createStudentAccountLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(idTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dobTextField))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(surNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lastNameTextField))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(roomLabel)
                            .addComponent(jLabel7)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(roomTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                            .addComponent(majorTextField)
                            .addComponent(genderTextField))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(emailTextField))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(checkButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(seniorityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(hallLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(hallTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 76, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bookRoomButton)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(createStudentAccountLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(idTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(dobTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(surNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(lastNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(genderTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(seniorityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hallLabel)
                    .addComponent(hallTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(majorTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkButton)
                    .addComponent(roomTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(roomLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(bookRoomButton)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bookRoomButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookRoomButtonActionPerformed
        String id = this.idTextField.getText();
        String roomName = roomTextField.getText();
        
    }//GEN-LAST:event_bookRoomButtonActionPerformed

    private void checkButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkButtonActionPerformed

        //initialize Roomstatus
        ((DefaultTableModel) roomStatusTable.getModel()).setRowCount(0);
        
        roomStatus.setVisible(true);
        RoomStatus.addListener();

        //hall for check room
        List<Hall> hallList = AdministratorForm.getHallList();

        //
        for (Hall hall : hallList) {
            if (hall.getHallName().equals(this.hallTextField.getText())) {
                RoomStatus.createObject(hall.findVacantRoom());
            }
        }
    }//GEN-LAST:event_checkButtonActionPerformed

//    public void addStudentToList(String roomName) {
//        //get value of textfield
//        String id = this.idTextField.getText();
//        String firstName = this.lastNameTextField.getText();
//        String surName = this.surNameTextField.getText();
//        String dob = this.dobTextField.getText();
//        String gender = "";
//        String email = this.emailTextField.getText();
//        String major = "";
//
//        //String room = this.hallTextField.getText();
//        //create new student with information
//        if (id.isBlank() || firstName.isBlank() || surName.isBlank() || dob.isBlank() || email.isBlank()) {
//            JOptionPane.showMessageDialog(this, "Blank field!",
//                    "Error", JOptionPane.ERROR_MESSAGE);
//        } else {
//            try {
//                int seniority = Integer.parseInt(this.seniorityTextField.getText());
//                Student student = new Student(id, firstName, surName, dob, gender, email, major, seniority);
//                MapStaffAndStudent.mapStudentAccount.put(id, student);
//                student.setRoom(roomName);
//            } catch (NumberFormatException ex) {
//                JOptionPane.showMessageDialog(this, "Wrong number format!",
//                        "Error", JOptionPane.ERROR_MESSAGE);
//            }
//        }
//    }

    public void setTextField(Student student) {
        this.idTextField.setText(student.getId());
        this.genderTextField.setText(student.getGender());
        this.majorTextField.setText(student.getMajor());
        this.surNameTextField.setText(student.getSurName());
        this.lastNameTextField.setText(student.getFirstName());
        this.emailTextField.setText(student.getEmail());
        this.dobTextField.setText(student.getDateOfBirth());
        
        String hallName = student.getRoom().substring(0, 2);
        
        this.hallTextField.setText(hallName);
        this.seniorityTextField.setText(String.valueOf(student.getSeniority()));
    }

    public void addRoomToTable(Hall hall) {

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
            java.util.logging.Logger.getLogger(BookingGuestRoomForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BookingGuestRoomForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BookingGuestRoomForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BookingGuestRoomForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new CreateStudentRoom().setVisible(true);
//            }
//        });
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new CreateStudentRoom().setVisible(true);
//            }
//        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bookRoomButton;
    private javax.swing.JButton checkButton;
    private javax.swing.JLabel createStudentAccountLabel;
    private javax.swing.JTextField dobTextField;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JTextField genderTextField;
    private javax.swing.JLabel hallLabel;
    public javax.swing.JTextField hallTextField;
    private javax.swing.JTextField idTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField lastNameTextField;
    private javax.swing.JTextField majorTextField;
    private javax.swing.JLabel roomLabel;
    public static javax.swing.JTextField roomTextField;
    private javax.swing.JTextField seniorityTextField;
    private javax.swing.JTextField surNameTextField;
    // End of variables declaration//GEN-END:variables
}
