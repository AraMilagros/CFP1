/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

/**
 *
 * @author jesus
 */
public class menuEmpleado extends javax.swing.JInternalFrame {

    /**
     * Creates new form menuEmpleado
     */
    public menuEmpleado() {
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
        btnRegistrarEmpleado = new javax.swing.JButton();
        btnAsignarCurso = new javax.swing.JButton();
        btnConsultarEstado = new javax.swing.JButton();
        btnModificarDatos = new javax.swing.JButton();
        btnBorrarEmpleado = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        btnRegistrarEmpleado.setText("Aceptar");

        btnAsignarCurso.setText("Aceptar");
        btnAsignarCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAsignarCursoActionPerformed(evt);
            }
        });

        btnConsultarEstado.setText("Aceptar");

        btnModificarDatos.setText("Aceptar");

        btnBorrarEmpleado.setText("Aceptar");

        btnSalir.setText("Salir");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addComponent(btnRegistrarEmpleado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 201, Short.MAX_VALUE)
                .addComponent(btnAsignarCurso)
                .addGap(191, 191, 191)
                .addComponent(btnConsultarEstado)
                .addGap(171, 171, 171))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(232, 232, 232)
                .addComponent(btnModificarDatos)
                .addGap(208, 208, 208)
                .addComponent(btnBorrarEmpleado)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSalir)
                .addGap(46, 46, 46))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistrarEmpleado)
                    .addComponent(btnAsignarCurso)
                    .addComponent(btnConsultarEstado))
                .addGap(77, 77, 77)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnModificarDatos)
                    .addComponent(btnBorrarEmpleado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 109, Short.MAX_VALUE)
                .addComponent(btnSalir)
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAsignarCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAsignarCursoActionPerformed
    }//GEN-LAST:event_btnAsignarCursoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAsignarCurso;
    private javax.swing.JButton btnBorrarEmpleado;
    private javax.swing.JButton btnConsultarEstado;
    private javax.swing.JButton btnModificarDatos;
    private javax.swing.JButton btnRegistrarEmpleado;
    private javax.swing.JButton btnSalir;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}