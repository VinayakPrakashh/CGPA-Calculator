
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author ACER
 */
public class sem5 extends javax.swing.JFrame {
int value;
    /**
     * Creates new form sem1
     */
    public sem5() {
        initComponents();
        perc.setVisible(false);
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
          
 sem1t.setVisible(false);
  sem1t2.setVisible(false);
  sem1tl.setVisible(false);
  sem1t2l.setVisible(false);
  try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db_cgpa","root","");
            String sql="SELECT totalmark FROM tblclet WHERE id = 1";
            
            System.out.println(sql);
            Statement stmt=con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            
            if(rs.next())
            {
    int id = rs.getInt("totalmark");
    String s=String.valueOf(id);
          sem1t3.setText(s);
            }
        }
        catch(Exception e)
        {
            System.out.println("error" + e);
        }
  try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db_cgpa","root","");
            String sql="SELECT totalmark FROM tblclet WHERE id = 2";
            
            System.out.println(sql);
            Statement stmt=con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            
            if(rs.next())
            {
    int id = rs.getInt("totalmark");
    String s=String.valueOf(id);
          sem1t4.setText(s);
            }
        }
        catch(Exception e)
        {
            System.out.println("error" + e);
        }
      }
      else{
          try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db_cgpa","root","");
            String sql="SELECT totalmark FROM tblc WHERE id = 1";
            
            System.out.println(sql);
            Statement stmt=con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            
            if(rs.next())
            {
    int id = rs.getInt("totalmark");
    String s=String.valueOf(id);
          sem1t.setText(s);
            }
        }
        catch(Exception e)
        {
            System.out.println("error" + e);
        }

    
         try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db_cgpa","root","");
            String sql="SELECT totalmark FROM tblc WHERE id = 2";
            
            System.out.println(sql);
            Statement stmt=con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            
            if(rs.next())
            {
    int id = rs.getInt("totalmark");
    String s=String.valueOf(id);
          sem1t2.setText(s);
            }
        }
        catch(Exception e)
        {
            System.out.println("error" + e);
        }

    
         try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db_cgpa","root","");
            String sql="SELECT totalmark FROM tblc WHERE id = 3";
            
            System.out.println(sql);
            Statement stmt=con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            
            if(rs.next())
            {
    int id = rs.getInt("totalmark");
    String s=String.valueOf(id);
          sem1t3.setText(s);
            }
        }
        catch(Exception e)
        {
            System.out.println("error" + e);
        }
