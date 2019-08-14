/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesConfiguracion;
import java.sql.*;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author Ricardo
 */
public class Edificioconfiguracion {
  Connection conexion = null;
  public static void CrearEdificio(Connection conexion,int torre,int piso,int depto) throws Exception
    {
         java.sql.PreparedStatement ps = conexion.prepareStatement("INSERT INTO edificio (torre,piso,depto) Values (?,?,?)");
        ps.setInt(1, torre);
        ps.setInt(2, piso);
        ps.setInt(3, depto);
        try
        {
          ps.execute();
          JOptionPane.showMessageDialog(null, "CARGA EXITOSA");
        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null, "NO SE PUDO CREAR EL EDIFICIO");
        }
    }
     public static void ModificarEdificio(Connection conexion,int torre,int piso,int depto,int idEdificio) throws Exception
    {
         java.sql.PreparedStatement ps = conexion.prepareStatement("UPDATE edificio SET  torre = ?, piso = ?,depto = ? WHERE idEdificio = ?");
        ps.setInt(1, torre);
        ps.setInt(2, piso);
        ps.setInt(3, depto);
        ps.setInt(4, idEdificio);
     
        
        try
        { 
          int ms= JOptionPane.showConfirmDialog(null, "Estas Seguro de Modificar ? ");  
           if(ms==JOptionPane.YES_OPTION){
           ps.execute();
           JOptionPane.showMessageDialog(null, "MODIFICACION EXITOSA");
          }else{
           JOptionPane.showMessageDialog(null, "SE CANCELO LA MODIFICACION");
          }  
        }
        catch(SQLException ex)
        {
          
            JOptionPane.showMessageDialog(null, "NO SE PUDO MODIFICAR");
        }
    }
     public static void EliminarEdificio(Connection conexion,int idEdificio) throws Exception
    {
        PreparedStatement  ps =  (PreparedStatement) conexion.prepareStatement("DELETE FROM edificio WHERE idEdificio = ? ");
        ps.setInt(1, idEdificio);  
        
          try
        {
          int ms=  JOptionPane.showConfirmDialog(null, "Estas Seguro de Eliminar ? ");
          if(ms==JOptionPane.YES_OPTION){
           ps.execute();
            JOptionPane.showMessageDialog(null, "ELIMINACION EXITOSA");
          }else{
           JOptionPane.showMessageDialog(null, "SE CANCELO LA ELIMINACION");
          } 
        }   catch(SQLException ex)
        {
           
            JOptionPane.showMessageDialog(null, "NO SE PUDO ELIMINAR");
        } 
    }
}
