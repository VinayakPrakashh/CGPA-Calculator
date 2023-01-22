
import java.sql.*;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class Database {

    public static Connection connect() {
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://db4free.net:3306/db_cgpa1234", "root12345678", "12345678");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Connection Failed, make sure you are Connected to Internet");
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Database Not Connected");
            java.util.logging.Logger.getLogger(Database.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        return con;
    }
}
