
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *id = 1
 * @author ACER
 */
public class dashboard extends javax.swing.JFrame {
int value;
    /**
     * Creates new form dashboard
     */
    public dashboard() {
        initComponents();
         try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db_cgpa","root","");
            String sql="SELECT checkbox FROM tblc WHERE id = 1";
            
            System.out.println(sql);
            Statement stmt=con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            
            if(rs.next())
            {
    int id = rs.getInt("checkbox");
   value = id;
 
            }
        }
        catch(Exception e)
        {
            System.out.println("error" + e);
        }
      if(value == 1){
          
             sem1.setVisible(false);
               sem2.setVisible(false);
               check.doClick();
                try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db_cgpa","root","");
            String sql="SELECT cgpa FROM tblc WHERE id = 1";
            
            System.out.println(sql);
            Statement stmt=con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            
            if(rs.next())
            {
    float id = rs.getFloat("cgpa");
 double rounded = Math.round(id*100)/100.0;
    
      progress.setValue((int) id);  
    String s=String.valueOf(rounded);
          cgpa.setText(s);
            }
        }
        catch(Exception e)
        {
            System.out.println("error" + e);
        }
      
       
    
                     try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db_cgpa","root","");
            String sql="SELECT sum3 FROM tblclet where id = 1";
            
            System.out.println(sql);
            Statement stmt=con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            
            if(rs.next())
            {
    int id = rs.getInt("sum3");
     progress2.setValue(id); 
    String s=String.valueOf(id);
          tmark.setText(s);
            }
        }
        catch(Exception e)
        {
            System.out.println("error" + e);
        }
        }
    else{
               sem1.setVisible(true);
               sem2.setVisible(true);
               progress2.setVisible(false);
               
                 try{
                Class.forName("com.mysql.jdbc.Driver");
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db_cgpa","root","");
                String sql="UPDATE tblc SET checkbox=0 WHERE id = 1";
                System.out.println(sql);
                Statement stmt=con.createStatement();
                int rs = stmt.executeUpdate(sql);

            }
            catch(Exception e)
            {
                System.out.println("error" + e);
            }
                 try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db_cgpa","root","");
            String sql="SELECT cgpa FROM tblc WHERE id = 2";
            
            System.out.println(sql);
            Statement stmt=con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            
            if(rs.next())
            {
    float id = rs.getFloat("cgpa");
    double rounded = Math.round(id*100)/100.0;
    progress.setValue((int) id); 
    String s=String.valueOf(rounded);
          cgpa.setText(s);
            }
        }
        catch(Exception e)
        {
            System.out.println("error" + e);
        }
                            try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db_cgpa","root","");
            String sql="SELECT sum1 FROM tblc where id = 1";
            
            System.out.println(sql);
            Statement stmt=con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            
            if(rs.next())
            {
    int id = rs.getInt("sum1");
     progress1.setValue(id); 
    String s=String.valueOf(id);
          tmark.setText(s);
            }
        }
        catch(Exception e)
        {
            System.out.println("error" + e);
        }
         }
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
        jLabel5 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        progress2 = new javax.swing.JProgressBar();
        progress1 = new javax.swing.JProgressBar();
        progress = new javax.swing.JProgressBar();
        jButton1 = new javax.swing.JButton();
        tmark = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        check = new javax.swing.JCheckBox();
        cgpa = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        sem3 = new javax.swing.JLabel();
        sem2 = new javax.swing.JLabel();
        sem6 = new javax.swing.JLabel();
        sem4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        sem1 = new javax.swing.JLabel();
        sem5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(1240, 518));
        jPanel1.setLayout(null);

        jLabel5.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText(" Connect Status");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel5);
        jLabel5.setBounds(1140, 90, 100, 14);

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setText("CLEAR DATA");
        jButton2.setToolTipText("Click after changing from LET to Normal and vice-versa");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(10, 360, 150, 26);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Untitled-2.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel3);
        jLabel3.setBounds(1150, 20, 70, 70);

        progress2.setMaximum(1200);
        progress2.setToolTipText("Your Progress");
        jPanel1.add(progress2);
        progress2.setBounds(647, 494, 290, 10);

        progress1.setMaximum(1750);
        progress1.setToolTipText("Your Progress");
        jPanel1.add(progress1);
        progress1.setBounds(647, 494, 290, 10);

        progress.setMaximum(10);
        progress.setToolTipText("Your Progress");
        jPanel1.add(progress);
        progress.setBounds(185, 494, 290, 10);

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setText("REFRESH SCORE");
        jButton1.setToolTipText("Click after changing from LET to Normal and vice-versa");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(10, 310, 150, 26);

        tmark.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        tmark.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(tmark);
        tmark.setBounds(950, 430, 120, 70);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/t.png"))); // NOI18N
        jPanel1.add(jLabel4);
        jLabel4.setBounds(640, 450, 304, 40);

        check.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        check.setForeground(new java.awt.Color(255, 255, 255));
        check.setText("LET");
        check.setToolTipText("Click Here if You are a Lateral Entry Student");
        check.setBorder(new javax.swing.border.MatteBorder(null));
        check.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        check.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkActionPerformed(evt);
            }
        });
        jPanel1.add(check);
        check.setBounds(30, 250, 110, 50);
        check.getAccessibleContext().setAccessibleDescription("hi");

        cgpa.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        cgpa.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(cgpa);
        cgpa.setBounds(490, 430, 160, 70);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/power.png"))); // NOI18N
        jLabel2.setToolTipText("Turn Off");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel2);
        jLabel2.setBounds(20, 20, 60, 60);

        sem3.setBackground(new java.awt.Color(0, 0, 0));
        sem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fgfd.png"))); // NOI18N
        sem3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sem3MouseClicked(evt);
            }
        });
        jPanel1.add(sem3);
        sem3.setBounds(850, 140, 223, 111);

        sem2.setBackground(new java.awt.Color(0, 0, 0));
        sem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Untitledsd-3.png"))); // NOI18N
        sem2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sem2MouseClicked(evt);
            }
        });
        jPanel1.add(sem2);
        sem2.setBounds(510, 140, 223, 111);

        sem6.setBackground(new java.awt.Color(0, 0, 0));
        sem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/6.png"))); // NOI18N
        sem6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sem6MouseClicked(evt);
            }
        });
        jPanel1.add(sem6);
        sem6.setBounds(850, 310, 223, 111);

        sem4.setBackground(new java.awt.Color(0, 0, 0));
        sem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/4.png"))); // NOI18N
        sem4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sem4MouseClicked(evt);
            }
        });
        jPanel1.add(sem4);
        sem4.setBounds(170, 310, 223, 111);

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/t2.png"))); // NOI18N
        jPanel1.add(jLabel6);
        jLabel6.setBounds(180, 450, 304, 40);

        sem1.setBackground(new java.awt.Color(0, 0, 0));
        sem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Untitled-3.png"))); // NOI18N
        sem1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sem1MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                sem1MousePressed(evt);
            }
        });
        jPanel1.add(sem1);
        sem1.setBounds(170, 140, 223, 111);

        sem5.setBackground(new java.awt.Color(0, 0, 0));
        sem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/5.png"))); // NOI18N
        sem5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sem5MouseClicked(evt);
            }
        });
        jPanel1.add(sem5);
        sem5.setBounds(510, 310, 223, 111);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/new.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, -4, 1240, 520);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 513, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sem1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sem1MouseClicked
        // TODO add your handling code here:
 
     
