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
public class Eliminar {
    Connection conexion = null;
    private int idLugarCurso;
    private String detalle;
    public int getIdLugarCurso() {
        return idLugarCurso;
    }
    public void setIdLugarCurso(int idLugarCurso) {
        this.idLugarCurso= idLugarCurso;
    }
    public String getDetalle() {
        return detalle;
    }
    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }
      
}
