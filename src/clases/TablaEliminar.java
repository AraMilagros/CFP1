/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DELL
 */
public class TablaEliminar {

    Connection conexion = clases.Conectar.conexion();

    public static DefaultTableModel AsignarModelo(ResultSet rs) {
        DefaultTableModel modelo = new DefaultTableModel();

        try {
            ResultSetMetaData datos = rs.getMetaData();     //OBTENER NOMBRE DE COLUMNAS
            int columnas = datos.getColumnCount();
            Object[] etiquetas = new Object[columnas];
            for (int i = 0; i < columnas; i++) {
                etiquetas[i] = datos.getColumnLabel(i + 1);
            }
            modelo.setColumnIdentifiers(etiquetas);

            while (rs.next()) {                             //AÑADIR ELEMENTOS A LA LISTA
                Object[] fila = new Object[columnas];
                for (int i = 0; i < columnas; i++) {
                    fila[i] = rs.getObject(i + 1);
                }
                modelo.addRow(fila);

            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "NO SE PUDO CARGAR TABLA");
        }
        return modelo;

    }

    public static ResultSet buscarDNI(Connection con, String txt) throws SQLException {
        ResultSet rs = null;
        PreparedStatement ps = con.prepareStatement("SELECT \n"
                + "    idpersona AS Legajo,\n"
                + "    nombrePersona AS Nombre,\n"
                + "    apellidoPersona AS Apellido,\n"
                + "    fechaNacimiento AS Fecha_de_Nacimiento,\n"
                + "    Sexo,\n"
                + "    CUIL,\n"
                + "    hijoPersona AS Hijos,\n"
                + "    correo,\n"
                + "    celular,\n"
                + "    lugar.nombre AS Domicilio,\n"
                + "    domicilio.nro AS Numero,\n"
                + "    tipodocumento.detalle AS Tipo_de_Documento,\n"
                + "    nacionalidad.detalle AS Nacionalidad,\n"
                + "    borrado AS Borrado\n"
                + "FROM\n"
                + "    persona\n"
                + "        INNER JOIN\n"
                + "    tipodocumento ON persona.idTipoDocumento = tipoDocumento.idTipoDocumento\n"
                + "        INNER JOIN\n"
                + "    nacionalidad ON persona.idNacionalidad = nacionalidad.idNacionalidad\n"
                + "        INNER JOIN\n"
                + "    domicilio ON persona.idDomicilio = domicilio.idDomicilio\n"
                + "        INNER JOIN\n"
                + "    lugar ON domicilio.idLugar = lugar.idLugar\n"
                + "    where persona.idPersona=?\n"
                + "     ORDER BY persona.idPersona ASC\n"
                + "        ");
        ps.setString(1, txt);
        try {

            rs = ps.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(TablaEliminar.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }

    public static ResultSet Creartablacompl(Connection con) throws SQLException {
        ResultSet rs = null;
        PreparedStatement ps = con.prepareStatement("SELECT \n"
                + "    idpersona AS Legajo,\n"
                + "    nombrePersona AS Nombre,\n"
                + "    apellidoPersona AS Apellido,\n"
                + "    fechaNacimiento AS Fecha_de_Nacimiento,\n"
                + "    Sexo,\n"
                + "    CUIL,\n"
                + "    hijoPersona AS Hijos,\n"
                + "    correo,\n"
                + "    celular,\n"
                + "    lugar.nombre AS Domicilio,\n"
                + "    domicilio.nro AS Numero,\n"
                + "    tipodocumento.detalle AS Tipo_de_Documento,\n"
                + "    nacionalidad.detalle AS Nacionalidad,\n"
                + "    borrado AS Borrado\n"
                + "FROM\n"
                + "    persona\n"
                + "        INNER JOIN\n"
                + "    tipodocumento ON persona.idTipoDocumento = tipoDocumento.idTipoDocumento\n"
                + "        INNER JOIN\n"
                + "    nacionalidad ON persona.idNacionalidad = nacionalidad.idNacionalidad\n"
                + "        inner JOIN\n"
                + "    domicilio ON persona.idDomicilio = domicilio.idDomicilio\n"
                + "    inner join lugar on domicilio.idLugar= lugar.idLugar");

        try {

            rs = ps.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(TablaEliminar.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }

    public static void eliminar(Connection con, int id) throws SQLException {
        PreparedStatement ps = con.prepareStatement("UPDATE `datoscfp`.`persona` \n"
                + "SET \n"
                + "    `borrado` = '1'\n"
                + "WHERE\n"
                + "    `idPersona` = ?");
        ps.setInt(1, id);

        try {

            ps.execute();
        } catch (SQLException ex) {
            Logger.getLogger(TablaEliminar.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
