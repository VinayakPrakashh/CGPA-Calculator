
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author ACER
 */
public class sem5_1 extends javax.swing.JFrame {
int value;
    /**
     * Creates new form sem1
     */
    public sem5_1() {
        initComponents();
        perc.setVisible(false);  
        setExtendedState(JFrame.MAXIMIZED_BOTH);
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
        jLabel22 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        pmse1 = new javax.swing.JTextField();
        cne1 = new javax.swing.JTextField();
        itr1 = new javax.swing.JTextField();
        mpl1 = new javax.swing.JTextField();
        wpl1 = new javax.swing.JTextField();
        cc1 = new javax.swing.JTextField();
        ps1 = new javax.swing.JTextField();
        mi1 = new javax.swing.JTextField();
        wp1 = new javax.swing.JTextField();
        progress = new javax.swing.JProgressBar();
        jLabel30 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        ps = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        cne = new javax.swing.JTextField();
        itr = new javax.swing.JTextField();
        wpl = new javax.swing.JTextField();
        mpl = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        wp = new javax.swing.JTextField();
        pmse = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        mi = new javax.swing.JTextField();
        cc = new javax.swing.JTextField();
        jToggleButton1 = new javax.swing.JButton();
        Sgpa = new javax.swing.JLabel();
        total = new javax.swing.JLabel();
        percentage1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(1366, 708));
        jPanel1.setLayout(null);

        perc.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        perc.setForeground(new java.awt.Color(255, 255, 255));
        perc.setText("%");
        jPanel1.add(perc);
        perc.setBounds(1070, 230, 50, 70);

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText(" Grade");
        jPanel1.add(jLabel22);
        jLabel22.setBounds(400, 150, 40, 16);

        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("  Point");
        jPanel1.add(jLabel25);
        jLabel25.setBounds(460, 150, 40, 16);

