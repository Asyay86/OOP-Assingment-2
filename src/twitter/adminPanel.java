/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package twitter;

import java.util.List;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
/**
 *
 * @author zihan
 */
public class adminPanel extends javax.swing.JFrame {
    /**
     * Creates new form bootlegTwitterGUI
     */
    
    //Singleton Pattern
    private static adminPanel instance = null;
    
    private adminPanel() {
        initComponents();
    }

    public static adminPanel getInstance() {
        if(instance == null) {
            instance = new adminPanel();
        }
        return instance;
    }
    
    private static List<user> id = new ArrayList<>();
    private static List<userGroup> g = new ArrayList<>();
    
    public static user searchId(String name){
        user result = new user("");
        
        for(int i = 0; i < id.size(); i++){
            if(name.equals(id.get(i).getID())){
                result = id.get(i);
            }
        }
        
        return result;
    }
    
    //Butoon events
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        showMessages1 = new javax.swing.JButton();
        addUser = new javax.swing.JButton();
        addGroup = new javax.swing.JButton();
        openUserView = new javax.swing.JButton();
        showGroup = new javax.swing.JButton();
        showPercentage = new javax.swing.JButton();
        showMessages = new javax.swing.JButton();
        showUser = new javax.swing.JButton();
        UserId = new javax.swing.JScrollPane();
        userArea = new javax.swing.JTextArea();
        groupId = new javax.swing.JScrollPane();
        groupArea = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        label1 = new java.awt.Label();
        label2 = new java.awt.Label();
        jScrollPane1 = new javax.swing.JScrollPane();
        treeView = new javax.swing.JTree();
        validateId = new javax.swing.JButton();
        findUpdated = new javax.swing.JButton();

        jTextArea3.setColumns(20);
        jTextArea3.setRows(5);
        jScrollPane3.setViewportView(jTextArea3);

