/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesConfiguracion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Carlos Maraz
 */
public class Trabajo {
    PreparedStatement ps=null;
    ResultSet rs=null;
    
     private int idTrabajo;
     private String detalle;

    public Trabajo(int idTrabajo, String detalle) {
        this.idTrabajo = idTrabajo;
        this.detalle = detalle;
    }

    public Trabajo() {
    }
     
    public int getIdTrabajo() {
        return idTrabajo;
    }

    public void setIdTrabajo(int idTrabajo) {
        this.idTrabajo = idTrabajo;
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
        
     public static void CrearTrabajo (Connection con, String detalle) {
  
        try {
            
          String sql = "INSERT INTO trabajo (detalle) VALUES (?)";
          PreparedStatement ps = con.prepareStatement(sql);
          ps.setString(1, detalle);
          ps.execute();
          JOptionPane.showMessageDialog(null, "LA CARGA SE REALIZÓ CON ÉXITO");
        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null, "ERROR, NO SE PUDO CREAR EL TRABAJO");
        }
    }
     
      public void Llenartabla(Connection con,JTable tabla){
       try {
           String sql="SELECT * FROM trabajo ";
           DefaultTableModel modelo = new DefaultTableModel(){
               @Override //Metodo para que no se puedan modificar las celdas de la tabla
               public boolean isCellEditable(int filas, int columnas) {
                   if (columnas ==2){
                    return true;   
                   } else 
                       return false;
               }
           };
           modelo.addColumn("idTrabajo");
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
      
     public static void ModificarTrabajo (Connection conexion,String detalle, int idTrabajo) {
         
        try { 
            String sql = "UPDATE trabajo SET detalle = ? WHERE idTrabajo =?";
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setString(1, detalle);
            ps.setInt(2, idTrabajo); 
            
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
     
      public void LlenarCombo (Connection conexion, JComboBox <Trabajo> comboTrabajo){
           
          try {   
              String sql = "SELECT idTrabajo,detalle FROM Trabajo ORDER BY detalle ASC";
              ps = conexion.prepareStatement(sql);
              rs = ps.executeQuery();
              Trabajo dat = new Trabajo();
              //dat.setIdTitulo(0);
              dat.setDetalle("Seleccionar Trabajo");
              comboTrabajo.addItem(dat);
              
              while (rs.next()){
                    dat= new Trabajo(); 
                    dat.setIdTrabajo( rs.getInt("idTrabajo"));
                    dat.setDetalle( rs.getString("detalle"));
                    comboTrabajo.addItem(dat);            
                }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
      
      public void ActualizarCombo (Connection conexion, JComboBox <Trabajo> comboTrabajo){
            
          try {   
              String sql = "SELECT * FROM trabajo ORDER BY detalle ASC";
              ps = conexion.prepareStatement(sql);
              rs = ps.executeQuery();
              Trabajo dat = new Trabajo();
              comboTrabajo.removeAllItems();
              dat.setDetalle("Seleccionar Trabajo");
              comboTrabajo.addItem(dat);
              while (rs.next()){
                    dat= new Trabajo();     
                    dat.setDetalle("Seleccionar Trabajo");
                    dat.setIdTrabajo( rs.getInt("idTrabajo"));
                    dat.setDetalle( rs.getString("detalle"));
                    comboTrabajo.addItem(dat);  
                }
              
              
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    } 
      
      public static void EliminarTrabajo (Connection conexion, int idTrabajo) {
        
        try{       
            PreparedStatement  ps =  (PreparedStatement) conexion.prepareStatement("DELETE FROM trabajo WHERE idTrabajo = ? ");
            ps.setInt (1, idTrabajo);
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
      
      public static void Buscar(JTable tabla, String filtro) {
        Connection con = null;
    
        String[] columnas = {"IdTrabajo", "detalle"};
        String[] registro = new String[2];
       
        DefaultTableModel modelo= new DefaultTableModel(null, columnas);
        String sql = "SELECT * FROM trabajo WHERE detalle LIKE '%"+filtro+"%'";
        
        try {
            con = clases.Conectar.conexion();
            PreparedStatement st = con.prepareStatement(sql);
            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                registro[0] = rs.getString ("idTrabajo");
                registro[1] = rs.getString ("detalle");

                modelo.addRow(registro);
            }
            tabla.setModel(modelo);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e, "Error durante la busqueda", JOptionPane.ERROR_MESSAGE);
        } 
            }
}