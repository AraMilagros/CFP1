/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;
import java.sql.*;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;
/**
 *
 * @author Ricardo
 */
public class Domicilioconfiguracion {
    Connection conexion = null;
    
    public static void CrearDomicilio(Connection conexion,int nro,String telefono,int idLugar,int idEdificio) throws Exception
    {
        java.sql.PreparedStatement ps = conexion.prepareStatement("INSERT INTO domicilio (nro,telefono,idLugar,idEdificio) Values (?,?,?,?)");
        ps.setInt(1, nro);
        ps.setString(1, telefono);
        ps.setInt(3, idLugar);
        ps.setInt(4, idEdificio);
        try
        {
          ps.execute();
          JOptionPane.showMessageDialog(null, "CARGA EXITOSA");
        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null, "NO SE PUDO CREAR EL Domicilio");
        }
    }
     public static void ModificarDomicilio(Connection conexion,int nro,String telefono,int idLugar,int idEdificio,int idDomicilio) throws Exception
    {
        java.sql.PreparedStatement ps = conexion.prepareStatement("UPDATE domicilio SET  nro = ?, telefono = ?,idLugar = ?,idEdificio = ? WHERE idDomicilio = ?");
        ps.setInt(1, nro);
        ps.setString(1, telefono);
        ps.setInt(3, idLugar);
        ps.setInt(4, idEdificio);
        ps.setInt(5, idDomicilio);
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
     public static void EliminarDomicilio(Connection conexion,int idDomicilio) throws Exception
    {
        PreparedStatement  ps =  (PreparedStatement) conexion.prepareStatement("DELETE FROM domicilio WHERE idDomicilio = ? ");
        ps.setInt(1, idDomicilio);  
        
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
