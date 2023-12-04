/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package frontend;

import backend.Category;
import backend.InventoryComponent;
import backend.Product;
import backend.ProductManagement;
import com.formdev.flatlaf.FlatDarkLaf;
import java.awt.Color;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author lemon
 */
public class AddProduct extends javax.swing.JFrame {

    private boolean[] firstRun = {true, true, true, true};
    private ProductManagement productManagement;
    private InventoryComponent subcat;
    
    /**
     * Creates new form AddProduct
     */
    public AddProduct() {
        initComponents();
    }
    
    public AddProduct(InventoryComponent subcategory, ProductManagement mainClass){
        subcat = subcategory;
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

        internalFrameAddItem = new javax.swing.JInternalFrame();
        textFieldAddItemHeader = new javax.swing.JTextField();
        layeredPaneAddItemContent = new javax.swing.JLayeredPane();
        labelProductNameTitle = new javax.swing.JLabel();
        formattedTextFieldProductName = new javax.swing.JFormattedTextField();
        labelPriceTitle = new javax.swing.JLabel();
        formattedTextFieldPrice = new javax.swing.JFormattedTextField();
        labelDateTitle = new javax.swing.JLabel();
        formattedTextFieldDate = new javax.swing.JFormattedTextField();
        labelDescription = new javax.swing.JLabel();
        scrollPaneDescription = new javax.swing.JScrollPane();
        textAreaDescription = new javax.swing.JTextArea();
        buttonAddItem = new javax.swing.JButton();
        buttonCancelAddItem = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(640, 480));

        internalFrameAddItem.setBorder(null);
        internalFrameAddItem.setClosable(true);
        internalFrameAddItem.setTitle("Add Product");
        internalFrameAddItem.setFrameIcon(null);
        internalFrameAddItem.setMaximumSize(new java.awt.Dimension(480, 300));
        internalFrameAddItem.setOpaque(true);
        internalFrameAddItem.setPreferredSize(new java.awt.Dimension(480, 300));
        internalFrameAddItem.setVisible(true);
        internalFrameAddItem.addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
                internalFrameAddItemInternalFrameClosed(evt);
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

        textFieldAddItemHeader.setEditable(false);
        textFieldAddItemHeader.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        textFieldAddItemHeader.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textFieldAddItemHeader.setText("Add Product");
        textFieldAddItemHeader.setBorder(null);
        textFieldAddItemHeader.setFocusable(false);
        textFieldAddItemHeader.setName("popupTitle"); // NOI18N

