/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author araa
 */
public class Domicilio {
    
    private int idDomicilio;
    private int nro;
    private String telefono;
    private Lugar idLugar;
    private Edificio idEdificio;

    public int getIdDomicilio() {
        return idDomicilio;
    }

    public void setIdDomicilio(int idDomicilio) {
        this.idDomicilio = idDomicilio;
    }

    public int getNro() {
        return nro;
    }

    public void setNro(int nro) {
        this.nro = nro;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Lugar getIdLugar() {
        return idLugar;
    }

    public void setIdLugar(Lugar idLugar) {
        this.idLugar = idLugar;
    }

    public Edificio getIdEdificio() {
        return idEdificio;
    }

    public void setIdEdificio(Edificio idEdificio) {
        this.idEdificio = idEdificio;
    }
    
    
}
