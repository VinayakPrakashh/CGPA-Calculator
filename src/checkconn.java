/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ACER
 */
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class checkconn {
    public static void checkConnection() {
        try {
    Connection con = Database.connect();
    String sql = "SELECT 1";
    Statement stmt = con.createStatement();
    ResultSet rs = stmt.executeQuery(sql);
    if (rs.next()) {
        JOptionPane.showMessageDialog(null, "Database Connected");
    }
} catch (Exception e) {
    JOptionPane.showMessageDialog(null, "Error connecting to the database: " + e.getMessage());
}
    }
}