        layeredPaneAddItemContent.setBackground(new java.awt.Color(76, 76, 76));
        layeredPaneAddItemContent.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(50, 50, 50), 1, true));
        layeredPaneAddItemContent.setFocusable(false);
        layeredPaneAddItemContent.setOpaque(true);

        labelProductNameTitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelProductNameTitle.setText("Product Name:");

        formattedTextFieldProductName.setBorder(null);
        formattedTextFieldProductName.setForeground(new java.awt.Color(130, 130, 130));
        formattedTextFieldProductName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        formattedTextFieldProductName.setText("Product Name");
        formattedTextFieldProductName.setToolTipText("");
        formattedTextFieldProductName.setCaretPosition(6);
        formattedTextFieldProductName.setFocusLostBehavior(javax.swing.JFormattedTextField.COMMIT);
        formattedTextFieldProductName.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        formattedTextFieldProductName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formattedTextFieldProductNameMousePressed(evt);
            }
        });
        formattedTextFieldProductName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                formattedTextFieldProductNameKeyTyped(evt);
            }
        });

        labelPriceTitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelPriceTitle.setText("Purchase Price:");

        formattedTextFieldPrice.setBorder(null);
        formattedTextFieldPrice.setForeground(new java.awt.Color(130, 130, 130));
        formattedTextFieldPrice.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        formattedTextFieldPrice.setText("Purchase Price");
        formattedTextFieldPrice.setToolTipText("");
        formattedTextFieldPrice.setFocusLostBehavior(javax.swing.JFormattedTextField.COMMIT);
        formattedTextFieldPrice.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        formattedTextFieldPrice.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formattedTextFieldPriceMousePressed(evt);
            }
        });
        formattedTextFieldPrice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                formattedTextFieldPriceKeyTyped(evt);
            }
        });

        labelDateTitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelDateTitle.setText("Purchase Date:");

        formattedTextFieldDate.setBorder(null);
        formattedTextFieldDate.setForeground(new java.awt.Color(130, 130, 130));
        formattedTextFieldDate.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        formattedTextFieldDate.setText("Purchase Date");
        formattedTextFieldDate.setToolTipText("");
        formattedTextFieldDate.setFocusLostBehavior(javax.swing.JFormattedTextField.COMMIT);
        formattedTextFieldDate.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        formattedTextFieldDate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formattedTextFieldDateMousePressed(evt);
            }
        });
        formattedTextFieldDate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                formattedTextFieldDateKeyTyped(evt);
            }
        });

        labelDescription.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelDescription.setText("Description:");

        scrollPaneDescription.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        textAreaDescription.setColumns(20);
        textAreaDescription.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        textAreaDescription.setForeground(new java.awt.Color(130, 130, 130));
        textAreaDescription.setLineWrap(true);
        textAreaDescription.setRows(3);
        textAreaDescription.setText("Product Description");
        textAreaDescription.setToolTipText("");
        textAreaDescription.setWrapStyleWord(true);
        textAreaDescription.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                textAreaDescriptionMousePressed(evt);
            }
        });
        textAreaDescription.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textAreaDescriptionKeyTyped(evt);
            }
        });
        scrollPaneDescription.setViewportView(textAreaDescription);

        layeredPaneAddItemContent.setLayer(labelProductNameTitle, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layeredPaneAddItemContent.setLayer(formattedTextFieldProductName, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layeredPaneAddItemContent.setLayer(labelPriceTitle, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layeredPaneAddItemContent.setLayer(formattedTextFieldPrice, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layeredPaneAddItemContent.setLayer(labelDateTitle, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layeredPaneAddItemContent.setLayer(formattedTextFieldDate, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layeredPaneAddItemContent.setLayer(labelDescription, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layeredPaneAddItemContent.setLayer(scrollPaneDescription, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layeredPaneAddItemContentLayout = new javax.swing.GroupLayout(layeredPaneAddItemContent);
        layeredPaneAddItemContent.setLayout(layeredPaneAddItemContentLayout);
        layeredPaneAddItemContentLayout.setHorizontalGroup(
            layeredPaneAddItemContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layeredPaneAddItemContentLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layeredPaneAddItemContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layeredPaneAddItemContentLayout.createSequentialGroup()
                        .addComponent(labelPriceTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(96, 96, 96)
                        .addComponent(formattedTextFieldPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layeredPaneAddItemContentLayout.createSequentialGroup()
                        .addComponent(labelProductNameTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(110, 110, 110)
                        .addComponent(formattedTextFieldProductName, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layeredPaneAddItemContentLayout.createSequentialGroup()
                        .addGroup(layeredPaneAddItemContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layeredPaneAddItemContentLayout.createSequentialGroup()
                                .addComponent(labelDateTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(82, 82, 82))
                            .addGroup(layeredPaneAddItemContentLayout.createSequentialGroup()
                                .addComponent(labelDescription, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layeredPaneAddItemContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(formattedTextFieldDate, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                            .addComponent(scrollPaneDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                .addGap(35, 35, 35))
        );
        layeredPaneAddItemContentLayout.setVerticalGroup(
            layeredPaneAddItemContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layeredPaneAddItemContentLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layeredPaneAddItemContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelProductNameTitle)
                    .addComponent(formattedTextFieldProductName, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layeredPaneAddItemContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPriceTitle)
                    .addComponent(formattedTextFieldPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layeredPaneAddItemContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDateTitle)
                    .addComponent(formattedTextFieldDate, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layeredPaneAddItemContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layeredPaneAddItemContentLayout.createSequentialGroup()
                        .addComponent(labelDescription)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(scrollPaneDescription, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE))
                .addContainerGap())
        );

        buttonAddItem.setBackground(new java.awt.Color(78, 110, 82));
        buttonAddItem.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        buttonAddItem.setText("Add");
        buttonAddItem.setToolTipText("");
        buttonAddItem.setBorderPainted(false);
        buttonAddItem.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonAddItem.setFocusPainted(false);
        buttonAddItem.setFocusable(false);
        buttonAddItem.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonAddItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAddItemActionPerformed(evt);
            }
        });

        buttonCancelAddItem.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        buttonCancelAddItem.setText("Cancel");
        buttonCancelAddItem.setToolTipText("");
        buttonCancelAddItem.setBorderPainted(false);
        buttonCancelAddItem.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonCancelAddItem.setFocusPainted(false);
        buttonCancelAddItem.setFocusable(false);
        buttonCancelAddItem.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonCancelAddItem.setPreferredSize(new java.awt.Dimension(85, 32));
        buttonCancelAddItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelAddItemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout internalFrameAddItemLayout = new javax.swing.GroupLayout(internalFrameAddItem.getContentPane());
        internalFrameAddItem.getContentPane().setLayout(internalFrameAddItemLayout);
        internalFrameAddItemLayout.setHorizontalGroup(
            internalFrameAddItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(textFieldAddItemHeader, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(internalFrameAddItemLayout.createSequentialGroup()
                .addGroup(internalFrameAddItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(internalFrameAddItemLayout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addComponent(buttonAddItem, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)
                        .addComponent(buttonCancelAddItem, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(internalFrameAddItemLayout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(layeredPaneAddItemContent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        internalFrameAddItemLayout.setVerticalGroup(
            internalFrameAddItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(internalFrameAddItemLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(textFieldAddItemHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(layeredPaneAddItemContent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(internalFrameAddItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonCancelAddItem, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonAddItem, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(internalFrameAddItem, javax.swing.GroupLayout.DEFAULT_SIZE, 640, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(internalFrameAddItem, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonAddItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAddItemActionPerformed
        // TODO add your handling code here:
        boolean added = false;
        boolean duplicate = false;
        if (firstRun[0] || formattedTextFieldProductName.getText().isBlank()) {
            new ErrorPopup("Please enter a <b>Product Name</b> for the new Product.").setVisible(true);
        } else if (firstRun[1] || formattedTextFieldPrice.getText().isBlank()) {
            new ErrorPopup("Please enter a <b>Purchase Price</b> for the new Product.").setVisible(true);
        } else if (firstRun[2] || formattedTextFieldDate.getText().isBlank()) {
            new ErrorPopup("Please enter a <b>Purchase Date</b> for the new Product.").setVisible(true);
        } else if (firstRun[3] || textAreaDescription.getText().isBlank()) {
            new ErrorPopup("Please enter a <b>Description</b> for the new Product.").setVisible(true);
        } else {            
            for (InventoryComponent product : subcat.getComponents()) {
                if (product.getName().equalsIgnoreCase(formattedTextFieldProductName.getText().trim())) {
                    new ErrorPopup("Duplicate <b>Product Name</b> for the new Product. Please enter a different name.").setVisible(true);
                    duplicate = true;
                    break;
                }
            }
            try {
               Double.parseDouble(formattedTextFieldPrice.getText().trim());
            }
            catch (NumberFormatException e) {
                new ErrorPopup("Invalid <b>price</b> for the new Product. Please enter a valid price.").setVisible(true);
                duplicate = true;
            }
            if(!duplicate){
                 Product newProduct = Product.addProduct(formattedTextFieldProductName.getText().trim(),
                        textAreaDescription.getText().trim(),
                        Double.parseDouble(formattedTextFieldPrice.getText().trim()),
                        formattedTextFieldDate.getText().trim(), subcat,
                        productManagement.findMaxId(subcat.getComponents(), 6, 9));
                String filePath = "productData.csv";
                String newData = String.format("%s,%s,%s,%s,%s", newProduct.getId(), newProduct.getName(),
                        newProduct.getDescription(), newProduct.getPurchasePrice(), newProduct.getPurchaseDate());
                added = true;
                try {
                    productManagement.writeDataToFile(newData, filePath);
                } catch (IOException ex) {
                    Logger.getLogger(AddProduct.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        // TODO add category and subcategory functionality goes here
        }
        if(added){
            super.dispose();
        }
        
    }//GEN-LAST:event_buttonAddItemActionPerformed

    private void buttonCancelAddItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelAddItemActionPerformed
        // TODO add your handling code here:
        super.dispose();
    }//GEN-LAST:event_buttonCancelAddItemActionPerformed

    private void internalFrameAddItemInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_internalFrameAddItemInternalFrameClosed
        // TODO add your handling code here:
        super.dispose();
    }//GEN-LAST:event_internalFrameAddItemInternalFrameClosed

    private void formattedTextFieldProductNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formattedTextFieldProductNameKeyTyped
        // TODO add your handling code here:
        if (firstRun[0]) {
            if (evt.paramString().contains("Delete") || evt.paramString().contains("Backspace")){
                formattedTextFieldProductName.setForeground(new Color(130,130,130));
                formattedTextFieldProductName.setText("Product Name");
                formattedTextFieldProductName.setCaretPosition(6);
                firstRun[0] = true;
            } else {
                formattedTextFieldProductName.setForeground(Color.lightGray);
                formattedTextFieldProductName.setText("");
                firstRun[0] = false;
            }
        } else if (formattedTextFieldProductName.getText().equals("")){
            formattedTextFieldProductName.setForeground(new Color(130,130,130));
            formattedTextFieldProductName.setText("Product Name");
            formattedTextFieldProductName.setCaretPosition(6);
            firstRun[0] = true;
        }
    }//GEN-LAST:event_formattedTextFieldProductNameKeyTyped

    private void formattedTextFieldPriceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formattedTextFieldPriceKeyTyped
        // TODO add your handling code here:
        if (firstRun[1]) {
            if (evt.paramString().contains("Delete") || evt.paramString().contains("Backspace")){
                formattedTextFieldPrice.setForeground(new Color(130,130,130));
                formattedTextFieldPrice.setText("Purchase Price");
                formattedTextFieldPrice.setCaretPosition(7);
                firstRun[1] = true;
            } else {
                formattedTextFieldPrice.setForeground(Color.lightGray);
                formattedTextFieldPrice.setText("");
                firstRun[1] = false;
            }
        } else if (formattedTextFieldPrice.getText().equals("")){
            formattedTextFieldPrice.setForeground(new Color(130,130,130));
            formattedTextFieldPrice.setText("Purchase Price");
            formattedTextFieldPrice.setCaretPosition(7);
            firstRun[1] = true;
        }
    }//GEN-LAST:event_formattedTextFieldPriceKeyTyped

    private void formattedTextFieldDateKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formattedTextFieldDateKeyTyped
        // TODO add your handling code here:
         if (firstRun[2]) {
            if (evt.paramString().contains("Delete") || evt.paramString().contains("Backspace")){
                formattedTextFieldDate.setForeground(new Color(130,130,130));
                formattedTextFieldDate.setText("Purchase Date");
                formattedTextFieldDate.setCaretPosition(6);
                firstRun[2] = true;
            } else {
                formattedTextFieldDate.setForeground(Color.lightGray);
                formattedTextFieldDate.setText("");
                firstRun[2] = false;
            }
        } else if (formattedTextFieldDate.getText().equals("")){
            formattedTextFieldDate.setForeground(new Color(130,130,130));
            formattedTextFieldDate.setText("Purchase Date");
            formattedTextFieldDate.setCaretPosition(6);
            firstRun[2] = true;
        }
    }//GEN-LAST:event_formattedTextFieldDateKeyTyped

    private void textAreaDescriptionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textAreaDescriptionKeyTyped
        // TODO add your handling code here:
        if (firstRun[3]) {
            if (evt.paramString().contains("Delete") || evt.paramString().contains("Backspace")){
                textAreaDescription.setForeground(new Color(130,130,130));
                textAreaDescription.setText("Product Description");
                textAreaDescription.setCaretPosition(0);
                firstRun[3] = true;
            } else {
                textAreaDescription.setForeground(Color.lightGray);
                textAreaDescription.setText("");
                firstRun[3] = false;
            }
        } else if (textAreaDescription.getText().equals("")){
            textAreaDescription.setForeground(new Color(130,130,130));
            textAreaDescription.setText("Product Description");
            textAreaDescription.setCaretPosition(0);
            firstRun[3] = true;
        }
    }//GEN-LAST:event_textAreaDescriptionKeyTyped

    private void formattedTextFieldProductNameMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formattedTextFieldProductNameMousePressed
        // TODO add your handling code here:
        if (firstRun[0]) 
            formattedTextFieldProductName.setCaretPosition(6);
    }//GEN-LAST:event_formattedTextFieldProductNameMousePressed

    private void formattedTextFieldPriceMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formattedTextFieldPriceMousePressed
        // TODO add your handling code here:
        if (firstRun[1]) 
            formattedTextFieldPrice.setCaretPosition(7);
    }//GEN-LAST:event_formattedTextFieldPriceMousePressed

    private void formattedTextFieldDateMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formattedTextFieldDateMousePressed
        // TODO add your handling code here:
        if (firstRun[2]) 
            formattedTextFieldDate.setCaretPosition(6);
    }//GEN-LAST:event_formattedTextFieldDateMousePressed

    private void textAreaDescriptionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textAreaDescriptionMousePressed
        // TODO add your handling code here:
        if (firstRun[3]) 
            textAreaDescription.setCaretPosition(0);
    }//GEN-LAST:event_textAreaDescriptionMousePressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            javax.swing.UIManager.setLookAndFeel(new FlatDarkLaf());
            /* Create and display the form */
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    new AddProduct().setVisible(true);
                }
            });
        } catch (UnsupportedLookAndFeelException ex) {
             java.util.logging.Logger.getLogger(AddProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAddItem;
    private javax.swing.JButton buttonCancelAddItem;
    private javax.swing.JFormattedTextField formattedTextFieldDate;
    private javax.swing.JFormattedTextField formattedTextFieldPrice;
    private javax.swing.JFormattedTextField formattedTextFieldProductName;
    private javax.swing.JInternalFrame internalFrameAddItem;
    private javax.swing.JLabel labelDateTitle;
    private javax.swing.JLabel labelDescription;
    private javax.swing.JLabel labelPriceTitle;
    private javax.swing.JLabel labelProductNameTitle;
    private javax.swing.JLayeredPane layeredPaneAddItemContent;
    private javax.swing.JScrollPane scrollPaneDescription;
    private javax.swing.JTextArea textAreaDescription;
    private javax.swing.JTextField textFieldAddItemHeader;
    // End of variables declaration//GEN-END:variables
}
