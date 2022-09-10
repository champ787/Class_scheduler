/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classsch;
import static classsch.login_module.username;
import java.sql.Connection;
import java.awt.Graphics;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.core.MatOfByte;
import static org.opencv.imgcodecs.Imgcodecs.imencode;
import org.opencv.videoio.VideoCapture;


/**
 *
 * @author Dell
 */

public class facultylogin extends javax.swing.JFrame {
 String id3;

 
      
  public facultylogin(){
      initComponents();
  }
        
    


  
   

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        password = new javax.swing.JFrame();
        passwordtext = new javax.swing.JPasswordField();
        submit = new javax.swing.JButton();
        label1 = new java.awt.Label();
        takeattandence = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        label5 = new java.awt.Label();
        label6 = new java.awt.Label();
        label7 = new java.awt.Label();
        label8 = new java.awt.Label();
        jButton3 = new javax.swing.JButton();
        label9 = new java.awt.Label();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        forgotdetails = new javax.swing.JButton();
        signup = new javax.swing.JButton();
        removestudent = new javax.swing.JButton();
        remove = new javax.swing.JTextField();
        label2 = new java.awt.Label();
        label3 = new java.awt.Label();
        jLabel1 = new javax.swing.JLabel();
        Timetable = new javax.swing.JButton();
        label4 = new java.awt.Label();
        jLabel2 = new javax.swing.JLabel();

        password.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        password.setBackground(new java.awt.Color(153, 204, 255));
        password.setLocation(new java.awt.Point(800, 450));
        password.setMinimumSize(new java.awt.Dimension(400, 200));
        password.setResizable(false);
        password.getContentPane().setLayout(null);

        passwordtext.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        passwordtext.setText("0000000");
        passwordtext.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        passwordtext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordtextActionPerformed(evt);
            }
        });
        password.getContentPane().add(passwordtext);
        passwordtext.setBounds(110, 40, 180, 30);

        submit.setBackground(new java.awt.Color(255, 255, 255));
        submit.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        submit.setText("Submit");
        submit.setToolTipText("Enter your Password");
        submit.setActionCommand("");
        submit.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(204, 204, 255), null, null));
        submit.setName("Submit"); // NOI18N
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });
        password.getContentPane().add(submit);
        submit.setBounds(150, 90, 100, 30);

        label1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        label1.setText("Password");
        password.getContentPane().add(label1);
        label1.setBounds(160, 0, 80, 26);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1920, 1080));
        getContentPane().setLayout(null);

        takeattandence.setBackground(new java.awt.Color(204, 204, 204));
        takeattandence.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 36)); // NOI18N
        takeattandence.setText("Take Attandance");
        takeattandence.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        takeattandence.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                takeattandenceActionPerformed(evt);
            }
        });
        getContentPane().add(takeattandence);
        takeattandence.setBounds(500, 420, 250, 90);

        jButton2.setBackground(new java.awt.Color(204, 204, 204));
        jButton2.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 36)); // NOI18N
        jButton2.setText("Data ");
        jButton2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(520, 640, 250, 90);

        label5.setText("Scan Id cards");
        getContentPane().add(label5);
        label5.setBounds(590, 540, 90, 20);

        label6.setText("Check your Records here");
        getContentPane().add(label6);
        label6.setBounds(240, 760, 143, 20);

        label7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        label7.setText("QR Code");
        label7.setVisible(false);
        getContentPane().add(label7);
        label7.setBounds(1240, 50, 90, 146);
        label7.getAccessibleContext().setAccessibleName("qrcode");

        label8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        label8.setText("Bar Code");
        getContentPane().add(label8);
        label8.setBounds(240, 30, 90, 30);

        jButton3.setBackground(new java.awt.Color(204, 204, 255));
        jButton3.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 36)); // NOI18N
        jButton3.setText("Record");
        jButton3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(170, 640, 250, 90);

        label9.setText("Enter new data here");
        getContentPane().add(label9);
        label9.setBounds(600, 760, 123, 20);

        jInternalFrame1.setBackground(new java.awt.Color(153, 204, 255));
        jInternalFrame1.setVisible(true);
        jInternalFrame1.getContentPane().setLayout(null);

        forgotdetails.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        forgotdetails.setText("Forgot Details");
        forgotdetails.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        forgotdetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                forgotdetailsActionPerformed(evt);
            }
        });
        jInternalFrame1.getContentPane().add(forgotdetails);
        forgotdetails.setBounds(90, 430, 200, 50);

        signup.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        signup.setText("Add Student");
        signup.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        signup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupActionPerformed(evt);
            }
        });
        jInternalFrame1.getContentPane().add(signup);
        signup.setBounds(80, 100, 200, 50);

        removestudent.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        removestudent.setText("Remove Student");
        removestudent.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        removestudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removestudentActionPerformed(evt);
            }
        });
        jInternalFrame1.getContentPane().add(removestudent);
        removestudent.setBounds(90, 310, 200, 50);
        jInternalFrame1.getContentPane().add(remove);
        remove.setBounds(90, 210, 190, 40);

        label2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        label2.setText("Enter Roll No");
        jInternalFrame1.getContentPane().add(label2);
        label2.setBounds(90, 180, 130, 21);

        label3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        label3.setText("Student Assist Panel");
        jInternalFrame1.getContentPane().add(label3);
        label3.setBounds(70, 20, 250, 40);

        getContentPane().add(jInternalFrame1);
        jInternalFrame1.setBounds(1270, 110, 380, 610);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/classsch/123456.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(240, 70, 470, 100);

        Timetable.setBackground(new java.awt.Color(204, 204, 204));
        Timetable.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 36)); // NOI18N
        Timetable.setText("Time Table");
        Timetable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TimetableActionPerformed(evt);
            }
        });
        getContentPane().add(Timetable);
        Timetable.setBounds(160, 420, 250, 90);

        label4.setText("Check your Timetable");
        getContentPane().add(label4);
        label4.setBounds(220, 540, 150, 20);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/classsch/wp1908100.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        jLabel2.setMaximumSize(new java.awt.Dimension(1920, 1080));
        jLabel2.setMinimumSize(new java.awt.Dimension(1920, 1080));
        jLabel2.setPreferredSize(new java.awt.Dimension(1920, 1080));
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 1920, 1080);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
new Admin().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void takeattandenceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_takeattandenceActionPerformed
new QRreader().setVisible(true);

    //class of thread

     
    }//GEN-LAST:event_takeattandenceActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
