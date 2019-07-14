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
public class EmpleadoLicenciaconfiguracion {
   Connection conexion = null;
  public static void CrearEmpleadoLicencia(Connection conexion,java.util.Date inicio,java.util.Date fin,int idEmpleado,int idLicencia) throws Exception
    {
         java.sql.PreparedStatement ps = conexion.prepareStatement("INSERT INTO empleadolicencia (inicio,fin,idEmpleado,idLicencia) Values (?,?,?,?)");
         SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
         String date = sdf.format(inicio.getDate());
         ps.setString(1, date);
         SimpleDateFormat sd = new SimpleDateFormat("yyyy-mm-dd");
         String date2 = sd.format(fin.getDate());
         ps.setString(2, date2);
         ps.setInt(3, idEmpleado);
         ps.setInt(4, idLicencia);
        try
        {
           ps.execute();
           
          JOptionPane.showMessageDialog(null, "CARGA EXITOSA");
        }
        catch(SQLException ex)
        {
           
            JOptionPane.showMessageDialog(null, "NO SE PUDO CREAR ASIGNAR LA LICENCIA AL EMPLEADO");
        }
    }
     public static void ModificarEmpleadoLicencia(Connection conexion,java.util.Date inicio,java.util.Date fin,int idEmpleado,int idLicencia,int idLicenciaEmpleado) throws Exception
    {
         java.sql.PreparedStatement ps = conexion.prepareStatement("UPDATE empleadolicencia SET  inicio = ?, fin = ?,idEmpleado = ?,idLicencia = ? WHERE idLicenciaEmpleado = ?");
          SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
         String date = sdf.format(inicio.getDate());
         ps.setString(1, date);
         SimpleDateFormat sd = new SimpleDateFormat("yyyy-mm-dd");
         String date2 = sd.format(fin.getDate());
         ps.setString(2, date2);
         ps.setInt(3, idEmpleado);
         ps.setInt(4, idLicencia);
         ps.setInt(5, idLicenciaEmpleado);
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
     public static void EliminarEmpleadoLicencia(Connection conexion,int idLicenciaEmpleado) throws Exception
    {
        PreparedStatement  ps =  (PreparedStatement) conexion.prepareStatement("DELETE FROM empleadolicencia WHERE idLicenciaEmpleado = ? ");
       ps.setInt(1, idLicenciaEmpleado);
        
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
