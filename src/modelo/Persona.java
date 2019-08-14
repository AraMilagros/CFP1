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
public class Persona {
    
    private int idPersona;
    private String nombrePersona;
    private String apellidoPersona;
    private Date fechaNacimiento;
    private boolean sexo;
    private String CUIL;
    private int hijoPersona;
    private String correo;
    private int celular;
    private Domicilio idDomicilio;
    private TipoDocumento idTipoDocumento;
    private Nacionalidad idNacionalidad;
    private Foto idFoto;
    private Lugar lugarNacimiento;
    private boolean borrado;

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombrePersona() {
        return nombrePersona;
    }

    public void setNombrePersona(String nombrePersona) {
        this.nombrePersona = nombrePersona;
    }

    public String getApellidoPersona() {
        return apellidoPersona;
    }

    public void setApellidoPersona(String apellidoPersona) {
        this.apellidoPersona = apellidoPersona;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public boolean isSexo() {
        return sexo;
    }

    public void setSexo(boolean sexo) {
        this.sexo = sexo;
    }

    public String getCUIL() {
        return CUIL;
    }

    public void setCUIL(String CUIL) {
        this.CUIL = CUIL;
    }

    public int getHijoPersona() {
        return hijoPersona;
    }

    public void setHijoPersona(int hijoPersona) {
        this.hijoPersona = hijoPersona;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public Domicilio getIdDomicilio() {
        return idDomicilio;
    }

    public void setIdDomicilio(Domicilio idDomicilio) {
        this.idDomicilio = idDomicilio;
    }

    public TipoDocumento getIdTipoDocumento() {
        return idTipoDocumento;
    }

    public void setIdTipoDocumento(TipoDocumento idTipoDocumento) {
        this.idTipoDocumento = idTipoDocumento;
    }

    public Nacionalidad getIdNacionalidad() {
        return idNacionalidad;
    }

    public void setIdNacionalidad(Nacionalidad idNacionalidad) {
        this.idNacionalidad = idNacionalidad;
    }

    public Foto getIdFoto() {
        return idFoto;
    }

    public void setIdFoto(Foto idFoto) {
        this.idFoto = idFoto;
    }

    public Lugar getLugarNacimiento() {
        return lugarNacimiento;
    }

    public void setLugarNacimiento(Lugar lugarNacimiento) {
        this.lugarNacimiento = lugarNacimiento;
    }

    public boolean isBorrado() {
        return borrado;
    }

    public void setBorrado(boolean borrado) {
        this.borrado = borrado;
    }
    
    
}
