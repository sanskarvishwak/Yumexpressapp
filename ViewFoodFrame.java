/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yumxpress.gui;

import java.awt.Image;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Map;
import java.util.Set;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import yumxpress.dao.ProductDAO;
import yumxpress.pojo.ProductPojo;
import yumxpress.util.OwnerProfile;

/**
 *
 * @author AFROZ
 */
public class ViewFoodFrame extends javax.swing.JFrame {

    private Map<String, ProductPojo> productDetails;

    public ViewFoodFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.lblOwnerProfile.setText("Hello " + OwnerProfile.getOwnerName());
        loadProductDetails();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblFoodImage = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtProductPrice = new javax.swing.JTextField();
        jcProductNames = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lblOwnerProfile = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        btnAddFood = new javax.swing.JButton();
        btnAddStaff = new javax.swing.JButton();
        btnViewStaff = new javax.swing.JButton();
        btnOrderList = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("View Food Frame");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(lblFoodImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 270, 300, 192));

        jLabel4.setBackground(new java.awt.Color(254, 255, 254));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(129, 120, 177));
        jLabel4.setText("Price");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 480, 105, 36));

        txtProductPrice.setEditable(false);
        txtProductPrice.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(txtProductPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 480, 178, 36));

        jcProductNames.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jcProductNames.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcProductNamesActionPerformed(evt);
            }
        });
        jPanel1.add(jcProductNames, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 220, 300, 35));

        jLabel2.setBackground(new java.awt.Color(254, 255, 254));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(129, 120, 177));
        jLabel2.setText("Select Food Name ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 160, 300, 35));

        jPanel3.setBackground(new java.awt.Color(129, 120, 177));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblOwnerProfile.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblOwnerProfile.setForeground(new java.awt.Color(51, 51, 51));
        jPanel3.add(lblOwnerProfile, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 200, 34));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/yumxpress/icons/user.png"))); // NOI18N
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, -1, -1));

        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 197, 280, 10));

        btnAddFood.setBackground(new java.awt.Color(193, 224, 127));
        btnAddFood.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnAddFood.setText("Add Food");
        btnAddFood.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddFoodActionPerformed(evt);
            }
        });
        jPanel3.add(btnAddFood, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 165, 40));

        btnAddStaff.setBackground(new java.awt.Color(193, 224, 127));
        btnAddStaff.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnAddStaff.setText("Add Staff");
        btnAddStaff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddStaffActionPerformed(evt);
            }
        });
        jPanel3.add(btnAddStaff, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 165, 40));

        btnViewStaff.setBackground(new java.awt.Color(193, 224, 127));
        btnViewStaff.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnViewStaff.setText("View Staff");
        btnViewStaff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewStaffActionPerformed(evt);
            }
        });
        jPanel3.add(btnViewStaff, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, 165, 40));

        btnOrderList.setBackground(new java.awt.Color(193, 224, 127));
        btnOrderList.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnOrderList.setText("Order List");
        btnOrderList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrderListActionPerformed(evt);
            }
        });
        jPanel3.add(btnOrderList, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 400, 165, 40));

        btnBack.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel3.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 490, 100, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -6, 280, 560));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 65)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(129, 120, 177));
        jLabel6.setText("View Food");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 0, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcProductNamesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcProductNamesActionPerformed
        String foodName = jcProductNames.getSelectedItem().toString();
        ProductPojo product = productDetails.get(foodName);
        Image img = product.getProductImage();
        img = img.getScaledInstance(lblFoodImage.getWidth(), lblFoodImage.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon icon = new ImageIcon(img);
        lblFoodImage.setIcon(icon);
        txtProductPrice.setText(product.getProductPrice() + "");


    }//GEN-LAST:event_jcProductNamesActionPerformed

    private void btnAddFoodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddFoodActionPerformed
        new AddFoodFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAddFoodActionPerformed

    private void btnAddStaffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddStaffActionPerformed
        new AddDeliveryStaffFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAddStaffActionPerformed

    private void btnViewStaffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewStaffActionPerformed
        new ViewDeliveryStaffFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnViewStaffActionPerformed

    private void btnOrderListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrderListActionPerformed
        new OrderListFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnOrderListActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        new SellerOptionFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

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
            java.util.logging.Logger.getLogger(ViewFoodFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewFoodFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewFoodFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewFoodFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewFoodFrame().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddFood;
    private javax.swing.JButton btnAddStaff;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnOrderList;
    private javax.swing.JButton btnViewStaff;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JComboBox<String> jcProductNames;
    private javax.swing.JLabel lblFoodImage;
    private javax.swing.JLabel lblOwnerProfile;
    private javax.swing.JTextField txtProductPrice;
    // End of variables declaration//GEN-END:variables

    private void loadProductDetails() {
        try {
            productDetails = ProductDAO.getProductDetailsByCompanyId(OwnerProfile.getCompanyId());
            if (productDetails.isEmpty()) {
                JOptionPane.showMessageDialog(null, "No food found for " + OwnerProfile.getCompanyId());
                return;
            }
            showProductNames();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Exception in DB in ViewFoodFrame");
            ex.printStackTrace();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Exception in DAO Image Processing in ViewFoodFrame");
            ex.printStackTrace();
        }
    }

    private void showProductNames() {
        Set<String> foodNames = productDetails.keySet();
        for (String foodName : foodNames) {
            jcProductNames.addItem(foodName);
        }
    }

}