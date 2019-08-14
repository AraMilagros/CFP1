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
public class Curso {
    
    private int idCurso;
    private int cicloLectivo;
    private int turno;
    private float costo;
    private int cupo;
    private Date fechaInicio;
    private Date fechaFinalizacion;
    private TipoCurso idTipoCurso;
    private LugarCurso idLugarCurso;
    private Periodicidad idPeriodicidad;
    private boolean borrado;

    public int getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(int idCurso) {
        this.idCurso = idCurso;
    }

    public int getCicloLectivo() {
        return cicloLectivo;
    }

    public void setCicloLectivo(int cicloLectivo) {
        this.cicloLectivo = cicloLectivo;
    }

    public int getTurno() {
        return turno;
    }

    public void setTurno(int turno) {
        this.turno = turno;
    }

    public float getCosto() {
        return costo;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }

    public int getCupo() {
        return cupo;
    }

    public void setCupo(int cupo) {
        this.cupo = cupo;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFinalizacion() {
        return fechaFinalizacion;
    }

    public void setFechaFinalizacion(Date fechaFinalizacion) {
        this.fechaFinalizacion = fechaFinalizacion;
    }

    public TipoCurso getIdTipoCurso() {
        return idTipoCurso;
    }

    public void setIdTipoCurso(TipoCurso idTipoCurso) {
        this.idTipoCurso = idTipoCurso;
    }

    public LugarCurso getIdLugarCurso() {
        return idLugarCurso;
    }

    public void setIdLugarCurso(LugarCurso idLugarCurso) {
        this.idLugarCurso = idLugarCurso;
    }

    public Periodicidad getIdPeriodicidad() {
        return idPeriodicidad;
    }

    public void setIdPeriodicidad(Periodicidad idPeriodicidad) {
        this.idPeriodicidad = idPeriodicidad;
    }

    public boolean isBorrado() {
        return borrado;
    }

    public void setBorrado(boolean borrado) {
        this.borrado = borrado;
    }
    
    
}
