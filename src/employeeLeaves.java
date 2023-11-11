import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class employeeLeaves extends javax.swing.JFrame {

   
    public employeeLeaves() {
        initComponents();
        LoadEmpno();
        Loadleave();
    }
    
    int casual = 0;
    int annual = 0;
    int medical =0;
    
    Connection con;
PreparedStatement pst;
PreparedStatement pst1;
 
 
public void Connection()
    {
        try {
            
            con = DriverManager.getConnection("jdbc:mysql://localhost/employeedetails","root","");    
            
        }  catch (SQLException ex) {
           ex.printStackTrace();
        }
        
    }

    public void LoadEmpno()
    {
        
        Connection();    
        try {
            pst = con.prepareStatement("select * from empdetails");
            ResultSet rs = pst.executeQuery();
            txtno.removeAllItems();
            
            
            while(rs.next())
            {
                txtno.addItem(rs.getString("empID"));
                
            }
    
        } catch (SQLException ex) {
            ex.printStackTrace();
        }    
    }
    
    public void Loadleave()
    {
        Connection();
        String empID = txtno.getSelectedItem().toString();
        try {
            pst = con.prepareStatement("select * from leaveinfo where empID = ?");
            pst.setString(1, empID);
            ResultSet rs2 = pst.executeQuery();
            
            if(rs2.next() == false)
            {
                JOptionPane.showMessageDialog(this, "Leave Information Error");
                
            }
            else
            {
                casual = rs2.getInt("casual");
                annual = rs2.getInt("annual");
                medical = rs2.getInt("medical");
            }
            
            
        } catch (SQLException ex) {
           ex.printStackTrace();
        }
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtno = new javax.swing.JComboBox<>();
        txtname = new javax.swing.JTextField();
        txtdays = new javax.swing.JSpinner();
        txtcategory = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        rcasual = new javax.swing.JRadioButton();
        rannual = new javax.swing.JRadioButton();
        rmedical = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel1.setText("Employee ID");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("Name");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("Department");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setText("Days");

        txtno.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnoActionPerformed(evt);
            }
        });

        txtname.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        txtdays.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        txtcategory.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 153));
        jLabel5.setText("Apply Leaves");

        rcasual.setBackground(new java.awt.Color(255, 255, 255));
        rcasual.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        rcasual.setText("Casual");

        rannual.setBackground(new java.awt.Color(255, 255, 255));
        rannual.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        rannual.setText("Annual");

        rmedical.setBackground(new java.awt.Color(255, 255, 255));
        rmedical.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        rmedical.setText("Medical");

        jButton1.setBackground(new java.awt.Color(204, 204, 255));
        jButton1.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        jButton1.setText("Calculate");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setFont(new java.awt.Font("Times New Roman", 2, 12)); // NOI18N
        jButton3.setText("<< Back");
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addComponent(rcasual))
                        .addGap(70, 70, 70)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(rmedical)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                                .addComponent(rannual))
                            .addComponent(txtname, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtno, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtcategory, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtdays, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(181, 181, 181)
                        .addComponent(jLabel5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton3)))
                .addContainerGap(61, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel5)
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtcategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rcasual)
                    .addComponent(rannual)
                    .addComponent(rmedical))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtdays, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnoActionPerformed

String empID = txtno.getSelectedItem().toString();
        
        Connection();
        
        try {
            pst = con.prepareStatement("select * from empdetails where empID = ?");
            pst.setString(1, empID);
            ResultSet rs1 = pst.executeQuery();
            
            if(rs1.next() == false)
            {
                JOptionPane.showMessageDialog(this, "Employee number Error");
            }
            else
            {
                String name = rs1.getString("fn");
                txtname.setText(name.trim());
                String category = rs1.getString("depName");
                txtcategory.setText(category.trim());
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }       
    }//GEN-LAST:event_txtnoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
Loadleave();
        int bleave = 0;
        
        String empID = txtno.getSelectedItem().toString();
        
        int days = Integer.parseInt(txtdays.getValue().toString());
        
        
        if(rcasual.isSelected() == true)
        {          
          bleave = casual - days;
          if(bleave < 0)
          {
              JOptionPane.showMessageDialog(this, "You Have a Casual Leave :  " + casual);
    
          }
          else
          {
              try {
                  pst = con.prepareStatement("update leaveinfo set casual = ? where empID = ?");
                    pst.setInt(1, bleave);
                    pst.setString(2, empID);
                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(this, "Your Casual Leave Updated");
                    
                    
              } catch (SQLException ex) {

                  Logger.getLogger(leaveInfo.class.getName()).log(Level.SEVERE, null, ex);
              }
          }        
        }
        
        else if(rannual.isSelected() == true)
        {
            
          bleave = annual - days;
          if(bleave < 0)
          {
              JOptionPane.showMessageDialog(this, "You Have a Casual Leave :  " + annual);
    
          }
          else
          {
              try {
                   pst1 = con.prepareStatement("update leaveinfo set annual = ? where empID = ?");
                    pst1.setInt(1, bleave);
                    pst1.setString(2, empID);
                    pst1.executeUpdate();
                    JOptionPane.showMessageDialog(this, "Your Annual Leave Updated");
                    
                    
              } catch (SQLException ex) {
                  Logger.getLogger(leaveInfo.class.getName()).log(Level.SEVERE, null, ex);
              }
          }    
        }
      else if(rmedical.isSelected() == true)
        {
            
          bleave = medical - days;
          if(bleave < 0)
          {
              JOptionPane.showMessageDialog(this, "You Have a Medical Leave :  " + medical);
    
          }
          else
          {
              try {
                   pst1 = con.prepareStatement("update leaveinfo set medical = ? where empID = ?");
                    pst1.setInt(1, bleave);
                    pst1.setString(2, empID);
                    pst1.executeUpdate();
                    JOptionPane.showMessageDialog(this, "Your Medical Leave Updated");
                    
                    
              } catch (SQLException ex) {
                  Logger.getLogger(leaveInfo.class.getName()).log(Level.SEVERE, null, ex);
              }
          }    
        }
        else
      {
          
          JOptionPane.showMessageDialog(this, "Something Wrong");
      }        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
dispose();
        choosetask2 c=new choosetask2();
c.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    
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
            java.util.logging.Logger.getLogger(employeeLeaves.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(employeeLeaves.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(employeeLeaves.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(employeeLeaves.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new employeeLeaves().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton rannual;
    private javax.swing.JRadioButton rcasual;
    private javax.swing.JRadioButton rmedical;
    private javax.swing.JTextField txtcategory;
    private javax.swing.JSpinner txtdays;
    private javax.swing.JTextField txtname;
    private javax.swing.JComboBox<String> txtno;
    // End of variables declaration//GEN-END:variables
}