        pmse1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                pmse1FocusLost(evt);
            }
        });
        pmse1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pmse1ActionPerformed(evt);
            }
        });
        pmse1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                pmse1KeyReleased(evt);
            }
        });
        jPanel1.add(pmse1);
        pmse1.setBounds(400, 170, 40, 30);

        cne1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                cne1FocusLost(evt);
            }
        });
        cne1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cne1ActionPerformed(evt);
            }
        });
        cne1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cne1KeyReleased(evt);
            }
        });
        jPanel1.add(cne1);
        cne1.setBounds(400, 490, 40, 30);

        itr1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                itr1FocusLost(evt);
            }
        });
        itr1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itr1ActionPerformed(evt);
            }
        });
        itr1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                itr1KeyReleased(evt);
            }
        });
        jPanel1.add(itr1);
        itr1.setBounds(400, 450, 40, 30);

        mpl1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                mpl1FocusLost(evt);
            }
        });
        mpl1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mpl1ActionPerformed(evt);
            }
        });
        mpl1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                mpl1KeyReleased(evt);
            }
        });
        jPanel1.add(mpl1);
        mpl1.setBounds(400, 410, 40, 30);

        wpl1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                wpl1FocusLost(evt);
            }
        });
        wpl1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wpl1ActionPerformed(evt);
            }
        });
        wpl1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                wpl1KeyReleased(evt);
            }
        });
        jPanel1.add(wpl1);
        wpl1.setBounds(400, 370, 40, 30);

        cc1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cc1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                cc1FocusLost(evt);
            }
        });
        cc1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cc1ActionPerformed(evt);
            }
        });
        cc1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cc1KeyReleased(evt);
            }
        });
        jPanel1.add(cc1);
        cc1.setBounds(400, 330, 40, 30);

        ps1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                ps1FocusLost(evt);
            }
        });
        ps1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ps1ActionPerformed(evt);
            }
        });
        ps1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ps1KeyReleased(evt);
            }
        });
        jPanel1.add(ps1);
        ps1.setBounds(400, 290, 40, 30);

        mi1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                mi1FocusLost(evt);
            }
        });
        mi1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi1ActionPerformed(evt);
            }
        });
        mi1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                mi1KeyReleased(evt);
            }
        });
        jPanel1.add(mi1);
        mi1.setBounds(400, 250, 40, 30);

        wp1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                wp1FocusLost(evt);
            }
        });
        wp1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wp1ActionPerformed(evt);
            }
        });
        wp1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                wp1KeyReleased(evt);
            }
        });
        jPanel1.add(wp1);
        wp1.setBounds(400, 210, 40, 30);

        progress.setMaximum(10);
        progress.setToolTipText("Your Progress");
        jPanel1.add(progress);
        progress.setBounds(700, 500, 270, 10);

        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BACK2.png"))); // NOI18N
        jLabel30.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel30MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel30);
        jLabel30.setBounds(10, 10, 120, 63);

        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NEXT2.png"))); // NOI18N
        jLabel29.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel29MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel29);
        jLabel29.setBounds(1240, 10, 119, 63);

        ps.setEditable(false);
        ps.setFocusable(false);
        ps.setRequestFocusEnabled(false);
        ps.setVerifyInputWhenFocusTarget(false);
        ps.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                psActionPerformed(evt);
            }
        });
        jPanel1.add(ps);
        ps.setBounds(460, 290, 40, 30);

        jLabel23.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("  Project & Seminar :");
        jPanel1.add(jLabel23);
        jLabel23.setBounds(230, 280, 180, 50);

        cne.setEditable(false);
        cne.setFocusable(false);
        cne.setRequestFocusEnabled(false);
        cne.setVerifyInputWhenFocusTarget(false);
        cne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cneActionPerformed(evt);
            }
        });
        jPanel1.add(cne);
        cne.setBounds(460, 490, 40, 30);

        itr.setEditable(false);
        itr.setFocusable(false);
        itr.setRequestFocusEnabled(false);
        itr.setVerifyInputWhenFocusTarget(false);
        itr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itrActionPerformed(evt);
            }
        });
        jPanel1.add(itr);
        itr.setBounds(460, 450, 40, 30);

        wpl.setEditable(false);
        wpl.setFocusable(false);
        wpl.setRequestFocusEnabled(false);
        wpl.setVerifyInputWhenFocusTarget(false);
        wpl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wplActionPerformed(evt);
            }
        });
        jPanel1.add(wpl);
        wpl.setBounds(460, 370, 40, 30);

        mpl.setEditable(false);
        mpl.setFocusable(false);
        mpl.setRequestFocusEnabled(false);
        mpl.setVerifyInputWhenFocusTarget(false);
        mpl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mplActionPerformed(evt);
            }
        });
        jPanel1.add(mpl);
        mpl.setBounds(460, 410, 40, 30);

        jLabel21.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Computer Network Engineering Lab :");
        jPanel1.add(jLabel21);
        jLabel21.setBounds(100, 480, 300, 40);

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("   Industrial Training :");
        jPanel1.add(jLabel16);
        jLabel16.setBounds(230, 430, 170, 60);

        jLabel20.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("      Microprocessor Lab :");
        jPanel1.add(jLabel20);
        jLabel20.setBounds(200, 380, 200, 80);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Project Management & Software Engineering :");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(30, 160, 365, 50);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("  Web Programming :");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(220, 200, 190, 50);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText(" Microprocessor and Interfacing :");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(130, 230, 280, 70);

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Web Programming Lab :");
        jPanel1.add(jLabel19);
        jLabel19.setBounds(200, 340, 200, 80);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("   Cloud Computing :");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(230, 300, 180, 90);

        wp.setEditable(false);
        wp.setFocusable(false);
        wp.setRequestFocusEnabled(false);
        wp.setVerifyInputWhenFocusTarget(false);
        wp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wpActionPerformed(evt);
            }
        });
        jPanel1.add(wp);
        wp.setBounds(460, 210, 40, 30);

        pmse.setEditable(false);
        pmse.setFocusable(false);
        pmse.setRequestFocusEnabled(false);
        pmse.setVerifyInputWhenFocusTarget(false);
        pmse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pmseActionPerformed(evt);
            }
        });
        jPanel1.add(pmse);
        pmse.setBounds(460, 170, 40, 30);

        jLabel31.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText("SEMESTER 5");
        jPanel1.add(jLabel31);
        jLabel31.setBounds(560, 20, 280, 70);

        mi.setEditable(false);
        mi.setFocusable(false);
        mi.setRequestFocusEnabled(false);
        mi.setVerifyInputWhenFocusTarget(false);
        mi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miActionPerformed(evt);
            }
        });
        jPanel1.add(mi);
        mi.setBounds(460, 250, 40, 30);

        cc.setEditable(false);
        cc.setFocusable(false);
        cc.setRequestFocusEnabled(false);
        cc.setVerifyInputWhenFocusTarget(false);
        cc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ccActionPerformed(evt);
            }
        });
        jPanel1.add(cc);
        cc.setBounds(460, 330, 40, 30);

        jToggleButton1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jToggleButton1.setText("CALCULATE");
        jToggleButton1.setToolTipText("Click to Calculate Your SEM CGPA");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jToggleButton1);
        jToggleButton1.setBounds(730, 430, 210, 50);

        Sgpa.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        Sgpa.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(Sgpa);
        Sgpa.setBounds(950, 330, 120, 50);

        total.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        total.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(total);
        total.setBounds(940, 150, 260, 70);

        percentage1.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        percentage1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(percentage1);
        percentage1.setBounds(950, 240, 120, 50);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("GRADE POINTS :");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(660, 170, 280, 30);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText(" SGPA :");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(820, 330, 140, 50);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("  PERCENTAGE :");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(680, 230, 270, 70);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SEM.png"))); // NOI18N
        jPanel1.add(jLabel10);
        jLabel10.setBounds(0, 0, 1370, 710);

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("                Programming in C :");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(160, 340, 240, 50);

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("                Programming in C :");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(160, 340, 240, 50);

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("      Engineering Graphics :");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(190, 380, 220, 50);

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("      Engineering Graphics :");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(190, 380, 220, 50);

        jLabel15.setText("jLabel15");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(290, 420, 110, 80);

        jLabel24.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("  Project & Seminar :");
        jPanel1.add(jLabel24);
        jLabel24.setBounds(240, 110, 170, 60);

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

    private void wpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_wpActionPerformed

    private void pmseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pmseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pmseActionPerformed

    private void miActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_miActionPerformed

    private void ccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ccActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ccActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        // TODO add your handling code here:
         if(pmse1.getText().isEmpty()||wp1.getText().isEmpty()||mi1.getText().isEmpty()||ps1.getText().isEmpty()||cc1.getText().isEmpty()||wpl1.getText().isEmpty()||mpl1.getText().isEmpty()||itr1.getText().isEmpty()||cne1.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Please Fill Grades correctly");
      }
      else{
        
            String pmseH, miH, ccH, wpH, wplH, mplH, itrH,cneH, psH;
   
       float totalmark;

       double percentage;
        float sgpa;
  
        
        pmseH = pmse.getText();
        wpH = wp.getText();
        miH = mi.getText();
    
     

      
        ccH = cc.getText();
    wplH = wpl.getText();
    
    mplH = mpl.getText();
       itrH = itr.getText();
        cneH = cne.getText();
        psH = ps.getText();

        
        float pmsegrade =Float.parseFloat(pmseH);
        float wpgrade = Float.parseFloat(wpH);
        float migrade = Float.parseFloat(miH);
    
      
     
      float mplgrade = Float.parseFloat(mplH);
        float ccgrade = Float.parseFloat(ccH);
        float wplgrade = Float.parseFloat(wplH);
        float itrgrade = Float.parseFloat(itrH);
        float cnegrade = Float.parseFloat(cneH); 
        totalmark = ((pmsegrade*4) + (wpgrade*4) + (migrade*4) + (mplgrade*2) + (ccgrade*4) + (wplgrade*2) + (itrgrade*2) + (cnegrade*3));
       
        sgpa = (((pmsegrade*4) + (wpgrade*4) + (migrade*4) + (mplgrade*2) + (ccgrade*4) + (wplgrade*2) + (itrgrade*2) + (cnegrade*3)) / 25);
         percentage = (sgpa*9.5);
 
 
  double rounded = Math.round(sgpa*100)/100.0;
   
         double rounded2 = Math.round(percentage*100)/100.0;
        Sgpa.setText(rounded+"");
     
        total.setText(totalmark+"");
        percentage1.setText(rounded2+"");
          String sgpA = Sgpa.getText();
        System.out.println(sgpA);
   
            perc.setVisible(true);
             int j = (int) sgpa;
     
   
        progress.setValue(j);  
     
          try{
                            Connection con=Database.connect();

                String sql="UPDATE tbl_main SET sem5=('"+sgpA+"') WHERE username='"+Login.username+"'";
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

    private void wplActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wplActionPerformed
        // TODO add your handlig code here:
    }//GEN-LAST:event_wplActionPerformed

    private void itrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itrActionPerformed

    private void mplActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mplActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mplActionPerformed

    private void cneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cneActionPerformed

    private void psActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_psActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_psActionPerformed

    private void jLabel30MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel30MouseClicked
        // TODO add your handling code here:
       sgpa_sem p=new sgpa_sem();
        p.setVisible(true);
          dispose();
    }//GEN-LAST:event_jLabel30MouseClicked

    private void jLabel29MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel29MouseClicked
        // TODO add your handling code here:
            sem6_1 p=new sem6_1();
        p.setVisible(true);
          dispose();
    }//GEN-LAST:event_jLabel29MouseClicked

    private void pmse1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pmse1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pmse1ActionPerformed

    private void cne1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cne1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cne1ActionPerformed

    private void itr1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itr1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itr1ActionPerformed

    private void mpl1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mpl1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mpl1ActionPerformed

    private void wpl1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wpl1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_wpl1ActionPerformed

    private void cc1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cc1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cc1ActionPerformed

    private void ps1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ps1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ps1ActionPerformed

    private void mi1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mi1ActionPerformed

    private void wp1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wp1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_wp1ActionPerformed

    private void pmse1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pmse1FocusLost
        // TODO add your handling code here:
       
    }//GEN-LAST:event_pmse1FocusLost

    private void wp1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_wp1FocusLost
        // TODO add your handling code here:
     
    }//GEN-LAST:event_wp1FocusLost

    private void mi1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_mi1FocusLost
        // TODO add your handling code here:
     
    }//GEN-LAST:event_mi1FocusLost

    private void ps1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ps1FocusLost
        // TODO add your handling code here:
      
    }//GEN-LAST:event_ps1FocusLost

    private void cc1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cc1FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_cc1FocusGained

    private void cc1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cc1FocusLost
        // TODO add your handling code here:
    
    }//GEN-LAST:event_cc1FocusLost

    private void wpl1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_wpl1FocusLost
        // TODO add your handling code here:
       
    }//GEN-LAST:event_wpl1FocusLost

    private void mpl1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_mpl1FocusLost
        // TODO add your handling code here:
    
    }//GEN-LAST:event_mpl1FocusLost

    private void itr1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_itr1FocusLost
        // TODO add your handling code here:
    
    }//GEN-LAST:event_itr1FocusLost

    private void cne1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cne1FocusLost
        // TODO add your handling code here:
    
    }//GEN-LAST:event_cne1FocusLost

    private void pmse1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pmse1KeyReleased
        // TODO add your handling code here:
 String grade = pmse1.getText();
