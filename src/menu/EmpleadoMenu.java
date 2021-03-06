/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menu;

import interfazEmpleado.*;
/**
 *
 * @author araa
 */
public class EmpleadoMenu extends javax.swing.JPanel {

    /**
     * Creates new form EmpleadoMenu
     */
    public EmpleadoMenu() {
        initComponents();
        
        this.setBounds(0, 95, 240, 174);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnRegistrarEmpleado = new javax.swing.JButton();
        btnAsignarCurso = new javax.swing.JButton();
        btnConsultarEstado = new javax.swing.JButton();
        btnModificarDatos = new javax.swing.JButton();
        btnBorrarEmpleado = new javax.swing.JButton();

        setBackground(new java.awt.Color(239, 238, 240));

        btnRegistrarEmpleado.setText("Registrar Empleado");
        btnRegistrarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarEmpleadoActionPerformed(evt);
            }
        });

        btnAsignarCurso.setText("Asignar Curso");
        btnAsignarCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAsignarCursoActionPerformed(evt);
            }
        });

        btnConsultarEstado.setText("Consultar Estado");
        btnConsultarEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarEstadoActionPerformed(evt);
            }
        });

        btnModificarDatos.setText("Modificar Empleado");
        btnModificarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarDatosActionPerformed(evt);
            }
        });

        btnBorrarEmpleado.setText("Borrar Empleado");
        btnBorrarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarEmpleadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnConsultarEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addComponent(btnRegistrarEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(btnModificarDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(btnAsignarCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btnBorrarEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(btnRegistrarEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnModificarDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAsignarCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnConsultarEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBorrarEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarEmpleadoActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        Principal.desactivarPanel();
        
        Registro empleado= new Registro();
        Principal.panelPrincipal.add(empleado);
        empleado.setVisible(true);

    }//GEN-LAST:event_btnRegistrarEmpleadoActionPerformed

    private void btnAsignarCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAsignarCursoActionPerformed

        this.setVisible(false);
        Principal.desactivarPanel();
        
        AsignarCurso curso=new AsignarCurso();
        Principal.panelPrincipal.add(curso);
        curso.setVisible(true);
    }//GEN-LAST:event_btnAsignarCursoActionPerformed

    private void btnConsultarEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarEstadoActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        Principal.desactivarPanel();
        
        ConsultaEstado empleado=new ConsultaEstado();
        Principal.panelPrincipal.add(empleado);
        empleado.setVisible(true);
    }//GEN-LAST:event_btnConsultarEstadoActionPerformed

    private void btnModificarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarDatosActionPerformed
        // TODO add your handling code here:

        this.setVisible(false);
        Principal.desactivarPanel();
        
        Modificar empleado= new Modificar();
        Principal.panelPrincipal.add(empleado);
        empleado.setVisible(true);
    }//GEN-LAST:event_btnModificarDatosActionPerformed

    private void btnBorrarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarEmpleadoActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        Principal.desactivarPanel();
        
        Eliminar empleado=new Eliminar();
        Principal.panelPrincipal.add(empleado);
        empleado.setVisible(true);
    }//GEN-LAST:event_btnBorrarEmpleadoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAsignarCurso;
    private javax.swing.JButton btnBorrarEmpleado;
    private javax.swing.JButton btnConsultarEstado;
    private javax.swing.JButton btnModificarDatos;
    private javax.swing.JButton btnRegistrarEmpleado;
    // End of variables declaration//GEN-END:variables
}
