package clases;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.DriverManager;


public class Conectar {
      
    public static Connection conexion = null;
    public static final String SERVIDOR="jdbc:mysql://localhost:3306/DatosCFP?useSSL=false";
    public static final String USUARIO = "root";
    public static final String PASS = "root";
    
    
      
      
    public static Connection conexion(){ 
    
        try {
                Class.forName("com.mysql.jdbc.Driver");
                conexion = (Connection) DriverManager.getConnection(SERVIDOR, USUARIO, PASS);
                if (conexion!=null) {
                    //JOptionPane.showMessageDialog(null, "hola :v");
                }
   
            } catch(ClassNotFoundException | HeadlessException | SQLException ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }
                
        return conexion;
                
   }
}
