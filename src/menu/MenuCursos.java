/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menu;

import curso.*;
/**
 *
 * @author jesus
 */
public class MenuCursos extends javax.swing.JInternalFrame {

    /**
     * Creates new form menuCursos
     */
    public MenuCursos() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnCrearCurso = new javax.swing.JButton();
        btnModificarCurso = new javax.swing.JButton();
        btnHorario = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(560, 315));
        setMinimumSize(new java.awt.Dimension(560, 315));
        setPreferredSize(new java.awt.Dimension(560, 315));

        jPanel1.setMaximumSize(new java.awt.Dimension(560, 315));
        jPanel1.setMinimumSize(new java.awt.Dimension(560, 315));
        jPanel1.setPreferredSize(new java.awt.Dimension(560, 315));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCrearCurso.setText("Crear");
        btnCrearCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearCursoActionPerformed(evt);
            }
        });
        jPanel1.add(btnCrearCurso, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, -1, -1));

        btnModificarCurso.setText("Modificar");
        btnModificarCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarCursoActionPerformed(evt);
            }
        });
        jPanel1.add(btnModificarCurso, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 70, -1, -1));

        btnHorario.setText("Aceptar");
        btnHorario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHorarioActionPerformed(evt);
            }
        });
        jPanel1.add(btnHorario, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 170, -1, -1));

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jPanel1.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 220, -1, -1));

        jLabel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Crear Horario", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, 170, 70));

        jLabel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Crear Curso", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 170, 70));

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, -1, -1));

        jLabel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Modificar Curso", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 170, 70));

        jLabel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Modificar Curso", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 50, 170, 70));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCrearCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearCursoActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        
        CrearCurso curso=new CrearCurso();
        Principal.panelPrincipal.add(curso);
        curso.setVisible(true);
    }//GEN-LAST:event_btnCrearCursoActionPerformed

    private void btnModificarCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarCursoActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        
        ModificarCurso curso= new ModificarCurso();
        Principal.panelPrincipal.add(curso);
        curso.setVisible(true);
    }//GEN-LAST:event_btnModificarCursoActionPerformed

    private void btnHorarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHorarioActionPerformed
        // TODO add your handling code here:
        
        this.setVisible(false);
        
        Horario hora=new Horario();
        Principal.panelPrincipal.add(hora);
        hora.setVisible(true);
    }//GEN-LAST:event_btnHorarioActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        
        EliminarCurso curso=new EliminarCurso();
        Principal.panelPrincipal.add(curso);
        curso.setVisible(true);
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        Principal.activarPanel();
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrearCurso;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnHorario;
    private javax.swing.JButton btnModificarCurso;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
