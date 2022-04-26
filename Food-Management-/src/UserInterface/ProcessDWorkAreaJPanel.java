/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface;

import UserInterface.DistributorWorkAreaJPanel;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.SupplierEnterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Organization.SupplierOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.FoodRequirementRequest;
import Business.WorkQueue.Inventory;
import Business.WorkQueue.InventoryDirectory;
import Business.WorkQueue.Products;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Pankaj Gorav
 */
public class ProcessDWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ProcessDWorkAreaJPanel
     */
    private JPanel userProcessContainer;
    private FoodRequirementRequest request;
    private ArrayList<Inventory> inventoryList;
    private ArrayList<Products> productList;
    UserAccount userAccount;
    boolean flag1 = false;
    EcoSystem ecosystem;
    Boolean flagFood;
    Enterprise enterprise;
    HashMap<String, Integer> requiredProdMap = new HashMap<>();

    public ProcessDWorkAreaJPanel(JPanel userProcessContainer,UserAccount userAccount, FoodRequirementRequest requestFood, Boolean flag, HashMap<String, Integer> requiredProdMap, Enterprise enterprise, EcoSystem ecosystem) {
        initComponents();
        // InventoryDirectory.setInventoryList();
        this.userProcessContainer = userProcessContainer;
        this.request = requestFood;
        productList = request.getProductList();
        this.flagFood = flag;
        this.enterprise = enterprise;
        this.ecosystem = ecosystem;
        this.userAccount=userAccount;
        this.requiredProdMap = requiredProdMap;

        if (flagFood == true) {
            submitJButton.setEnabled(true);
            btnSupplierFood.setEnabled(false);

        } else {
            submitJButton.setEnabled(false);
            btnSupplierFood.setEnabled(true);

        }
        populateTable();

        populateInventory();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        resultJTextField = new javax.swing.JTextField();
        backJButton = new javax.swing.JButton();
        submitJButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblProducts = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblInventory = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        lblInventoryCount = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jComboBoxProductType = new javax.swing.JComboBox<>();
        btnProductType = new javax.swing.JButton();
        btnInventoryCount = new javax.swing.JButton();
        btnSupplierFood = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 51, 51));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Comments");

        backJButton.setBackground(new java.awt.Color(255, 255, 255));
        backJButton.setFont(new java.awt.Font("Bodoni MT", 1, 14)); // NOI18N
        backJButton.setText("Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        submitJButton.setBackground(new java.awt.Color(255, 255, 255));
        submitJButton.setFont(new java.awt.Font("Bodoni MT", 1, 14)); // NOI18N
        submitJButton.setText("Approve NGO Request");
        submitJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitJButtonActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Bodoni MT", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Process Request");

        tblProducts.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Food Type", "Product", "Quantity"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblProducts);

        tblInventory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product ID", "Product Type", "Product Name", "Availablility ", "Units"
            }
        ));
        jScrollPane1.setViewportView(tblInventory);

        jLabel3.setFont(new java.awt.Font("Bodoni MT", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Inventory Dashboard");

        lblInventoryCount.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblInventoryCount.setForeground(new java.awt.Color(255, 255, 255));
        lblInventoryCount.setText("0");

        jLabel4.setFont(new java.awt.Font("Bodoni MT", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Filter");

        jComboBoxProductType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnProductType.setBackground(new java.awt.Color(255, 255, 255));
        btnProductType.setFont(new java.awt.Font("Bodoni MT", 1, 14)); // NOI18N
        btnProductType.setText("Product Type");
        btnProductType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductTypeActionPerformed(evt);
            }
        });

        btnInventoryCount.setBackground(new java.awt.Color(255, 255, 255));
        btnInventoryCount.setFont(new java.awt.Font("Bodoni MT", 1, 14)); // NOI18N
        btnInventoryCount.setText("Inventory Count");
        btnInventoryCount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInventoryCountActionPerformed(evt);
            }
        });

        btnSupplierFood.setBackground(new java.awt.Color(255, 255, 255));
        btnSupplierFood.setFont(new java.awt.Font("Bodoni MT", 1, 14)); // NOI18N
        btnSupplierFood.setText("Request Supplier");
        btnSupplierFood.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSupplierFoodActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 303, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBoxProductType, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnProductType)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnInventoryCount)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblInventoryCount, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1)
                            .addComponent(jScrollPane2)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnSupplierFood)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(resultJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))
                                .addGap(149, 149, 149)
                                .addComponent(submitJButton)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxProductType, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnProductType, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnInventoryCount, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblInventoryCount, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSupplierFood, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(resultJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(3, 3, 3)
                            .addComponent(submitJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(97, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        DistributorWorkAreaJPanel dwjp = (DistributorWorkAreaJPanel) component;
        dwjp.populateTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void submitJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitJButtonActionPerformed

        resultJTextField.setText("Approved");
        request.setRequestResult(resultJTextField.getText());
        request.setStatus("Completed");

        int suppCount = 0, reqCount = 0, newresult = 0;

        //for (Inventory inSupp : inventoryList) 
        for (Inventory inSupp : InventoryDirectory.getInventoryList()) {
            for (Products prod : productList) {
                if (prod.getProductName().equalsIgnoreCase(inSupp.getProductName())) {
                    if (prod.getQuantity() < inSupp.getQuantity()) {
                        suppCount = inSupp.getQuantity();
                        reqCount = prod.getQuantity();
                        newresult = suppCount - reqCount;
                        inSupp.setQuantity(newresult);

                    }

                }
            }
        }
       // InventoryDirectory.setInventoryList(inventoryList);
         JOptionPane.showMessageDialog(null, "Request Approved Successfully!");
        populateInventory();
    }//GEN-LAST:event_submitJButtonActionPerformed

    private void btnProductTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductTypeActionPerformed

        ArrayList<Inventory> inv = new ArrayList<>();

        for (Inventory f : InventoryDirectory.getInventoryList()) {

            if (f.getProductType().equalsIgnoreCase((String) this.jComboBoxProductType.getSelectedItem())) {
                inv.add(f);
            }
        }
        if (inv.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Empty List");
        }

        DefaultTableModel dtm = (DefaultTableModel) tblInventory.getModel();
        dtm.setRowCount(0);

        for (Inventory p : inv) {
            Object row[] = new Object[5];
            row[0] = p;
            row[1] = p.getProductType();
            row[2] = p.getProductName();
            row[3] = p.getAvailability();
            row[4] = p.getQuantity();

            dtm.addRow(row);

        }
    }//GEN-LAST:event_btnProductTypeActionPerformed

    private void btnInventoryCountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInventoryCountActionPerformed

        int counter = 0;
        for (Inventory i : inventoryList) {

            counter = counter + i.getQuantity();

        }

        lblInventoryCount.setText(Integer.toString(counter));


    }//GEN-LAST:event_btnInventoryCountActionPerformed

    private void btnSupplierFoodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSupplierFoodActionPerformed
        // TODO add your handling code here:
        Organization orgSupp=null;
