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
public class EmpleadoLicencia {
    
    private int idEmpleadoLicencia;
    private Date inicio;
    private Date fin;
    private Empleado idEmpleado;
    private Licencia idLicencia;

    public int getIdEmpleadoLicencia() {
        return idEmpleadoLicencia;
    }

    public void setIdEmpleadoLicencia(int idEmpleadoLicencia) {
        this.idEmpleadoLicencia = idEmpleadoLicencia;
    }

    public Date getInicio() {
        return inicio;
    }

    public void setInicio(Date inicio) {
        this.inicio = inicio;
    }

    public Date getFin() {
        return fin;
    }

    public void setFin(Date fin) {
        this.fin = fin;
    }

    public Empleado getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(Empleado idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public Licencia getIdLicencia() {
        return idLicencia;
    }

    public void setIdLicencia(Licencia idLicencia) {
        this.idLicencia = idLicencia;
    }
    
    
    
}
