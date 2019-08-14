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
public class EmpleadoCargo {
    
    private int EmpleadoCargo;
    private Cargo idCargo;
    private Empleado idEmpleado;

    public int getEmpleadoCargo() {
        return EmpleadoCargo;
    }

    public void setEmpleadoCargo(int EmpleadoCargo) {
        this.EmpleadoCargo = EmpleadoCargo;
    }

    public Cargo getIdCargo() {
        return idCargo;
    }

    public void setIdCargo(Cargo idCargo) {
        this.idCargo = idCargo;
    }

    public Empleado getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(Empleado idEmpleado) {
        this.idEmpleado = idEmpleado;
    }
    
    
    
}
