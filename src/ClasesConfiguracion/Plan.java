/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesConfiguracion;

import static clases.Conectar.conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Carlos Maraz
 */
public class Plan {

    
    PreparedStatement ps=null;
    ResultSet rs=null;
        
    private int idPlan;
    private String detalle;
    
    
    public Plan(int idPlan, String detalle) {
        this.idPlan = idPlan;
        this.detalle = detalle;
    }

    public Plan() {
    }

    public int getIdPlan() {
        return idPlan;
    }

    public void setIdPlan(int idPlan) {
        this.idPlan = idPlan;
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
    
    
     public static void CrearPlan (Connection con, String detalle) {
         
        try {  
          String sql = "INSERT INTO planes (detalle, borrado) VALUES (?,?)";
          PreparedStatement ps = con.prepareStatement(sql);
          ps.setString(1, detalle);
          ps.setBoolean(2, false);
          
          ps.execute();
          JOptionPane.showMessageDialog(null, "LA CARGA SE REALIZÓ CON ÉXITO");
        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null, "ERROR, NO SE PUDO CREAR EL PLAN");
        }
    }
     
     public static void ModificarPlan(Connection conexion,String detalle, int idPlan) {
         
        try { 
            String sql = "UPDATE planes SET  detalle = ? WHERE idPlanes =?" ;
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setString(1, detalle);
            ps.setInt(2, idPlan); 
            
            int ms= JOptionPane.showConfirmDialog(null, "Estas seguro de Modificar ? ");  
            if(ms==JOptionPane.YES_OPTION){
            ps.execute();
            JOptionPane.showMessageDialog(null, "MODIFICACION EXITOSA");
            }else{
             JOptionPane.showMessageDialog(null, "SE CANCELO LA MODIFICACION");
            }  
        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null, "ERROR, NO SE PUDO MODIFICAR");
        }
    }
     
      public void Llenartabla(Connection con,JTable tabla){
       try {
           String sql="SELECT * FROM planes ";
            DefaultTableModel modelo = new DefaultTableModel(){
               @Override //Metodo para que no se pueda modificar las celdas de la tabla
               public boolean isCellEditable(int filas, int columnas) {
                   if (columnas ==2){
                    return true;   
                   } else 
                       return false;
               }
           };
           modelo.addColumn("idPlanes");
           modelo.addColumn("Detalle");
           tabla.setModel(modelo);
           String[] datos= new String[2];
           
              Statement st = (Statement)con.createStatement();
              ResultSet rs = st.executeQuery(sql);
              while (rs.next()) {
                  datos[0] = rs.getString(1);
                  datos[1] = rs.getString(2);
                  modelo.addRow(datos);
              }
              tabla.setModel(modelo);
          }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null, "ERROR AL CARGAR LA TABLA");  
        }
    }
      
      public void LlenarCombo(Connection conexion, JComboBox <Plan> comboPlan){
           
          try {   
              String sql = "SELECT idPlanes, detalle FROM planes ORDER BY detalle ASC";
              ps = conexion.prepareStatement(sql);
              rs = ps.executeQuery();
              Plan dat = new Plan();
              //dat.setIdPlan(0);
              dat.setDetalle("Seleccionar Plan");
              comboPlan.addItem(dat);
              
              while (rs.next()){
                    dat= new Plan(); 
                    dat.setIdPlan( rs.getInt("idPlanes"));
                    dat.setDetalle( rs.getString("detalle"));
                    comboPlan.addItem(dat);            
                }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
      
     public void LlenarLista(Connection conexion, JList lista) {
        DefaultListModel<String> modelo = new DefaultListModel<String>();
        
        try { 
            String sql = "SELECT detalle FROM planes";
            Statement st = (Statement) conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);  
            
            while (rs.next()) {
                
                modelo.addElement(rs.getString("detalle"));
            }
            lista.setModel(modelo);
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "NO SE PUDO CARGAR LA LISTA");
        }
    }
         
     public static void Buscar(JTable tabla, String filtro) {
        Connection con = null;
         
        String[] columnas = {"IdPlanes", "detalle"};
        String[] registro = new String[2];
       
        DefaultTableModel modelo= new DefaultTableModel(null, columnas);
        String sql = "SELECT * FROM planes WHERE detalle LIKE '%"+filtro+"%'";
        
        try {
            con = clases.Conectar.conexion();
            PreparedStatement st = con.prepareStatement(sql);
            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                registro[0] = rs.getString ("idPlanes");
                registro[1] = rs.getString ("detalle");

                modelo.addRow(registro);
            }
            tabla.setModel(modelo);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e, "Error durante la busqueda", JOptionPane.ERROR_MESSAGE);
        } 
            }

       public static void EliminarPlan(Connection conexion, int idPlan) {
        
        try{       
            PreparedStatement  ps =  (PreparedStatement) conexion.prepareStatement("DELETE FROM planes WHERE idPlanes = ? ");
            ps.setInt (1, idPlan);
            int ms=  JOptionPane.showConfirmDialog(null, "Estas seguro de Eliminar ? ");
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
    
       public void ActualizarCombo(Connection conexion, JComboBox <Plan> comboPlan){
            
          try {   
              String sql = "SELECT * FROM planes ORDER BY detalle ASC";
              ps = conexion.prepareStatement(sql);
              rs = ps.executeQuery();
              Plan dat = new Plan();
              //dat.setIdPlan(0);
              comboPlan.removeAllItems();
              dat.setDetalle("Seleccionar Plan");
              comboPlan.addItem(dat);
              
              while (rs.next()){
                    dat= new Plan(); 
                    dat.setIdPlan( rs.getInt("idPlanes"));
                    dat.setDetalle( rs.getString("detalle"));
                    comboPlan.addItem(dat);            
                }
              
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
       
}
   
