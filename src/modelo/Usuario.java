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
public class Usuario {
    
    private int idUsuario;
    private String pass;
    private Jerarquia idJerarquia;
    private Persona idPersona;

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public Jerarquia getIdJerarquia() {
        return idJerarquia;
    }

    public void setIdJerarquia(Jerarquia idJerarquia) {
        this.idJerarquia = idJerarquia;
    }

    public Persona getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(Persona idPersona) {
        this.idPersona = idPersona;
    }
    
    
}
