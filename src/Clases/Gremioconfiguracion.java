/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;
import java.sql.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.DefaultListModel;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;
import javax.swing.JOptionPane;
/**
 *
 * @author Ricardo
 */
public class Gremioconfiguracion {
    Connection conexion = null;
    private int idGremio;
    private String detalle;
    public int getIdGremio() {
        return idGremio;
    }
    public void setIdGremio(int idGremio) {
        this.idGremio = idGremio;
    }
    public String getDetalle() {
        return detalle;
    }
    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }
    @Override
    public String toString(){
        return detalle;
    }
     public static void CrearGremio(Connection conexion,String detalle) throws Exception{//Este metodo es para crear un gremio
        java.sql.PreparedStatement ps = conexion.prepareStatement("INSERT INTO gremio (detalle) Values (?)");
        ps.setString(1,detalle);
        try {
          ps.execute();
          JOptionPane.showMessageDialog(null, "CARGA EXITOSA");
        }
        catch(SQLException ex)
        {
           JOptionPane.showMessageDialog(null, "NO SE PUDO CREAR EL GREMIO");
        }
    } 
      public static void ModificarGremio(Connection conexion,String detalle,int idGremio) throws Exception{//Este metodo es para modificar un gremio
        java.sql.PreparedStatement ps = conexion.prepareStatement("UPDATE gremio SET  detalle = ? WHERE idGremio = ?");
        ps.setString(1,detalle);
        ps.setInt(2, idGremio);  
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
    public static void EliminarGremio(Connection conexion,int idGremio) throws Exception{//Este metodo es para eliminar un gremio
        PreparedStatement  ps =  (PreparedStatement) conexion.prepareStatement("DELETE FROM gremio WHERE idGremio = ? ");
        ps.setInt(1, idGremio);  
        try{
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
    public void BuscarGremio(Connection conexion,JList lista,String detalle){//Este metodo es para buscar un gremio
        DefaultListModel<String> modelo =new  DefaultListModel<String>();
        try {
            Statement st = (Statement) conexion.createStatement();
            ResultSet rs = st.executeQuery("select detalle from gremio where detalle like '%"+detalle+"%' ");
                while (rs.next()){
                modelo.addElement(rs.getString("detalle"));
                }
                lista.setModel(modelo);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "NO SE PUDO BUSCAR EL GREMIO");
        }                 
 }
      public void Llenarcombo(Connection conexion,JComboBox<Gremioconfiguracion> comboGremio){//Este metodo es para llenar un combo con los gremios a que pertenecen los empleados
        try {
            Statement st = (Statement) conexion.createStatement();
            ResultSet rs = st.executeQuery("select idGremio,detalle from gremio ORDER BY detalle ASC ");
            Gremioconfiguracion dat= new Gremioconfiguracion();
            dat.setIdGremio(0);
            dat.setDetalle("Seleccionar Gremio");
            comboGremio.addItem(dat);
                while(rs.next()){
                    dat= new Gremioconfiguracion(); 
                    dat.setIdGremio( rs.getInt("idGremio"));
                    dat.setDetalle( rs.getString("detalle"));
                    comboGremio.addItem(dat);            
                }
        } catch (SQLException ex) { 
            JOptionPane.showMessageDialog(null, "ERROR AL MOSTRAR LOS GREMIOS");
        }
    }
    public void  llenarlista(Connection conexion,JList lista){//Este metodo es para llenar una lista con los gremios a que pertenecen los empleados
     DefaultListModel<String> modelo =new  DefaultListModel<String>();
      try {
            Statement st = (Statement) conexion.createStatement();
            ResultSet rs = st.executeQuery("select detalle from gremio ");
                while (rs.next()){  
                  modelo.addElement(rs.getString("detalle"));
                }
                lista.setModel(modelo); 
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "NO SE PUDO CARGAR LA LISTA");
        }
 } 
  public void Llenartabla(Connection conexion,JTable tabla){//Este metodo es para llenar una tabla con los gremios a que pertenecen los empleados
        String sql="select detalle from gremio";
        Statement st;
        DefaultTableModel modelo =new DefaultTableModel();
        modelo.addColumn("Gremio");
        tabla.setModel(modelo);
        String[] datos= new String[1];
        try{
        st=(Statement) conexion.createStatement();
        ResultSet rs=st.executeQuery(sql);
            while(rs.next()){
            datos[0]=rs.getString(1);
             modelo.addRow(datos);
            }
             tabla.setModel(modelo);
         }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null, "Error al cargar la tabla");   
        }
   }
}
