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
import javax.swing.JComboBox;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;
import javax.swing.JOptionPane;
/**
 *
 * @author Ricardo
 */
public class Licenciaconfiguracion {
   Connection conexion = null;
   private int idLicencia;
   private String articulo;
   private String detalle;
   
    public int getIdLicencia() {
        return idLicencia;
    }
    public void setIdLicencia(int idLicencia) {
        this.idLicencia = idLicencia;
    }
    public String getArticulo() {
        return articulo;
    }
    public void setArticulo(String articulo) {
        this.articulo = articulo;
    }
    public String getDetalle() {
        return detalle;
    }
    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }
    @Override
    public String toString() {
        return this.articulo;
    }
    public static void CrearLicencia(Connection conexion,int articulo,String detalle) throws Exception {//Este metodo es para crear una licencia
        java.sql.PreparedStatement ps = conexion.prepareStatement("INSERT INTO licencia (articulo,detalle) Values (?,?)");
        ps.setInt(1, articulo);
        ps.setString(2, detalle);
        try {
          ps.execute();
          JOptionPane.showMessageDialog(null, "CARGA EXITOSA");
        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null, "NO SE PUDO CREAR LA LICENCIA");
        }
    }
     public static void ModificarLicencia(Connection conexion,int articulo,String detalle,int idLicencia) throws Exception {//Este metodo es para modificar una licencia
        java.sql.PreparedStatement ps = conexion.prepareStatement("UPDATE licencia SET  articulo = ?, detalle = ? WHERE idLicencia = ?");
        ps.setInt(1, articulo);
        ps.setString(2, detalle);
        ps.setInt(3, idLicencia);
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
     public static void EliminarLicencia(Connection conexion,int idLicencia) throws Exception{//Este metodo es para eliminar una licencia
        PreparedStatement  ps =  (PreparedStatement) conexion.prepareStatement("DELETE FROM licencia WHERE idLicencia = ? ");
        ps.setInt(1, idLicencia); 
        try{
            int ms=  JOptionPane.showConfirmDialog(null, "Estas Seguro de Eliminar ? ");
            if(ms==JOptionPane.YES_OPTION){
            ps.execute();
            JOptionPane.showMessageDialog(null, "ELIMINACION EXITOSA");
            }else{
             JOptionPane.showMessageDialog(null, "SE CANCELO LA ELIMINACION");
            } 
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "NO SE PUDO ELIMINAR");
        } 
    }
    public void Llenarcombo(Connection conexion,JComboBox<Licenciaconfiguracion> comboArticulo){//Este metodo es para llenar el combo con los articulos de las licencias
        try {
            Statement st = (Statement) conexion.createStatement();
            ResultSet rs = st.executeQuery("select idLicencia,articulo,detalle from licencia ORDER BY articulo ASC ");
            Licenciaconfiguracion dat= new Licenciaconfiguracion();
            dat.setIdLicencia(0);
            dat.setArticulo("Seleccionar Articulo");
            dat.setDetalle("");
            comboArticulo.addItem(dat);
                while(rs.next()){
                    dat= new Licenciaconfiguracion();
                    dat.setIdLicencia( rs.getInt("idLicencia"));
                    dat.setArticulo(rs.getString("articulo"));
                    dat.setDetalle(rs.getString("detalle"));
                    comboArticulo.addItem(dat);      
                }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR AL CARGAR LOS articulos EN EL COMBO");
        }
    }
    public void Llenartabla(Connection conexion,JTable tabla,int idLicencia){//Este metodo es para llenar la tabla con las licencias dependiendo del articulo que seleccione el usuario
        String sql="select articulo,detalle from licencia WHERE idLicencia=" + idLicencia;
        Statement st;
        DefaultTableModel modelo =new DefaultTableModel();
        modelo.addColumn("Articulo");
        modelo.addColumn("Detalle");
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
            JOptionPane.showMessageDialog(null, "ERROR AL CARGAR LAS LICENCIAS EN LA TABLA");
            
        }
  } 
}
