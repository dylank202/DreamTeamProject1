/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package frontend;

import com.formdev.flatlaf.FlatDarkLaf;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author lemon
 */
public class ErrorPopup extends javax.swing.JFrame {

    String errorMessage = "Placeholder error message.";
    /**
     * Creates new form ErrorPopup
     */
    public ErrorPopup() {
        initComponents();
    }
    
    public ErrorPopup(String error) {
        initComponents();
        errorMessage = error;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        internalFrameAddCats = new javax.swing.JInternalFrame();
        textFieldAddCatsHeader = new javax.swing.JTextField();
        buttonAddCat = new javax.swing.JButton();
        formattedTextFieldCatName = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(480, 300));

        internalFrameAddCats.setBorder(null);
        internalFrameAddCats.setClosable(true);
        internalFrameAddCats.setTitle("Error");
        internalFrameAddCats.setFrameIcon(null);
        internalFrameAddCats.setMaximumSize(new java.awt.Dimension(480, 300));
        internalFrameAddCats.setOpaque(true);
        internalFrameAddCats.setPreferredSize(new java.awt.Dimension(480, 300));
        internalFrameAddCats.setVisible(true);
        internalFrameAddCats.addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
                internalFrameAddCatsInternalFrameClosed(evt);
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        textFieldAddCatsHeader.setEditable(false);
        textFieldAddCatsHeader.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        textFieldAddCatsHeader.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textFieldAddCatsHeader.setText("Error:");
        textFieldAddCatsHeader.setBorder(null);
        textFieldAddCatsHeader.setFocusable(false);
        textFieldAddCatsHeader.setName("popupTitle"); // NOI18N
        textFieldAddCatsHeader.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldAddCatsHeaderActionPerformed(evt);
            }
        });

        buttonAddCat.setBackground(new java.awt.Color(78, 80, 82));
        buttonAddCat.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        buttonAddCat.setText("Okay");
        buttonAddCat.setBorderPainted(false);
        buttonAddCat.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonAddCat.setFocusPainted(false);
        buttonAddCat.setFocusable(false);
        buttonAddCat.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonAddCat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAddCatActionPerformed(evt);
            }
        });

        formattedTextFieldCatName.setEditable(false);
        formattedTextFieldCatName.setBorder(null);
        formattedTextFieldCatName.setForeground(new java.awt.Color(190, 120, 120));
        formattedTextFieldCatName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        formattedTextFieldCatName.setText(errorMessage);
        formattedTextFieldCatName.setToolTipText("Insert name here");
        formattedTextFieldCatName.setActionCommand("<Not Set>");
        formattedTextFieldCatName.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        formattedTextFieldCatName.setDisabledTextColor(new java.awt.Color(120, 120, 120));
        formattedTextFieldCatName.setFocusLostBehavior(javax.swing.JFormattedTextField.REVERT);
        formattedTextFieldCatName.setFocusTraversalPolicyProvider(true);
        formattedTextFieldCatName.setFocusable(false);
        formattedTextFieldCatName.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        formattedTextFieldCatName.setMargin(new java.awt.Insets(6, 6, 6, 6));
        formattedTextFieldCatName.setName(""); // NOI18N
        formattedTextFieldCatName.setOpaque(true);
        formattedTextFieldCatName.setRequestFocusEnabled(false);
        formattedTextFieldCatName.setSelectedTextColor(new java.awt.Color(140, 140, 140));
        formattedTextFieldCatName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                formattedTextFieldCatNameFocusLost(evt);
            }
        });

        javax.swing.GroupLayout internalFrameAddCatsLayout = new javax.swing.GroupLayout(internalFrameAddCats.getContentPane());
        internalFrameAddCats.getContentPane().setLayout(internalFrameAddCatsLayout);
        internalFrameAddCatsLayout.setHorizontalGroup(
            internalFrameAddCatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(textFieldAddCatsHeader, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(internalFrameAddCatsLayout.createSequentialGroup()
                .addGroup(internalFrameAddCatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(internalFrameAddCatsLayout.createSequentialGroup()
                        .addGap(182, 182, 182)
                        .addComponent(buttonAddCat, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(internalFrameAddCatsLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(formattedTextFieldCatName, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        internalFrameAddCatsLayout.setVerticalGroup(
            internalFrameAddCatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(internalFrameAddCatsLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(textFieldAddCatsHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(formattedTextFieldCatName, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buttonAddCat, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 480, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(internalFrameAddCats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(internalFrameAddCats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void textFieldAddCatsHeaderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldAddCatsHeaderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldAddCatsHeaderActionPerformed

    private void buttonAddCatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAddCatActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_buttonAddCatActionPerformed

    private void formattedTextFieldCatNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formattedTextFieldCatNameFocusLost
        // TODO add your handling code here:
        // if not empty, and focus lost, replace with default text. otherwise,
        // it has user entered text, so dont delete it and keep the text there. (do nothing)
    }//GEN-LAST:event_formattedTextFieldCatNameFocusLost

    private void internalFrameAddCatsInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_internalFrameAddCatsInternalFrameClosed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_internalFrameAddCatsInternalFrameClosed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            javax.swing.UIManager.setLookAndFeel(new FlatDarkLaf());
            /* Create and display the form */
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    new ErrorPopup().setVisible(true);
                }
            });
        } catch (UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ErrorPopup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAddCat;
    private javax.swing.JFormattedTextField formattedTextFieldCatName;
    private javax.swing.JInternalFrame internalFrameAddCats;
    private javax.swing.JTextField textFieldAddCatsHeader;
    // End of variables declaration//GEN-END:variables
}
