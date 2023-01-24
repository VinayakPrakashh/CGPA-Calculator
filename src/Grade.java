
import java.awt.TextField;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JTextField;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ACER
 */
public class Grade {
public static void setSemesterGrade(String semColumnName, JTextField semTextField) {
    try {
        Connection con = Database.connect();
        String sql = "SELECT " + semColumnName + " FROM tbl_main WHERE username='" + Login.username + "'";
        System.out.println(sql);
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(sql);
        if (rs.next()) {
            int id = rs.getInt(semColumnName);
            String s = String.valueOf(id);
            semTextField.setText(s);
        }
    } catch (Exception e) {
        System.out.println("error" + e);
    }
}

}
