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
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Modi {

    Connection conexion = clases.Conectar.conexion();

    public static ResultSet TraerM(Connection con, int idp) throws SQLException {
        // String nom, String ape, Date fech, boolean sex, int cuil, String corr, int cel, int idlug, String nacim, int n, int d, int iddom, int nrodom, int tfijo, int idtipdoc, String tipdoc, int idnacion, String nacion, int idedi, int dep, int niv, int pis, int torr, int idcod, int codpos//
        ResultSet rs = null;
        PreparedStatement ps = con.prepareStatement("SELECT\n"
                + "    idpersona,\n"
                + "    nombrePersona,\n"
                + "    apellidoPersona,\n"
                + "    fechaNacimiento,\n"
                + "    Sexo,\n"
                + "    CUIL,\n"
                + "    correo,\n"
                + "    celular,\n"
                + "    lugar.idLugar AS idlug,\n"
                + "    lugar.nombre AS nacimiento,\n"
                + "    lugar.nivel AS nivel,\n"
                + "    lugar.de AS dep,\n"
                + "    domicilio.idDomicilio AS iddom,\n"
                + "    domicilio.nro,\n"
                + "    domicilio.telefono AS telefij,\n"
                + "    tipodocumento.idTipoDocumento AS idtipodoc,\n"
                + "    tipodocumento.detalle AS tipodoc,\n"
                + "    nacionalidad.idNacionalidad AS idnacion,\n"
                + "    nacionalidad.detalle AS nacion,\n"
                + "    edificio.idEdificio AS idedi,\n"
                + "    edificio.depto AS deedif,\n"
                + "    edificio.piso AS pisoedi,\n"
                + "    edificio.torre AS torreedi,\n"
                + "    codigopostal.idCodigoPostal AS idcod,\n" 
                + "    codigopostal.codigoPostal AS codpos\n"
                + "     FROM\n"
                + "    persona\n"
                + "        INNER JOIN\n"
                + "    tipodocumento ON persona.idTipoDocumento = tipoDocumento.idTipoDocumento\n"
                + "        INNER JOIN\n"
                + "    nacionalidad ON persona.idNacionalidad = nacionalidad.idNacionalidad\n"
                + "        INNER JOIN\n"
                + "    domicilio ON persona.idDomicilio = domicilio.idDomicilio\n"
                + "        INNER JOIN\n"
                + "    lugar ON domicilio.idLugar = lugar.idLugar\n"
                + "        INNER JOIN\n"
                + "    edificio ON edificio.idEdificio= domicilio.idEdificio\n"
                + "        inner join\n"
                + "    codigopostal on lugar.idLugar= codigoPostal.localidad\n"
                + "    where persona.idPersona=?\n"
                + "        ");
        ps.setInt(1, idp);
        try {

            rs = ps.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(TablaEliminar.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }
}