//        resultJTextField.setText("Sent to Supplier");
//        request.setRequestResult(resultJTextField.getText());
//        request.setStatus("Sent to Supplier");
        ArrayList<Products> productListSupp = new ArrayList<>();
        for (String str : requiredProdMap.keySet()) {
            Products p = new Products();
            p.setProductName(str);
            p.setQuantity(requiredProdMap.get(str));
            productListSupp.add(p);

        }
      // request.setMessage("Process Required Food");
        request.setSender(userAccount);
        if(request.getReceiver()==userAccount)
        {
            request.setReceiver(null);
        }
        request.setStatus("Pending Approval from Supplier");
        request.setProductList(productList);
        request.setSuppProductList(productListSupp);
        
        for (Network network : ecosystem.getNetworkList()) {
            for (Enterprise entp : network.getEnterpriseDirectory().getEnterpriseList()) {
                if (entp instanceof SupplierEnterprise) {
                    for (Organization org : entp.getOrganizationDirectory().getOrganizationList()) {
                        if (org instanceof SupplierOrganization) {
                           org.getWorkQueue().getWorkRequestList().add(request);
                           userAccount.getWorkQueue().getWorkRequestList().add(request);
                            

                        }
                    }
                }
            }
        }
      
          
        
        JOptionPane.showMessageDialog(null, "Request Sent to Supplier!");
        
      
    }//GEN-LAST:event_btnSupplierFoodActionPerformed

    public void populateTable() {

        DefaultTableModel model = (DefaultTableModel) tblProducts.getModel();

        model.setRowCount(0);

        productList = ((FoodRequirementRequest) request).getProductList();
        if (productList != null) {
            for (Products p : productList) {
                Object row[] = new Object[3];
                row[0] = p;
                row[1] = p.getProductName();
                row[2] = p.getQuantity();
                model.addRow(row);
            }
        }
    }

    private void populateInventory() {

          inventoryList = InventoryDirectory.getInventoryList();
        DefaultTableModel model1 = (DefaultTableModel) tblInventory.getModel();
        model1.setRowCount(0);
        for (Inventory p : inventoryList) {
            Object row[] = new Object[5];
            row[0] = p;
            row[1] = p.getProductType();
            row[2] = p.getProductName();
            row[3] = p.getAvailability();
            row[4] = p.getQuantity();

            model1.addRow(row);

        }
        Set<String> set = new HashSet<String>();
        for (Inventory c : InventoryDirectory.getInventoryList()) {
            set.add(c.getProductType());
        }
        jComboBoxProductType.removeAllItems();

        for (String a : set) {
            jComboBoxProductType.addItem(a);
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JButton btnInventoryCount;
    private javax.swing.JButton btnProductType;
    private javax.swing.JButton btnSupplierFood;
    private javax.swing.JComboBox<String> jComboBoxProductType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblInventoryCount;
    private javax.swing.JTextField resultJTextField;
    private javax.swing.JButton submitJButton;
    private javax.swing.JTable tblInventory;
    private javax.swing.JTable tblProducts;
    // End of variables declaration//GEN-END:variables

}
