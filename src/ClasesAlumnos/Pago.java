/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesAlumnos;

import java.sql.Connection;
/**
 *
 * @author Ricardo
 */
public class Pago {
    Connection conexion = null;
    private int idGremio;
    private String detalle;
    public int getIdGremio() {
        return idGremio;
    }
    public void setIdGremio(int idGremio) {
        this.idGremio = idGremio;
    }
    public String getDetalle() {
        return detalle;
    }
    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }
    
}
