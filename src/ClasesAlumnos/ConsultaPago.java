/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesAlumnos;

import java.sql.Connection;
/**
 *
 * @author
 */
public class ConsultaPago {
    Connection conexion = null;
    private int idCodigoPostal;
    private int localidad;
    private String codigoPostal;
    
     public int getIdCodigoPostal() {
        return idCodigoPostal;
    }
    public void setIdCodigoPostal(int idCodigoPostal) {
        this.idCodigoPostal = idCodigoPostal;
    }
     public int getLocalidad() {
        return localidad;
    }
    public void setLocalidad(int localidad) {
        this.localidad = localidad;
    }
    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    } 
}
