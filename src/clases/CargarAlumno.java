/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;

/**
 *
 * @author Nero
 */
public class CargarAlumno {

    public static PreparedStatement pst,pst1,pst2;

    public static void CargaPersona(Connection con, String nombrePersona, String apellidoPersona, java.util.Date fechaNacimiento, boolean sexo,
            String CUIL, int hijoPersona, String correo, int celular, int idDomicilio,
            int idTipoDocumento, int idNacionalidad, int idFoto, int lugarNacimiento, boolean borrado) {

        java.util.Date fech = new Date(fechaNacimiento.getTime());

        String estado = "Disponible";

        try {
            con = clases.Conectar.conexion();
            pst = con.prepareStatement("INSERT INTO persona (nombrePersona,apellidoPersona,fechaNacimiento,sexo,"
                    + "CUIL,hijoPersona,correo,celular,idDomicilio,idTipoDocumento,idNacionalidad,"
                    + "idFoto,lugarNacimiento,borrado) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            pst.setString(1, nombrePersona);
            pst.setString(2, apellidoPersona);
            pst.setDate(3, (Date) fech);
            pst.setBoolean(4, sexo);
            pst.setString(5, CUIL);
            pst.setInt(6, hijoPersona);
            pst.setString(7, correo);
            pst.setInt(8, celular);
            pst.setInt(9, idDomicilio);
            pst.setInt(10, idTipoDocumento);
            pst.setInt(11, idNacionalidad);
            pst.setInt(12, idFoto);
            pst.setInt(13, lugarNacimiento);
            pst.setBoolean(14, borrado);

            pst.executeUpdate();

            pst.close();

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, "Error, Datos no Guardados o Ingreso de Datos Incompleto o Codigo del Producto no Valido:\n" + e, "Se a producido un Error en la Operacion.", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static int LeerNacionalidad(Connection con, String detalle) throws Exception {
        int id = 0;
        ResultSet rs = null;
        PreparedStatement stmt = con.prepareStatement("SELECT idNacionalidad FROM datoscfp.nacionalidad WHERE detalle = ?");
        stmt.setString(1, detalle);
        try {
            rs = stmt.executeQuery();
            if (rs.next()) {
                id = rs.getInt("idNacionalidad");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al leer Id de Codigo", "ERROR!!!...", ERROR_MESSAGE);
        }
        return id;
    }

    public static ResultSet CargarComboNacionalidad(Connection con) throws Exception {
        ResultSet rs = null;
        PreparedStatement stmt = con.prepareStatement("SELECT detalle FROM datoscfp.nacionalidad");
        try {
            rs = stmt.executeQuery();
        } catch (Exception e) {
        }
        return rs;
    }

    public static int LeerTipoDocumento(Connection con, String detalle) throws Exception {
        int id = 0;
        ResultSet rs = null;
        PreparedStatement stmt = con.prepareStatement("SELECT idTipoDocumento FROM datoscfp.tipoDocumento WHERE detalle = ?");
        stmt.setString(1, detalle);
        try {
            rs = stmt.executeQuery();
            if (rs.next()) {
                id = rs.getInt("idTipoDocumento");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al leer Id de Codigo", "ERROR!!!...", ERROR_MESSAGE);
        }
        return id;
    }

    public static ResultSet CargarComboTipoDocumeto(Connection con) throws Exception {
        ResultSet rs = null;
        PreparedStatement stmt = con.prepareStatement("SELECT detalle FROM datoscfp.tipoDocumento");
        try {
            rs = stmt.executeQuery();
        } catch (Exception e) {
        }
        return rs;
    }

    public static int LeerLocalidad(Connection con, String detalle) throws Exception {
        int id = 0;
        ResultSet rs = null;
        PreparedStatement stmt = con.prepareStatement("SELECT idLugar FROM datoscfp.lugar WHERE nombre = ?");
        stmt.setString(1, detalle);
        try {
            rs = stmt.executeQuery();
            if (rs.next()) {
                id = rs.getInt("idLugar");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al leer Id de Codigo", "ERROR!!!...", ERROR_MESSAGE);
        }
        return id;
    }

    public static ResultSet CargarComboLocalidad(Connection con) throws Exception {
        ResultSet rs = null;
        PreparedStatement stmt = con.prepareStatement("SELECT nombre FROM datoscfp.lugar WHERE nivel = 3");
        try {
            rs = stmt.executeQuery();
        } catch (Exception e) {
        }
        return rs;
    }

    public static DefaultComboBoxModel ComboBarrio(ResultSet rs) {
        DefaultComboBoxModel listacombo = new DefaultComboBoxModel();
        try {
            listacombo.addElement("");

            while (rs.next()) {
                listacombo.addElement(rs.getString("nombre"));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pudo cargar LISTA de Barrios");
        }
        return listacombo;
    }

    public static ResultSet CargarCombBarrio(Connection con, int id) throws Exception {
        ResultSet rs = null;
        PreparedStatement stmt = con.prepareStatement("SELECT nombre FROM datoscfp.lugar WHERE nivel = 2 and de = ?");
        stmt.setInt(1, id);
        try {
            rs = stmt.executeQuery();
        } catch (Exception e) {
        }
        return rs;
    }

    public static DefaultComboBoxModel ComboCalle(ResultSet rs) {
        DefaultComboBoxModel listacombo = new DefaultComboBoxModel();
        try {
            listacombo.addElement("");

            while (rs.next()) {
                listacombo.addElement(rs.getString("nombre"));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pudo cargar LISTA de Barrios");
        }
        return listacombo;
    }

    public static ResultSet CargarCombCalle(Connection con, int id) throws Exception {
        ResultSet rs = null;
        PreparedStatement stmt = con.prepareStatement("SELECT nombre FROM datoscfp.lugar WHERE nivel = 1 and de = ?");
        stmt.setInt(1, id);
        try {
            rs = stmt.executeQuery();
        } catch (Exception e) {
        }
        return rs;
    }

    public static void CrearDom(Connection con, int n, String tel, int idl, int ide) throws Exception {
        PreparedStatement pst1 = con.prepareStatement("INSERT INTO `datoscfp`.`domicilio` (`nro`, `telefono`, `idLugar`, `idEdificio`) VALUES (?,?,?,?)");
        pst1.setInt(1, n);
        pst1.setString(2, tel);
        pst1.setInt(3, idl);
        pst1.setInt(4, ide);

        pst1.execute();

        pst1.close();
    }

    public static void Crearedi(Connection con, int t, int piso, int dept) throws Exception {
        PreparedStatement pst2 = con.prepareStatement("INSERT INTO `datoscfp`.`edificio` (`torre`, `piso`, `depto`) VALUES (?,?,?)");
        pst2.setInt(1, t);
        pst2.setInt(2, piso);
        pst2.setInt(3, dept);

        pst2.execute();

        pst2.close();
    }

    public static int ultid_domi() {
        int iddomi = 0;
        try {
            Connection con = Conectar.conexion();
            ResultSet ultid = null;
            String sql2 = "SELECT idDomicilio FROM domicilio ORDER BY idDomicilio DESC LIMIT 1";
            PreparedStatement st2 = con.prepareStatement(sql2);
            ultid = st2.executeQuery();
            iddomi = ultid.getInt("idDomicilio");
        } catch (Exception e) {
        }
        return iddomi;
    }

    public static int ultid_edi() {
        int idedi = 0;
        try {
            Connection con = Conectar.conexion();
            ResultSet ultid = null;
            String sql3 = "SELECT idEdificio FROM edificio ORDER BY idEdificio DESC LIMIT 1";
            PreparedStatement st2 = con.prepareStatement(sql3);
            ultid = st2.executeQuery();
            idedi = ultid.getInt("idEdificio");
        } catch (Exception e) {
        }
        return idedi;
    }
    Conectar cc = new Conectar();
    Connection cn = cc.conexion();
}
