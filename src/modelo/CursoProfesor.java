/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author jesus
 */
public class CursoProfesor {

    private int idCursoProfesor;
    private Curso idCurso;
    private Empleado idEmpleado;

    public int getIdCursoProfesor() {
        return idCursoProfesor;
    }

    public void setIdCursoProfesor(int idCursoProfesor) {
        this.idCursoProfesor = idCursoProfesor;
    }

    public Curso getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(Curso idCurso) {
        this.idCurso = idCurso;
    }

    public Empleado getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(Empleado idEmpleado) {
        this.idEmpleado = idEmpleado;
    }
}
