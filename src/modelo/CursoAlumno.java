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
public class CursoAlumno {
    
    private int idCursoAlumno;
    private float saldo;
    private Date fechaIngreso;
    private Date fechaBajaEgreso;
    private Alumno idAlumno;
    private EstadoAlumno idEstadoAlumno;
    private Curso idCurso;
    private MotivoBaja idMotivoBaja;

    public int getIdCursoAlumno() {
        return idCursoAlumno;
    }

    public void setIdCursoAlumno(int idCursoAlumno) {
        this.idCursoAlumno = idCursoAlumno;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public Date getFechaBajaEgreso() {
        return fechaBajaEgreso;
    }

    public void setFechaBajaEgreso(Date fechaBajaEgreso) {
        this.fechaBajaEgreso = fechaBajaEgreso;
    }

    public Alumno getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(Alumno idAlumno) {
        this.idAlumno = idAlumno;
    }

    public EstadoAlumno getIdEstadoAlumno() {
        return idEstadoAlumno;
    }

    public void setIdEstadoAlumno(EstadoAlumno idEstadoAlumno) {
        this.idEstadoAlumno = idEstadoAlumno;
    }

    public Curso getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(Curso idCurso) {
        this.idCurso = idCurso;
    }

    public MotivoBaja getIdMotivoBaja() {
        return idMotivoBaja;
    }

    public void setIdMotivoBaja(MotivoBaja idMotivoBaja) {
        this.idMotivoBaja = idMotivoBaja;
    }
    
    
}
