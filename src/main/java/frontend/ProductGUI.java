/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package frontend;

import com.formdev.flatlaf.FlatDarkLaf;
import javax.swing.DefaultListModel;
import javax.swing.UnsupportedLookAndFeelException;
import backend.*;
import java.awt.Font;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author yahir
 */
public class ProductGUI extends javax.swing.JFrame {
    
   private InventoryComponent subcat;
   private DefaultListModel<String> products = new DefaultListModel<>();
   private ProductManagement productManagement;
   private int lastItemIndex = -1;
   private InventoryComponent category;
    /**
     * Creates new form ProductGUI
     */
    public ProductGUI() {
        
        initComponents();
        
    }
    
    public ProductGUI(InventoryComponent subCategory, ProductManagement mainClass, InventoryComponent cat) {
        productManagement = mainClass;
        category = cat;
        Subcategory newSubcat = (Subcategory) subCategory;
        int i = 0;
//        for (InventoryComponent entry : subcat.getComponents()) {
//            products.add(i, entry.getName());
//            i++;
//        }
        List<InventoryComponent> strList = new ArrayList<>();
        i = 0;

        for (InventoryComponent entry1 : newSubcat.getComponents()){
            strList.add(i, entry1);
            i++;
        }
        strList.sort((InventoryComponent product1, InventoryComponent product2) -> 
                Integer.compare(Integer.parseInt(product1.getId()),Integer.parseInt(product2.getId()))
            );
        newSubcat.setComponents(strList);
        for (i = 0; i < strList.size(); i++) {
            products.add(i, strList.get(i).getName());
        }
        subcat = (Subcategory) newSubcat;
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

        labelDetailsTitle = new javax.swing.JLabel();
        buttonAdd = new javax.swing.JButton();
        buttonDelete = new javax.swing.JButton();
        buttonEdit = new javax.swing.JButton();
        scrollPaneItems = new javax.swing.JScrollPane();
        listItems = new javax.swing.JList<>();
        layeredPaneDetails = new javax.swing.JLayeredPane();
        textFieldProductName = new javax.swing.JTextField();
        labelIdTitle = new javax.swing.JLabel();
        labelId = new javax.swing.JLabel();
        labelPriceTitle = new javax.swing.JLabel();
        labelPrice = new javax.swing.JLabel();
        labelDateTitle = new javax.swing.JLabel();
        labelDate = new javax.swing.JLabel();
        labelDescriptionTitle = new javax.swing.JLabel();
        scrollPaneDescription = new javax.swing.JScrollPane();
        textAreaDescription = new javax.swing.JTextArea();
        labelItemsTitle = new javax.swing.JLabel();
        panelTitleContainer = new javax.swing.JPanel();
        textFieldProductsPageTitle = new javax.swing.JTextField();
        buttonBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setLocationByPlatform(true);
        setResizable(false);
        setSize(new java.awt.Dimension(800, 600));
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        labelDetailsTitle.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        labelDetailsTitle.setText("Details");

        buttonAdd.setBackground(new java.awt.Color(78, 110, 82));
        buttonAdd.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        buttonAdd.setText("Add");
        buttonAdd.setToolTipText("");
        buttonAdd.setBorderPainted(false);
        buttonAdd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonAdd.setFocusPainted(false);
        buttonAdd.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonAdd.setMaximumSize(new java.awt.Dimension(98, 32));
        buttonAdd.setMinimumSize(new java.awt.Dimension(98, 32));
        buttonAdd.setOpaque(true);
        buttonAdd.setRequestFocusEnabled(false);
        buttonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAddActionPerformed(evt);
            }
        });

        buttonDelete.setBackground(new java.awt.Color(150, 80, 82));
        buttonDelete.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        buttonDelete.setText("Delete");
        buttonDelete.setToolTipText("");
        buttonDelete.setBorderPainted(false);
        buttonDelete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonDelete.setFocusPainted(false);
        buttonDelete.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonDelete.setMaximumSize(new java.awt.Dimension(98, 32));
        buttonDelete.setMinimumSize(new java.awt.Dimension(98, 32));
        buttonDelete.setOpaque(true);
        buttonDelete.setRequestFocusEnabled(false);
        buttonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDeleteActionPerformed(evt);
            }
        });

        buttonEdit.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        buttonEdit.setText("Edit");
        buttonEdit.setToolTipText("");
        buttonEdit.setBorderPainted(false);
        buttonEdit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonEdit.setFocusPainted(false);
        buttonEdit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonEdit.setMaximumSize(new java.awt.Dimension(98, 32));
        buttonEdit.setMinimumSize(new java.awt.Dimension(98, 32));
        buttonEdit.setOpaque(true);
        buttonEdit.setRequestFocusEnabled(false);
        buttonEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEditActionPerformed(evt);
            }
        });

        scrollPaneItems.setBorder(null);
        scrollPaneItems.setToolTipText("");
        scrollPaneItems.setFocusable(false);
        scrollPaneItems.setRequestFocusEnabled(false);

        listItems.setBorder(null);
        listItems.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        listItems.setModel(this.products);
        listItems.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        listItems.setToolTipText("");
        listItems.setFocusable(false);
        listItems.setRequestFocusEnabled(false);
        listItems.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listItemsValueChanged(evt);
            }
        });
        scrollPaneItems.setViewportView(listItems);

        layeredPaneDetails.setBackground(new java.awt.Color(70, 73, 75));
        layeredPaneDetails.setToolTipText("");
        layeredPaneDetails.setFocusable(false);
        layeredPaneDetails.setOpaque(true);
        layeredPaneDetails.setPreferredSize(new java.awt.Dimension(351, 372));
        layeredPaneDetails.setRequestFocusEnabled(false);

        textFieldProductName.setEditable(false);
        textFieldProductName.setBackground(new java.awt.Color(70, 73, 75));
        textFieldProductName.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        textFieldProductName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textFieldProductName.setText("-");
        textFieldProductName.setToolTipText("Product name");
        textFieldProductName.setBorder(null);
        textFieldProductName.setFocusable(false);
        textFieldProductName.setOpaque(true);
        textFieldProductName.setRequestFocusEnabled(false);

        labelIdTitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelIdTitle.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelIdTitle.setText("ID:");

        labelId.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelId.setText("-");
        labelId.setToolTipText("Product ID");

        labelPriceTitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelPriceTitle.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelPriceTitle.setText("Price:");

        labelPrice.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelPrice.setText("-");
        labelPrice.setToolTipText("Product purchase price");

        labelDateTitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelDateTitle.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelDateTitle.setText("Date:");

        labelDate.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelDate.setText("-");
        labelDate.setToolTipText("Product purchase date");

        labelDescriptionTitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelDescriptionTitle.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelDescriptionTitle.setText("Description:");

        textAreaDescription.setEditable(false);
        textAreaDescription.setColumns(20);
        textAreaDescription.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        textAreaDescription.setLineWrap(true);
        textAreaDescription.setRows(5);
        textAreaDescription.setToolTipText("Product description");
        textAreaDescription.setFocusable(false);
        textAreaDescription.setRequestFocusEnabled(false);
        scrollPaneDescription.setViewportView(textAreaDescription);

        layeredPaneDetails.setLayer(textFieldProductName, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layeredPaneDetails.setLayer(labelIdTitle, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layeredPaneDetails.setLayer(labelId, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layeredPaneDetails.setLayer(labelPriceTitle, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layeredPaneDetails.setLayer(labelPrice, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layeredPaneDetails.setLayer(labelDateTitle, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layeredPaneDetails.setLayer(labelDate, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layeredPaneDetails.setLayer(labelDescriptionTitle, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layeredPaneDetails.setLayer(scrollPaneDescription, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layeredPaneDetailsLayout = new javax.swing.GroupLayout(layeredPaneDetails);
        layeredPaneDetails.setLayout(layeredPaneDetailsLayout);
        layeredPaneDetailsLayout.setHorizontalGroup(
            layeredPaneDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layeredPaneDetailsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layeredPaneDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textFieldProductName, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layeredPaneDetailsLayout.createSequentialGroup()
                        .addGroup(layeredPaneDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layeredPaneDetailsLayout.createSequentialGroup()
                                .addComponent(labelIdTitle)
                                .addGap(125, 125, 125)
                                .addComponent(labelId))
                            .addGroup(layeredPaneDetailsLayout.createSequentialGroup()
                                .addComponent(labelDateTitle)
                                .addGap(104, 104, 104)
                                .addComponent(labelDate))
                            .addGroup(layeredPaneDetailsLayout.createSequentialGroup()
                                .addComponent(labelPriceTitle)
                                .addGap(102, 102, 102)
                                .addComponent(labelPrice))
                            .addComponent(labelDescriptionTitle))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layeredPaneDetailsLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(scrollPaneDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        layeredPaneDetailsLayout.setVerticalGroup(
            layeredPaneDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layeredPaneDetailsLayout.createSequentialGroup()
                .addComponent(textFieldProductName, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layeredPaneDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelIdTitle)
                    .addComponent(labelId))
                .addGap(18, 18, 18)
                .addGroup(layeredPaneDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPriceTitle)
                    .addComponent(labelPrice))
                .addGap(18, 18, 18)
                .addGroup(layeredPaneDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDateTitle)
                    .addComponent(labelDate))
                .addGap(18, 18, 18)
                .addComponent(labelDescriptionTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(scrollPaneDescription, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                .addContainerGap())
        );

        labelItemsTitle.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        labelItemsTitle.setText("Items");

        panelTitleContainer.setBackground(new java.awt.Color(30, 140, 170));

        textFieldProductsPageTitle.setEditable(false);
        textFieldProductsPageTitle.setBackground(new java.awt.Color(30, 140, 170));
        textFieldProductsPageTitle.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        textFieldProductsPageTitle.setForeground(new java.awt.Color(220, 220, 220));
        textFieldProductsPageTitle.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textFieldProductsPageTitle.setText("Products");
        textFieldProductsPageTitle.setBorder(null);
        textFieldProductsPageTitle.setFocusable(false);
        textFieldProductsPageTitle.setOpaque(true);
        textFieldProductsPageTitle.setRequestFocusEnabled(false);

        buttonBack.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        buttonBack.setText("<<");
        buttonBack.setToolTipText("Back to Categories page");
        buttonBack.setBorderPainted(false);
        buttonBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonBack.setFocusPainted(false);
        buttonBack.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonBack.setMaximumSize(new java.awt.Dimension(98, 32));
        buttonBack.setMinimumSize(new java.awt.Dimension(98, 32));
        buttonBack.setOpaque(true);
        buttonBack.setRequestFocusEnabled(false);
        buttonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelTitleContainerLayout = new javax.swing.GroupLayout(panelTitleContainer);
        panelTitleContainer.setLayout(panelTitleContainerLayout);
        panelTitleContainerLayout.setHorizontalGroup(
            panelTitleContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTitleContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(buttonBack, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textFieldProductsPageTitle)
                .addGap(88, 88, 88))
        );
        panelTitleContainerLayout.setVerticalGroup(
            panelTitleContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTitleContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelTitleContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textFieldProductsPageTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelTitleContainerLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(buttonBack, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(buttonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(scrollPaneItems, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(layeredPaneDetails, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(117, 117, 117)))
                .addGap(0, 40, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(153, 153, 153)
                .addComponent(labelItemsTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelDetailsTitle)
                .addGap(171, 171, 171))
            .addComponent(panelTitleContainer, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelTitleContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelDetailsTitle)
                    .addComponent(labelItemsTitle))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollPaneItems)
                    .addComponent(layeredPaneDetails, javax.swing.GroupLayout.DEFAULT_SIZE, 367, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAddActionPerformed
        // TODO add your handling code here:
        new AddProduct(subcat,productManagement).setVisible(true);
            
    }//GEN-LAST:event_buttonAddActionPerformed

    private void buttonEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditActionPerformed
        // TODO add your handling code here:
        if (listItems.getSelectedIndex() == -1) {
            new ErrorPopup("Please <b>select a product</b> to edit.").setVisible(true);
        } else {
            new EditProduct(subcat, productManagement, subcat.getComponents().get(listItems.getSelectedIndex())).setVisible(true);
        }
    }//GEN-LAST:event_buttonEditActionPerformed

    private void buttonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDeleteActionPerformed
        // TODO add your handling code here:
        if (listItems.getSelectedIndex() == -1) {
            new ErrorPopup("Please <b>select a product</b> to delete.").setVisible(true);
        } else {
            new DeleteObject("Product", listItems.getSelectedValue(), productManagement, subcat, category).setVisible(true);
        }
    }//GEN-LAST:event_buttonDeleteActionPerformed

    private void buttonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBackActionPerformed
        // TODO add your handling code here:
        new CategoriesGUI().setVisible(true);
        super.dispose();
        
    }//GEN-LAST:event_buttonBackActionPerformed

    private void listItemsValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listItemsValueChanged
        // TODO add your handling code here:
        if(listItems.getSelectedIndex() != -1){
            
            lastItemIndex = listItems.getSelectedIndex();
            textFieldProductName.setFont(textFieldProductName.getFont().deriveFont(24f));
            textFieldProductName.setText(subcat.getComponents().get(listItems.getSelectedIndex()).getName());
            labelId.setText(subcat.getComponents().get(listItems.getSelectedIndex()).getId());
            labelPrice.setText(Double.toString(subcat.getComponents().get(listItems.getSelectedIndex()).getPurchasePrice()));
            labelDate.setText(subcat.getComponents().get(listItems.getSelectedIndex()).getPurchaseDate());
            textAreaDescription.setText(subcat.getComponents().get(listItems.getSelectedIndex()).getDescription());
        
            if (textFieldProductName.getText().length() > 55) {
                textFieldProductName.setFont(new Font(textFieldProductName.getFont().getFamily(), textFieldProductName.getFont().getStyle(), 10));
            } else if (textFieldProductName.getText().length() > 45) {
                textFieldProductName.setFont(new Font(textFieldProductName.getFont().getFamily(), textFieldProductName.getFont().getStyle(), 12));
            } else if (textFieldProductName.getText().length() > 35) {
                textFieldProductName.setFont(new Font(textFieldProductName.getFont().getFamily(), textFieldProductName.getFont().getStyle(), 14));
            } else if (textFieldProductName.getText().length() > 25) {
                textFieldProductName.setFont(new Font(textFieldProductName.getFont().getFamily(), textFieldProductName.getFont().getStyle(), 17));
            }
        }
        
    }//GEN-LAST:event_listItemsValueChanged

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        // TODO add your handling code here:
        int i = 0;
        List<InventoryComponent> strList = new ArrayList<>();

        for (InventoryComponent entry1 : subcat.getComponents()){
            strList.add(i, entry1);
            i++;
        }
        strList.sort((InventoryComponent product1, InventoryComponent product2) -> 
                Integer.compare(Integer.parseInt(product1.getId()),Integer.parseInt(product2.getId()))
            );
        Subcategory newSubcat = (Subcategory) subcat;
        newSubcat.setComponents(strList);     
        subcat = (Subcategory) newSubcat;

        ArrayList<String> strNames = new ArrayList<>();
        for (i = 0; i < strList.size(); i++) {
            strNames.add(strList.get(i).getName());
        }
        String[] str1 = strNames.toArray(new String[0]);
        
        listItems.setListData(str1);
        textFieldProductName.setFont(textFieldProductName.getFont().deriveFont(24f));
        textFieldProductName.setText("-");
        labelId.setText("-");
        labelPrice.setText("-");
        labelDate.setText("-");
        textAreaDescription.setText("");
    }//GEN-LAST:event_formWindowGainedFocus

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            javax.swing.UIManager.setLookAndFeel(new FlatDarkLaf());
            /* Create and display the form */
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    new ProductGUI().setVisible(true);
                }
            });
        } catch (UnsupportedLookAndFeelException ex) {
             java.util.logging.Logger.getLogger(ProductGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAdd;
    private javax.swing.JButton buttonBack;
    private javax.swing.JButton buttonDelete;
    private javax.swing.JButton buttonEdit;
    private javax.swing.JLabel labelDate;
    private javax.swing.JLabel labelDateTitle;
    private javax.swing.JLabel labelDescriptionTitle;
    private javax.swing.JLabel labelDetailsTitle;
    private javax.swing.JLabel labelId;
    private javax.swing.JLabel labelIdTitle;
    private javax.swing.JLabel labelItemsTitle;
    private javax.swing.JLabel labelPrice;
    private javax.swing.JLabel labelPriceTitle;
    private javax.swing.JLayeredPane layeredPaneDetails;
    private javax.swing.JList<String> listItems;
    private javax.swing.JPanel panelTitleContainer;
    private javax.swing.JScrollPane scrollPaneDescription;
    private javax.swing.JScrollPane scrollPaneItems;
    private javax.swing.JTextArea textAreaDescription;
    private javax.swing.JTextField textFieldProductName;
    private javax.swing.JTextField textFieldProductsPageTitle;
    // End of variables declaration//GEN-END:variables
}
