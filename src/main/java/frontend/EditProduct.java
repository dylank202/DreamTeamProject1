/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package frontend;

import backend.InventoryComponent;
import backend.Product;
import backend.ProductManagement;
import com.formdev.flatlaf.FlatDarkLaf;
import java.awt.Color;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.text.BadLocationException;

/**
 *
 * @author lemon
 */
public class EditProduct extends javax.swing.JFrame {

    private boolean[] firstRun = {true, true, true, true};
    private ProductManagement productManagement;
    private InventoryComponent subcat;
    private InventoryComponent product;
    
    /**
     * Creates new form AddProduct
     */
    public EditProduct() {
        initComponents();
    }
    
    public EditProduct(InventoryComponent subcategory, ProductManagement mainClass, InventoryComponent thisProduct){
        subcat = subcategory;
        productManagement = mainClass;
        product = thisProduct;
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

        internalFrameEditItem = new javax.swing.JInternalFrame();
        textFieldEditItemHeader = new javax.swing.JTextField();
        layeredPaneEditItemContent = new javax.swing.JLayeredPane();
        labelProductNameTitle = new javax.swing.JLabel();
        formattedTextFieldProductName = new javax.swing.JFormattedTextField();
        labelPriceTitle = new javax.swing.JLabel();
        formattedTextFieldPrice = new javax.swing.JFormattedTextField();
        labelDateTitle = new javax.swing.JLabel();
        formattedTextFieldDate = new javax.swing.JFormattedTextField();
        labelDescription = new javax.swing.JLabel();
        scrollPaneDescription = new javax.swing.JScrollPane();
        textAreaDescription = new javax.swing.JTextArea();
        buttonEditItem = new javax.swing.JButton();
        buttonCancelEditItem = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(640, 480));

        internalFrameEditItem.setBorder(null);
        internalFrameEditItem.setClosable(true);
        internalFrameEditItem.setTitle("Edit Product");
        internalFrameEditItem.setFrameIcon(null);
        internalFrameEditItem.setMaximumSize(new java.awt.Dimension(480, 300));
        internalFrameEditItem.setOpaque(true);
        internalFrameEditItem.setPreferredSize(new java.awt.Dimension(480, 300));
        internalFrameEditItem.setVisible(true);
        internalFrameEditItem.addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
                internalFrameEditItemInternalFrameClosed(evt);
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

        textFieldEditItemHeader.setEditable(false);
        textFieldEditItemHeader.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        textFieldEditItemHeader.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textFieldEditItemHeader.setText("Edit Product");
        textFieldEditItemHeader.setBorder(null);
        textFieldEditItemHeader.setFocusable(false);
        textFieldEditItemHeader.setName("popupTitle"); // NOI18N

