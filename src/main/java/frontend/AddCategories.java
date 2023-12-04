/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package frontend;
import backend.ProductManagement;
import backend.Category;
import backend.InventoryComponent;
import com.formdev.flatlaf.*;
import java.awt.Color;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import backend.Subcategory;

/**
 *
 * @author mrswi
 */
public class AddCategories extends javax.swing.JFrame {
    
    private String catType = "Category";
    private boolean firstRun = true;
    private ProductManagement productManagement;
    private int selectedCatIndex = -1; 
    
    /**
     * Creates new form AddCategories
     */
    public AddCategories() {
        initComponents();
    }
    public AddCategories(String type, ProductManagement mainClass) {
        catType = type;
        productManagement = mainClass;
        initComponents();
    }
    
    public AddCategories(String type, ProductManagement mainClass, int categories) {
        selectedCatIndex = categories;
        catType = type;
        productManagement = mainClass;
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

        internalFrameAddCats = new javax.swing.JInternalFrame();
        textFieldAddCatsHeader = new javax.swing.JTextField();
        buttonAddCat = new javax.swing.JButton();
        buttonCancelAddCat = new javax.swing.JButton();
        formattedTextFieldCatName = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setIconImages(null);
        setLocation(new java.awt.Point(0, 0));
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(480, 300));

        internalFrameAddCats.setBorder(null);
        internalFrameAddCats.setClosable(true);
        internalFrameAddCats.setTitle("Add " + catType);
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
        textFieldAddCatsHeader.setText("Add " + catType);
        textFieldAddCatsHeader.setBorder(null);
        textFieldAddCatsHeader.setFocusable(false);
        textFieldAddCatsHeader.setName("popupTitle"); // NOI18N

        buttonAddCat.setBackground(new java.awt.Color(78, 110, 82));
        buttonAddCat.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        buttonAddCat.setText("Add");
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

