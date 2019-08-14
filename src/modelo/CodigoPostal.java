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
public class CodigoPostal {
    
    private int idCodigoPostal;
    private Lugar localidad;
    private String codigoPostal;

    public int getIdCodigoPostal() {
        return idCodigoPostal;
    }

    public void setIdCodigoPostal(int idCodigoPostal) {
        this.idCodigoPostal = idCodigoPostal;
    }

    public Lugar getLocalidad() {
        return localidad;
    }

    public void setLocalidad(Lugar localidad) {
        this.localidad = localidad;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }
    
}
