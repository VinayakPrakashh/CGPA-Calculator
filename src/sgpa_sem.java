

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *id = 1
 * @author ACER
 */
public class sgpa_sem extends javax.swing.JFrame {


    /**
     * Creates new form dashboard
     */
    public sgpa_sem() {
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

        jPanel1 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tmark = new javax.swing.JLabel();
        cgpa = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        sem3 = new javax.swing.JLabel();
        sem2 = new javax.swing.JLabel();
        sem6 = new javax.swing.JLabel();
        sem4 = new javax.swing.JLabel();
        sem1 = new javax.swing.JLabel();
        sem5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(1240, 518));
        jPanel1.setLayout(null);

        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton3.setText("BACK");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(20, 20, 120, 50);

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

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Untitled-2.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel3);
        jLabel3.setBounds(1150, 20, 70, 70);

        tmark.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        tmark.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(tmark);
        tmark.setBounds(950, 430, 120, 70);

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
        jLabel2.setBounds(20, 430, 60, 60);

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
 
     
sem1_1 p=new sem1_1();
        p.setVisible(true);
          dispose();
   
   
    }//GEN-LAST:event_sem1MouseClicked

    private void sem2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sem2MouseClicked
        // TODO add your handling code here:
 
                sem2_1 p=new sem2_1();
        p.setVisible(true);
          dispose();        
        
     
    }//GEN-LAST:event_sem2MouseClicked

    private void sem3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sem3MouseClicked
        // TODO add your handling code here:
 
        sem3_1 p=new sem3_1();
        p.setVisible(true);
          dispose();
    }//GEN-LAST:event_sem3MouseClicked

    private void sem4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sem4MouseClicked
        // TODO add your handling code here:
     
          sem4_1 p=new sem4_1();
        p.setVisible(true);
          dispose();
    }//GEN-LAST:event_sem4MouseClicked

    private void sem5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sem5MouseClicked
        // TODO add your handling code here:
      
            sem5_1 p=new sem5_1();
        p.setVisible(true);
       
    }//GEN-LAST:event_sem5MouseClicked

    private void sem6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sem6MouseClicked
        // TODO add your handling code here:
    
            sem6_1 p=new sem6_1();
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

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
            try{
                      Connection con=Database.connect();

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
             
        }
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
         choice1 p=new choice1();
        p.setVisible(true);
          dispose(); 
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
                new sgpa_sem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cgpa;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel sem1;
    private javax.swing.JLabel sem2;
    private javax.swing.JLabel sem3;
    private javax.swing.JLabel sem4;
    private javax.swing.JLabel sem5;
    private javax.swing.JLabel sem6;
    private javax.swing.JLabel tmark;
    // End of variables declaration//GEN-END:variables
}
