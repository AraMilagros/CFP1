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

   
     public static void CrearPlan (Connection con, String detalle) {
  
        try {
            
          String sql = "INSERT INTO planes (detalle) VALUES (?)";
          PreparedStatement ps = con.prepareStatement(sql);
          ps.setString(1, detalle);
          ps.execute();
          JOptionPane.showMessageDialog(null, "LA CARGA SE REALIZÓ CON ÉXITO");
        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null, "ERROR, NO SE PUDO CREAR EL PLAN");
        }
    }
     
     public static void ModificarPlan(Connection conexion,String detalle,int idPlan) {
         
        try { 
            String sql = "UPDATE planes SET  detalle = ? WHERE idPlanes = ?";
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setString(1,detalle);
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
           DefaultTableModel modelo = new DefaultTableModel();
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
      
      public void llenarCombo(Connection conexion, JComboBox comboPlan){
          
          
          try {   
              String sql = "SELECT detalle FROM planes ORDER BY detalle ASC";
              ps = conexion.prepareStatement(sql);
              //Ejecutamos la consulta
              rs = ps.executeQuery();
              //LLenamos nuestro ComboBox
              comboPlan.addItem("Seleccione un Plan");

              while (rs.next()) {
                  
                  comboPlan.addItem(rs.getString("detalle"));
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

    public void LlenarCombo(Connection conexion, JComboBox<String> cbPlanActual) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
     
}