        jFormattedTextField1.setText("jFormattedTextField1");

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        showMessages1.setText("Show Messages Total");
        showMessages1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showMessages1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        addUser.setText("Add User");
        addUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addUserActionPerformed(evt);
            }
        });

        addGroup.setText("Add Group");
        addGroup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addGroupActionPerformed(evt);
            }
        });

        openUserView.setText("Open User View");
        openUserView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openUserViewActionPerformed(evt);
            }
        });

        showGroup.setText("Show Group Total");
        showGroup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showGroupActionPerformed(evt);
            }
        });

        showPercentage.setText("Show Positive Percentage");
        showPercentage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showPercentageActionPerformed(evt);
            }
        });

        showMessages.setText("Show Messages Total");
        showMessages.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showMessagesActionPerformed(evt);
            }
        });

        showUser.setText("Show User Total");
        showUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showUserActionPerformed(evt);
            }
        });

        userArea.setColumns(20);
        userArea.setRows(5);
        UserId.setViewportView(userArea);
        userArea.getAccessibleContext().setAccessibleName("User Id");

        groupArea.setColumns(20);
        groupArea.setRows(5);
        groupId.setViewportView(groupArea);
        groupArea.getAccessibleContext().setAccessibleName("Group Id");
        groupArea.getAccessibleContext().setAccessibleDescription("");

        jLabel1.setText("Tree View");

        label1.setText("UserID:");

        label2.setText("GroupID:");

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Root");
        treeView.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jScrollPane1.setViewportView(treeView);

        validateId.setText("Validate ID");
        validateId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                validateIdActionPerformed(evt);
            }
        });

        findUpdated.setText("Find Last Updated");
        findUpdated.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findUpdatedActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(UserId, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                                .addComponent(groupId, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                            .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addGroup, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(addUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(showUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(showMessages, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                            .addComponent(validateId, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(showPercentage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(showGroup, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(findUpdated, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(openUserView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(26, 26, 26)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(addUser, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(UserId, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(addGroup, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                            .addComponent(groupId, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(openUserView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(showUser, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(showGroup, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(showMessages, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(showPercentage, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(validateId, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(findUpdated, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16))))
        );

        label1.getAccessibleContext().setAccessibleName("userId");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void showMessagesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showMessagesActionPerformed
        // TODO add your handling code here:
        int total = 0;
        messageTotal m = new messageTotal();
        for(int i = 0; i < id.size(); i++){
            total += id.get(i).accept(m);
        }
        JOptionPane.showMessageDialog(this, "Total messages: " + total);
    }//GEN-LAST:event_showMessagesActionPerformed

    private void openUserViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openUserViewActionPerformed
        // TODO add your handling code here:
        if((user) treeView.getLastSelectedPathComponent() instanceof user){
            user u = (((user) treeView.getLastSelectedPathComponent()));
            userView userV  = new userView(u);
            userV.setTitle("USER ID: " + u.getID() + " Time created: " + u.getCreation());
            userV.setVisible(true);
            userV.setCreation(System.currentTimeMillis());
            userV.setUpdate(System.currentTimeMillis());
        }
        else {
            JOptionPane.showMessageDialog(this, "Not applicable to this");
        }
        
    }//GEN-LAST:event_openUserViewActionPerformed

    private void showUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showUserActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "Total users: " + id.size());
    }//GEN-LAST:event_showUserActionPerformed

    private void addUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addUserActionPerformed
        // TODO add your handling code here:
        DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode) treeView.getLastSelectedPathComponent();
        if(selectedNode != null && !userArea.getText().equals("")){
            if(selectedNode instanceof user){
                JOptionPane.showMessageDialog(this, "Not applicable to this");
            }
            else{
                String name = userArea.getText();
                user newNode = new user(name);
                newNode.setCreation(System.currentTimeMillis());
                selectedNode.add(newNode);
                id.add(newNode);
                newNode.setCreation(System.currentTimeMillis());
                newNode.setUpdate(System.currentTimeMillis());
                
                ((DefaultTreeModel) treeView.getModel()).nodeStructureChanged(selectedNode);
            }
        }
    }//GEN-LAST:event_addUserActionPerformed

    private void addGroupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addGroupActionPerformed
        // TODO add your handling code here:
        DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode) treeView.getLastSelectedPathComponent();
        if(selectedNode != null && !groupArea.getText().equals("")){
            if(selectedNode instanceof user)
            {
                JOptionPane.showMessageDialog(this, "Not applicable to this");
            }
            else{
                String name = groupArea.getText();
                userGroup newNode = new userGroup(name + "(Group)");
                selectedNode.add(newNode);
                g.add(newNode);
                newNode.setCreation(System.currentTimeMillis());
                newNode.setUpdate(System.currentTimeMillis());
            
                ((DefaultTreeModel) treeView.getModel()).nodeStructureChanged(selectedNode);
            }
        }
    }//GEN-LAST:event_addGroupActionPerformed

    private void showGroupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showGroupActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "Total groups: " + g .size());
    }//GEN-LAST:event_showGroupActionPerformed

    private void showPercentageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showPercentageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_showPercentageActionPerformed

    private void showMessages1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showMessages1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_showMessages1ActionPerformed

    private void validateIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_validateIdActionPerformed
        // TODO add your handling code here:
        
        for(int i = 0; i < id.size()-1; i++){
            for(int j = i+1; j < id.size(); j++){
                if(id.get(i).getID().equals(id.get(j).getID()) || id.get(i).getID().contains(" ")){
                    JOptionPane.showMessageDialog(this, id.get(i).getID() + " is not a valid ID.");
                }
            }
        }
        
        for(int i = 0; i < g.size()-1; i++){
            for(int j = i+1; j < g.size(); j++){
                if(g.get(i).getID().equals(g.get(j).getID()) || g.get(i).getID().contains(" ")){
                    JOptionPane.showMessageDialog(this, g.get(i).getID() + " is not a valid ID.");
                }
            }
        }
    }//GEN-LAST:event_validateIdActionPerformed

    private void findUpdatedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findUpdatedActionPerformed
        // TODO add your handling code here:
        DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode) treeView.getLastSelectedPathComponent();
        if(selectedNode != null && (!groupArea.getText().equals("") || !userArea.getText().equals(""))){
            if(selectedNode instanceof user){
                user u = (((user) treeView.getLastSelectedPathComponent()));
                JOptionPane.showMessageDialog(this, u.getUpdated());
            }
            else if(selectedNode instanceof userGroup){
                userGroup u = (((userGroup) treeView.getLastSelectedPathComponent()));
                JOptionPane.showMessageDialog(this, u.getUpdated());
            }
        }
    }//GEN-LAST:event_findUpdatedActionPerformed

    public void showFrame() {
        setVisible(true);
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
            java.util.logging.Logger.getLogger(adminPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adminPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adminPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adminPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adminPanel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane UserId;
    private javax.swing.JButton addGroup;
    private javax.swing.JButton addUser;
    private javax.swing.JButton findUpdated;
    private javax.swing.JTextArea groupArea;
    private javax.swing.JScrollPane groupId;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea3;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private javax.swing.JButton openUserView;
    private javax.swing.JButton showGroup;
    private javax.swing.JButton showMessages;
    private javax.swing.JButton showMessages1;
    private javax.swing.JButton showPercentage;
    private javax.swing.JButton showUser;
    private javax.swing.JTree treeView;
    private javax.swing.JTextArea userArea;
    private javax.swing.JButton validateId;
    // End of variables declaration//GEN-END:variables
}
