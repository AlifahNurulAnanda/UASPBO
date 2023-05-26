package koneksi;
import java.sql.*;
import javax.swing.JOptionPane;

public class koneksi {
    Connection con;
    public static Connection connect(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/karyawan", "root", "");
            return con;
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
}
}