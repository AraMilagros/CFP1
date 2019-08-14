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
public class Cursadoconfiguracion {
    Connection conexion = null;
    private int idLugarCurso;
    private String detalle;
    public int getIdLugarCurso() {
        return idLugarCurso;
    }
    public void setIdLugarCurso(int idLugarCurso) {
        this.idLugarCurso= idLugarCurso;
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
    public static void CrearLugarCurso(Connection conexion,String detalle) throws Exception{//Este metodo es para crear un lugar donde se cursara un curso
         java.sql.PreparedStatement ps = conexion.prepareStatement("INSERT INTO lugarCurso (detalle) Values (?)");
         ps.setString(1,detalle);
       try{
          ps.execute();
          JOptionPane.showMessageDialog(null, "CARGA EXITOSA");
        }
        catch(SQLException ex)
        {
          JOptionPane.showMessageDialog(null, "NO SE PUDO CREAR EL LUGAR DEL CURSO");
        }
    } 
    public static void ModificarLugarCurso(Connection conexion,String detalle,int idLugarCurso) throws Exception {//Este metodo es para modificar un lugar donde se cursara un curso
        java.sql.PreparedStatement ps = conexion.prepareStatement("UPDATE lugarCurso SET  detalle = ? WHERE idLugarCurso = ?");
        ps.setString(1,detalle);
        ps.setInt(2, idLugarCurso);  
        try { 
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
     public static void EliminarLugarCurso(Connection conexion,int idLugarCurso) throws Exception{//Este metodo es para eliminar un lugar donde se cursara un curso
        PreparedStatement  ps =  (PreparedStatement) conexion.prepareStatement("DELETE FROM lugarCurso WHERE idLugarCurso = ? ");
        ps.setInt(1, idLugarCurso);  
        try{
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
    public void BuscarLugarCurso(Connection conexion,JList lista,String detalle){//Este metodo es para buscar un lugar donde se cursara un curso
        DefaultListModel<String> modelo =new  DefaultListModel<String>();
        try {
            Statement st = (Statement) conexion.createStatement();
            ResultSet rs = st.executeQuery("select detalle from lugarCurso where detalle like '%"+detalle+"%' ");
                while (rs.next()){
                modelo.addElement(rs.getString("detalle"));
                }
                lista.setModel(modelo);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "NO SE PUDO BUSCAR EL LUGAR DEL CURSO");
        }                
   } 
    public void Llenarcombo(Connection conexion,JComboBox<Cursadoconfiguracion> comboCursado){//Este metodo es para llenar el combo con los lugares donde se cursaran los cursos
        try {
            Statement st = (Statement) conexion.createStatement();
            ResultSet rs = st.executeQuery("select idLugarCurso,detalle from lugarCurso ORDER BY detalle ASC ");
            Cursadoconfiguracion dat= new Cursadoconfiguracion();
            
            dat.setIdLugarCurso(0);
            dat.setDetalle("Seleccionar Lugar");
            comboCursado.addItem(dat);
            
            while(rs.next()){
                dat= new Cursadoconfiguracion();
                dat.setIdLugarCurso(rs.getInt("idLugarCurso"));
                dat.setDetalle(rs.getString("detalle"));
                comboCursado.addItem(dat);         
            }
            
           
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR AL MOSTRAR LOS LUGARES");
        }
    }
      public void  llenarlista(Connection conexion,JList lista){
    DefaultListModel<String> modelo =new  DefaultListModel<String>();
   
      try {
            Statement st = (Statement) conexion.createStatement();
            ResultSet rs = st.executeQuery("select detalle from lugarCurso ");
            while (rs.next()){  
              modelo.addElement(rs.getString("detalle"));
            }
            lista.setModel(modelo);
           
        } catch (SQLException ex) {
         
            JOptionPane.showMessageDialog(null, "NO SE PUDO CARGAR LA LISTA");
        }
    } 
    public void Llenartabla(Connection conexion,JTable tabla){//Este metodo es para llenar una tabla con los lugares donde se cursaran los cursos
        String sql="select detalle from lugarCurso";
        Statement st;
        DefaultTableModel modelo =new DefaultTableModel();
        modelo.addColumn("Lugar de Cursado");
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
