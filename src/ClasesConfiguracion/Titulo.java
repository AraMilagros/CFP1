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
           DefaultTableModel modelo = new DefaultTableModel();
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
    
}
