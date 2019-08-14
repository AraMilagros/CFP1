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
public class PlanPersona {
    
    private int idPlanPersona;
    private Persona idPersona;
    private Planes idPlanes;

    public int getIdPlanPersona() {
        return idPlanPersona;
    }

    public void setIdPlanPersona(int idPlanPersona) {
        this.idPlanPersona = idPlanPersona;
    }

    public Persona getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(Persona idPersona) {
        this.idPersona = idPersona;
    }

    public Planes getIdPlanes() {
        return idPlanes;
    }

    public void setIdPlanes(Planes idPlanes) {
        this.idPlanes = idPlanes;
    }
    
    
}
