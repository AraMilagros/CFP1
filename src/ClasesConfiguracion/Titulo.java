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
public class Titulo {
    
     PreparedStatement ps=null;
     ResultSet rs=null;
        
     private int idTitulo;
     private String detalle;

    public Titulo(int idTitulo, String detalle) {
        this.idTitulo = idTitulo;
        this.detalle = detalle;
    }

    public Titulo() {
    }

    public int getIdTitulo() {
        return idTitulo;
    }

    public void setIdTitulo(int idTitulo) {
        this.idTitulo = idTitulo;
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
    
     public static void CrearTitulo (Connection con, String detalle) {
  
        try {   
          String sql = "INSERT INTO titulo (detalle) VALUES (?)";
          PreparedStatement ps = con.prepareStatement(sql);
          ps.setString(1, detalle);
          ps.execute();
          JOptionPane.showMessageDialog(null, "LA CARGA SE REALIZÓ CON ÉXITO");
        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null, "ERROR, NO SE PUDO CREAR EL TÍTULO");
        }
    }
     
      public void Llenartabla(Connection con,JTable tabla){
       try {
           String sql="SELECT * FROM titulo ";
           DefaultTableModel modelo = new DefaultTableModel(){
               @Override //Metodo para que no se pueda modificar las celdas de la tabla
               public boolean isCellEditable(int filas, int columnas) {
                   if (columnas ==2){
                    return true;   
                   } else 
                       return false;
               }
           };
           modelo.addColumn("idTitulo");
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
     public static void ModificarTitulo(Connection conexion,String detalle, int idTitulo) {
         
        try { 
            String sql = "UPDATE titulo SET detalle = ? WHERE idTitulo =?";
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setString(1, detalle);
            ps.setInt(2, idTitulo); 
            
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
     
      public void LlenarCombo(Connection conexion, JComboBox <Titulo> comboTitulo){
           
          try {   
              String sql = "SELECT idTitulo,detalle FROM Titulo ORDER BY detalle ASC";
              ps = conexion.prepareStatement(sql);
              rs = ps.executeQuery();
              Titulo dat = new Titulo();
              //dat.setIdTitulo(0);
              dat.setDetalle("Seleccionar Título");
              comboTitulo.addItem(dat);
              
              while (rs.next()){
                    dat= new Titulo(); 
                    dat.setIdTitulo( rs.getInt("idTitulo"));
                    dat.setDetalle( rs.getString("detalle"));
                    comboTitulo.addItem(dat);            
                }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
      
      public void ActualizarCombo(Connection conexion, JComboBox <Titulo> comboTitulo){
            
          try {   
              String sql = "SELECT * FROM titulo ORDER BY detalle ASC";
              ps = conexion.prepareStatement(sql);
              rs = ps.executeQuery();
              Titulo dat = new Titulo();
              comboTitulo.removeAllItems();
              dat.setDetalle("Seleccionar Título");
              comboTitulo.addItem(dat);
              
              while (rs.next()){
                    dat= new Titulo(); 
                    dat.setIdTitulo( rs.getInt("idTitulo"));
                    dat.setDetalle( rs.getString("detalle"));
                    comboTitulo.addItem(dat);            
                }
              
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
      
      
     public static void EliminarTitulo (Connection conexion, int idTitulo) {
        
        try{       
            PreparedStatement  ps =  (PreparedStatement) conexion.prepareStatement("DELETE FROM titulo WHERE idTitulo = ? ");
            ps.setInt (1, idTitulo);
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
    
        String[] columnas = {"IdTitulo", "detalle"};
        String[] registro = new String[2];
       
        DefaultTableModel modelo= new DefaultTableModel(null, columnas);
        String sql = "SELECT * FROM titulo WHERE detalle LIKE '%"+filtro+"%'";
        
        try {
            con = clases.Conectar.conexion();
            PreparedStatement st = con.prepareStatement(sql);
            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                registro[0] = rs.getString ("idTitulo");
                registro[1] = rs.getString ("detalle");

                modelo.addRow(registro);
            }
            tabla.setModel(modelo);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e, "Error durante la busqueda", JOptionPane.ERROR_MESSAGE);
        } 
            }   
    
    }

