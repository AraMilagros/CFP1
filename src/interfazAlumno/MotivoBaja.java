package interfazAlumno;

import javax.swing.JOptionPane;
import menu.Principal;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Karen Rodriguez
 */
public class MotivoBaja extends javax.swing.JInternalFrame {

    /**
     * Creates new form MotivoBaja
     */
    public MotivoBaja() {
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

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        txtdetalle = new javax.swing.JTextField();
        btndardebaja = new javax.swing.JButton();
        btnanterior = new javax.swing.JButton();

        jPanel2.setBackground(new java.awt.Color(38, 86, 186));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Baja Alumno");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 273, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jButton8.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton8.setBorderPainted(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Motivo de Baja");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 12, 174, 34));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Eliga el Motivo o la Situacion del Alumno:" }));
        jComboBox1.setToolTipText("");
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 52, 231, 33));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Detalle");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 110, 170, 27));
        jPanel1.add(txtdetalle, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 143, 255, 34));

        btndardebaja.setBackground(new java.awt.Color(38, 86, 186));
        btndardebaja.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btndardebaja.setForeground(new java.awt.Color(255, 255, 255));
        btndardebaja.setText("Dar de Baja");
        btndardebaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndardebajaActionPerformed(evt);
            }
        });
        jPanel1.add(btndardebaja, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 189, 146, -1));

        btnanterior.setBackground(new java.awt.Color(38, 86, 186));
        btnanterior.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnanterior.setForeground(new java.awt.Color(255, 255, 255));
        btnanterior.setText("Anterior");
        btnanterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnanteriorActionPerformed(evt);
            }
        });
        jPanel1.add(btnanterior, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 137, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap(247, Short.MAX_VALUE)
                    .addComponent(jButton8)
                    .addGap(163, 163, 163)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(142, 142, 142)
                    .addComponent(jButton8)
                    .addContainerGap(242, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btndardebajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndardebajaActionPerformed
        // TODO add your handling code here
        this.setVisible(false);
        if(menu.Principal.menuAlumno==1){
            Eliminar elim=new Eliminar();
            Principal.panelPrincipal.add(elim);
            elim.setVisible(true);
        }else {
            if(menu.Principal.menuAlumno==0){
                JOptionPane.showMessageDialog(null, "No hay un alumno para dar de baja. \nPor favor ingrese desde 'Dar de baja' para seleccionarlo.");
                Principal.activarPanel();
            }
        }
    }//GEN-LAST:event_btndardebajaActionPerformed

    private void btnanteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnanteriorActionPerformed
        // TODO add your handling code here:
        Principal.activarPanel();
        dispose();
    }//GEN-LAST:event_btnanteriorActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnanterior;
    private javax.swing.JButton btndardebaja;
    private javax.swing.JButton jButton8;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtdetalle;
    // End of variables declaration//GEN-END:variables
}