new Button().setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void passwordtextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordtextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordtextActionPerformed

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
             try {
    Class.forName("com.mysql.jdbc.Driver");
    java.sql.Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/Class_scheduling","root","9621792087");
   String sql="select * from login_info where  password = ? ;";
    
   PreparedStatement pst=con.prepareStatement(sql);
   
            
        
              pst.setString(1,passwordtext.getText());
    
    ResultSet rs=pst.executeQuery();
    if(rs.next())
    {
       

    
       password.dispose();
        
      facultylogin fac=new facultylogin();
      fac.setVisible(true);
      
      
    }
else
    {
         JOptionPane.showMessageDialog(null,"user name an password not matched");
     username.setText("");
    
    }
    
}
catch(Exception e){
    JOptionPane.showMessageDialog(null,e);
}
    }//GEN-LAST:event_submitActionPerformed

    private void signupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupActionPerformed
        new Signup().setVisible(true); // TODO add your handling code here:
    }//GEN-LAST:event_signupActionPerformed

    private void TimetableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TimetableActionPerformed
   new TT().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_TimetableActionPerformed

    private void forgotdetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_forgotdetailsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_forgotdetailsActionPerformed

    private void removestudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removestudentActionPerformed

  try {
          
          
    Class.forName("com.mysql.jdbc.Driver");
    Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/Class_scheduling","root","9621792087");
   String sql="delete from login_info2 where enrollmentno=? ;";
     
   PreparedStatement pst=con.prepareStatement(sql);
   pst.setString(1,remove.getText()); 
   int rs=pst.executeUpdate();
    
    
    
    
}
catch(Exception e){
    JOptionPane.showMessageDialog(null,e);
    
    }                                            
        // TODO add your handling code here:
    }//GEN-LAST:event_removestudentActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);

        new facultylogin().setVisible(true);//<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
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
            java.util.logging.Logger.getLogger(facultylogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(facultylogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(facultylogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(facultylogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
             
        
             
               
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton Timetable;
    public javax.swing.JButton forgotdetails;
    public javax.swing.JButton jButton2;
    public javax.swing.JButton jButton3;
    public javax.swing.JInternalFrame jInternalFrame1;
    public javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel2;
    public java.awt.Label label1;
    public java.awt.Label label2;
    public java.awt.Label label3;
    public java.awt.Label label4;
    public java.awt.Label label5;
    public java.awt.Label label6;
    public java.awt.Label label7;
    public java.awt.Label label8;
    public java.awt.Label label9;
    public javax.swing.JFrame password;
    public javax.swing.JPasswordField passwordtext;
    public javax.swing.JTextField remove;
    public javax.swing.JButton removestudent;
    public javax.swing.JButton signup;
    public javax.swing.JButton submit;
    public javax.swing.JButton takeattandence;
    // End of variables declaration//GEN-END:variables
}
