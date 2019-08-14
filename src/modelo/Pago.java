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
public class Pago {
    
    private int idPago;
    private Date fecha;
    private float importe;
    private Empleado idCobrador;
    private CursoAlumno idCursoAlumno;

    public int getIdPago() {
        return idPago;
    }

    public void setIdPago(int idPago) {
        this.idPago = idPago;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public float getImporte() {
        return importe;
    }

    public void setImporte(float importe) {
        this.importe = importe;
    }

    public Empleado getIdCobrador() {
        return idCobrador;
    }

    public void setIdCobrador(Empleado idCobrador) {
        this.idCobrador = idCobrador;
    }

    public CursoAlumno getIdCursoAlumno() {
        return idCursoAlumno;
    }

    public void setIdCursoAlumno(CursoAlumno idCursoAlumno) {
        this.idCursoAlumno = idCursoAlumno;
    }
    
    
}
