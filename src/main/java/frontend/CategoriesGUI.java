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
public class CategoriesGUI extends javax.swing.JFrame {

    /**
     * Creates new form CategoriesGUI
     */
    public CategoriesGUI() {
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

        labelSubcatsTitle = new javax.swing.JLabel();
        labelCatsTitle = new javax.swing.JLabel();
        buttonAddCat = new javax.swing.JButton();
        buttonDeleteCat = new javax.swing.JButton();
        scrollPaneCategories = new javax.swing.JScrollPane();
        listCategories = new javax.swing.JList<>();
        textFieldHomePageTitle = new javax.swing.JTextField();
        scrollPaneSubcats = new javax.swing.JScrollPane();
        listSubcats = new javax.swing.JList<>();
        buttonDeleteSubcategory = new javax.swing.JButton();
        buttonAddSubcategory = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 800, 600));
        setLocationByPlatform(true);
        setMaximumSize(new java.awt.Dimension(800, 600));
        setMinimumSize(new java.awt.Dimension(800, 600));
        setResizable(false);
        setSize(new java.awt.Dimension(800, 600));

        labelSubcatsTitle.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        labelSubcatsTitle.setText("Subcategories");

        labelCatsTitle.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        labelCatsTitle.setText("Categories");

        buttonAddCat.setBackground(new java.awt.Color(78, 110, 82));
        buttonAddCat.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        buttonAddCat.setText("Add");
        buttonAddCat.setToolTipText("Add a new category");
        buttonAddCat.setBorderPainted(false);
        buttonAddCat.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonAddCat.setFocusPainted(false);
        buttonAddCat.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonAddCat.setMaximumSize(new java.awt.Dimension(98, 32));
        buttonAddCat.setMinimumSize(new java.awt.Dimension(98, 32));
        buttonAddCat.setOpaque(true);
        buttonAddCat.setRequestFocusEnabled(false);
        buttonAddCat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAddCatActionPerformed(evt);
            }
        });

        buttonDeleteCat.setBackground(new java.awt.Color(150, 80, 82));
        buttonDeleteCat.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        buttonDeleteCat.setText("Delete");
        buttonDeleteCat.setToolTipText("Delete the selected category");
        buttonDeleteCat.setBorderPainted(false);
        buttonDeleteCat.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonDeleteCat.setFocusPainted(false);
        buttonDeleteCat.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonDeleteCat.setMaximumSize(new java.awt.Dimension(98, 32));
        buttonDeleteCat.setMinimumSize(new java.awt.Dimension(98, 32));
        buttonDeleteCat.setOpaque(true);
        buttonDeleteCat.setRequestFocusEnabled(false);
        buttonDeleteCat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDeleteCatActionPerformed(evt);
            }
        });

        scrollPaneCategories.setBorder(null);
        scrollPaneCategories.setToolTipText("");
        scrollPaneCategories.setFocusable(false);
        scrollPaneCategories.setRequestFocusEnabled(false);

        listCategories.setBorder(null);
        listCategories.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        listCategories.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Category 1", "Category 2", "Category 3", "Category 4", "Category 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listCategories.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        listCategories.setToolTipText("List of all categories");
        listCategories.setFocusable(false);
        listCategories.setRequestFocusEnabled(false);
        listCategories.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listCategoriesValueChanged(evt);
            }
        });
        scrollPaneCategories.setViewportView(listCategories);

        textFieldHomePageTitle.setEditable(false);
        textFieldHomePageTitle.setBackground(new java.awt.Color(30, 140, 170));
        textFieldHomePageTitle.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        textFieldHomePageTitle.setForeground(new java.awt.Color(220, 220, 220));
        textFieldHomePageTitle.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textFieldHomePageTitle.setText("Inventory");
        textFieldHomePageTitle.setBorder(null);
        textFieldHomePageTitle.setFocusable(false);
        textFieldHomePageTitle.setOpaque(true);
        textFieldHomePageTitle.setRequestFocusEnabled(false);

        scrollPaneSubcats.setToolTipText("");
        scrollPaneSubcats.setFocusable(false);
        scrollPaneSubcats.setRequestFocusEnabled(false);

        listSubcats.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        listSubcats.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        listSubcats.setToolTipText("List of subcategories contained in the selected category");
        listSubcats.setFocusable(false);
        listSubcats.setRequestFocusEnabled(false);
        scrollPaneSubcats.setViewportView(listSubcats);

        buttonDeleteSubcategory.setBackground(new java.awt.Color(150, 80, 82));
        buttonDeleteSubcategory.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        buttonDeleteSubcategory.setText("Delete");
        buttonDeleteSubcategory.setToolTipText("Delete the selected subcategory");
        buttonDeleteSubcategory.setBorderPainted(false);
        buttonDeleteSubcategory.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonDeleteSubcategory.setFocusPainted(false);
        buttonDeleteSubcategory.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonDeleteSubcategory.setMaximumSize(new java.awt.Dimension(98, 32));
        buttonDeleteSubcategory.setMinimumSize(new java.awt.Dimension(98, 32));
        buttonDeleteSubcategory.setOpaque(true);
        buttonDeleteSubcategory.setRequestFocusEnabled(false);
        buttonDeleteSubcategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDeleteSubcategoryActionPerformed(evt);
            }
        });

        buttonAddSubcategory.setBackground(new java.awt.Color(78, 110, 82));
        buttonAddSubcategory.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        buttonAddSubcategory.setText("Add");
        buttonAddSubcategory.setToolTipText("Add a new subcategory to the selected category");
        buttonAddSubcategory.setBorderPainted(false);
        buttonAddSubcategory.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonAddSubcategory.setFocusPainted(false);
        buttonAddSubcategory.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonAddSubcategory.setMaximumSize(new java.awt.Dimension(98, 32));
        buttonAddSubcategory.setMinimumSize(new java.awt.Dimension(98, 32));
        buttonAddSubcategory.setOpaque(true);
        buttonAddSubcategory.setRequestFocusEnabled(false);
        buttonAddSubcategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAddSubcategoryActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(textFieldHomePageTitle)
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(buttonAddCat, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonDeleteCat, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(scrollPaneCategories, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(scrollPaneSubcats, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(buttonAddSubcategory, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonDeleteSubcategory, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(65, 65, 65))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(144, 144, 144)
                .addComponent(labelCatsTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelSubcatsTitle)
                .addGap(121, 121, 121))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(textFieldHomePageTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelSubcatsTitle)
                    .addComponent(labelCatsTitle))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollPaneCategories, javax.swing.GroupLayout.DEFAULT_SIZE, 379, Short.MAX_VALUE)
                    .addComponent(scrollPaneSubcats, javax.swing.GroupLayout.DEFAULT_SIZE, 379, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(buttonDeleteSubcategory, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(buttonAddSubcategory, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(buttonDeleteCat, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(buttonAddCat, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonAddCatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAddCatActionPerformed
        // TODO add your handling code here:
        new AddCategories("Category").setVisible(true);
    }//GEN-LAST:event_buttonAddCatActionPerformed

    private void buttonDeleteCatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDeleteCatActionPerformed
        // TODO add your handling code here:
        new DeleteCategory("Category", listCategories.getSelectedValue()).setVisible(true);
    }//GEN-LAST:event_buttonDeleteCatActionPerformed

    private void buttonDeleteSubcategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDeleteSubcategoryActionPerformed
        // TODO add your handling code here:
        new DeleteCategory("Subcategory", listSubcats.getSelectedValue()).setVisible(true);
    }//GEN-LAST:event_buttonDeleteSubcategoryActionPerformed

    private void buttonAddSubcategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAddSubcategoryActionPerformed
        // TODO add your handling code here:
        new AddCategories("Subcategory").setVisible(true);
    }//GEN-LAST:event_buttonAddSubcategoryActionPerformed

    private void listCategoriesValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listCategoriesValueChanged
        // TODO add your handling code here:
        //listSubcats.setListData(categories.listCategories.getSelectedIndex()); set subcategory list to correct subcategories depending on the category selected
    }//GEN-LAST:event_listCategoriesValueChanged

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            javax.swing.UIManager.setLookAndFeel(new FlatDarkLaf());
            /* Create and display the form */
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    new javax.swing.JFrame().setVisible(true);
                }
            });
        } catch (UnsupportedLookAndFeelException ex) {
             java.util.logging.Logger.getLogger(CategoriesGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CategoriesGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAddCat;
    private javax.swing.JButton buttonAddSubcategory;
    private javax.swing.JButton buttonDeleteCat;
    private javax.swing.JButton buttonDeleteSubcategory;
    private javax.swing.JLabel labelCatsTitle;
    private javax.swing.JLabel labelSubcatsTitle;
    private javax.swing.JList<String> listCategories;
    private javax.swing.JList<String> listSubcats;
    private javax.swing.JScrollPane scrollPaneCategories;
    private javax.swing.JScrollPane scrollPaneSubcats;
    private javax.swing.JTextField textFieldHomePageTitle;
    // End of variables declaration//GEN-END:variables
}
