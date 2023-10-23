import java.sql.Connection;
import java.sql.Statement;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Tharindu
 */
public class Agents extends javax.swing.JFrame {
    Connection con = null;
    Statement stmt= null;
    ResultSet Rs = null;

    /**
     * Creates new form Agents
     */
    public Agents() {
        initComponents();
        SelectMed();
        
    }

    
    @SuppressWarnings("unchecked")
    public void SelectMed()
    {
        try
        {
            con = databaseConnection.connection();
            stmt = con.createStatement();
            Rs = stmt.executeQuery("SELECT * FROM agent");
            AgenTable.setModel(DbUtils.resultSetToTableModel(Rs));
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        AgenID = new javax.swing.JLabel();
        AgenName = new javax.swing.JLabel();
        AgenAge = new javax.swing.JLabel();
        AgenPW = new javax.swing.JLabel();
        AgenGender = new javax.swing.JLabel();
        AgenPhone = new javax.swing.JLabel();
        AID = new javax.swing.JTextField();
        AName = new javax.swing.JTextField();
        AAge = new javax.swing.JTextField();
        APhone = new javax.swing.JTextField();
        AGender = new javax.swing.JComboBox<>();
        add = new javax.swing.JButton();
        update = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        AgenTable = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        clear = new javax.swing.JButton();
        APW = new javax.swing.JTextField();
        companylbl = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        medicinelbl = new javax.swing.JLabel();
        AAge1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 255, 153));

        jPanel2.setBackground(new java.awt.Color(0, 255, 153));
        jPanel2.setPreferredSize(new java.awt.Dimension(1178, 841));

        jLabel2.setFont(new java.awt.Font("Segoe UI Symbol", 1, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 255, 153));
        jLabel2.setText("MANAGE AGENTS");
        jLabel2.setToolTipText("");

        AgenID.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        AgenID.setText("Agent ID");
        AgenID.setToolTipText("");

        AgenName.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        AgenName.setText("Agent Name");

        AgenAge.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        AgenAge.setText("Age");
        AgenAge.setToolTipText("");

        AgenPW.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        AgenPW.setText("Password");
        AgenPW.setToolTipText("");

        AgenGender.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        AgenGender.setText("Gender");
        AgenGender.setToolTipText("");

        AgenPhone.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        AgenPhone.setText("Phone");
        AgenPhone.setToolTipText("");

        AGender.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        AGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Femail" }));

