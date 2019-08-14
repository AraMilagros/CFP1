/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesConfiguracion;
import java.sql.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;
import javax.swing.JOptionPane;
/**
 *
 * @author Ricardo
 */
public class CodigoPostalconfiguracion {
    Connection conexion = null;
    private int idCodigoPostal;
    private int localidad;
    private String codigoPostal;
    
     public int getIdCodigoPostal() {
        return idCodigoPostal;
    }
    public void setIdCodigoPostal(int idCodigoPostal) {
        this.idCodigoPostal = idCodigoPostal;
    }
     public int getLocalidad() {
        return localidad;
    }
    public void setLocalidad(int localidad) {
        this.localidad = localidad;
    }
    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    @Override
    public String toString() {
        return this.codigoPostal;
    } 
     public static void CrearCodigoPostal(Connection conexion,int localidad, String codigoPostal) throws Exception{//Este metodo es para crear un CODIGO POSTAL
         java.sql.PreparedStatement ps = conexion.prepareStatement("INSERT INTO codigopostal (localidad,codigoPostal) Values (?,?)");
         ps.setInt(1, localidad);
         ps.setString(2,codigoPostal);
       
        try
        {
           ps.execute();
           JOptionPane.showMessageDialog(null, "CARGA EXITOSA");
        }
        catch(SQLException ex)
        {
           JOptionPane.showMessageDialog(null, "NO SE PUDO CREAR EL CODIGO POSTAL");
        }
    }
     public static void ModificarCodigoPostal(Connection conexion,int localidad, String codigoPostal,int idCodigoPostal) throws Exception{//Este metodo es para modificar un CODIGO POSTAL
         java.sql.PreparedStatement ps = conexion.prepareStatement("UPDATE codigopostal SET  localidad = ?, codigoPostal= ? WHERE idCodigoPostal = ?");
         ps.setInt(1, localidad);
         ps.setString(2, codigoPostal);
         ps.setInt(3, idCodigoPostal);
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
     public static void EliminarCodigoPostal(Connection conexion,int idCodigoPostal) throws Exception{//Este metodo es para eliminar un CODIGO POSTAL
        PreparedStatement  ps =  (PreparedStatement) conexion.prepareStatement("DELETE FROM codigopostal WHERE idCodigoPostal = ? ");
        ps.setInt(1, idCodigoPostal);  
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
      public void Llenartabla(Connection conexion,JTable tabla){//Este metodo es para llenar la tabla con los codigos postales y su localidad cargados de la base de datos
        String sql="SELECT lugar.nombre,codigopostal.codigoPostal FROM codigopostal INNER JOIN lugar ON codigopostal.localidad = lugar.idLugar where lugar.nivel=3 ";
        Statement st;
        DefaultTableModel modelo =new DefaultTableModel();
        modelo.addColumn("Localidad");
        modelo.addColumn("Codigo Postal");
        tabla.setModel(modelo);
        String[] datos= new String[2];
        try{
         st=(Statement) conexion.createStatement();
         ResultSet rs=st.executeQuery(sql);
            while(rs.next()){
            datos[0]=rs.getString(1);
            datos[1]=rs.getString(2);
            modelo.addRow(datos);
            }
            tabla.setModel(modelo);
         }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null, "ERROR AL CARGAR LA TABLA CON LOS CODIGOS POSTALES");  
        }
   }
      
     public Vector<CodigoPostalconfiguracion> mostrarCodigoPostal(Connection conexion,int idLugar) {//Este metodo es para llenar el combo con los codigos postales dependiendo de la localidad que selecione el usuario
        PreparedStatement ps = null;
        ResultSet rs = null;
        Vector<CodigoPostalconfiguracion> datos = new Vector<CodigoPostalconfiguracion>();
        Lugarconfiguracion dat = null;
        try {
            String sql = "SELECT * FROM codigopostal WHERE localidad=" + idLugar;
            ps = conexion.prepareStatement(sql);
            rs = ps.executeQuery();
            CodigoPostalconfiguracion  da = new CodigoPostalconfiguracion();
            da.setIdCodigoPostal(0);
            da.setCodigoPostal("Seleccionar Codigo Postal");
            datos.add(da);
                while (rs.next()) {
                    da = new CodigoPostalconfiguracion();
                    da.setIdCodigoPostal(rs.getInt("idCodigoPostal"));
                    da.setCodigoPostal(rs.getString("codigoPostal"));
                    datos.add(da);
                }
                rs.close();
        } catch (SQLException ex) {
            System.err.println("Error consulta :" + ex.getMessage());
        }
        return datos;
    }
      public void   llenarlista(Connection conexion,JList lista,int idLugar){//Este metodo es para llenar la lista con los codigos postales dependiendo de la localidad que selecione el usuario
       DefaultListModel<String> modelo =new  DefaultListModel<String>();
      
       try {
            Statement st = (Statement) conexion.createStatement();
            ResultSet rs = st.executeQuery( "SELECT * FROM codigoPostal WHERE localidad=" + idLugar);
                while (rs.next()){ 
                  modelo.addElement(rs.getString("codigoPostal"));
                }
                lista.setModel(modelo);
           
        } catch (SQLException ex) {
           
            JOptionPane.showMessageDialog(null, "NO SE PUDO CARGAR LA LISTA");
        }
 } 
}
