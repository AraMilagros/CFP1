/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfazAlumno;

import menu.Principal;

/**
 *
 * @author Nero
 */
public class Inscripcion extends javax.swing.JInternalFrame {

    /**
     * Creates new form InscripcionAlumno
     */
    public Inscripcion() {
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
        jTextField6 = new javax.swing.JTextField();
        btncancelar = new javax.swing.JButton();
        btnguardar = new javax.swing.JButton();
        btntomarfoto = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        txtapellido = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jPanel3 = new javax.swing.JPanel();
        femenino = new javax.swing.JRadioButton();
        masculino = new javax.swing.JRadioButton();
        combonacimiento = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        combonacionalidad = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        combodocumento = new javax.swing.JComboBox<>();
        jLabel17 = new javax.swing.JLabel();
        txtnumerodocumento = new javax.swing.JTextField();
        txtcuil = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        panel = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        txttelefono = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txttelefonofijo = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtcorreo = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        comboplanes = new javax.swing.JComboBox<>();
        jLabel25 = new javax.swing.JLabel();
        combotrabajo = new javax.swing.JComboBox<>();
        jLabel26 = new javax.swing.JLabel();
        txthijos1 = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        combolocalidad = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        txtcodigopostal = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        combobarrio = new javax.swing.JComboBox<>();
        jLabel21 = new javax.swing.JLabel();
        combocalle = new javax.swing.JComboBox<>();
        jLabel20 = new javax.swing.JLabel();
        txthijos = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        combotorre = new javax.swing.JComboBox<>();
        jLabel23 = new javax.swing.JLabel();
        combopiso = new javax.swing.JComboBox<>();
        jLabel24 = new javax.swing.JLabel();
        txthijos2 = new javax.swing.JTextField();
        btnguardar1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtdni = new javax.swing.JTextField();
        btnverificar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setResizable(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField6.setText("FOTO");
        jPanel1.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 10, 161, 161));

