
import java.io.File;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
     import javazoom.jl.player.Player;
import java.io.FileInputStream;



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 * id = 1
 *
 * @author ACER
 */
public class registration extends javax.swing.JFrame {

    int value;

    /**
     * Creates new form dashboard
     */
    public registration() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        Thread thread = new Thread(new Runnable() {
    public void run() {
        try {
            FileInputStream fis = new FileInputStream("song.mp3");
            Player playMP3 = new Player(fis);
            playMP3.play();
        } catch (Exception e) {
            System.out.println("Problem playing file song.mp3");
            System.out.println(e);
        }
    }
});
thread.start();

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
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cpass = new javax.swing.JPasswordField();
        register1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        pass = new javax.swing.JPasswordField();
        register = new javax.swing.JButton();
        uname = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tmark = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(1366, 708));
        jPanel1.setLayout(null);

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText(" Already Registered?");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(610, 530, 120, 16);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(242, 242, 242));
        jLabel9.setText("REGISTER");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(600, 110, 170, 50);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(242, 242, 242));
        jLabel8.setText("CONFIRM :");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(450, 380, 190, 50);

        cpass.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpassActionPerformed(evt);
            }
        });
        jPanel1.add(cpass);
        cpass.setBounds(650, 390, 250, 40);

        register1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        register1.setText("LOGIN");
        register1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                register1ActionPerformed(evt);
            }
        });
        jPanel1.add(register1);
        register1.setBounds(600, 550, 130, 40);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(242, 242, 242));
        jLabel7.setText("NAME :");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(510, 170, 130, 50);

        name.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });
        jPanel1.add(name);
        name.setBounds(650, 180, 250, 40);

        pass.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPanel1.add(pass);
        pass.setBounds(650, 320, 250, 40);

        register.setBackground(new java.awt.Color(204, 204, 204));
        register.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        register.setText("REGISTER");
        register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerActionPerformed(evt);
            }
        });
        jPanel1.add(register);
        register.setBounds(580, 450, 170, 50);

        uname.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        uname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unameActionPerformed(evt);
            }
        });
        jPanel1.add(uname);
        uname.setBounds(650, 250, 250, 40);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(242, 242, 242));
        jLabel6.setText(" PASSWORD :");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(400, 310, 250, 50);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(242, 242, 242));
        jLabel4.setText(" USERNAME :");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(410, 240, 230, 50);

        jLabel5.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText(" Connection");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel5);
        jLabel5.setBounds(1290, 70, 70, 14);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel3);
        jLabel3.setBounds(1300, 20, 50, 50);

        tmark.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        tmark.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(tmark);
        tmark.setBounds(950, 430, 120, 70);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/po2.png"))); // NOI18N
        jLabel2.setToolTipText("Turn Off");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel2);
        jLabel2.setBounds(20, 20, 50, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, -4, 1370, 710);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
  int confirm = JOptionPane.showConfirmDialog(null, "Are you sure you want to exit?", "Confirm Exit", JOptionPane.YES_NO_OPTION);
if (confirm == JOptionPane.YES_OPTION) {
    System.exit(0);
}
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
    
       checkconn.checkConnection();
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        // TODO add your handling code here:
   

  
    

       checkconn.checkConnection();
    }//GEN-LAST:event_jLabel5MouseClicked

    private void unameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_unameActionPerformed

    private void registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerActionPerformed
        String name1 = name.getText();
        String password = pass.getText();
        String username = uname.getText();
        String cpassword = cpass.getText();
        if (username.equals("") || password.equals("") || name1.equals("") || cpassword.equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Fields cannot be empty");
        } else {
            try {

                Connection con = Database.connect();
                String sql = "SELECT * FROM tbl_main where username='" + username + "'";

                System.out.println(sql);
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery(sql);

                if (rs.next()) {

                    JOptionPane.showMessageDialog(null, "user already exists please try another username");
                    uname.setText("");

                } else {

                    if (password.equals(cpassword)) {
                        try {

                            String sql1 = "INSERT INTO tbl_main (`name`,`username`,`password`) VALUES ('" + name1 + "','" + username + "','" + password + "')";
                            System.out.println(sql);
                            Statement stmt1 = con.createStatement();
                            int rs1 = stmt1.executeUpdate(sql1);

                            JOptionPane.showMessageDialog(null, "registration success");
                            Login p = new Login();
                            p.setVisible(true);
                            dispose();

                        } catch (Exception e) {
                            System.out.println("error" + e);
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Password doesn't match");
                    }
                }
            } catch (Exception e) {

            }
        }

    }//GEN-LAST:event_registerActionPerformed

    private void register1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_register1ActionPerformed
        // TODO add your handling code here:
        Login p = new Login();
        p.setVisible(true);
        dispose();

    }//GEN-LAST:event_register1ActionPerformed

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

    private void cpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cpassActionPerformed

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
            java.util.logging.Logger.getLogger(choice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(choice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(choice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(choice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new registration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField cpass;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField name;
    private javax.swing.JPasswordField pass;
    private javax.swing.JButton register;
    private javax.swing.JButton register1;
    private javax.swing.JLabel tmark;
    private javax.swing.JTextField uname;
    // End of variables declaration//GEN-END:variables
}