        add.setBackground(new java.awt.Color(0, 255, 0));
        add.setFont(new java.awt.Font("Segoe UI Symbol", 1, 24)); // NOI18N
        add.setText("ADD");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        update.setBackground(new java.awt.Color(0, 255, 0));
        update.setFont(new java.awt.Font("Segoe UI Symbol", 1, 24)); // NOI18N
        update.setText("UPDATE");
        update.setToolTipText("");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        delete.setBackground(new java.awt.Color(0, 255, 0));
        delete.setFont(new java.awt.Font("Segoe UI Symbol", 1, 24)); // NOI18N
        delete.setText("DELETE");
        delete.setToolTipText("");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        AgenTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "AgentID", "AgentName", "AgentAge", "AgentPhone", "AgentPass", "AgentGender"
            }
        ));
        AgenTable.setSelectionBackground(new java.awt.Color(0, 255, 153));
        AgenTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AgenTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(AgenTable);

        jLabel12.setFont(new java.awt.Font("Segoe UI Symbol", 1, 15)); // NOI18N
        jLabel12.setText("Agents List");
        jLabel12.setToolTipText("");

        clear.setBackground(new java.awt.Color(0, 255, 0));
        clear.setFont(new java.awt.Font("Segoe UI Symbol", 1, 24)); // NOI18N
        clear.setText("CLEAR");
        clear.setToolTipText("");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(318, 318, 318)
                        .addComponent(jLabel2))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(AgenID)
                                .addGap(90, 90, 90)
                                .addComponent(AID, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(AgenAge, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(AgenName, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(64, 64, 64)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(AAge, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                                    .addComponent(AName))))
                        .addGap(68, 68, 68)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(AgenPW)
                                .addGap(18, 18, 18)
                                .addComponent(APW, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(AgenGender)
                                    .addComponent(AgenPhone))
                                .addGap(29, 29, 29)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(AGender, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(APhone, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(196, 196, 196)
                        .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(update)
                        .addGap(18, 18, 18)
                        .addComponent(delete)
                        .addGap(18, 18, 18)
                        .addComponent(clear))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(421, 421, 421)
                        .addComponent(jLabel12))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 850, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel2)
                .addGap(58, 58, 58)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AgenID)
                    .addComponent(AID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AgenPhone)
                    .addComponent(APhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AgenName)
                    .addComponent(AName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AgenPW)
                    .addComponent(APW, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AgenGender)
                    .addComponent(AgenAge)
                    .addComponent(AGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        companylbl.setFont(new java.awt.Font("Times New Roman Cyr", 1, 36)); // NOI18N
        companylbl.setText("COMPANY");
        companylbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                companylblMouseClicked(evt);
            }
        });

        medicinelbl.setFont(new java.awt.Font("Times New Roman Cyr", 1, 36)); // NOI18N
        medicinelbl.setText("MEDICINE");
        medicinelbl.setToolTipText("");
        medicinelbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                medicinelblMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(medicinelbl))
                    .addComponent(companylbl, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(488, 488, 488)
                    .addComponent(AAge1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(488, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(208, 208, 208)
                                .addComponent(jLabel9))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(120, 120, 120)
                                .addComponent(companylbl)
                                .addGap(18, 18, 18)
                                .addComponent(medicinelbl)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(395, 395, 395)
                    .addComponent(AAge1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(396, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1185, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 790, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        try
        {
            //java.sql.Date ManDate = new java.sql.Date(MfDate.getDate().getTime());
            //java.sql.Date ExpDate = new java.sql.Date(ExDate.getDate().getTime());
            String query = "INSERT INTO agent(AgentId  ,AgName,Age,Phone,Password,Gender) VALUES(?,?,?,?,?,?)";
            
            stmt = con.createStatement();
            
            PreparedStatement praparedStmt = con.prepareStatement(query);
            
            praparedStmt.setInt(1, Integer.valueOf(AID.getText()));
            praparedStmt.setString(2, AName.getText());
            praparedStmt.setInt(3, Integer.valueOf(AAge.getText()));
            praparedStmt.setString(4, APhone.getText());
            praparedStmt.setString(5, APW.getText());
            praparedStmt.setString(6, AGender.getSelectedItem().toString());
            //int row = praparedStmt.executeUpdate();
            praparedStmt.execute();
            JOptionPane.showMessageDialog(null, "Agent Successfully Added");
            con.close();
            SelectMed();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "NOT Added");
        }

    }//GEN-LAST:event_addActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        // TODO add your handling code here:
        if(AID.getText().isEmpty() || AName.getText().isEmpty()|| AAge.getText().isEmpty()|| APhone.getText().isEmpty() || APW.getText().isEmpty())
        {
            
        }
        else
        {
            try
        {
            //java.sql.Date ManDate = new java.sql.Date(MfDate.getDate().getTime());
            //java.sql.Date ExpDate = new java.sql.Date(ExDate.getDate().getTime());
            String query = "UPDATE agent SET AgName = ?,Age = ?,Phone = ?,Password = ?,Gender =? WHERE AgentId  =?";
            
            stmt = con.createStatement();
            
            PreparedStatement praparedStmt = con.prepareStatement(query);
            
            
            praparedStmt.setString(1, AName.getText());
            praparedStmt.setInt(2, Integer.valueOf(AAge.getText()));
            praparedStmt.setInt(3, Integer.valueOf(APhone.getText()));
            praparedStmt.setString(4, APW.getText());
            praparedStmt.setString(5, AGender.getSelectedItem().toString());
            praparedStmt.setInt(6, Integer.valueOf(AID.getText()));
           
            praparedStmt.execute();
            JOptionPane.showMessageDialog(null, "UPDATED");
            con.close();
            SelectMed();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "not UPDATED");
        }
        }
    }//GEN-LAST:event_updateActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        if(AID.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Enter The Agent To be Deleted");
        }
        else
        {
            try
            {
                //con = databaseConnection.connection();
                
                stmt = con.createStatement();
     
            
                String AgenId = AID.getText();
                String query = "DELETE FROM agent WHERE AgentId ="+AgenId;
                
                //Statement Add = con.createStatement();
                //Add.executeUpdate(query);
                stmt.executeUpdate(query);
                SelectMed();
                
                JOptionPane.showMessageDialog(this, "Agent Deleted Successfully");
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(this, "NOT DELETED");
            }
        }
    }//GEN-LAST:event_deleteActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        AID.setText("");
        AName.setText("");
        AAge.setText("");
        APhone.setText("");
        APW.setText("");
       // AGender.setText("");
    }//GEN-LAST:event_clearActionPerformed

    private void AgenTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AgenTableMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)AgenTable.getModel();
        int Myindex = AgenTable.getSelectedRow();
        AID.setText(model.getValueAt(Myindex, 0).toString());
        AName.setText(model.getValueAt(Myindex, 1).toString());
        AAge.setText(model.getValueAt(Myindex, 2).toString());
        APhone.setText(model.getValueAt(Myindex, 3).toString());  
        APW.setText(model.getValueAt(Myindex, 3).toString());
    }//GEN-LAST:event_AgenTableMouseClicked

    private void companylblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_companylblMouseClicked
        new company().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_companylblMouseClicked

    private void medicinelblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_medicinelblMouseClicked
        // TODO add your handling code here:
        new Medicine().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_medicinelblMouseClicked

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
            java.util.logging.Logger.getLogger(Agents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Agents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Agents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Agents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Agents().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AAge;
    private javax.swing.JTextField AAge1;
    private javax.swing.JComboBox<String> AGender;
    private javax.swing.JTextField AID;
    private javax.swing.JTextField AName;
    private javax.swing.JTextField APW;
    private javax.swing.JTextField APhone;
    private javax.swing.JLabel AgenAge;
    private javax.swing.JLabel AgenGender;
    private javax.swing.JLabel AgenID;
    private javax.swing.JLabel AgenName;
    private javax.swing.JLabel AgenPW;
    private javax.swing.JLabel AgenPhone;
    private javax.swing.JTable AgenTable;
    private javax.swing.JButton add;
    private javax.swing.JButton clear;
    private javax.swing.JLabel companylbl;
    private javax.swing.JButton delete;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel medicinelbl;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
