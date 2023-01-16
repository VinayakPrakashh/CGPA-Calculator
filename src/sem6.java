
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
 *
 * @author ACER
 */
public class sem6 extends javax.swing.JFrame {
int value;
    /**
     * Creates new form sem1
     */
    public sem6() {
        initComponents();
        perc.setVisible(false);
        try{
                        Connection con=Database.connect();

            String sql="SELECT checkbox FROM tbl_main WHERE username='"+Login.username+"'";
            
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
          
sem1t1.setVisible(false);
  sem1t2.setVisible(false);
  sem1tl.setVisible(false);
  sem1t2l.setVisible(false);
  try{
                        Connection con=Database.connect();

            String sql="SELECT sem3_pl FROM tbl_main WHERE username='"+Login.username+"'";
            
            System.out.println(sql);
            Statement stmt=con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            
            if(rs.next())
            {
    int id = rs.getInt("sem3_pl");
    String s=String.valueOf(id);
          sem1t3.setText(s);
            }
        }
        catch(Exception e)
        {
            System.out.println("error" + e);
        }
  try{
                        Connection con=Database.connect();

            String sql="SELECT sem4_pl FROM tbl_main WHERE username='"+Login.username+"'";
            
            System.out.println(sql);
            Statement stmt=con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            
            if(rs.next())
            {
    int id = rs.getInt("sem4_pl");
    String s=String.valueOf(id);
          sem1t4.setText(s);
            }
        }
        catch(Exception e)
        {
            System.out.println("error" + e);
        }
   try{
                        Connection con=Database.connect();

            String sql="SELECT sem5_pl FROM tbl_main WHERE username='"+Login.username+"'";
            
            System.out.println(sql);
            Statement stmt=con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            
            if(rs.next())
            {
    int id = rs.getInt("sem5_pl");
    String s=String.valueOf(id);
          sem1t5.setText(s);
            }
        }
        catch(Exception e)
        {
            System.out.println("error" + e);
        }
      }
  else{
         try{
                        Connection con=Database.connect();

            String sql="SELECT sem1_p FROM tbl_main WHERE username='"+Login.username+"'";
            
            System.out.println(sql);
            Statement stmt=con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            
            if(rs.next())
            {
    int id = rs.getInt("sem1_p");
    String s=String.valueOf(id);
          sem1t1.setText(s);
            }
        }
        catch(Exception e)
        {
            System.out.println("error" + e);
        }

    
         try{
                        Connection con=Database.connect();

            String sql="SELECT sem2_p FROM tbl_main WHERE username='"+Login.username+"'";
            
            System.out.println(sql);
            Statement stmt=con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            
            if(rs.next())
            {
    int id = rs.getInt("sem2_p");
    String s=String.valueOf(id);
          sem1t2.setText(s);
            }
        }
        catch(Exception e)
        {
            System.out.println("error" + e);
        }

    
         try{
                        Connection con=Database.connect();

            String sql="SELECT sem3_p FROM tbl_main WHERE username='"+Login.username+"'";
            
            System.out.println(sql);
            Statement stmt=con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            
            if(rs.next())
            {
    int id = rs.getInt("sem3_p");
    String s=String.valueOf(id);
          sem1t3.setText(s);
            }
        }
        catch(Exception e)
        {
            System.out.println("error" + e);
        }
try{
                        Connection con=Database.connect();

            String sql="SELECT sem4_p FROM tbl_main WHERE username='"+Login.username+"'";
            
            System.out.println(sql);
            Statement stmt=con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            
            if(rs.next())
            {
    int id = rs.getInt("sem4_p");
    String s=String.valueOf(id);
          sem1t4.setText(s);
            }
        }
        catch(Exception e)
        {
            System.out.println("error" + e);
        }

try{
                        Connection con=Database.connect();

            String sql="SELECT sem5_p FROM tbl_main WHERE username='"+Login.username+"'";
            
            System.out.println(sql);
            Statement stmt=con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            
            if(rs.next())
            {
    int id = rs.getInt("sem5_p");
    String s=String.valueOf(id);
          sem1t5.setText(s);
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
        st1 = new javax.swing.JTextField();
        st = new javax.swing.JTextField();
        perc = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        mc1 = new javax.swing.JTextField();
        mcl1 = new javax.swing.JTextField();
        cn1 = new javax.swing.JTextField();
        ps1 = new javax.swing.JTextField();
        sdpl1 = new javax.swing.JTextField();
        sdp1 = new javax.swing.JTextField();
        progress = new javax.swing.JProgressBar();
        jLabel21 = new javax.swing.JLabel();
        sem1t1 = new javax.swing.JTextField();
        sem1tl = new javax.swing.JLabel();
        sem1t5 = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        sem1t4 = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        sem1t3 = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        mcl = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        sem1t2 = new javax.swing.JTextField();
        sem1t2l = new javax.swing.JLabel();
        ps = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cn = new javax.swing.JTextField();
        mc = new javax.swing.JTextField();
        sdp = new javax.swing.JTextField();
        sdpl = new javax.swing.JTextField();
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
        jLabel16 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        st1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                st1FocusLost(evt);
            }
        });
        st1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                st1ActionPerformed(evt);
            }
        });
        st1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                st1KeyReleased(evt);
            }
        });
        jPanel1.add(st1);
        st1.setBounds(370, 350, 40, 30);

        st.setEditable(false);
        st.setFocusable(false);
        st.setRequestFocusEnabled(false);
        st.setVerifyInputWhenFocusTarget(false);
        st.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stActionPerformed(evt);
            }
        });
        jPanel1.add(st);
        st.setBounds(430, 350, 40, 30);

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

        jLabel29.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("  Point");
        jPanel1.add(jLabel29);
        jLabel29.setBounds(430, 90, 40, 16);

        mc1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                mc1FocusLost(evt);
            }
        });
        mc1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mc1ActionPerformed(evt);
            }
        });
        mc1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                mc1KeyReleased(evt);
            }
        });
        jPanel1.add(mc1);
        mc1.setBounds(370, 110, 40, 30);

        mcl1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                mcl1FocusLost(evt);
            }
        });
        mcl1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mcl1ActionPerformed(evt);
            }
        });
        mcl1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                mcl1KeyReleased(evt);
            }
        });
        jPanel1.add(mcl1);
        mcl1.setBounds(370, 230, 40, 30);

        cn1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                cn1FocusLost(evt);
            }
        });
        cn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cn1ActionPerformed(evt);
            }
        });
        cn1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cn1KeyReleased(evt);
            }
        });
        jPanel1.add(cn1);
        cn1.setBounds(370, 150, 40, 30);

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
        ps1.setBounds(370, 310, 40, 30);

        sdpl1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                sdpl1FocusLost(evt);
            }
        });
        sdpl1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sdpl1ActionPerformed(evt);
            }
        });
        sdpl1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                sdpl1KeyReleased(evt);
            }
        });
        jPanel1.add(sdpl1);
        sdpl1.setBounds(370, 270, 40, 30);

        sdp1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                sdp1FocusLost(evt);
            }
        });
        sdp1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sdp1ActionPerformed(evt);
            }
        });
        sdp1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                sdp1KeyReleased(evt);
            }
        });
        jPanel1.add(sdp1);
        sdp1.setBounds(370, 190, 40, 30);

        progress.setMaximum(10);
        progress.setToolTipText("Your Progress");
        jPanel1.add(progress);
        progress.setBounds(530, 480, 270, 10);

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/back.png"))); // NOI18N
        jLabel21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel21MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel21);
        jLabel21.setBounds(0, 0, 60, 60);

        sem1t1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sem1t1ActionPerformed(evt);
            }
        });
        jPanel1.add(sem1t1);
        sem1t1.setBounds(370, 420, 100, 40);

        sem1tl.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        sem1tl.setForeground(new java.awt.Color(255, 255, 255));
        sem1tl.setText("SEM1 GRADE POINTS:");
        jPanel1.add(sem1tl);
        sem1tl.setBounds(180, 420, 180, 40);

        sem1t5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sem1t5ActionPerformed(evt);
            }
        });
        jPanel1.add(sem1t5);
        sem1t5.setBounds(1000, 170, 100, 40);

        jLabel28.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("SEM5 GRADE POINTS:");
        jPanel1.add(jLabel28);
        jLabel28.setBounds(810, 170, 180, 40);

        sem1t4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sem1t4ActionPerformed(evt);
            }
        });
        jPanel1.add(sem1t4);
        sem1t4.setBounds(700, 170, 100, 40);

        jLabel27.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("SEM4 GRADE POINTS:");
        jPanel1.add(jLabel27);
        jLabel27.setBounds(510, 170, 180, 40);

        sem1t3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sem1t3ActionPerformed(evt);
            }
        });
        jPanel1.add(sem1t3);
        sem1t3.setBounds(1000, 120, 100, 40);

        jLabel25.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("SEM3 GRADE POINTS:");
        jPanel1.add(jLabel25);
        jLabel25.setBounds(810, 120, 180, 40);

        mcl.setEditable(false);
        mcl.setFocusable(false);
        mcl.setRequestFocusEnabled(false);
        mcl.setVerifyInputWhenFocusTarget(false);
        mcl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mclActionPerformed(evt);
            }
        });
        jPanel1.add(mcl);
        mcl.setBounds(430, 230, 40, 30);

        jLabel23.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Microcontroller Lab :");
        jPanel1.add(jLabel23);
        jLabel23.setBounds(200, 220, 180, 50);

        sem1t2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sem1t2ActionPerformed(evt);
            }
        });
        jPanel1.add(sem1t2);
        sem1t2.setBounds(700, 120, 100, 40);

        sem1t2l.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        sem1t2l.setForeground(new java.awt.Color(255, 255, 255));
        sem1t2l.setText("SEM2 GRADE POINTS:");
        jPanel1.add(sem1t2l);
        sem1t2l.setBounds(510, 120, 200, 40);

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
        ps.setBounds(430, 310, 40, 30);

        jLabel20.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Software Testing :");
        jPanel1.add(jLabel20);
        jLabel20.setBounds(220, 320, 150, 80);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Microcontrollers :");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(225, 94, 140, 60);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Computer Networks :");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(195, 141, 180, 50);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Smart Device Programming :");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(135, 169, 240, 70);

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Project & Seminar :");
        jPanel1.add(jLabel19);
        jLabel19.setBounds(210, 290, 160, 70);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Smart Device Programming Lab :");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(100, 240, 280, 90);

        cn.setEditable(false);
        cn.setFocusable(false);
        cn.setRequestFocusEnabled(false);
        cn.setVerifyInputWhenFocusTarget(false);
        cn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cnActionPerformed(evt);
            }
        });
        jPanel1.add(cn);
        cn.setBounds(430, 150, 40, 30);

        mc.setEditable(false);
        mc.setRequestFocusEnabled(false);
        mc.setVerifyInputWhenFocusTarget(false);
        mc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mcActionPerformed(evt);
            }
        });
        jPanel1.add(mc);
        mc.setBounds(430, 110, 40, 30);

        sdp.setEditable(false);
        sdp.setFocusable(false);
        sdp.setRequestFocusEnabled(false);
        sdp.setVerifyInputWhenFocusTarget(false);
        sdp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sdpActionPerformed(evt);
            }
        });
        jPanel1.add(sdp);
        sdp.setBounds(430, 190, 40, 30);

        sdpl.setEditable(false);
        sdpl.setFocusable(false);
        sdpl.setRequestFocusEnabled(false);
        sdpl.setVerifyInputWhenFocusTarget(false);
        sdpl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sdplActionPerformed(evt);
            }
        });
        jPanel1.add(sdpl);
        sdpl.setBounds(430, 270, 40, 30);

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
        percentage1.setBounds(770, 280, 110, 50);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("GRADE POINTS :");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(487, 230, 280, 30);

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

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SEM6NEW.png"))); // NOI18N
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

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SEM6NEW.png"))); // NOI18N
        jPanel1.add(jLabel16);
        jLabel16.setBounds(0, 0, 1240, 510);

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

    private void cnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cnActionPerformed

    private void mcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mcActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mcActionPerformed

    private void sdpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sdpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sdpActionPerformed

    private void sdplActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sdplActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sdplActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        // TODO add your handling code here:
         if(mc1.getText().isEmpty()||cn1.getText().isEmpty()||sdp1.getText().isEmpty()||mcl1.getText().isEmpty()||sdpl1.getText().isEmpty()||ps1.getText().isEmpty()||st1.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Please Fill Grades correctly");
      }
      else{
        if(value == 1){
             String mcH, cnH, sdpH, sdplH, mplH, mclH, stH, psH, sem1t3H, sem1t4H, sem1t5H;
        float average;
       float totalmark;
       float totalmark2;
       double percentage;
        float cgpa;
         float cgpa2;
        
        mcH = mc.getText();
       cnH = cn.getText();
        sdpH = sdp.getText();
    
     

      
        sdplH = sdpl.getText();
    psH = ps.getText();
    
    stH = st.getText();
        mclH = mcl.getText();
   
        sem1t3H = sem1t3.getText();
        sem1t4H = sem1t4.getText();
        sem1t5H = sem1t5.getText();
   
        
        float mcgrade =Float.parseFloat(mcH);
        float cngrade = Float.parseFloat(cnH);
        float sdpgrade = Float.parseFloat(sdpH);
    
      
     
      float sdplgrade = Float.parseFloat(sdplH);
        float psgrade = Float.parseFloat(psH);
        float stgrade = Float.parseFloat(stH);
        float mclgrade = Float.parseFloat(mclH);
      

        float sem1t3grade = Float.parseFloat(sem1t3H);
        float sem1t4grade = Float.parseFloat(sem1t4H);
          float sem1t5grade = Float.parseFloat(sem1t5H);
        totalmark = ((mcgrade*5) + (cngrade*4) + (sdpgrade*5) + (sdplgrade*3) + (psgrade*10) + (stgrade*5) + (mclgrade*3));
       
        cgpa = (((mcgrade*5) + (cngrade*4) + (sdpgrade*5) + (sdplgrade*3) + (psgrade*10) + (stgrade*5) + (mclgrade*3)) / 35);
         percentage = (cgpa*9.5);
  totalmark2 = ( totalmark + sem1t3grade + sem1t4grade + sem1t5grade);
  cgpa2 = (totalmark2 / 120);
   double rounded = Math.round(cgpa2*100)/100.0;
   
         double rounded2 = Math.round(percentage*100)/100.0;
        Cgpa.setText(rounded+"");
        String cgpA=Cgpa.getText();
        total.setText(totalmark+"");
        percentage1.setText(rounded2+"");
            
      perc.setVisible(false);
       try{
                            Connection con=Database.connect();

                String sql="UPDATE tbl_main SET tot_cgpal=('"+cgpA+"') WHERE username='"+Login.username+"'";
                System.out.println(sql);
                Statement stmt=con.createStatement();
                int rs = stmt.executeUpdate(sql);

            }
            catch(Exception e)
            {
                System.out.println("error" + e);
            }
                     String sem1tot = total.getText();
        System.out.println(sem1tot);
   try{
                            Connection con=Database.connect();

                String sql="UPDATE tbl_main SET sem6_pl=('"+sem1tot+"') WHERE username='"+Login.username+"'";
                System.out.println(sql);
                Statement stmt=con.createStatement();
                int rs = stmt.executeUpdate(sql);

            }
            catch(Exception e)
            {
                System.out.println("error" + e);
            }
        int j = (int) cgpa2;
     
   
        progress.setValue(j);  
     
   
        progress.setValue(j);
    
       
    try{
                            Connection con=Database.connect();

                String sql="UPDATE tbl_main SET tot_pl = sem3_pl+sem4_pl+sem5_pl+sem6_pl where username='"+Login.username+"'";
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
            String mcH, cnH, sdpH, sdplH, mplH, mclH, sem1tH, stH, psH, sem1t2H, sem1t3H, sem1t4H, sem1t5H;
        float average;
       float totalmark;
       float totalmark2;
       double percentage;
        float cgpa;
         float cgpa2;
        
        mcH = mc.getText();
       cnH = cn.getText();
        sdpH = sdp.getText();
    
     

      
        sdplH = sdpl.getText();
    psH = ps.getText();
    
    stH = st.getText();
        mclH = mcl.getText();
        sem1t2H = sem1t2.getText();
        sem1t3H = sem1t3.getText();
        sem1t4H = sem1t4.getText();
        sem1t5H = sem1t5.getText();
        sem1tH = sem1t1.getText();
        
        float mcgrade =Float.parseFloat(mcH);
        float cngrade = Float.parseFloat(cnH);
        float sdpgrade = Float.parseFloat(sdpH);
    
      
     
      float sdplgrade = Float.parseFloat(sdplH);
        float psgrade = Float.parseFloat(psH);
        float stgrade = Float.parseFloat(stH);
        float mclgrade = Float.parseFloat(mclH);
      
        float sem1tgrade = Float.parseFloat(sem1tH);
        float sem1t2grade = Float.parseFloat(sem1t2H);
        float sem1t3grade = Float.parseFloat(sem1t3H);
        float sem1t4grade = Float.parseFloat(sem1t4H);
          float sem1t5grade = Float.parseFloat(sem1t5H);
        totalmark = ((mcgrade*5) + (cngrade*4) + (sdpgrade*5) + (sdplgrade*3) + (psgrade*10) + (stgrade*5) + (mclgrade*3));
       
        cgpa = (((mcgrade*5) + (cngrade*4) + (sdpgrade*5) + (sdplgrade*3) + (psgrade*10) + (stgrade*5) + (mclgrade*3)) / 35);
         percentage = (cgpa*9.5);
  totalmark2 = (sem1tgrade + totalmark + sem1t2grade + sem1t3grade + sem1t4grade + sem1t5grade);
  cgpa2 = (totalmark2 / 175);
  double rounded = Math.round(cgpa2*100)/100.0;
   double rgpa = Math.round(cgpa*100)/100.0;
         double rounded2 = Math.round(percentage*100)/100.0;
        Cgpa.setText(rounded+"");
 
        total.setText(totalmark+"");
        percentage1.setText(rounded2+"");
            
             perc.setVisible(false);
            int j = (int) cgpa2;
     
   
        progress.setValue(j);
        
                     String sem1tot = total.getText();
        System.out.println(sem1tot);
   try{
                            Connection con=Database.connect();

                String sql="UPDATE tbl_main SET sem6_p=('"+sem1tot+"') WHERE username='"+Login.username+"'";
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

                String sql="UPDATE tbl_main SET tot_p = sem1_p+sem2_p+sem3_p+sem4_p+sem5_p+sem6_p where username='"+Login.username+"'";
                System.out.println(sql);
                Statement stmt=con.createStatement();
                int rs = stmt.executeUpdate(sql);

            }
            catch(Exception e)
            {
                System.out.println("error" + e);
            }
   String cgpA = Cgpa.getText();
        System.out.println(cgpA);
    try{
                            Connection con=Database.connect();

                String sql="UPDATE tbl_main SET tot_cgpal=('"+cgpA+"') WHERE username='"+Login.username+"'";
                System.out.println(sql);
                Statement stmt=con.createStatement();
                int rs = stmt.executeUpdate(sql);

            }
            catch(Exception e)
            {
                System.out.println("error" + e);
            }
    }
         }
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void psActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_psActionPerformed
        // TODO add your handlig code here:
    }//GEN-LAST:event_psActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void sem1t2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sem1t2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sem1t2ActionPerformed

    private void mclActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mclActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mclActionPerformed

    private void sem1t3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sem1t3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sem1t3ActionPerformed

    private void sem1t4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sem1t4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sem1t4ActionPerformed

    private void sem1t5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sem1t5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sem1t5ActionPerformed

    private void sem1t1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sem1t1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sem1t1ActionPerformed

    private void jLabel21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MouseClicked
        // TODO add your handling code here:
        dashboard p=new dashboard();
        p.setVisible(true);
          dispose();
    }//GEN-LAST:event_jLabel21MouseClicked

    private void mc1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mc1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mc1ActionPerformed

    private void mcl1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mcl1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mcl1ActionPerformed

    private void cn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cn1ActionPerformed

    private void ps1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ps1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ps1ActionPerformed

    private void sdpl1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sdpl1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sdpl1ActionPerformed

    private void sdp1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sdp1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sdp1ActionPerformed

    private void mc1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_mc1FocusLost
        // TODO add your handling code here:
     
    }//GEN-LAST:event_mc1FocusLost

    private void cn1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cn1FocusLost
        // TODO add your handling code here:
       
    }//GEN-LAST:event_cn1FocusLost

    private void sdp1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_sdp1FocusLost
        // TODO add your handling code here:
    
    }//GEN-LAST:event_sdp1FocusLost

    private void mcl1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_mcl1FocusLost
        // TODO add your handling code here:
   
    }//GEN-LAST:event_mcl1FocusLost

    private void sdpl1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_sdpl1FocusLost
        // TODO add your handling code here:
     
    }//GEN-LAST:event_sdpl1FocusLost

    private void ps1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ps1FocusLost
        // TODO add your handling code here:
      
    }//GEN-LAST:event_ps1FocusLost

    private void mc1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mc1KeyReleased
        // TODO add your handling code here:
                                                   String i;
        i=mc1.getText();
        
        if("S".equals(i) || "s".equals(i)){
           
           mc.setText("10");
        }
      else if("A".equals(i)||"a".equals(i)){
            
           mc.setText("9");
        }
               else if("B".equals(i)||"b".equals(i)){
            
           mc.setText("8");
        }
                   else if("C".equals(i) ||"c".equals(i)){
            
           mc.setText("7");
        }
                       else if("D".equals(i)||"d".equals(i)){
            
           mc.setText("6");
        }
                           else if("E".equals(i)||"e".equals(i)){
            
           mc.setText("5");
        }
                           else if("F".equals(i)||"f".equals(i)){
          
           mc.setText("0");
        }else{
                                    
                                    
                               }
        cn1.requestFocusInWindow();
    }//GEN-LAST:event_mc1KeyReleased

    private void cn1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cn1KeyReleased
        // TODO add your handling code here:
                                                 String i;
        i=cn1.getText();
        
        if("S".equals(i) || "s".equals(i)){
           
           cn.setText("10");
        }
      else if("A".equals(i)||"a".equals(i)){
            
           cn.setText("9");
        }
               else if("B".equals(i)||"b".equals(i)){
            
           cn.setText("8");
        }
                   else if("C".equals(i) ||"c".equals(i)){
            
           cn.setText("7");
        }
                       else if("D".equals(i)||"d".equals(i)){
            
           cn.setText("6");
        }
                           else if("E".equals(i)||"e".equals(i)){
            
           cn.setText("5");
        }
                               else if("F".equals(i)||"f".equals(i)){
          
           cn.setText("0");
        }else{
                                    
                               }
        sdp1.requestFocusInWindow();
    }//GEN-LAST:event_cn1KeyReleased

    private void sdp1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sdp1KeyReleased
        // TODO add your handling code here:
                                                    String i;
        i=sdp1.getText();
        
        if("S".equals(i) || "s".equals(i)){
           
           sdp.setText("10");
        }
      else if("A".equals(i)||"a".equals(i)){
            
           sdp.setText("9");
        }
               else if("B".equals(i)||"b".equals(i)){
            
           sdp.setText("8");
        }
                   else if("C".equals(i) ||"c".equals(i)){
            
           sdp.setText("7");
        }
                       else if("D".equals(i)||"d".equals(i)){
            
           sdp.setText("6");
        }
                           else if("E".equals(i)||"e".equals(i)){
            
           sdp.setText("5");
        }
                               else if("F".equals(i)||"f".equals(i)){
          
           sdp.setText("0");
        }else{
                                    
                               }
      mcl1.requestFocusInWindow();
    }//GEN-LAST:event_sdp1KeyReleased

    private void mcl1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mcl1KeyReleased
        // TODO add your handling code here:
                                                     String i;
        i=mcl1.getText();
        
        if("S".equals(i) || "s".equals(i)){
           
           mcl.setText("10");
        }
      else if("A".equals(i)||"a".equals(i)){
            
           mcl.setText("9");
        }
               else if("B".equals(i)||"b".equals(i)){
            
           mcl.setText("8");
        }
                   else if("C".equals(i) ||"c".equals(i)){
            
           mcl.setText("7");
        }
                       else if("D".equals(i)||"d".equals(i)){
            
           mcl.setText("6");
        }
                           else if("E".equals(i)||"e".equals(i)){
            
           mcl.setText("5");
        }
                               else if("F".equals(i)||"f".equals(i)){
          
           mcl.setText("0");
        }else{
                                    
                               }
       sdpl1.requestFocusInWindow();
    }//GEN-LAST:event_mcl1KeyReleased

    private void sdpl1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sdpl1KeyReleased
        // TODO add your handling code here:
                                                   String i;
        i=sdpl1.getText();
        
        if("S".equals(i) || "s".equals(i)){
           
           sdpl.setText("10");
        }
      else if("A".equals(i)||"a".equals(i)){
            
           sdpl.setText("9");
        }
               else if("B".equals(i)||"b".equals(i)){
            
           sdpl.setText("8");
        }
                   else if("C".equals(i) ||"c".equals(i)){
            
           sdpl.setText("7");
        }
                       else if("D".equals(i)||"d".equals(i)){
            
           sdpl.setText("6");
        }
                           else if("E".equals(i)||"e".equals(i)){
            
           sdpl.setText("5");
        }
                               else if("F".equals(i)||"f".equals(i)){
          
           sdpl.setText("0");
        }else{
                                    
                               }
       ps1.requestFocusInWindow();
    }//GEN-LAST:event_sdpl1KeyReleased

    private void ps1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ps1KeyReleased
        // TODO add your handling code here:
                                                  String i;
        i=ps1.getText();
        
        if("S".equals(i) || "s".equals(i)){
           
           ps.setText("10");
        }
      else if("A".equals(i)||"a".equals(i)){
            
           ps.setText("9");
        }
               else if("B".equals(i)||"b".equals(i)){
            
           ps.setText("8");
        }
                   else if("C".equals(i) ||"c".equals(i)){
            
           ps.setText("7");
        }
                       else if("D".equals(i)||"d".equals(i)){
            
           ps.setText("6");
        }
                           else if("E".equals(i)||"e".equals(i)){
            
           ps.setText("5");
        }
                               else if("F".equals(i)||"f".equals(i)){
          
           ps.setText("0");
        }else{
                                    
                               }
        st1.requestFocusInWindow();
    }//GEN-LAST:event_ps1KeyReleased

    private void st1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_st1FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_st1FocusLost

    private void st1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_st1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_st1ActionPerformed

    private void st1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_st1KeyReleased
        // TODO add your handling code here:
                                                String i;
        i=st1.getText();
        
        if("S".equals(i) || "s".equals(i)){
           
           st.setText("10");
        }
      else if("A".equals(i)||"a".equals(i)){
            
           st.setText("9");
        }
               else if("B".equals(i)||"b".equals(i)){
            
           st.setText("8");
        }
                   else if("C".equals(i) ||"c".equals(i)){
            
           st.setText("7");
        }
                       else if("D".equals(i)||"d".equals(i)){
            
           st.setText("6");
        }
                           else if("E".equals(i)||"e".equals(i)){
            
           st.setText("5");
        }
                               else if("F".equals(i)||"f".equals(i)){
          
           st.setText("0");
        }else{
                                    
                               }
     jToggleButton1.requestFocusInWindow();
    }//GEN-LAST:event_st1KeyReleased

    private void stActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_stActionPerformed

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
                new sem6().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Cgpa;
    private javax.swing.JTextField cn;
    private javax.swing.JTextField cn1;
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
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JButton jToggleButton1;
    private javax.swing.JTextField mc;
    private javax.swing.JTextField mc1;
    private javax.swing.JTextField mcl;
    private javax.swing.JTextField mcl1;
    private javax.swing.JLabel perc;
    private javax.swing.JLabel percentage1;
    private javax.swing.JProgressBar progress;
    private javax.swing.JTextField ps;
    private javax.swing.JTextField ps1;
    private javax.swing.JTextField sdp;
    private javax.swing.JTextField sdp1;
    private javax.swing.JTextField sdpl;
    private javax.swing.JTextField sdpl1;
    private javax.swing.JTextField sem1t1;
    private javax.swing.JTextField sem1t2;
    private javax.swing.JLabel sem1t2l;
    private javax.swing.JTextField sem1t3;
    private javax.swing.JTextField sem1t4;
    private javax.swing.JTextField sem1t5;
    private javax.swing.JLabel sem1tl;
    private javax.swing.JTextField st;
    private javax.swing.JTextField st1;
    private javax.swing.JLabel total;
    // End of variables declaration//GEN-END:variables
}
