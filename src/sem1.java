
import java.sql.*;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author ACER
 */
public class sem1 extends javax.swing.JFrame {
 String tmark;

    /**
     * Creates new form sem1
     */
    public sem1() {
        initComponents();
      perc.setVisible(false);
      
      
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
        perc = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        cfS = new javax.swing.JTextField();
        ep1S = new javax.swing.JTextField();
        ech1S = new javax.swing.JTextField();
        em1S = new javax.swing.JTextField();
        progress = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();
        hpeS = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        em1 = new javax.swing.JTextField();
        ec1S = new javax.swing.JTextField();
        ec1 = new javax.swing.JTextField();
        ep1 = new javax.swing.JTextField();
        ech1 = new javax.swing.JTextField();
        hpe = new javax.swing.JTextField();
        cf = new javax.swing.JTextField();
        jToggleButton1 = new javax.swing.JButton();
        Cgpa = new javax.swing.JLabel();
        total = new javax.swing.JLabel();
        percentage1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        perc.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        perc.setForeground(new java.awt.Color(255, 255, 255));
        perc.setText("%");
        jPanel1.add(perc);
        perc.setBounds(893, 256, 50, 40);

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("  Point");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(440, 110, 40, 16);

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText(" Grade");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(380, 110, 40, 16);

        cfS.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                cfSFocusLost(evt);
            }
        });
        cfS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cfSActionPerformed(evt);
            }
        });
        cfS.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cfSKeyReleased(evt);
            }
        });
        jPanel1.add(cfS);
        cfS.setBounds(380, 330, 40, 30);

        ep1S.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                ep1SFocusLost(evt);
            }
        });
        ep1S.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ep1SActionPerformed(evt);
            }
        });
        ep1S.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ep1SKeyReleased(evt);
            }
        });
        jPanel1.add(ep1S);
        ep1S.setBounds(380, 210, 40, 30);

        ech1S.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                ech1SFocusLost(evt);
            }
        });
        ech1S.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ech1SActionPerformed(evt);
            }
        });
        ech1S.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ech1SKeyReleased(evt);
            }
        });
        jPanel1.add(ech1S);
        ech1S.setBounds(380, 250, 40, 30);

        em1S.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                em1SKeyReleased(evt);
            }
        });
        jPanel1.add(em1S);
        em1S.setBounds(380, 170, 40, 30);

        progress.setMaximum(10);
        progress.setToolTipText("Your Progress");
        jPanel1.add(progress);
        progress.setBounds(530, 480, 270, 10);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("English for Communication 1 :");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(126, 129, 239, 25);

        hpeS.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                hpeSFocusLost(evt);
            }
        });
        hpeS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hpeSActionPerformed(evt);
            }
        });
        hpeS.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                hpeSKeyReleased(evt);
            }
        });
        jPanel1.add(hpeS);
        hpeS.setBounds(380, 290, 40, 30);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/back.png"))); // NOI18N
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel11);
        jLabel11.setBounds(0, 0, 60, 60);

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/next.png"))); // NOI18N
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel13);
        jLabel13.setBounds(1070, 0, 165, 50);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("English for Mathematics 1 :");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(151, 175, 214, 16);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Engineering Physics 1 :");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(186, 209, 179, 30);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Engineering Chemistry 1 :");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(164, 248, 201, 28);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText(" Health & Physical Education :");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(130, 280, 240, 50);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Computing Fundamentals :");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(150, 320, 215, 50);

        em1.setEditable(false);
        em1.setFocusable(false);
        em1.setRequestFocusEnabled(false);
        em1.setVerifyInputWhenFocusTarget(false);
        em1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                em1ActionPerformed(evt);
            }
        });
        jPanel1.add(em1);
        em1.setBounds(440, 170, 40, 30);

        ec1S.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ec1SKeyReleased(evt);
            }
        });
        jPanel1.add(ec1S);
        ec1S.setBounds(380, 130, 40, 30);

        ec1.setEditable(false);
        ec1.setFocusable(false);
        ec1.setRequestFocusEnabled(false);
        ec1.setVerifyInputWhenFocusTarget(false);
        ec1.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                ec1ComponentAdded(evt);
            }
        });
        ec1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                ec1FocusLost(evt);
            }
        });
        ec1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ec1MouseExited(evt);
            }
        });
        ec1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ec1ActionPerformed(evt);
            }
        });
        jPanel1.add(ec1);
        ec1.setBounds(440, 130, 40, 30);

        ep1.setEditable(false);
        ep1.setFocusable(false);
        ep1.setRequestFocusEnabled(false);
        ep1.setVerifyInputWhenFocusTarget(false);
        ep1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ep1ActionPerformed(evt);
            }
        });
        jPanel1.add(ep1);
        ep1.setBounds(440, 210, 40, 30);

        ech1.setEditable(false);
        ech1.setFocusable(false);
        ech1.setRequestFocusEnabled(false);
        ech1.setVerifyInputWhenFocusTarget(false);
        ech1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ech1ActionPerformed(evt);
            }
        });
        jPanel1.add(ech1);
        ech1.setBounds(440, 250, 40, 30);

        hpe.setEditable(false);
        hpe.setFocusable(false);
        hpe.setRequestFocusEnabled(false);
        hpe.setVerifyInputWhenFocusTarget(false);
        hpe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hpeActionPerformed(evt);
            }
        });
        jPanel1.add(hpe);
        hpe.setBounds(440, 290, 40, 30);

        cf.setEditable(false);
        cf.setFocusable(false);
        cf.setRequestFocusEnabled(false);
        cf.setVerifyInputWhenFocusTarget(false);
        cf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cfActionPerformed(evt);
            }
        });
        jPanel1.add(cf);
        cf.setBounds(440, 330, 40, 30);

        jToggleButton1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jToggleButton1.setText("CALCULATE");
        jToggleButton1.setToolTipText("Click to Calculate Your SEM CGPA");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jToggleButton1);
        jToggleButton1.setBounds(560, 410, 210, 50);

        Cgpa.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        Cgpa.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(Cgpa);
        Cgpa.setBounds(770, 300, 130, 90);

        total.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        total.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(total);
        total.setBounds(770, 170, 260, 50);

        percentage1.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        percentage1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(percentage1);
        percentage1.setBounds(770, 240, 120, 70);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("GRADE POINTS :");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(490, 180, 280, 30);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText(" CGPA :");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(640, 320, 140, 50);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("  PERCENTAGE :");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(505, 250, 270, 50);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SEM1NEW.png"))); // NOI18N
        jPanel1.add(jLabel10);
        jLabel10.setBounds(0, 0, 1240, 510);

        jLabel12.setText("jLabel12");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(870, 30, 43, 16);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1236, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 508, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void em1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_em1ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_em1ActionPerformed

    private void ec1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ec1ActionPerformed
        // TODO add your handling code here:
 
        
    }//GEN-LAST:event_ec1ActionPerformed

    private void ep1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ep1ActionPerformed
        // TODO add your handling code here:
   
    }//GEN-LAST:event_ep1ActionPerformed

    private void ech1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ech1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ech1ActionPerformed

    private void hpeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hpeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hpeActionPerformed

    private void cfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cfActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        // TODO add your handling code here:
         if(ec1.getText().isEmpty()||em1.getText().isEmpty()||ep1.getText().isEmpty()||ech1.getText().isEmpty()||hpe.getText().isEmpty()||cf.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Please Fill Grades correctly");
      }
      else{
        
            String ec1H, em1H, ep1H, ech1H, hpeH, cfH;
  
       float totalmark;
       double percentage;
        double cgpa;
        
        ec1H = ec1.getText();
        em1H = em1.getText();
        ep1H = ep1.getText();
        ech1H = ech1.getText();
     
        hpeH = hpe.getText();
      
        cfH = cf.getText();
    
        
        float ecgrade =Float.parseFloat(ec1H);
        float emgrade = Float.parseFloat(em1H);
        float epgrade = Float.parseFloat(ep1H);
        float echgrade = Float.parseFloat(ech1H);
      
        float hpegrade = Float.parseFloat(hpeH);
     
        float cfgrade = Float.parseFloat(cfH);
  
        totalmark = ((ecgrade*3) + (emgrade*6) + (epgrade*3) + (echgrade*3) + (hpegrade*2) + (cfgrade*4));
       
        cgpa = (((ecgrade*3) + (emgrade*6) + (epgrade*3) + (echgrade*3) + (hpegrade*2) + (cfgrade*4)) / 21);
         percentage = (cgpa*9.5);
  double rounded = Math.round(cgpa*100)/100.0;
 
        Cgpa.setText(rounded+"");
     
        total.setText(totalmark+"");
        tmark=Float.toString(totalmark);
         double rounded2 = Math.round(percentage*100)/100.0;
        percentage1.setText(rounded2+"");
          String cgpA = Cgpa.getText();
        System.out.println(cgpA);
    try{
                Connection con=Database.connect();
                String sql="UPDATE tbl_main SET tot_cgpa=('"+cgpA+"') WHERE username='"+Login.username+"'";
                System.out.println(sql);
                Statement stmt=con.createStatement();
                int rs = stmt.executeUpdate(sql);

            }
            catch(Exception e)
            {
                System.out.println("error" + e);
            }
        
      
        perc.setVisible(true);
        int i = (int) cgpa;
     
        for(i=1;i<=10;i++){
        progress.setValue((int) cgpa);
        }
           String sem1tot = total.getText();
        System.out.println(sem1tot);
         try{
                 Connection con=Database.connect();
          
                 String sql="UPDATE tbl_main SET sem1_p=('"+sem1tot+"') WHERE username='"+Login.username+"'";
                System.out.println(sql);
                Statement stmt=con.createStatement();
                int rs = stmt.executeUpdate(sql);

            }
            catch(Exception e)
            {
                System.out.println("error" + e);
            }
         



 try{
              Connection con=Database.connect();
                String sql="UPDATE tbl_main SET tot_p = sem1_p where username='"+Login.username+"'";
                System.out.println(sql);
                Statement stmt=con.createStatement();
                int rs = stmt.executeUpdate(sql);

            }
            catch(Exception e)
            {
                System.out.println("error" + e);
            }
         }
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        // TODO add your handling code here:
           dashboard p=new dashboard();
        p.setVisible(true);
          dispose();
          
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        // TODO add your handling code here:
             sem2 p=new sem2();
        p.setVisible(true);
          dispose();
    }//GEN-LAST:event_jLabel13MouseClicked

    private void ec1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ec1MouseExited
        // TODO add your handling code here:

    }//GEN-LAST:event_ec1MouseExited

    private void ec1ComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_ec1ComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_ec1ComponentAdded

    private void ec1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ec1FocusLost
        // TODO add your handling code here:
  
    }//GEN-LAST:event_ec1FocusLost

    private void cfSFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cfSFocusLost
        // TODO add your handling code here:
    
    }//GEN-LAST:event_cfSFocusLost

    private void cfSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cfSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cfSActionPerformed

    private void ep1SFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ep1SFocusLost
        // TODO add your handling code here:
     
    }//GEN-LAST:event_ep1SFocusLost

    private void ep1SActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ep1SActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ep1SActionPerformed

    private void ech1SFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ech1SFocusLost
        // TODO add your handling code here:
      
    }//GEN-LAST:event_ech1SFocusLost

    private void ech1SActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ech1SActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ech1SActionPerformed

    private void hpeSFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_hpeSFocusLost
        // TODO add your handling code here:
      
    }//GEN-LAST:event_hpeSFocusLost

    private void hpeSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hpeSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hpeSActionPerformed

    private void ec1SKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ec1SKeyReleased
        // TODO add your handling code here:
                                               String i;
        i=ec1S.getText();
        
        if("S".equals(i) || "s".equals(i)){
           
           ec1.setText("10");
        }
      else if("A".equals(i)||"a".equals(i)){
            
           ec1.setText("9");
        }
               else if("B".equals(i)||"b".equals(i)){
            
           ec1.setText("8");
        }
                   else if("C".equals(i) ||"c".equals(i)){
            
           ec1.setText("7");
        }
                       else if("D".equals(i)||"d".equals(i)||"d".equals(i)){
            
           ec1.setText("6");
        }
                           else if("E".equals(i)||"e".equals(i)){
            
           ec1.setText("5");
        }
                               else if("F".equals(i)||"f".equals(i)){
          
           ec1.setText("0");
           
        }else{
                                    
                               }
                              
    }//GEN-LAST:event_ec1SKeyReleased

    private void em1SKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_em1SKeyReleased
        // TODO add your handling code here:
                                               String i;
        i=em1S.getText();
        
        if("S".equals(i) || "s".equals(i)){
           
           em1.setText("10");
        }
      else if("A".equals(i)||"a".equals(i)){
            
           em1.setText("9");
        }
               else if("B".equals(i)||"b".equals(i)){
            
           em1.setText("8");
        }
                   else if("C".equals(i) ||"c".equals(i)){
            
           em1.setText("7");
        }
                       else if("D".equals(i)||"d".equals(i)){
            
           em1.setText("6");
        }
                           else if("E".equals(i)||"e".equals(i)||"e".equals(i)){
            
           em1.setText("5");
        }
                               else if("F".equals(i)||"f".equals(i)){
          
           em1.setText("0");
        }
       
                              
    }//GEN-LAST:event_em1SKeyReleased

    private void ep1SKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ep1SKeyReleased
        // TODO add your handling code here:
                                                      String i;
        i=ep1S.getText();
        
        if("S".equals(i) || "s".equals(i)){
           
           ep1.setText("10");
        }
      else if("A".equals(i)||"a".equals(i)){
            
           ep1.setText("9");
        }
               else if("B".equals(i)||"b".equals(i)){
            
           ep1.setText("8");
        }
                   else if("C".equals(i) ||"c".equals(i)){
            
           ep1.setText("7");
        }
                       else if("D".equals(i)||"d".equals(i)){
            
           ep1.setText("6");
        }
                           else if("E".equals(i)||"e".equals(i)||"e".equals(i)){
            
           ep1.setText("5");
        }
                               else if("F".equals(i)||"f".equals(i)){
          
           ep1.setText("0");
        }else{
                                    
                               }
    }//GEN-LAST:event_ep1SKeyReleased

    private void ech1SKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ech1SKeyReleased
        // TODO add your handling code here:
                                                     String i;
        i=ech1S.getText();
        
        if("S".equals(i) || "s".equals(i)){
           
           ech1.setText("10");
        }
      else if("A".equals(i)||"a".equals(i)){
            
           ech1.setText("9");
        }
               else if("B".equals(i)||"b".equals(i)){
            
           ech1.setText("8");
        }
                   else if("C".equals(i) ||"c".equals(i)){
            
           ech1.setText("7");
        }
                       else if("D".equals(i)||"d".equals(i)){
            
           ech1.setText("6");
        }
                           else if("E".equals(i)||"e".equals(i)||"e".equals(i)){
            
           ech1.setText("5");
        }
                               else if("F".equals(i)||"f".equals(i)){
          
           ech1.setText("0");
        }else{
                                    
                               }
                             
    }//GEN-LAST:event_ech1SKeyReleased

    private void hpeSKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_hpeSKeyReleased
        // TODO add your handling code here:
                                                      String i;
        i=hpeS.getText();
        
        if("S".equals(i) || "s".equals(i)){
            
           hpe.setText("10");
        }
      else if("A".equals(i)||"a".equals(i)){
            
           hpe.setText("9");
        }
               else if("B".equals(i)||"b".equals(i)){
            
           hpe.setText("8");
        }
                   else if("C".equals(i) ||"c".equals(i)){
            
           hpe.setText("7");
        }
                       else if("D".equals(i)||"d".equals(i)){
            
          hpe.setText("6");
        }
                           else if("E".equals(i)||"e".equals(i)||"e".equals(i)){
            
           hpe.setText("5");
        }
                               else if("F".equals(i)||"f".equals(i)){
          
           hpe.setText("0");
        }else{
                                    
                               }
                               
    }//GEN-LAST:event_hpeSKeyReleased

    private void cfSKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cfSKeyReleased
        // TODO add your handling code here:
                                                       String i;
        i=cfS.getText();
        
        if("S".equals(i) || "s".equals(i)){
            
           cf.setText("10");
        }
      else if("A".equals(i)||"a".equals(i)){
            
           cf.setText("9");
        }
               else if("B".equals(i)||"b".equals(i)){
            
           cf.setText("8");
        }
                   else if("C".equals(i) ||"c".equals(i)){
            
           cf.setText("7");
        }
                       else if("D".equals(i)||"d".equals(i)){
            
           cf.setText("6");
        }
                           else if("E".equals(i)||"e".equals(i)){
            
           cf.setText("5");
        }
                               else if("F".equals(i)||"f".equals(i)){
          
           cf.setText("0");
        }
                               else{
                                    
                               }
                                  
                  
                                 
    }//GEN-LAST:event_cfSKeyReleased

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
            java.util.logging.Logger.getLogger(sem1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(sem1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(sem1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(sem1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new sem1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Cgpa;
    private javax.swing.JTextField cf;
    private javax.swing.JTextField cfS;
    private javax.swing.JTextField ec1;
    private javax.swing.JTextField ec1S;
    private javax.swing.JTextField ech1;
    private javax.swing.JTextField ech1S;
    private javax.swing.JTextField em1;
    private javax.swing.JTextField em1S;
    private javax.swing.JTextField ep1;
    private javax.swing.JTextField ep1S;
    private javax.swing.JTextField hpe;
    private javax.swing.JTextField hpeS;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jToggleButton1;
    private javax.swing.JLabel perc;
    private javax.swing.JLabel percentage1;
    private javax.swing.JProgressBar progress;
    private javax.swing.JLabel total;
    // End of variables declaration//GEN-END:variables
}