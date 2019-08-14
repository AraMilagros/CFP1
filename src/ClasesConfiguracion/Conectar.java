/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesConfiguracion;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
/**
 *
 * @author usuario
 */
public class Conectar {
     public static  String servidor = "jdbc:mysql://localhost/DatosCFP?useSSL=false";
     public static  String usuario = "root";
     public static String pass = "root";
   
  // String servidor="jdbc:mysql://localhost/probar?autoReconnect=true&useSSL=false";//+"?useTimezone=true&serverTimezone=UTC";
  public static Connection conexion()
   {
      Connection conexion=null;
       try
       {
         conexion = (Connection) DriverManager.getConnection(servidor, usuario, pass);
       }
       catch(Exception ex)
       {
            JOptionPane.showMessageDialog(null, ex.getMessage());

       }
          return conexion;
  }
}
