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
public class PersonaTrabajo {
    
    private int idPersonaTrabajo;
    private Trabajo idTrabajo;
    private Persona idPersona;

    public int getIdPersonaTrabajo() {
        return idPersonaTrabajo;
    }

    public void setIdPersonaTrabajo(int idPersonaTrabajo) {
        this.idPersonaTrabajo = idPersonaTrabajo;
    }

    public Trabajo getIdTrabajo() {
        return idTrabajo;
    }

    public void setIdTrabajo(Trabajo idTrabajo) {
        this.idTrabajo = idTrabajo;
    }

    public Persona getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(Persona idPersona) {
        this.idPersona = idPersona;
    }
    
    
}
