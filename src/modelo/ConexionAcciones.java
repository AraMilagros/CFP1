/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Date;

/**
 *
 * @author araa
 */
public class ConexionAcciones {
    
    private int idConexionAccion;
    private Empleado idEmpleado;
    private String detalle;
    private Date fecha;

    public int getIdConexionAccion() {
        return idConexionAccion;
    }

    public void setIdConexionAccion(int idConexionAccion) {
        this.idConexionAccion = idConexionAccion;
    }

    public Empleado getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(Empleado idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
    
}
