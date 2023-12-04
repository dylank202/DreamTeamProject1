/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package frontend;

import javax.swing.JOptionPane;
import com.formdev.flatlaf.FlatDarkLaf;
import javax.swing.UnsupportedLookAndFeelException;
import backend.*;
import java.security.NoSuchAlgorithmException;

/**
 *
 * @author shmit
 */
public class Login extends javax.swing.JFrame {
    private Encrypt encrypt = new Encrypt();
    private String hashedPas = "77230fb5224b2316d0b4c7f4e5e5f482";
    private String hashedUser = "21232f297a57a5a743894a0e4a801fc3";
    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelAppTitle = new javax.swing.JPanel();
        textFieldAppTitle = new javax.swing.JTextField();
        labelLoginTitle = new javax.swing.JLabel();
        labelId = new javax.swing.JLabel();
        textFieldId = new javax.swing.JTextField();
        labelPassword = new javax.swing.JLabel();
        passwordFieldPassword = new javax.swing.JPasswordField();
        checkBoxShowPassword = new javax.swing.JCheckBox();
        buttonLogin = new javax.swing.JButton();
        buttonClear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(640, 400));

        panelAppTitle.setBackground(new java.awt.Color(30, 140, 170));

        textFieldAppTitle.setEditable(false);
        textFieldAppTitle.setBackground(new java.awt.Color(30, 140, 170));
        textFieldAppTitle.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        textFieldAppTitle.setForeground(new java.awt.Color(220, 220, 220));
        textFieldAppTitle.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textFieldAppTitle.setText("Inventory Management");
        textFieldAppTitle.setToolTipText("");
        textFieldAppTitle.setActionCommand("<none>");
        textFieldAppTitle.setBorder(null);
        textFieldAppTitle.setFocusable(false);
        textFieldAppTitle.setOpaque(true);
        textFieldAppTitle.setRequestFocusEnabled(false);

        javax.swing.GroupLayout panelAppTitleLayout = new javax.swing.GroupLayout(panelAppTitle);
        panelAppTitle.setLayout(panelAppTitleLayout);
        panelAppTitleLayout.setHorizontalGroup(
            panelAppTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 640, Short.MAX_VALUE)
            .addGroup(panelAppTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelAppTitleLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(textFieldAppTitle)
                    .addContainerGap()))
        );
        panelAppTitleLayout.setVerticalGroup(
            panelAppTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
            .addGroup(panelAppTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelAppTitleLayout.createSequentialGroup()
                    .addGap(9, 9, 9)
                    .addComponent(textFieldAppTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(9, Short.MAX_VALUE)))
        );

        labelLoginTitle.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        labelLoginTitle.setText("Login");

        labelId.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        labelId.setText("ID");

        labelPassword.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        labelPassword.setText("Password");

        checkBoxShowPassword.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        checkBoxShowPassword.setText("Show Password");
        checkBoxShowPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxShowPasswordActionPerformed(evt);
            }
        });

        buttonLogin.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        buttonLogin.setText("Login");
        buttonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLoginActionPerformed(evt);
            }
        });

        buttonClear.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        buttonClear.setText("Clear");
        buttonClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelAppTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(buttonLogin)
                                .addGap(33, 33, 33)
                                .addComponent(buttonClear))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(labelPassword)
                                    .addComponent(labelId))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(textFieldId, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                                    .addComponent(passwordFieldPassword)))
                            .addComponent(checkBoxShowPassword)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(251, 251, 251)
                        .addComponent(labelLoginTitle)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelAppTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelLoginTitle)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(textFieldId))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(passwordFieldPassword))
                .addGap(9, 9, 9)
                .addComponent(checkBoxShowPassword)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonLogin)
                    .addComponent(buttonClear))
                .addGap(0, 66, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void checkBoxShowPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxShowPasswordActionPerformed
        // TODO add your handling code here:
        if(checkBoxShowPassword.isSelected()){
            passwordFieldPassword.setEchoChar((char)0);
        }
        else{
            passwordFieldPassword.setEchoChar('*');
        }
    }//GEN-LAST:event_checkBoxShowPasswordActionPerformed

    private void buttonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLoginActionPerformed
        // TODO add your handling code here:
        try{
            if(textFieldId.getText().equals("")){
                JOptionPane.showMessageDialog(this,"ID is Empty");
            }
            else if(passwordFieldPassword.getText().equals("")){
                JOptionPane.showMessageDialog(this,"Password is Empty");
            } 
            else if ((encrypt.encryptString(textFieldId.getText())).equals(hashedUser) && (encrypt.encryptString(passwordFieldPassword.getText())).equals(hashedPas)) {
                new CategoriesGUI().setVisible(true);
                super.dispose();
            }
            else{
                JOptionPane.showMessageDialog(this,"Wrong ID or Password","Message",JOptionPane.ERROR_MESSAGE);
            }
        }
        catch(NoSuchAlgorithmException x)
        {
            
        }
    }//GEN-LAST:event_buttonLoginActionPerformed

    private void buttonClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonClearActionPerformed
        // TODO add your handling code here:
        textFieldId.setText("");
        passwordFieldPassword.setText("");
    }//GEN-LAST:event_buttonClearActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            javax.swing.UIManager.setLookAndFeel(new FlatDarkLaf());
            /* Create and display the form */
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    new Login().setVisible(true);
                }
            });
        } catch (UnsupportedLookAndFeelException ex) {
             java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonClear;
    private javax.swing.JButton buttonLogin;
    private javax.swing.JCheckBox checkBoxShowPassword;
    private javax.swing.JLabel labelId;
    private javax.swing.JLabel labelLoginTitle;
    private javax.swing.JLabel labelPassword;
    private javax.swing.JPanel panelAppTitle;
    private javax.swing.JPasswordField passwordFieldPassword;
    private javax.swing.JTextField textFieldAppTitle;
    private javax.swing.JTextField textFieldId;
    // End of variables declaration//GEN-END:variables
}
