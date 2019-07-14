/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.DefaultListModel;
import javax.swing.JComboBox;
import javax.swing.JList;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;
import javax.swing.JOptionPane;
/**
 *
 * @author Ricardo
 */
public class Lugarconfiguracion {
    Connection conexion = null;
    private int idLugar;
    private String nombre;
    private int nivel;
    private int de;
   
    public int getIdLugar() {
        return idLugar;
    }
    public void setIdLugar(int idLugar) {
        this.idLugar = idLugar;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getNivel() {
        return nivel;
    }
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
     public int getDe() {
        return de;
    }
    public void setDe(int de) {
        this.de = de;
    }
    @Override
    public String toString() {
        return this.nombre;
    }
    public static void CrearLugar(Connection conexion,String nombre,int nivel,int de) throws Exception{//Este metodo es para crear un lugar
        java.sql.PreparedStatement ps = conexion.prepareStatement("INSERT INTO lugar (nombre,nivel,de) Values (?,?,?)");
        ps.setString(1,nombre);
        ps.setInt(2, nivel);
        ps.setInt(3, de);
        try{
           ps.execute();
          JOptionPane.showMessageDialog(null, "CARGA EXITOSA");
        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null, "NO SE PUDO CREAR EL LUGAR");
        }
    }
     public static void ModificarLugar(Connection conexion,String nombre,int nivel,int de,int idLugar) throws Exception{//Este metodo es para modificar un lugar
        java.sql.PreparedStatement ps = conexion.prepareStatement("UPDATE lugar SET  nombre = ?,nivel = ?,de = ? WHERE idLugar = ?");
        ps.setString(1,nombre);
        ps.setInt(2, nivel);
        ps.setInt(3, de);
        ps.setInt(4, idLugar);
        try{ 
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
     public static void Eliminar(Connection conexion,int idLugar) throws Exception {//Este metodo es para eliminar un lugar
        java.sql.PreparedStatement ps = conexion.prepareStatement("DELETE FROM lugar WHERE idLugar = ? ");
        ps.setInt(1, idLugar);
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
    public void LlenarcomboLocalidad(Connection conexion,JComboBox<Lugarconfiguracion> comboLocalidad){//Este metodo para llenar el combo con las localidades 
        try {
            Statement st = (Statement) conexion.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM lugar WHERE nivel=3 ORDER BY nombre ASC");
            Lugarconfiguracion dat= new Lugarconfiguracion();
            dat.setIdLugar(0);
            dat.setNombre("Seleccionar Localidad");
            dat.setNivel(0);
            dat.setDe(0);
            comboLocalidad.addItem(dat);
                while(rs.next()){
                    dat= new Lugarconfiguracion();
                    dat.setIdLugar(rs.getInt("idLugar"));
                    dat.setNombre(rs.getString("nombre"));
                    dat.setNivel(rs.getInt("nivel"));
                    dat.setDe(rs.getInt("de"));
                    comboLocalidad.addItem(dat); 
                }
           
        } catch (SQLException ex) {
         
            JOptionPane.showMessageDialog(null, "ERROR AL MOSTRAR Las localidades");
        }
    }
    public void LlenarcomboBarrio(Connection conexion,JComboBox<Lugarconfiguracion> comboBarrio){//Este metodo para llenar el combo con los barrios
        try {
            Statement st = (Statement) conexion.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM lugar WHERE nivel=2 ORDER BY nombre ASC");
            Lugarconfiguracion dat= new Lugarconfiguracion();
            dat.setIdLugar(0);
            dat.setNombre("Seleccionar Barrio");
            dat.setNivel(0);
            dat.setDe(0);
            comboBarrio.addItem(dat);
            while(rs.next()){
                   dat= new Lugarconfiguracion();
                   dat.setIdLugar(rs.getInt("idLugar"));
                   dat.setNombre(rs.getString("nombre"));
                   dat.setNivel(rs.getInt("nivel"));
                   dat.setDe(rs.getInt("de"));
                   comboBarrio.addItem(dat); 
            }  
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR AL MOSTRAR Los barrios");
        }
    }
       public void LlenarcomboCalles(Connection conexion,JComboBox<Lugarconfiguracion> comboCalles){//Este metodo para llenar el combo con las calles
        try {
            Statement st = (Statement) conexion.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM lugar WHERE nivel=1 ORDER BY nombre ASC");
            Lugarconfiguracion dat= new Lugarconfiguracion();
            dat.setIdLugar(0);
            dat.setNombre("Seleccionar Calle");
            dat.setNivel(0);
            dat.setDe(0);
            comboCalles.addItem(dat);
            while(rs.next()){
                    dat= new Lugarconfiguracion();
                    dat.setIdLugar(rs.getInt("idLugar"));
                    dat.setNombre(rs.getString("nombre"));
                    dat.setNivel(rs.getInt("nivel"));
                    dat.setDe(rs.getInt("de"));
                    comboCalles.addItem(dat); 
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERROR AL MOSTRAR Las calles");
        }
    }
    public void LlenartablaLocalidad(Connection conexion,JTable tabla){//Este metodo es para llenar la tabla con las localidades
        String sql="SELECT nombre FROM lugar WHERE nivel=3 ORDER BY nombre ASC";
        Statement st;
        DefaultTableModel modelo =new DefaultTableModel();
        modelo.addColumn("Localidad");
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
            JOptionPane.showMessageDialog(null, "ERROR AL CARGAR LAS LOCALIDADES EN LA TABLA"); 
        }
    }
    public void  llenarlistaLocalidad(Connection conexion,JList lista){//Este metodo para llenar la lista con las localidades
        DefaultListModel<String> modelo =new  DefaultListModel<String>();
        try {
            Statement st = (Statement) conexion.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM lugar WHERE nivel=3 ORDER BY nombre ASC");
                while (rs.next()){  
                  modelo.addElement(rs.getString("nombre"));
                }
                lista.setModel(modelo);  
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "NO SE PUDO CARGAR LA LISTA");
        }
    } 
    public void BuscarLocalidad(Connection conexion,JList lista,String nombre){//Este metodo es para buscar una localidad
        DefaultListModel<String> modelo =new  DefaultListModel<String>();
           try {
            Statement st = (Statement) conexion.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM lugar WHERE nivel=3 and nombre like '%"+nombre+"%' ");
                while (rs.next()){
                modelo.addElement(rs.getString("nombre"));
                }
                lista.setModel(modelo);
        } catch (SQLException ex) { 
            JOptionPane.showMessageDialog(null, "NO SE PUDO BUSCAR LA LOCALIDAD");
        }                 
    }
    public void LlenartablaBarrio(Connection conexion,JTable tabla){//Este metodo es para llenar la tabla con los barrios
        String sql="SELECT nombre FROM lugar WHERE nivel=2 ORDER BY nombre ASC";
        Statement st;
        DefaultTableModel modelo =new DefaultTableModel();
        modelo.addColumn("Barrio");
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
            JOptionPane.showMessageDialog(null, "ERROR AL CARGAR LOS BARRIOS EN LA TABLA"); 
        }
    }
    public Vector<Lugarconfiguracion> mostrarBarrio(Connection conexion,int idLugar) {//Este metodo es para llenar el combo con los barrios dependiendo de la localidad que selecione el usuario
        PreparedStatement ps = null;
        ResultSet rs = null;
        Vector<Lugarconfiguracion> datos = new Vector<Lugarconfiguracion>();
        Lugarconfiguracion dat = null;
        try {
            String sql = "SELECT * FROM lugar WHERE nivel=2 and de =" + idLugar;
            ps = conexion.prepareStatement(sql);
            rs = ps.executeQuery();
            dat = new Lugarconfiguracion();
            dat.setIdLugar(0);
            dat.setNombre("Seleccionar Barrio");
            datos.add(dat);
                while (rs.next()) {
                    dat = new Lugarconfiguracion();
                    dat.setIdLugar(rs.getInt("idLugar"));
                    dat.setNombre(rs.getString("nombre"));
                    datos.add(dat);
                }
                rs.close();
        } catch (SQLException ex) {
            System.err.println("Error consulta :" + ex.getMessage());
        }
        return datos;
    }
    public void   llenarlistaBarrio(Connection conexion,JList lista,int idLugar){//Este metodo es para llenar la lista con los barrios dependiendo de la localidad que selecione el usuario
        DefaultListModel<String> modelo =new  DefaultListModel<String>();
        Lugarconfiguracion dat= new Lugarconfiguracion();
        try {
            Statement st = (Statement) conexion.createStatement();
            ResultSet rs = st.executeQuery( "SELECT * FROM lugar WHERE nivel=2 and de =" + idLugar);
                while (rs.next()){
                  modelo.addElement(rs.getString("nombre"));
                }
                lista.setModel(modelo);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "NO SE PUDO CARGAR LA LISTA");
        }
    } 
    public Vector<Lugarconfiguracion> mostrarCalles(Connection conexion,int idLugar) {//Este metodo es para llenar el combo con las calles dependiendo del barrio que selecione el usuario
        PreparedStatement ps = null;
        ResultSet rs = null;
        Vector<Lugarconfiguracion> datos = new Vector<Lugarconfiguracion>();
        Lugarconfiguracion dat = null;
        try {
            String sql = "SELECT * FROM lugar WHERE nivel=1 and de =" + idLugar;
            ps = conexion.prepareStatement(sql);
            rs = ps.executeQuery();
            dat = new Lugarconfiguracion();
            dat.setIdLugar(0);
            dat.setNombre("Seleccionar Calle");
            datos.add(dat);
                while (rs.next()) {
                    dat = new Lugarconfiguracion();
                    dat.setIdLugar(rs.getInt("idLugar"));
                    dat.setNombre(rs.getString("nombre"));
                    datos.add(dat);
                }
                rs.close();
        } catch (SQLException ex) {
            System.err.println("Error consulta :" + ex.getMessage());
        }
        return datos;
    }
    public void   llenarlistaCalles(Connection conexion,JList lista,int idLugar){//Este metodo es para llenar la lista con las calles dependiendo del barrio que selecione el usuario
        DefaultListModel<String> modelo =new  DefaultListModel<String>();
        Lugarconfiguracion dat= new Lugarconfiguracion();
        try {
            Statement st = (Statement) conexion.createStatement();
            ResultSet rs = st.executeQuery( "SELECT * FROM lugar WHERE nivel = 1 and de =" + idLugar);
                while (rs.next()){
                  modelo.addElement(rs.getString("nombre"));
                }
                lista.setModel(modelo);
        } catch (SQLException ex) {
          
            JOptionPane.showMessageDialog(null, "NO SE PUDO CARGAR LA LISTA");
        }
   } 
    public void LlenartablaCalles(Connection conexion,JTable tabla){//Este metodo es para llenar la tabla con las calles
        String sql="SELECT nombre FROM lugar WHERE nivel=1 ORDER BY nombre ASC";
        Statement st;
        DefaultTableModel modelo =new DefaultTableModel();
        modelo.addColumn("Barrio");
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
            JOptionPane.showMessageDialog(null, "ERROR AL CARGAR LAS CALLES EN LA TABLA"); 
        }
    }
}