        buttonCancelAddCat.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        buttonCancelAddCat.setText("Cancel");
        buttonCancelAddCat.setBorderPainted(false);
        buttonCancelAddCat.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonCancelAddCat.setFocusPainted(false);
        buttonCancelAddCat.setFocusable(false);
        buttonCancelAddCat.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonCancelAddCat.setPreferredSize(new java.awt.Dimension(85, 32));
        buttonCancelAddCat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelAddCatActionPerformed(evt);
            }
        });

        formattedTextFieldCatName.setBorder(null);
        formattedTextFieldCatName.setForeground(new java.awt.Color(120, 120, 120));
        formattedTextFieldCatName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        formattedTextFieldCatName.setText(catType + " Name");
        formattedTextFieldCatName.setToolTipText("");
        formattedTextFieldCatName.setActionCommand("<Not Set>");
        formattedTextFieldCatName.setCaretPosition(formattedTextFieldCatName.getText().length() / 2);
        formattedTextFieldCatName.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        formattedTextFieldCatName.setDisabledTextColor(new java.awt.Color(120, 120, 120));
        formattedTextFieldCatName.setFocusLostBehavior(javax.swing.JFormattedTextField.REVERT);
        formattedTextFieldCatName.setFocusTraversalPolicyProvider(true);
        formattedTextFieldCatName.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        formattedTextFieldCatName.setMargin(new java.awt.Insets(6, 6, 6, 6));
        formattedTextFieldCatName.setName(""); // NOI18N
        formattedTextFieldCatName.setOpaque(true);
        formattedTextFieldCatName.setRequestFocusEnabled(false);
        formattedTextFieldCatName.setSelectedTextColor(new java.awt.Color(140, 140, 140));
        formattedTextFieldCatName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formattedTextFieldCatNameMousePressed(evt);
            }
        });
        formattedTextFieldCatName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                formattedTextFieldCatNameKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout internalFrameAddCatsLayout = new javax.swing.GroupLayout(internalFrameAddCats.getContentPane());
        internalFrameAddCats.getContentPane().setLayout(internalFrameAddCatsLayout);
        internalFrameAddCatsLayout.setHorizontalGroup(
            internalFrameAddCatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(textFieldAddCatsHeader, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(internalFrameAddCatsLayout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(buttonAddCat, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addComponent(buttonCancelAddCat, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, internalFrameAddCatsLayout.createSequentialGroup()
                .addContainerGap(64, Short.MAX_VALUE)
                .addComponent(formattedTextFieldCatName, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64))
        );
        internalFrameAddCatsLayout.setVerticalGroup(
            internalFrameAddCatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(internalFrameAddCatsLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(textFieldAddCatsHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(formattedTextFieldCatName, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(internalFrameAddCatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonCancelAddCat, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonAddCat, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(internalFrameAddCats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(internalFrameAddCats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonAddCatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAddCatActionPerformed
        // TODO add your handling code here:
        boolean duplicate = false;
        boolean added = false;
        if (firstRun || formattedTextFieldCatName.getText().isBlank()) {
            new ErrorPopup("Please enter a <b>" + catType + " Name</b> for the new " + catType + ".").setVisible(true);
        } else {
            if(catType.equals("Category")){
                for (InventoryComponent category : productManagement.getCategories().values()) {
                    if (category.getName().equalsIgnoreCase(formattedTextFieldCatName.getText().trim())) {
                        new ErrorPopup("Duplicate <b>" + catType + " Name</b> for the new " + catType + ". Please Enter a different name.").setVisible(true);
                        duplicate = true;
                        break;
                    }
                }
                if(!duplicate){
                    InventoryComponent newCategory = new Category(formattedTextFieldCatName.getText());
                    String filePath = "categoryData.csv";
                    String newData = String.format("%s,%s", newCategory.getId(), newCategory.getName());
                    //InventoryComponent newCategory = new Category(input);
                    productManagement.addCat(newCategory);
                    added = true;
                    try {
                        productManagement.writeDataToFile(newData, filePath);
                    } catch (IOException ex) {
                        Logger.getLogger(AddCategories.class.getName()).log(Level.SEVERE, null, ex);
                    }
                        
                }
            // TODO add category and subcategory functionality goes here
            }
            if(catType.equals("Subcategory")){
                InventoryComponent selectedCategory = (Category) productManagement.getCategories().values().toArray()[selectedCatIndex];
                for (InventoryComponent entry1 : selectedCategory.getComponents()) {
                    if (entry1.getName().equalsIgnoreCase(formattedTextFieldCatName.getText().trim())) {
                        new ErrorPopup("Duplicate <b>" + catType + " Name</b> for the new " + catType + ". Please Enter a new name").setVisible(true);
                        duplicate = true;
                        break;
                    }
                }
                if(!duplicate){
                    Subcategory newSubcategory = Subcategory.addSubcategory(formattedTextFieldCatName.getText(),
                           selectedCategory, productManagement.findMaxId(selectedCategory.getComponents(), 3, 6));
                    String filePath = "subcategoryData.csv";
                    String newData = String.format("%s,%s", newSubcategory.getId(), newSubcategory.getName());
                    productManagement.addSubCat(newSubcategory);
                    added = true;
                    try {
                        productManagement.writeDataToFile(newData, filePath);
                    } catch (IOException ex) {
                        Logger.getLogger(AddCategories.class.getName()).log(Level.SEVERE, null, ex);
                    }
                        
                }
            // TODO add category and subcategory functionality goes here
            }
        }
        if(added){
            super.dispose();
        }
    }//GEN-LAST:event_buttonAddCatActionPerformed

    private void buttonCancelAddCatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelAddCatActionPerformed
        super.dispose();
    }//GEN-LAST:event_buttonCancelAddCatActionPerformed

    private void internalFrameAddCatsInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_internalFrameAddCatsInternalFrameClosed
        super.dispose();
    }//GEN-LAST:event_internalFrameAddCatsInternalFrameClosed

    private void formattedTextFieldCatNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formattedTextFieldCatNameKeyTyped
        // TODO add your handling code here:
        if (firstRun) {
            if (evt.paramString().contains("Delete") || evt.paramString().contains("Backspace")){
                formattedTextFieldCatName.setForeground(new Color(120,120,120));
                formattedTextFieldCatName.setText(catType + " Name");
                formattedTextFieldCatName.setCaretPosition(formattedTextFieldCatName.getText().length() / 2);
                firstRun = true;
            } else {
                formattedTextFieldCatName.setForeground(Color.lightGray);
                formattedTextFieldCatName.setText("");
                firstRun = false;
            }
        } else if (formattedTextFieldCatName.getText().equals("")){
            formattedTextFieldCatName.setForeground(new Color(120,120,120));
            formattedTextFieldCatName.setText(catType + " Name");
            formattedTextFieldCatName.setCaretPosition(formattedTextFieldCatName.getText().length() / 2);
            firstRun = true;
        }
    }//GEN-LAST:event_formattedTextFieldCatNameKeyTyped

    private void formattedTextFieldCatNameMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formattedTextFieldCatNameMousePressed
        // TODO add your handling code here:
        if (firstRun) 
            formattedTextFieldCatName.setCaretPosition(formattedTextFieldCatName.getText().length() / 2);
    }//GEN-LAST:event_formattedTextFieldCatNameMousePressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            javax.swing.UIManager.setLookAndFeel(new FlatDarkLaf());
            /* Create and display the form */
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    new AddCategories().setVisible(true);
                }
            });
        } catch (UnsupportedLookAndFeelException ex) {
             java.util.logging.Logger.getLogger(AddCategories.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAddCat;
    private javax.swing.JButton buttonCancelAddCat;
    private javax.swing.JFormattedTextField formattedTextFieldCatName;
    private javax.swing.JInternalFrame internalFrameAddCats;
    private javax.swing.JTextField textFieldAddCatsHeader;
    // End of variables declaration//GEN-END:variables
}