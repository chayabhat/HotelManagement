/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package login_s;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.JScrollBar;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class Register
{
    Connection conn;

    public static  Connection ConnecrDL() {

        try
        {
            Class.forName("org.sqlite.JDBC");
            Connection conn=DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Admin\\Documents\\NetBeansProjects\\loginjava\\RoomNew.sqlite");
            return conn;
            
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
}

    private void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void show() {
        
        Register1 r=new Register1();
        r.show();
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
public class Register1 extends javax.swing.JFrame 
{
    Connection con=null;
    PreparedStatement pst;
    ResultSet rs=null;
  
        

    /**
     * Creates new form Register
     */
   public Register1() {
          super("Register");
       try{
      
        initComponents();
        conn=Register.ConnecrDL();
        
        
          Statement stmt=conn.createStatement();
           ResultSet rs= stmt.executeQuery("select * from Hotel_Table");
            Vector<Vector> rowData=new Vector<>();
            Vector<String> colNames=new Vector();
            colNames.add("Customer Id");
            colNames.add("First Name");
            colNames.add("Last Name");
            colNames.add("Address");
             colNames.add("Postal Code");
             colNames.add("Phone Number");
             colNames.add("E Mail");
             colNames.add("Nationality");
             
             
             
            while(rs.next()){
                
                
                Vector<String> row=new Vector();
                row.add(rs.getInt("CustomerRef")+"");
                row.add(rs.getString("FirstName"));
                row.add(rs.getString("SurName"));
                row.add(rs.getString("Address"));
                row.add(rs.getInt("PostCode")+"");
                row.add(rs.getInt("Phone_no")+"");
                row.add(rs.getString("Email"));
                row.add(rs.getString("Nationality"));
                System.out.println("data inserted");
                rowData.add(row);
            
            }
            
            DefaultTableModel dft=new DefaultTableModel(rowData,colNames);
           
             Hotel_Table.setModel(dft);
             jScrollPane1.setHorizontalScrollBar(new JScrollBar());
             jScrollPane1.setVerticalScrollBar(new JScrollBar());
       }
       catch(SQLException sql){
           sql.printStackTrace();
       }
             
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
 //   @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jtxtNationality = new javax.swing.JTextField();
        jtxtEmail1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jtxtPhone_no = new javax.swing.JTextField();
        jtxtPostCode = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jtxtAddress = new javax.swing.JTextField();
        jtxtSurName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtxtFirstName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jtxtCustomerRef = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Hotel_Table = new javax.swing.JTable();
        jbtnInsert = new javax.swing.JButton();
        JbtnReset = new javax.swing.JButton();
        jbtnDelete = new javax.swing.JButton();
        jbtnBack = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 0, 153));

        jPanel1.setBackground(new java.awt.Color(255, 102, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setForeground(new java.awt.Color(204, 0, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(1625, 700));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Nationality:");

        jtxtNationality.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jtxtEmail1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Email:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Phone_no:");

        jtxtPhone_no.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jtxtPostCode.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("PostCode:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Address");

        jtxtAddress.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jtxtSurName.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("SurName:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("FirstName:");

        jtxtFirstName.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("CustomerRef:");

        jtxtCustomerRef.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        Hotel_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CustomerRef", "FirstName", "SurName", "Address", "PostCode", "Phone_no", "Email", "Nationality"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        Hotel_Table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Hotel_TableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Hotel_Table);

        jbtnInsert.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbtnInsert.setText("Insert");
        jbtnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnInsertActionPerformed(evt);
            }
        });

        JbtnReset.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        JbtnReset.setText("Reset");
        JbtnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbtnResetActionPerformed(evt);
            }
        });

        jbtnDelete.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbtnDelete.setText("Delete");
        jbtnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDeleteActionPerformed(evt);
            }
        });

        jbtnBack.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbtnBack.setText("Back");
        jbtnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnBackActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel9.setText("REGISTER");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addComponent(jLabel1)
                    .addComponent(jLabel5)
                    .addComponent(jLabel8)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtxtEmail1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jtxtPostCode)
                    .addComponent(jtxtPhone_no)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtxtAddress, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)
                            .addComponent(jtxtSurName)
                            .addComponent(jtxtCustomerRef)
                            .addComponent(jtxtFirstName))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jtxtNationality))
                .addGap(48, 48, 48)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 856, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(123, 123, 123))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbtnInsert, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(99, 99, 99)
                .addComponent(JbtnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77)
                .addComponent(jbtnDelete)
                .addGap(112, 112, 112)
                .addComponent(jbtnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(231, 231, 231))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(560, 560, 560)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(jLabel3)
                        .addGap(43, 43, 43)
                        .addComponent(jLabel4)
                        .addGap(45, 45, 45)
                        .addComponent(jLabel5)
                        .addGap(50, 50, 50)
                        .addComponent(jLabel1)
                        .addGap(45, 45, 45)
                        .addComponent(jLabel6)
                        .addGap(39, 39, 39)
                        .addComponent(jLabel7)
                        .addGap(30, 30, 30)
                        .addComponent(jLabel8))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane1)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jtxtCustomerRef, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(jtxtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addComponent(jtxtSurName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)
                                .addComponent(jtxtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41)
                                .addComponent(jtxtPostCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)
                                .addComponent(jtxtPhone_no, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(jtxtEmail1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24)
                                .addComponent(jtxtNationality, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnInsert, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JbtnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1469, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 156, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 690, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 308, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnInsertActionPerformed

        try{
            conn.setAutoCommit(false);
          
             
             //--------------------------------------------------------------------
            String sql="INSERT INTO Hotel_Table"
                    +"( `FirstName`, `SurName`, `Address`, `PostCode`, `Phone_no`, `Email`, `Nationality`)"
                    +"VALUES (?,?,?,?,?,?,?)";
            System.out.println(sql);
            
            
                      
        //con=DriverManager.getConnection("jdbc:mysql://localhost/Hotel_Manage","root","");
            pst=conn.prepareStatement(sql);
           // pst.setInt(1,Integer.parseInt(jtxtCustomerRef.getText()));
             pst.setString(1,jtxtFirstName.getText()); 
             pst.setString(2,jtxtSurName.getText());
              pst.setString(3,jtxtAddress.getText());
               pst.setInt(4,Integer.parseInt(jtxtPostCode.getText()));
                pst.setInt(5,Integer.parseInt(jtxtPhone_no.getText()));
                 pst.setString(6,jtxtEmail1.getText());
                  pst.setString(7,jtxtNationality.getText());
                 
                 int rowUpdated=pst.executeUpdate();
                 conn.commit();
                 if(rowUpdated>0){
                     
                      
                Vector<String> row=new Vector();
                row.add(rs.getInt("CustomerRef")+"");
                row.add(rs.getString("FirstName"));
                row.add(rs.getString("SurName"));
                row.add(rs.getString("Address"));
                row.add(rs.getInt("PostCode")+"");
                row.add(rs.getInt("Phone_no")+"");
                row.add(rs.getString("Email"));
                row.add(rs.getString("Nationality"));
                //dft.addRow(row);
                     
                 }
                 else{
                 
                 
                 }
                 
                 
                 JOptionPane.showMessageDialog(null,"inserted successfully");
                 
                    
        }
        catch(SQLException | HeadlessException ex)
        {
             JOptionPane.showMessageDialog(null,ex);
        }
        catch(NumberFormatException nfe){
            JOptionPane.showMessageDialog(null,"Input Error","Input is invalid",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jbtnInsertActionPerformed

    private void Hotel_TableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Hotel_TableMouseClicked
       
    }//GEN-LAST:event_Hotel_TableMouseClicked

    private void jbtnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnBackActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        login ob=new login();
        ob.setVisible(true);
    }//GEN-LAST:event_jbtnBackActionPerformed

    private void JbtnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbtnResetActionPerformed
        // TODO add your handling code here:
         jtxtCustomerRef.setText(null);
         jtxtFirstName.setText(null);
          jtxtSurName.setText(null);
          jtxtAddress.setText(null);
          jtxtPostCode.setText(null);
           jtxtPhone_no.setText(null);
             jtxtEmail1.setText(null);
             jtxtNationality.setText(null);
    }//GEN-LAST:event_JbtnResetActionPerformed

    private void jbtnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDeleteActionPerformed
        // TODO add your handling code here:
        DefaultTableModel Model= (DefaultTableModel) Hotel_Table.getModel();
        if(Hotel_Table.getSelectedRow()== -1){
             if(Hotel_Table.getRowCount()== 0){
                 JOptionPane.showMessageDialog(null,"No Data To Delete","Hotel Management System",
                         JOptionPane.OK_OPTION);
                 
             }
             else
             {
                 JOptionPane.showMessageDialog(null,"Select a row to Delete","Hotel Management System",
                         JOptionPane.OK_OPTION);
             }
        }
             else
             {
                     Model.removeRow(Hotel_Table.getSelectedRow());
                     }
    }//GEN-LAST:event_jbtnDeleteActionPerformed

   /* 
     
    //  @param args the command line arguments
     
     

    
    /*public static void main(Strings,arg[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
    //    java.awt.EventQueue.invokeLater(new Runnable() {
      //      public void run() {
        //        new Register().setVisible(true);
            //}
       // });
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Hotel_Table;
    private javax.swing.JButton JbtnReset;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtnBack;
    private javax.swing.JButton jbtnDelete;
    private javax.swing.JButton jbtnInsert;
    private javax.swing.JTextField jtxtAddress;
    private javax.swing.JTextField jtxtCustomerRef;
    private javax.swing.JTextField jtxtEmail1;
    private javax.swing.JTextField jtxtFirstName;
    private javax.swing.JTextField jtxtNationality;
    private javax.swing.JTextField jtxtPhone_no;
    private javax.swing.JTextField jtxtPostCode;
    private javax.swing.JTextField jtxtSurName;
    // End of variables declaration//GEN-END:variables
    }

}