sem1 p=new sem1();
        p.setVisible(true);
          dispose();
   
   
    }//GEN-LAST:event_sem1MouseClicked

    private void sem2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sem2MouseClicked
        // TODO add your handling code here:
 
                sem2 p=new sem2();
        p.setVisible(true);
          dispose();        
        
     
    }//GEN-LAST:event_sem2MouseClicked

    private void sem3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sem3MouseClicked
        // TODO add your handling code here:
 
        sem3 p=new sem3();
        p.setVisible(true);
          dispose();
    }//GEN-LAST:event_sem3MouseClicked

    private void sem4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sem4MouseClicked
        // TODO add your handling code here:
     
          sem4 p=new sem4();
        p.setVisible(true);
          dispose();
    }//GEN-LAST:event_sem4MouseClicked

    private void sem5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sem5MouseClicked
        // TODO add your handling code here:
      
            sem5 p=new sem5();
        p.setVisible(true);
       
    }//GEN-LAST:event_sem5MouseClicked

    private void sem6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sem6MouseClicked
        // TODO add your handling code here:
    
            sem6 p=new sem6();
        p.setVisible(true);
          dispose();
    }//GEN-LAST:event_sem6MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void sem1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sem1MousePressed
        // TODO add your handling code here:


    }//GEN-LAST:event_sem1MousePressed

    private void checkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkActionPerformed
        // TODO add your handling code here:
          if(check.isSelected()){
             sem1.setVisible(false);
               sem2.setVisible(false);
               
               
                try{
                Class.forName("com.mysql.jdbc.Driver");
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db_cgpa","root","");
                String sql="UPDATE tblc SET checkbox=1 WHERE id = 1";
                System.out.println(sql);
                Statement stmt=con.createStatement();
                int rs = stmt.executeUpdate(sql);

            }
            catch(Exception e)
            {
                System.out.println("error" + e);
            }
           try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db_cgpa","root","");
            String sql="SELECT cgpa FROM tblc WHERE id = 1";
            
            System.out.println(sql);
            Statement stmt=con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            
            if(rs.next())
            {
    float id = rs.getFloat("cgpa");
     double rounded = Math.round(id*100)/100.0;
    String s=String.valueOf(rounded);
          cgpa.setText(s);
            }
        }
        catch(Exception e)
        {
            System.out.println("error" + e);
        }
                     try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db_cgpa","root","");
            String sql="SELECT sum3 FROM tblclet where id = 1";
            
            System.out.println(sql);
            Statement stmt=con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            
            if(rs.next())
            {
    int id = rs.getInt("sum3");
    String s=String.valueOf(id);
          tmark.setText(s);
            }
        }
        catch(Exception e)
        {
            System.out.println("error" + e);
        }
        }
    else{
               sem1.setVisible(true);
               sem2.setVisible(true);
               
                 try{
                Class.forName("com.mysql.jdbc.Driver");
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db_cgpa","root","");
                String sql="UPDATE tblc SET checkbox=0 WHERE id = 1";
                System.out.println(sql);
                Statement stmt=con.createStatement();
                int rs = stmt.executeUpdate(sql);

            }
            catch(Exception e)
            {
                System.out.println("error" + e);
            }
          }
                try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db_cgpa","root","");
            String sql="SELECT cgpa FROM tblc WHERE id = 1";
            
            System.out.println(sql);
            Statement stmt=con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
           
            if(rs.next())
            {
    float id = rs.getFloat("cgpa");
     double rounded = Math.round(id*100)/100.0;
    String s=String.valueOf(rounded);
          cgpa.setText(s);
            }
        }
        catch(Exception e)
        {
            System.out.println("error" + e);
        }
                            try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db_cgpa","root","");
            String sql="SELECT sum1 FROM tblc where id = 1";
            
            System.out.println(sql);
            Statement stmt=con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            
            if(rs.next())
            {
    int id = rs.getInt("sum1");
    String s=String.valueOf(id);
          tmark.setText(s);
            }
        }
        catch(Exception e)
        {
            System.out.println("error" + e);
        }
                  
    }//GEN-LAST:event_checkActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         dashboard p=new dashboard();
        p.setVisible(true);
          dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
            try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db_cgpa","root","");
            String sql="SELECT sum1 FROM tblc where id = 1";
            
            System.out.println(sql);
            Statement stmt=con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            
            if(rs.next())
            {
  JOptionPane.showMessageDialog(null, "Database Connected");
            }
        }
        catch(Exception e)
        {
             JOptionPane.showMessageDialog(null, "Database Not Connected");
        }
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       try{
           int flag=0;
                Class.forName("com.mysql.jdbc.Driver");
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db_cgpa","root","");
                String sql="UPDATE tblc SET sum1 = NULL,totalmark=NULL,cgpa=NULL";
                String sql1="UPDATE tblclet SET sum3 = NULL,totalmark=NULL";
                System.out.println(sql);
                 System.out.println(sql1);
                Statement stmt=con.createStatement();
                int rs = stmt.executeUpdate(sql);
                int rs1 = stmt.executeUpdate(sql1);
                flag=1;
                if(flag==1)
                 JOptionPane.showMessageDialog(null, "Data cleared");
                    
                

            }
            catch(Exception e)
            {
              JOptionPane.showMessageDialog(null, "Error clearing Data");
            }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        // TODO add your handling code here:
         try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db_cgpa","root","");
            String sql="SELECT sum1 FROM tblc where id = 1";
            
            System.out.println(sql);
            Statement stmt=con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            
            if(rs.next())
            {
  JOptionPane.showMessageDialog(null, "Database Connected");
            }
        }
        catch(Exception e)
        {
             JOptionPane.showMessageDialog(null, "Database Not Connected");
        }
    }//GEN-LAST:event_jLabel5MouseClicked

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
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cgpa;
    private javax.swing.JCheckBox check;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar progress;
    private javax.swing.JProgressBar progress1;
    private javax.swing.JProgressBar progress2;
    private javax.swing.JLabel sem1;
    private javax.swing.JLabel sem2;
    private javax.swing.JLabel sem3;
    private javax.swing.JLabel sem4;
    private javax.swing.JLabel sem5;
    private javax.swing.JLabel sem6;
    private javax.swing.JLabel tmark;
    // End of variables declaration//GEN-END:variables
}