        btncancelar.setBackground(new java.awt.Color(38, 86, 186));
        btncancelar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btncancelar.setForeground(new java.awt.Color(255, 255, 255));
        btncancelar.setText("Cancelar");
        btncancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelarActionPerformed(evt);
            }
        });
        jPanel1.add(btncancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 360, 130, -1));

        btnguardar.setBackground(new java.awt.Color(38, 86, 186));
        btnguardar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnguardar.setForeground(new java.awt.Color(255, 255, 255));
        btnguardar.setText("Realizar Pago");
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });
        jPanel1.add(btnguardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 300, 130, -1));

        btntomarfoto.setBackground(new java.awt.Color(38, 86, 186));
        btntomarfoto.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btntomarfoto.setForeground(new java.awt.Color(255, 255, 255));
        btntomarfoto.setText("Tomar foto");
        jPanel1.add(btntomarfoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 180, -1, -1));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos personales", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setText("Nombre");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 36, -1, -1));

        txtnombre.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel4.add(txtnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 65, 133, -1));

        txtapellido.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel4.add(txtapellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(199, 67, 133, -1));

        jLabel4.setText("Apellido");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(187, 38, -1, -1));

        jLabel5.setText("Fecha de nacimiento");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(344, 29, -1, -1));
        jPanel4.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(356, 58, -1, -1));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Sexo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        femenino.setBackground(new java.awt.Color(255, 255, 255));
        femenino.setText("Femenino");
        jPanel3.add(femenino, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 29, -1, -1));

        masculino.setBackground(new java.awt.Color(255, 255, 255));
        masculino.setText("Masculino");
        jPanel3.add(masculino, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 29, -1, -1));

        jPanel4.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(499, 29, -1, 57));

        combonacimiento.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        combonacimiento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "seleccionar" }));
        combonacimiento.setToolTipText("");
        jPanel4.add(combonacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 127, -1, -1));

        jLabel15.setText("Lugar De Nacimiento");
        jPanel4.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 104, -1, -1));

        combonacionalidad.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        combonacionalidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "seleccionar" }));
        combonacionalidad.setToolTipText("");
        jPanel4.add(combonacionalidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(187, 127, -1, -1));

        jLabel14.setText("Nacionalidad");
        jPanel4.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 104, -1, -1));

        jLabel13.setText("Tipo Documento");
        jPanel4.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(306, 104, -1, -1));

        combodocumento.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        combodocumento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "seleccionar" }));
        combodocumento.setToolTipText("");
        jPanel4.add(combodocumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(318, 127, -1, -1));

        jLabel17.setText("N° Documento");
        jPanel4.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(437, 104, -1, -1));

        txtnumerodocumento.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel4.add(txtnumerodocumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(449, 127, 98, -1));

        txtcuil.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel4.add(txtcuil, new org.netbeans.lib.awtextra.AbsoluteConstraints(588, 127, 94, -1));

        jLabel8.setText("CUIL");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(559, 104, -1, -1));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 180));

        panel.setBackground(new java.awt.Color(255, 255, 255));
        panel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "contactos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N
        panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setText("Telefono");
        panel.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 29, -1, -1));

        txttelefono.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        panel.add(txttelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 52, 101, -1));

        jLabel18.setText("Telefono Fijo");
        panel.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 82, -1, -1));

        txttelefonofijo.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        panel.add(txttelefonofijo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 105, 101, -1));

        jLabel10.setText("Correo");
        panel.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 135, -1, -1));

        txtcorreo.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        panel.add(txtcorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 158, 98, -1));

        jPanel1.add(panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 150, 200));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos Personales", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setText("Planes");
        jPanel7.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 29, -1, -1));

        comboplanes.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        comboplanes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar" }));
        jPanel7.add(comboplanes, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 53, -1, -1));

        jLabel25.setText("HIjos");
        jPanel7.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 83, -1, -1));

        combotrabajo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        combotrabajo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "seleccionar" }));
        combotrabajo.setToolTipText("");
        jPanel7.add(combotrabajo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 152, -1, -1));

        jLabel26.setText("Trabajo");
        jPanel7.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 129, -1, -1));

        txthijos1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel7.add(txthijos1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 106, 95, -1));

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 190, 150, 200));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Domicilio", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setText("Localidad");
        jPanel6.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 29, -1, -1));

        combolocalidad.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        combolocalidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar" }));
        jPanel6.add(combolocalidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, -1, -1));

        jLabel16.setText("Código postal");
        jPanel6.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, -1, -1));

        txtcodigopostal.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel6.add(txtcodigopostal, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 30, 95, -1));

        jLabel19.setText("Barrio");
        jPanel6.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        combobarrio.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        combobarrio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar" }));
        jPanel6.add(combobarrio, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        jLabel21.setText("Calle");
        jPanel6.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, -1, -1));

        combocalle.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        combocalle.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar" }));
        jPanel6.add(combocalle, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, -1, -1));

        jLabel20.setText("N° de casa");
        jPanel6.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 70, -1, -1));

        txthijos.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel6.add(txthijos, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 90, 80, -1));

        jLabel22.setText("Torre");
        jPanel6.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        combotorre.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        combotorre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar" }));
        combotorre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combotorreActionPerformed(evt);
            }
        });
        jPanel6.add(combotorre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));

        jLabel23.setText("Piso");
        jPanel6.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, -1, -1));

        combopiso.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        combopiso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar" }));
        jPanel6.add(combopiso, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, -1, -1));

        jLabel24.setText("N° de departamento");
        jPanel6.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 140, -1, -1));

        txthijos2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel6.add(txthijos2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 160, 80, -1));

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 450, 200));

        btnguardar1.setBackground(new java.awt.Color(38, 86, 186));
        btnguardar1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnguardar1.setForeground(new java.awt.Color(255, 255, 255));
        btnguardar1.setText("Guardar");
        jPanel1.add(btnguardar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 330, 130, -1));

        jPanel2.setBackground(new java.awt.Color(38, 86, 186));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Carga De Datos");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(742, 12, -1, 28));
        jPanel2.add(txtdni, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 12, 120, -1));

        btnverificar.setBackground(new java.awt.Color(0, 0, 0));
        btnverificar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnverificar.setForeground(new java.awt.Color(255, 255, 255));
        btnverificar.setText("Verificar");
        jPanel2.add(btnverificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(213, 13, 142, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("D.N.I");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 12, -1, 28));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 961, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 425, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btncancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelarActionPerformed
        // TODO add your handling code here:
        Principal.activarPanel();
        dispose();
    }//GEN-LAST:event_btncancelarActionPerformed

    private void combotorreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combotorreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combotorreActionPerformed

    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        
        Pago pago=new Pago();
        Principal.panelPrincipal.add(pago);
        pago.setVisible(true);
    }//GEN-LAST:event_btnguardarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncancelar;
    private javax.swing.JButton btnguardar;
    private javax.swing.JButton btnguardar1;
    private javax.swing.JButton btntomarfoto;
    private javax.swing.JButton btnverificar;
    private javax.swing.JComboBox<String> combobarrio;
    private javax.swing.JComboBox<String> combocalle;
    private javax.swing.JComboBox<String> combodocumento;
    private javax.swing.JComboBox<String> combolocalidad;
    private javax.swing.JComboBox<String> combonacimiento;
    private javax.swing.JComboBox<String> combonacionalidad;
    private javax.swing.JComboBox<String> combopiso;
    private javax.swing.JComboBox<String> comboplanes;
    private javax.swing.JComboBox<String> combotorre;
    private javax.swing.JComboBox<String> combotrabajo;
    private javax.swing.JRadioButton femenino;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JRadioButton masculino;
    private javax.swing.JPanel panel;
    private javax.swing.JTextField txtapellido;
    private javax.swing.JTextField txtcodigopostal;
    private javax.swing.JTextField txtcorreo;
    private javax.swing.JTextField txtcuil;
    private javax.swing.JTextField txtdni;
    private javax.swing.JTextField txthijos;
    private javax.swing.JTextField txthijos1;
    private javax.swing.JTextField txthijos2;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtnumerodocumento;
    private javax.swing.JTextField txttelefono;
    private javax.swing.JTextField txttelefonofijo;
    // End of variables declaration//GEN-END:variables
}
