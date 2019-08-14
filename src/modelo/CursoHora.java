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
public class CursoHora {
    
    private int idCursoHora;
    private Horario idHorario;
    private Curso idCurso;

    public int getIdCursoHora() {
        return idCursoHora;
    }

    public void setIdCursoHora(int idCursoHora) {
        this.idCursoHora = idCursoHora;
    }

    public Horario getIdHorario() {
        return idHorario;
    }

    public void setIdHorario(Horario idHorario) {
        this.idHorario = idHorario;
    }

    public Curso getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(Curso idCurso) {
        this.idCurso = idCurso;
    }
    
    
}
