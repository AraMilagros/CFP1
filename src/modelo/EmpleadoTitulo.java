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
public class EmpleadoTitulo {
    
    private int idEmpleadoTitulo;
    private Titulo idTitulo;
    private Empleado idEmpleado;

    public int getIdEmpleadoTitulo() {
        return idEmpleadoTitulo;
    }

    public void setIdEmpleadoTitulo(int idEmpleadoTitulo) {
        this.idEmpleadoTitulo = idEmpleadoTitulo;
    }

    public Titulo getIdTitulo() {
        return idTitulo;
    }

    public void setIdTitulo(Titulo idTitulo) {
        this.idTitulo = idTitulo;
    }

    public Empleado getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(Empleado idEmpleado) {
        this.idEmpleado = idEmpleado;
    }
    
    
}