int score = GradeConverter.convert(grade);
pmse.setText(Integer.toString(score));
    }//GEN-LAST:event_pmse1KeyReleased

    private void wp1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_wp1KeyReleased
        // TODO add your handling code here:
   String grade = wp1.getText();
int score = GradeConverter.convert(grade);
wp.setText(Integer.toString(score));
    }//GEN-LAST:event_wp1KeyReleased

    private void mi1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mi1KeyReleased
        // TODO add your handling code here:
    String grade = mi1.getText();
int score = GradeConverter.convert(grade);
mi.setText(Integer.toString(score));
    }//GEN-LAST:event_mi1KeyReleased

    private void ps1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ps1KeyReleased
        // TODO add your handling code here:
       String grade = ps1.getText();
int score = GradeConverter.convert(grade);
ps.setText(Integer.toString(score));
    }//GEN-LAST:event_ps1KeyReleased

    private void cc1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cc1KeyReleased
        // TODO add your handling code here:
                                                    String i;
       String grade = cc1.getText();
int score = GradeConverter.convert(grade);
cc.setText(Integer.toString(score));
    }//GEN-LAST:event_cc1KeyReleased

    private void wpl1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_wpl1KeyReleased
        // TODO add your handling code here:
   String grade = wpl1.getText();
int score = GradeConverter.convert(grade);
wpl.setText(Integer.toString(score));
    }//GEN-LAST:event_wpl1KeyReleased

    private void mpl1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mpl1KeyReleased
        // TODO add your handling code here:
    String grade = mpl1.getText();
