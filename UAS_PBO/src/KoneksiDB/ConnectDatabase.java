
package KoneksiDB;

import java.sql.*;
import javax.swing.JOptionPane;

public class ConnectDatabase {
    Connection CN;
    
    public static Connection OpenConn(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection CN = DriverManager.getConnection("jdbc:mysql://localhost/dbmahasiswa", "root", "");
            return CN;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e);
            return null;
        }
    }
}