        layeredPaneEditItemContent.setBackground(new java.awt.Color(76, 76, 76));
        layeredPaneEditItemContent.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(50, 50, 50), 1, true));
        layeredPaneEditItemContent.setFocusable(false);
        layeredPaneEditItemContent.setOpaque(true);

        labelProductNameTitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelProductNameTitle.setText("Product Name:");

        formattedTextFieldProductName.setBorder(null);
        formattedTextFieldProductName.setForeground(new java.awt.Color(155, 155, 155));
        formattedTextFieldProductName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        formattedTextFieldProductName.setText(subcat.getComponents().get(subcat.getComponents().indexOf(product)).getName());
        formattedTextFieldProductName.setToolTipText("");
        formattedTextFieldProductName.setFocusLostBehavior(javax.swing.JFormattedTextField.COMMIT);
        formattedTextFieldProductName.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        formattedTextFieldProductName.setSelectionColor(new java.awt.Color(61, 100, 100));
        formattedTextFieldProductName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                formattedTextFieldProductNameKeyTyped(evt);
            }
        });

        labelPriceTitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelPriceTitle.setText("Purchase Price:");

        formattedTextFieldPrice.setBorder(null);
        formattedTextFieldPrice.setForeground(new java.awt.Color(155, 155, 155));
        formattedTextFieldPrice.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        formattedTextFieldPrice.setText(String.valueOf(subcat.getComponents().get(subcat.getComponents().indexOf(product)).getPurchasePrice()));
        formattedTextFieldPrice.setToolTipText("");
        formattedTextFieldPrice.setFocusLostBehavior(javax.swing.JFormattedTextField.COMMIT);
        formattedTextFieldPrice.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        formattedTextFieldPrice.setSelectionColor(new java.awt.Color(61, 100, 100));
        formattedTextFieldPrice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                formattedTextFieldPriceKeyTyped(evt);
            }
        });

        labelDateTitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelDateTitle.setText("Purchase Date:");

        formattedTextFieldDate.setBorder(null);
        formattedTextFieldDate.setForeground(new java.awt.Color(155, 155, 155));
        formattedTextFieldDate.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        formattedTextFieldDate.setText(subcat.getComponents().get(subcat.getComponents().indexOf(product)).getPurchaseDate());
        formattedTextFieldDate.setToolTipText("");
        formattedTextFieldDate.setFocusLostBehavior(javax.swing.JFormattedTextField.COMMIT);
        formattedTextFieldDate.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        formattedTextFieldDate.setSelectionColor(new java.awt.Color(61, 100, 100));
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
        textAreaDescription.setForeground(new java.awt.Color(155, 155, 155));
        textAreaDescription.setLineWrap(true);
        textAreaDescription.setRows(3);
        textAreaDescription.setText(subcat.getComponents().get(subcat.getComponents().indexOf(product)).getDescription());
        textAreaDescription.setToolTipText("");
        textAreaDescription.setWrapStyleWord(true);
        textAreaDescription.setSelectionColor(new java.awt.Color(61, 100, 100));
        textAreaDescription.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textAreaDescriptionKeyTyped(evt);
            }
        });
        scrollPaneDescription.setViewportView(textAreaDescription);

        layeredPaneEditItemContent.setLayer(labelProductNameTitle, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layeredPaneEditItemContent.setLayer(formattedTextFieldProductName, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layeredPaneEditItemContent.setLayer(labelPriceTitle, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layeredPaneEditItemContent.setLayer(formattedTextFieldPrice, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layeredPaneEditItemContent.setLayer(labelDateTitle, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layeredPaneEditItemContent.setLayer(formattedTextFieldDate, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layeredPaneEditItemContent.setLayer(labelDescription, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layeredPaneEditItemContent.setLayer(scrollPaneDescription, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layeredPaneEditItemContentLayout = new javax.swing.GroupLayout(layeredPaneEditItemContent);
        layeredPaneEditItemContent.setLayout(layeredPaneEditItemContentLayout);
        layeredPaneEditItemContentLayout.setHorizontalGroup(
            layeredPaneEditItemContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layeredPaneEditItemContentLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layeredPaneEditItemContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layeredPaneEditItemContentLayout.createSequentialGroup()
                        .addComponent(labelPriceTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(96, 96, 96)
                        .addComponent(formattedTextFieldPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layeredPaneEditItemContentLayout.createSequentialGroup()
                        .addComponent(labelProductNameTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(110, 110, 110)
                        .addComponent(formattedTextFieldProductName, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layeredPaneEditItemContentLayout.createSequentialGroup()
                        .addGroup(layeredPaneEditItemContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layeredPaneEditItemContentLayout.createSequentialGroup()
                                .addComponent(labelDateTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(82, 82, 82))
                            .addGroup(layeredPaneEditItemContentLayout.createSequentialGroup()
                                .addComponent(labelDescription, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layeredPaneEditItemContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(formattedTextFieldDate, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                            .addComponent(scrollPaneDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                .addGap(35, 35, 35))
        );
        layeredPaneEditItemContentLayout.setVerticalGroup(
            layeredPaneEditItemContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layeredPaneEditItemContentLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layeredPaneEditItemContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelProductNameTitle)
                    .addComponent(formattedTextFieldProductName, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layeredPaneEditItemContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPriceTitle)
                    .addComponent(formattedTextFieldPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layeredPaneEditItemContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDateTitle)
                    .addComponent(formattedTextFieldDate, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layeredPaneEditItemContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layeredPaneEditItemContentLayout.createSequentialGroup()
                        .addComponent(labelDescription)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(scrollPaneDescription, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE))
                .addContainerGap())
        );

        buttonEditItem.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        buttonEditItem.setText("Save");
        buttonEditItem.setToolTipText("");
        buttonEditItem.setBorderPainted(false);
        buttonEditItem.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonEditItem.setFocusPainted(false);
        buttonEditItem.setFocusable(false);
        buttonEditItem.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonEditItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEditItemActionPerformed(evt);
            }
        });

        buttonCancelEditItem.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        buttonCancelEditItem.setText("Cancel");
        buttonCancelEditItem.setToolTipText("");
        buttonCancelEditItem.setBorderPainted(false);
        buttonCancelEditItem.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonCancelEditItem.setFocusPainted(false);
        buttonCancelEditItem.setFocusable(false);
        buttonCancelEditItem.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonCancelEditItem.setPreferredSize(new java.awt.Dimension(85, 32));
        buttonCancelEditItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelEditItemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout internalFrameEditItemLayout = new javax.swing.GroupLayout(internalFrameEditItem.getContentPane());
        internalFrameEditItem.getContentPane().setLayout(internalFrameEditItemLayout);
        internalFrameEditItemLayout.setHorizontalGroup(
            internalFrameEditItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(textFieldEditItemHeader, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(internalFrameEditItemLayout.createSequentialGroup()
                .addGroup(internalFrameEditItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(internalFrameEditItemLayout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addComponent(buttonEditItem, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)
                        .addComponent(buttonCancelEditItem, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(internalFrameEditItemLayout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(layeredPaneEditItemContent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        internalFrameEditItemLayout.setVerticalGroup(
            internalFrameEditItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(internalFrameEditItemLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(textFieldEditItemHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(layeredPaneEditItemContent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(internalFrameEditItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonCancelEditItem, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonEditItem, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(internalFrameEditItem, javax.swing.GroupLayout.DEFAULT_SIZE, 640, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(internalFrameEditItem, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonEditItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditItemActionPerformed
        // TODO add your handling code here:
        boolean added = false;
        boolean duplicate = false;
        if (formattedTextFieldProductName.getText().isBlank()) {
            new ErrorPopup("Please enter a <b>Product Name</b> for the Product.").setVisible(true);
        } else if (formattedTextFieldPrice.getText().isBlank()) {
            new ErrorPopup("Please enter a <b>Purchase Price</b> for the Product.").setVisible(true);
        } else if (formattedTextFieldDate.getText().isBlank()) {
            new ErrorPopup("Please enter a <b>Purchase Date</b> for the Product.").setVisible(true);
        } else if (textAreaDescription.getText().isBlank()) {
            new ErrorPopup("Please enter a <b>Description</b> for the Product.").setVisible(true);
        } else {            
            for (InventoryComponent entry : subcat.getComponents()) {
                if (entry.getName().equalsIgnoreCase(formattedTextFieldProductName.getText().trim()) && !entry.getName().equalsIgnoreCase(product.getName())) {
                    new ErrorPopup("Duplicate <b>Product Name</b> for the Product. Please enter a different name.").setVisible(true);
                    duplicate = true;
                    break;
                }
            }
            try {
               Double.parseDouble(formattedTextFieldPrice.getText().trim());
            }
            catch (NumberFormatException e) {
                new ErrorPopup("Invalid <b>price</b> for the Product. Please enter a valid price.").setVisible(true);
                duplicate = true;
            }
            if(!duplicate){
                
                for (InventoryComponent entry : subcat.getComponents()) {
                    if (entry.getName().equalsIgnoreCase(product.getName())) {
                        // Delete the product from the CSV file
                        String filePath = "productData.csv";
                        subcat.getComponents().remove(entry);
                        String dataToRemove = String.format("%s␟,␟%s␟,␟%s␟,␟%s␟,␟%s", entry.getId(), entry.getName(),
                            entry.getDescription(), entry.getPurchasePrice(), entry.getPurchaseDate());
                        try {
                            productManagement.deleteDataFromFile(dataToRemove, filePath);
                        } catch (IOException ex) {
                            Logger.getLogger(DeleteObject.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        break;
                    }
                }
                Product.setProductCounter(Product.getProductCounter() - 1);
                Product newProduct = Product.addProduct(formattedTextFieldProductName.getText().trim(),
                        textAreaDescription.getText().trim(),
                        Double.parseDouble(formattedTextFieldPrice.getText().trim()),
                        formattedTextFieldDate.getText().trim(), subcat,
                        Integer.parseInt(product.getId().substring(6, 9)) - 1);
                String filePath = "productData.csv";
                String newData = String.format("%s␟,␟%s␟,␟%s␟,␟%s␟,␟%s", newProduct.getId(), newProduct.getName(),
                        newProduct.getDescription(), newProduct.getPurchasePrice(), newProduct.getPurchaseDate());
                added = true;
                try {
                    productManagement.writeDataToFile(newData, filePath);
                } catch (IOException ex) {
                    Logger.getLogger(EditProduct.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        if(added){
            super.dispose();
        }
        
    }//GEN-LAST:event_buttonEditItemActionPerformed

    private void buttonCancelEditItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelEditItemActionPerformed
        // TODO add your handling code here:
        super.dispose();
    }//GEN-LAST:event_buttonCancelEditItemActionPerformed

    private void internalFrameEditItemInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_internalFrameEditItemInternalFrameClosed
        // TODO add your handling code here:
        super.dispose();
    }//GEN-LAST:event_internalFrameEditItemInternalFrameClosed

    private void formattedTextFieldProductNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formattedTextFieldProductNameKeyTyped
        // TODO add your handling code here:
        if (!formattedTextFieldProductName.getText().equals(subcat.getComponents().get(subcat.getComponents().indexOf(product)).getName())){
            formattedTextFieldProductName.setForeground(Color.lightGray);
        }
        
        if (evt.paramString().contains("Delete") || evt.paramString().contains("Backspace")) {
            if (formattedTextFieldProductName.getText().equals(subcat.getComponents().get(subcat.getComponents().indexOf(product)).getName())) {
                formattedTextFieldProductName.setForeground(new Color(155,155,155));
            }
        } else {
            try {
                if (formattedTextFieldProductName.getText(
                        0, formattedTextFieldProductName.getCaretPosition()
                    ).concat(
                        ("" + evt.getKeyChar()).concat(
                            formattedTextFieldProductName.getText(
                                formattedTextFieldProductName.getCaretPosition(), 
                                formattedTextFieldProductName.getText().length() - formattedTextFieldProductName.getCaretPosition()
                            )
                        )
                    ).equals(subcat.getComponents().get(subcat.getComponents().indexOf(product)).getName())
                ) {
                    formattedTextFieldProductName.setForeground(new Color(155,155,155));
                } else formattedTextFieldProductName.setForeground(Color.lightGray);
            } catch (BadLocationException ex) {
                Logger.getLogger(EditProduct.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
//                if (formattedTextFieldProductName.getText(0, formattedTextFieldProductName.getCaretPosition()).concat(("" + evt.getKeyChar()).concat(formattedTextFieldProductName.getText(formattedTextFieldProductName.getCaretPosition(),formattedTextFieldProductName.getText().length() - formattedTextFieldProductName.getCaretPosition()))).equals(subcat.getComponents().get(subcat.getComponents().indexOf(product)).getName())) {
    }//GEN-LAST:event_formattedTextFieldProductNameKeyTyped

    private void formattedTextFieldPriceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formattedTextFieldPriceKeyTyped
        // TODO add your handling code here:        
        if (!formattedTextFieldPrice.getText().equals(Double.toString(subcat.getComponents().get(subcat.getComponents().indexOf(product)).getPurchasePrice()))){
            formattedTextFieldPrice.setForeground(Color.lightGray);
        }
        
        if (evt.paramString().contains("Delete") || evt.paramString().contains("Backspace")) {
            if (formattedTextFieldPrice.getText().equals(Double.toString(subcat.getComponents().get(subcat.getComponents().indexOf(product)).getPurchasePrice()))) {
                formattedTextFieldPrice.setForeground(new Color(155,155,155));
            }
        } else {
            try {
                if (formattedTextFieldPrice.getText(
                        0, formattedTextFieldPrice.getCaretPosition()
                    ).concat(
                        ("" + evt.getKeyChar()).concat(
                            formattedTextFieldPrice.getText(
                                formattedTextFieldPrice.getCaretPosition(), 
                                formattedTextFieldPrice.getText().length() - formattedTextFieldPrice.getCaretPosition()
                            )
                        )
                    ).equals(Double.toString(subcat.getComponents().get(subcat.getComponents().indexOf(product)).getPurchasePrice()))
                ) {
                    formattedTextFieldPrice.setForeground(new Color(155,155,155));
                } else formattedTextFieldPrice.setForeground(Color.lightGray);
            } catch (BadLocationException ex) {
                Logger.getLogger(EditProduct.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_formattedTextFieldPriceKeyTyped

    private void formattedTextFieldDateKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formattedTextFieldDateKeyTyped
        // TODO add your handling code here:
        if (!formattedTextFieldDate.getText().equals(subcat.getComponents().get(subcat.getComponents().indexOf(product)).getPurchaseDate())){
            formattedTextFieldDate.setForeground(Color.lightGray);
        }
        
        if (evt.paramString().contains("Delete") || evt.paramString().contains("Backspace")) {
            if (formattedTextFieldDate.getText().equals(subcat.getComponents().get(subcat.getComponents().indexOf(product)).getPurchaseDate())) {
                formattedTextFieldDate.setForeground(new Color(155,155,155));
            }
        } else {
            try {
                if (formattedTextFieldDate.getText(
                        0, formattedTextFieldDate.getCaretPosition()
                    ).concat(
                        ("" + evt.getKeyChar()).concat(
                            formattedTextFieldDate.getText(
                                formattedTextFieldDate.getCaretPosition(),
                                formattedTextFieldDate.getText().length() - formattedTextFieldDate.getCaretPosition()
                            )
                        )
                    ).equals(subcat.getComponents().get(subcat.getComponents().indexOf(product)).getPurchaseDate())
                ) {
                    formattedTextFieldDate.setForeground(new Color(155,155,155));
                } else formattedTextFieldDate.setForeground(Color.lightGray);
            } catch (BadLocationException ex) {
                Logger.getLogger(EditProduct.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_formattedTextFieldDateKeyTyped

    private void textAreaDescriptionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textAreaDescriptionKeyTyped
        // TODO add your handling code here:
        if (!textAreaDescription.getText().equals(subcat.getComponents().get(subcat.getComponents().indexOf(product)).getDescription())){
            textAreaDescription.setForeground(Color.lightGray);
        }

        if (evt.paramString().contains("Delete") || evt.paramString().contains("Backspace")) {
            if (textAreaDescription.getText().equals(subcat.getComponents().get(subcat.getComponents().indexOf(product)).getDescription())) {
                textAreaDescription.setForeground(new Color(155,155,155));
            }
        } else {
            try {
                if (textAreaDescription.getText(
                        0, textAreaDescription.getCaretPosition()
                    ).concat(
                        ("" + evt.getKeyChar()).concat(
                            textAreaDescription.getText(
                                textAreaDescription.getCaretPosition(),
                                textAreaDescription.getText().length() - textAreaDescription.getCaretPosition()
                            )
                        )
                    ).equals(subcat.getComponents().get(subcat.getComponents().indexOf(product)).getDescription())
                ) {
                    textAreaDescription.setForeground(new Color(155,155,155));
                } else textAreaDescription.setForeground(Color.lightGray);
            } catch (BadLocationException ex) {
                Logger.getLogger(EditProduct.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_textAreaDescriptionKeyTyped

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            javax.swing.UIManager.setLookAndFeel(new FlatDarkLaf());
            /* Create and display the form */
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    new EditProduct().setVisible(true);
                }
            });
        } catch (UnsupportedLookAndFeelException ex) {
             java.util.logging.Logger.getLogger(EditProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCancelEditItem;
    private javax.swing.JButton buttonEditItem;
    private javax.swing.JFormattedTextField formattedTextFieldDate;
    private javax.swing.JFormattedTextField formattedTextFieldPrice;
    private javax.swing.JFormattedTextField formattedTextFieldProductName;
    private javax.swing.JInternalFrame internalFrameEditItem;
    private javax.swing.JLabel labelDateTitle;
    private javax.swing.JLabel labelDescription;
    private javax.swing.JLabel labelPriceTitle;
    private javax.swing.JLabel labelProductNameTitle;
    private javax.swing.JLayeredPane layeredPaneEditItemContent;
    private javax.swing.JScrollPane scrollPaneDescription;
    private javax.swing.JTextArea textAreaDescription;
    private javax.swing.JTextField textFieldEditItemHeader;
    // End of variables declaration//GEN-END:variables
}