try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db_cgpa","root","");
            String sql="SELECT totalmark FROM tblc WHERE id = 4";
            
            System.out.println(sql);
            Statement stmt=con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            
            if(rs.next())
            {
    int id = rs.getInt("totalmark");
    String s=String.valueOf(id);
          sem1t4.setText(s);
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
        sem1t4 = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        sem1t3 = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        sem1t2 = new javax.swing.JTextField();
        sem1t2l = new javax.swing.JLabel();
        ps = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        sem1t = new javax.swing.JTextField();
        sem1tl = new javax.swing.JLabel();
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
        mi = new javax.swing.JTextField();
        cc = new javax.swing.JTextField();
        jToggleButton1 = new javax.swing.JButton();
        Cgpa = new javax.swing.JLabel();
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
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        perc.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        perc.setForeground(new java.awt.Color(255, 255, 255));
        perc.setText("%");
        jPanel1.add(perc);
        perc.setBounds(890, 270, 50, 70);

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText(" Grade");
        jPanel1.add(jLabel22);
        jLabel22.setBounds(370, 90, 40, 16);

        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("  Point");
        jPanel1.add(jLabel25);
        jLabel25.setBounds(430, 90, 40, 16);

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
        pmse1.setBounds(370, 110, 40, 30);

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
        cne1.setBounds(370, 430, 40, 30);

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
        itr1.setBounds(370, 390, 40, 30);

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
        mpl1.setBounds(370, 350, 40, 30);

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
        wpl1.setBounds(370, 310, 40, 30);

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
        cc1.setBounds(370, 270, 40, 30);

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
        ps1.setBounds(370, 230, 40, 30);

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
        mi1.setBounds(370, 190, 40, 30);

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
        wp1.setBounds(370, 150, 40, 30);

        progress.setMaximum(10);
        progress.setToolTipText("Your Progress");
        jPanel1.add(progress);
        progress.setBounds(530, 480, 270, 10);

        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/back.png"))); // NOI18N
        jLabel30.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel30MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel30);
        jLabel30.setBounds(0, 0, 60, 60);

        sem1t4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sem1t4ActionPerformed(evt);
            }
        });
        jPanel1.add(sem1t4);
        sem1t4.setBounds(1000, 170, 100, 40);

        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/next.png"))); // NOI18N
        jLabel29.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel29MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel29);
        jLabel29.setBounds(1070, 0, 165, 50);

        jLabel28.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("SEM 4 TOTAL :");
        jPanel1.add(jLabel28);
        jLabel28.setBounds(830, 170, 160, 40);

        sem1t3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sem1t3ActionPerformed(evt);
            }
        });
        jPanel1.add(sem1t3);
        sem1t3.setBounds(720, 170, 100, 40);

        jLabel27.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("SEM 3 TOTAL :");
        jPanel1.add(jLabel27);
        jLabel27.setBounds(550, 170, 160, 40);

        sem1t2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sem1t2ActionPerformed(evt);
            }
        });
        jPanel1.add(sem1t2);
        sem1t2.setBounds(1000, 120, 100, 40);

        sem1t2l.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        sem1t2l.setForeground(new java.awt.Color(255, 255, 255));
        sem1t2l.setText("SEM 2 TOTAL :");
        jPanel1.add(sem1t2l);
        sem1t2l.setBounds(830, 120, 160, 40);

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
        ps.setBounds(430, 230, 40, 30);

        jLabel23.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("  Project & Seminar :");
        jPanel1.add(jLabel23);
        jLabel23.setBounds(200, 220, 180, 50);

        sem1t.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sem1tActionPerformed(evt);
            }
        });
        jPanel1.add(sem1t);
        sem1t.setBounds(720, 120, 100, 40);

        sem1tl.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        sem1tl.setForeground(new java.awt.Color(255, 255, 255));
        sem1tl.setText("SEM 1 TOTAL :");
        jPanel1.add(sem1tl);
        sem1tl.setBounds(550, 120, 160, 40);

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
        cne.setBounds(430, 430, 40, 30);

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
        itr.setBounds(430, 390, 40, 30);

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
        wpl.setBounds(430, 310, 40, 30);

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
        mpl.setBounds(430, 350, 40, 30);

        jLabel21.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Computer Network Engineering Lab :");
        jPanel1.add(jLabel21);
        jLabel21.setBounds(70, 420, 300, 40);

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("   Industrial Training :");
        jPanel1.add(jLabel16);
        jLabel16.setBounds(200, 370, 170, 60);

        jLabel20.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("      Microprocessor Lab :");
        jPanel1.add(jLabel20);
        jLabel20.setBounds(170, 320, 200, 80);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Project Management & Software Engineering :");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 94, 365, 60);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("    Web Programming :");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(185, 141, 190, 50);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("   Microprocessor and Interfacing :");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(95, 169, 280, 70);

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Web Programming Lab :");
        jPanel1.add(jLabel19);
        jLabel19.setBounds(170, 280, 200, 80);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("   Cloud Computing :");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(200, 240, 180, 90);

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
        wp.setBounds(430, 150, 40, 30);

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
        pmse.setBounds(430, 110, 40, 30);

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
        mi.setBounds(430, 190, 40, 30);

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
        cc.setBounds(430, 270, 40, 30);

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
        Cgpa.setBounds(770, 340, 390, 50);

        total.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        total.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(total);
        total.setBounds(770, 210, 260, 70);

        percentage1.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        percentage1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(percentage1);
        percentage1.setBounds(770, 280, 120, 50);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("TOTAL MARK :");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(510, 230, 260, 30);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText(" CGPA :");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(640, 340, 140, 50);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("  PERCENTAGE :");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(500, 270, 270, 70);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SEM5NEW.png"))); // NOI18N
        jPanel1.add(jLabel10);
        jLabel10.setBounds(0, 0, 1240, 510);

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("                Programming in C :");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(130, 280, 240, 50);

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("                Programming in C :");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(130, 280, 240, 50);

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("      Engineering Graphics :");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(155, 320, 220, 50);

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("      Engineering Graphics :");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(155, 320, 220, 50);

        jLabel15.setText("jLabel15");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(260, 360, 110, 80);

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText(" Workshop Practice :");
        jPanel1.add(jLabel17);
        jLabel17.setBounds(200, 380, 170, 25);

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText(" Workshop Practice :");
        jPanel1.add(jLabel18);
        jLabel18.setBounds(200, 380, 170, 25);

        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField5);
        jTextField5.setBounds(380, 470, 40, 30);

        jLabel24.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("  Project & Seminar :");
        jPanel1.add(jLabel24);
        jLabel24.setBounds(205, 50, 170, 60);

        jLabel26.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("SEMESTER 1 TOTAL :");
        jPanel1.add(jLabel26);
        jLabel26.setBounds(430, 120, 220, 40);

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
        if(value == 1){
             String pmseH, miH, ccH, wpH, wplH, mplH, itrH, cneH, psH, sem1t3H, sem1t4H;
        float average;
       float totalmark;
       float totalmark2;
       double percentage;
        float cgpa;
         float cgpa2;
        
        pmseH = pmse.getText();
        wpH = wp.getText();
        miH = mi.getText();
    
     

      
        ccH = cc.getText();
    wplH = wpl.getText();
    
    mplH = mpl.getText();
       itrH = itr.getText();
        cneH = cne.getText();
        psH = ps.getText();
 
        sem1t3H = sem1t3.getText();
        sem1t4H = sem1t4.getText();
        
        float pmsegrade =Float.parseFloat(pmseH);
        float wpgrade = Float.parseFloat(wpH);
        float migrade = Float.parseFloat(miH);
    
      
     
      float mplgrade = Float.parseFloat(mplH);
        float ccgrade = Float.parseFloat(ccH);
        float wplgrade = Float.parseFloat(wplH);
        float itrgrade = Float.parseFloat(itrH);
        float cnegrade = Float.parseFloat(cneH);
        float psgrade = Float.parseFloat(psH);
       
        float sem1t3grade = Float.parseFloat(sem1t3H);
        float sem1t4grade = Float.parseFloat(sem1t4H);
        totalmark = ((pmsegrade*4) + (wpgrade*4) + (migrade*4) + (mplgrade*2) + (ccgrade*4) + (wplgrade*2) + (itrgrade*2) + (cnegrade*3));
       
        cgpa = (((pmsegrade*4) + (wpgrade*4) + (migrade*4) + (mplgrade*2) + (ccgrade*4) + (wplgrade*2) + (itrgrade*2) + (cnegrade*3)) / 25);
         percentage = (cgpa*9.5);
  totalmark2 = ( totalmark+ sem1t3grade + sem1t4grade);
  cgpa2 = (totalmark2 / 85);
  double rounded = Math.round(cgpa2*100)/100.0;
   
         double rounded2 = Math.round(percentage*100)/100.0;
        Cgpa.setText(rounded+"");
        total.setText(totalmark+"");
        percentage1.setText(rounded2+"");
          String cgpA = Cgpa.getText();
        System.out.println(cgpA);
    try{
                Class.forName("com.mysql.jdbc.Driver");
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db_cgpa","root","");
                String sql="UPDATE tblc SET cgpa=('"+cgpA+"') WHERE id = 1";
                System.out.println(sql);
                Statement stmt=con.createStatement();
                int rs = stmt.executeUpdate(sql);

            }
            catch(Exception e)
            {
                System.out.println("error" + e);
            }
            if(cgpa2 >= 8){
                                               try
       {
           FileInputStream fileInputStream = new FileInputStream("good.mp3");
           Player player = new Player(fileInputStream);
           player.play();
       }
       catch(FileNotFoundException | JavaLayerException e){
       
       }

        }
        else if(cgpa2 >= 5){
                                                try
       {
           FileInputStream fileInputStream = new FileInputStream("notbad.mp3");
           Player player = new Player(fileInputStream);
           player.play();
       }
       catch(FileNotFoundException | JavaLayerException e){
       
       }

        }
        else{
                                                try
       {
           FileInputStream fileInputStream = new FileInputStream("bad.mp3");
           Player player = new Player(fileInputStream);
           player.play();
       }
       catch(FileNotFoundException | JavaLayerException e){
       
       }

        }
            perc.setVisible(true);
             int j = (int) cgpa2;
     
   
        progress.setValue(j);  
     
                  String sem1tot = total.getText();
        System.out.println(sem1tot);
   try{
                Class.forName("com.mysql.jdbc.Driver");
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db_cgpa","root","");
                String sql="UPDATE tblclet SET totalmark=('"+sem1tot+"') WHERE id = 3";
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
                String sql="UPDATE tblclet SET sum3 = (SELECT SUM(totalmark) as sum_i FROM tblclet WHERE id < 4) where id =1";
                System.out.println(sql);
                Statement stmt=con.createStatement();
                int rs = stmt.executeUpdate(sql);

            }
            catch(Exception e)
            {
                System.out.println("error" + e);
            }
        }
        else{
            String pmseH, miH, ccH, wpH, wplH, mplH, itrH, sem1tH, cneH, psH, sem1t2H, sem1t3H, sem1t4H;
        float average;
       float totalmark;
       float totalmark2;
       double percentage;
        float cgpa;
         float cgpa2;
        
        pmseH = pmse.getText();
        wpH = wp.getText();
        miH = mi.getText();
    
     

      
        ccH = cc.getText();
    wplH = wpl.getText();
    
    mplH = mpl.getText();
       itrH = itr.getText();
        cneH = cne.getText();
        psH = ps.getText();
        sem1tH = sem1t.getText();
        sem1t2H = sem1t2.getText();
        sem1t3H = sem1t3.getText();
        sem1t4H = sem1t4.getText();
        
        float pmsegrade =Float.parseFloat(pmseH);
        float wpgrade = Float.parseFloat(wpH);
        float migrade = Float.parseFloat(miH);
    
      
     
      float mplgrade = Float.parseFloat(mplH);
        float ccgrade = Float.parseFloat(ccH);
        float wplgrade = Float.parseFloat(wplH);
        float itrgrade = Float.parseFloat(itrH);
        float cnegrade = Float.parseFloat(cneH);
        float psgrade = Float.parseFloat(psH);
        float sem1tgrade = Float.parseFloat(sem1tH);
        float sem1t2grade = Float.parseFloat(sem1t2H);
        float sem1t3grade = Float.parseFloat(sem1t3H);
        float sem1t4grade = Float.parseFloat(sem1t4H);
        totalmark = ((pmsegrade*4) + (wpgrade*4) + (migrade*4) + (mplgrade*2) + (ccgrade*4) + (wplgrade*2) + (itrgrade*2) + (cnegrade*3));
       
        cgpa = (((pmsegrade*4) + (wpgrade*4) + (migrade*4) + (mplgrade*2) + (ccgrade*4) + (wplgrade*2) + (itrgrade*2) + (cnegrade*3)) / 25);
         percentage = (cgpa*9.5);
  totalmark2 = (sem1tgrade + totalmark + sem1t2grade + sem1t3grade + sem1t4grade);
  cgpa2 = (totalmark2 / 140);
  double rounded = Math.round(cgpa2*100)/100.0;
   
         double rounded2 = Math.round(percentage*100)/100.0;
        Cgpa.setText(rounded+"");
        total.setText(totalmark+"");
        percentage1.setText(rounded2+"");
          String cgpA = Cgpa.getText();
        System.out.println(cgpA);
    try{
                Class.forName("com.mysql.jdbc.Driver");
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db_cgpa","root","");
                String sql="UPDATE tblc SET cgpa=('"+cgpA+"') WHERE id = 2";
                System.out.println(sql);
                Statement stmt=con.createStatement();
                int rs = stmt.executeUpdate(sql);

            }
            catch(Exception e)
            {
                System.out.println("error" + e);
            }
            if(cgpa2 >= 8){
                                               try
       {
           FileInputStream fileInputStream = new FileInputStream("good.mp3");
           Player player = new Player(fileInputStream);
           player.play();
       }
       catch(FileNotFoundException | JavaLayerException e){
       
       }

        }
        else if(cgpa2 >= 5){
                                                try
       {
           FileInputStream fileInputStream = new FileInputStream("notbad.mp3");
           Player player = new Player(fileInputStream);
           player.play();
       }
       catch(FileNotFoundException | JavaLayerException e){
       
       }

        }
        else{
                                                try
       {
           FileInputStream fileInputStream = new FileInputStream("bad.mp3");
           Player player = new Player(fileInputStream);
           player.play();
       }
       catch(FileNotFoundException | JavaLayerException e){
       
       }

        }
            perc.setVisible(true);
             int j = (int) cgpa2;
     
   
        progress.setValue(j);  
     
                  String sem1tot = total.getText();
        System.out.println(sem1tot);
   try{
                Class.forName("com.mysql.jdbc.Driver");
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db_cgpa","root","");
                String sql="UPDATE tblc SET totalmark=('"+sem1tot+"') WHERE id = 5";
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
                String sql="UPDATE tblc SET sum1 = (SELECT SUM(totalmark) as sum_i FROM tblc WHERE id < 6) where id =1";
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

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void sem1tActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sem1tActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sem1tActionPerformed

    private void psActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_psActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_psActionPerformed

    private void sem1t2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sem1t2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sem1t2ActionPerformed

    private void sem1t3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sem1t3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sem1t3ActionPerformed

    private void sem1t4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sem1t4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sem1t4ActionPerformed

    private void jLabel30MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel30MouseClicked
        // TODO add your handling code here:
       dashboard p=new dashboard();
        p.setVisible(true);
          dispose();
    }//GEN-LAST:event_jLabel30MouseClicked

    private void jLabel29MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel29MouseClicked
        // TODO add your handling code here:
            sem6 p=new sem6();
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
                                                 String i;
        i=pmse1.getText();
        
        if("S".equals(i)){
           
           pmse.setText("10");
        }
      else if("A".equals(i)){
            
           pmse.setText("9");
        }
               else if("B".equals(i)){
            
           pmse.setText("8");
        }
                   else if("C".equals(i)){
            
           pmse.setText("7");
        }
                       else if("D".equals(i)){
            
           pmse.setText("6");
        }
                           else if("E".equals(i)){
            
           pmse.setText("5");
        }
                              else{
          
           pmse.setText("0");
        }
    }//GEN-LAST:event_pmse1KeyReleased

    private void wp1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_wp1KeyReleased
        // TODO add your handling code here:
                                                   String i;
        i=wp1.getText();
        
        if("S".equals(i)){
           
           wp.setText("10");
        }
      else if("A".equals(i)){
            
           wp.setText("9");
        }
               else if("B".equals(i)){
            
           wp.setText("8");
        }
                   else if("C".equals(i)){
            
           wp.setText("7");
        }
                       else if("D".equals(i)){
            
           wp.setText("6");
        }
                           else if("E".equals(i)){
            
           wp.setText("5");
        }
                              else{
          
           wp.setText("0");
        }
    }//GEN-LAST:event_wp1KeyReleased

    private void mi1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mi1KeyReleased
        // TODO add your handling code here:
                                                   String i;
        i=mi1.getText();
        
        if("S".equals(i)){
           
           mi.setText("10");
        }
      else if("A".equals(i)){
            
           mi.setText("9");
        }
               else if("B".equals(i)){
            
           mi.setText("8");
        }
                   else if("C".equals(i)){
            
           mi.setText("7");
        }
                       else if("D".equals(i)){
            
           mi.setText("6");
        }
                           else if("E".equals(i)){
            
           mi.setText("5");
        }
                              else{
          
           mi.setText("0");
        }
    }//GEN-LAST:event_mi1KeyReleased

    private void ps1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ps1KeyReleased
        // TODO add your handling code here:
                                                  String i;
        i=ps1.getText();
        
        if("S".equals(i)){
           
           ps.setText("10");
        }
      else if("A".equals(i)){
            
           ps.setText("9");
        }
               else if("B".equals(i)){
            
           ps.setText("8");
        }
                   else if("C".equals(i)){
            
           ps.setText("7");
        }
                       else if("D".equals(i)){
            
           ps.setText("6");
        }
                           else if("E".equals(i)){
            
           ps.setText("5");
        }
                              else{
          
           ps.setText("0");
        }
    }//GEN-LAST:event_ps1KeyReleased

    private void cc1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cc1KeyReleased
        // TODO add your handling code here:
                                                    String i;
        i=cc1.getText();
        
        if("S".equals(i)){
           
           cc.setText("10");
        }
      else if("A".equals(i)){
            
           cc.setText("9");
        }
               else if("B".equals(i)){
            
           cc.setText("8");
        }
                   else if("C".equals(i)){
            
           cc.setText("7");
        }
                       else if("D".equals(i)){
            
           cc.setText("6");
        }
                           else if("E".equals(i)){
            
           cc.setText("5");
        }
                              else{
          
           cc.setText("0");
        }
    }//GEN-LAST:event_cc1KeyReleased

    private void wpl1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_wpl1KeyReleased
        // TODO add your handling code here:
                                                 String i;
        i=wpl1.getText();
        
        if("S".equals(i)){
           
           wpl.setText("10");
        }
      else if("A".equals(i)){
            
           wpl.setText("9");
        }
               else if("B".equals(i)){
            
           wpl.setText("8");
        }
                   else if("C".equals(i)){
            
           wpl.setText("7");
        }
                       else if("D".equals(i)){
            
           wpl.setText("6");
        }
                           else if("E".equals(i)){
            
           wpl.setText("5");
        }
                              else{
          
           wpl.setText("0");
        }
    }//GEN-LAST:event_wpl1KeyReleased

    private void mpl1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mpl1KeyReleased
        // TODO add your handling code here:
                                                    String i;
        i=mpl1.getText();
        
        if("S".equals(i)){
           
           mpl.setText("10");
        }
      else if("A".equals(i)){
            
           mpl.setText("9");
        }
               else if("B".equals(i)){
            
           mpl.setText("8");
        }
                   else if("C".equals(i)){
            
           mpl.setText("7");
        }
                       else if("D".equals(i)){
            
           mpl.setText("6");
        }
                           else if("E".equals(i)){
            
           mpl.setText("5");
        }
                              else{
          
           mpl.setText("0");
        }
    }//GEN-LAST:event_mpl1KeyReleased

    private void itr1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_itr1KeyReleased
        // TODO add your handling code here:
                                                    String i;
        i=itr1.getText();
        
        if("S".equals(i)){
           
           itr.setText("10");
        }
      else if("A".equals(i)){
            
           itr.setText("9");
        }
               else if("B".equals(i)){
            
           itr.setText("8");
        }
                   else if("C".equals(i)){
            
           itr.setText("7");
        }
                       else if("D".equals(i)){
            
           itr.setText("6");
        }
                           else if("E".equals(i)){
            
           itr.setText("5");
        }
                              else{
          
           itr.setText("0");
        }
    }//GEN-LAST:event_itr1KeyReleased

    private void cne1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cne1KeyReleased
        // TODO add your handling code here:
                                                    String i;
        i=cne1.getText();
        
        if("S".equals(i)){
           
           cne.setText("10");
        }
      else if("A".equals(i)){
            
           cne.setText("9");
        }
               else if("B".equals(i)){
            
           cne.setText("8");
        }
                   else if("C".equals(i)){
            
           cne.setText("7");
        }
                       else if("D".equals(i)){
            
           cne.setText("6");
        }
                           else if("E".equals(i)){
            
           cne.setText("5");
        }
                              else{
          
           cne.setText("0");
        }
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
                new sem5().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Cgpa;
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
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField5;
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
    private javax.swing.JTextField sem1t;
    private javax.swing.JTextField sem1t2;
    private javax.swing.JLabel sem1t2l;
    private javax.swing.JTextField sem1t3;
    private javax.swing.JTextField sem1t4;
    private javax.swing.JLabel sem1tl;
    private javax.swing.JLabel total;
    private javax.swing.JTextField wp;
    private javax.swing.JTextField wp1;
    private javax.swing.JTextField wpl;
    private javax.swing.JTextField wpl1;
    // End of variables declaration//GEN-END:variables
}