int score = GradeConverter.convert(grade);
mpl.setText(Integer.toString(score));
    }//GEN-LAST:event_mpl1KeyReleased

    private void itr1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_itr1KeyReleased
        // TODO add your handling code here:
      String grade = itr1.getText();
int score = GradeConverter.convert(grade);
itr.setText(Integer.toString(score));
    }//GEN-LAST:event_itr1KeyReleased

    private void cne1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cne1KeyReleased
        // TODO add your handling code here:
      String grade = cne1.getText();
int score = GradeConverter.convert(grade);
cne.setText(Integer.toString(score));
    }//GEN-LAST:event_cne1KeyReleased

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
                new sem5_1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Sgpa;
    private javax.swing.JTextField cc;
    private javax.swing.JTextField cc1;
    private javax.swing.JTextField cne;
    private javax.swing.JTextField cne1;
    private javax.swing.JTextField itr;
    private javax.swing.JTextField itr1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jToggleButton1;
    private javax.swing.JTextField mi;
    private javax.swing.JTextField mi1;
    private javax.swing.JTextField mpl;
    private javax.swing.JTextField mpl1;
    private javax.swing.JLabel perc;
    private javax.swing.JLabel percentage1;
    private javax.swing.JTextField pmse;
    private javax.swing.JTextField pmse1;
    private javax.swing.JProgressBar progress;
    private javax.swing.JTextField ps;
    private javax.swing.JTextField ps1;
    private javax.swing.JLabel total;
    private javax.swing.JTextField wp;
    private javax.swing.JTextField wp1;
    private javax.swing.JTextField wpl;
    private javax.swing.JTextField wpl1;
    // End of variables declaration//GEN-END:variables
}
