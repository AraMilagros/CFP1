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
public class Periodicidadconfiguracion {
    Connection conexion = null;
    private int idPeriodicidad;
    private String detalle;
  
    public int getIdPeriodicidad() {
        return idPeriodicidad;
    }
    public void setIdPeriodicidad(int idPeriodicidad) {
        this.idPeriodicidad= idPeriodicidad;
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
     public static void CrearPeriodicidad(Connection conexion,String detalle) throws Exception {//este metodo es para crear una periodicidad 
        java.sql.PreparedStatement ps = conexion.prepareStatement("INSERT INTO periodicidad (detalle) Values (?)");
        ps.setString(1,detalle);
        try{
           ps.execute(); 
           JOptionPane.showMessageDialog(null, "CARGA EXITOSA");
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "NO SE PUDO CARGAR");
        }
    }
    public static void ModificarPeriodicidad(Connection conexion,String detalle,int idPeriodicidad) throws Exception {//este metodo es para modificar una periodicidad 
        java.sql.PreparedStatement ps = conexion.prepareStatement("UPDATE periodicidad SET  detalle = ? WHERE idPeriodicidad = ?");
        ps.setString(1,detalle);
        ps.setInt(2, idPeriodicidad);  
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
     public static void EliminarPeriodicidad(Connection conexion,int idPeriodicidad) throws Exception {//este metodo es para eliminar una periodicidad 
        PreparedStatement  ps =  (PreparedStatement) conexion.prepareStatement("DELETE FROM periodicidad WHERE idPeriodicidad = ? ");
        ps.setInt(1, idPeriodicidad);  
        try {
            int ms=  JOptionPane.showConfirmDialog(null, "Estas Seguro de Eliminar ? ");
            if(ms==JOptionPane.YES_OPTION){
            ps.execute();
            JOptionPane.showMessageDialog(null, "ELIMINACION EXITOSA");
            }else{
             JOptionPane.showMessageDialog(null, "SE CANCELO LA ELIMINACION");
            } 
        }   catch(SQLException ex) {
            JOptionPane.showMessageDialog(null, "NO SE PUDO ELIMINAR");
        }
    }
    public void BuscarPeriodicidad(Connection conexion,JList lista,String detalle){//Este metodo es para buscar una periodicidad
        DefaultListModel<String> modelo =new  DefaultListModel<String>();
        try {
            Statement st = (Statement) conexion.createStatement();
            ResultSet rs = st.executeQuery("select detalle from periodicidad where detalle like '%"+detalle+"%' ");
                while (rs.next()){
                modelo.addElement(rs.getString("detalle"));
                }
                lista.setModel(modelo);
        } catch (SQLException ex) {
              
            JOptionPane.showMessageDialog(null, "Error al buscar");
        }                
    } 
     public void Llenarcombo(Connection conexion,JComboBox<Periodicidadconfiguracion> comboPeriodicidad){//Este metodo es para llenar un combo con las periodicidades
        try {
            Statement st = (Statement) conexion.createStatement();
            ResultSet rs = st.executeQuery("select idPeriodicidad,detalle from periodicidad ORDER BY detalle ASC ");
            Periodicidadconfiguracion dat= new Periodicidadconfiguracion();
            dat.setIdPeriodicidad(0);
            dat.setDetalle("Seleccionar Periodicidad");
            comboPeriodicidad.addItem(dat);
                    while(rs.next()){
                        dat= new Periodicidadconfiguracion();
                        dat.setIdPeriodicidad(rs.getInt("idPeriodicidad"));
                        dat.setDetalle( rs.getString("detalle"));
                        comboPeriodicidad.addItem(dat);          
                    } 
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null, "ERROR AL CARGAR COMBO");
        }
    }
    public void  llenarlista(Connection conexion,JList lista){//Este metodo es para llenar una lista con las periodicidades
        DefaultListModel<String> modelo =new  DefaultListModel<String>();
        try {
            Statement st = (Statement) conexion.createStatement();
            ResultSet rs = st.executeQuery("select detalle from periodicidad ");
                while (rs.next()){  
                  modelo.addElement(rs.getString("detalle"));
                }
                lista.setModel(modelo);  
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "NO SE PUDO CARGAR LA LISTA");
        }
    } 
    public void Llenartabla(Connection conexion,JTable tabla){//Este metodo es para llenar una tabla con las periodicidades
        String sql="select detalle from periodicidad";
        Statement st;
        DefaultTableModel modelo =new DefaultTableModel();
        modelo.addColumn("Periodicidad");
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
        catch(SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al cargar la tabla "); 
        }
    }  
}
