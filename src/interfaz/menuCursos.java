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
public class menuCursos extends javax.swing.JInternalFrame {

    /**
     * Creates new form menuCursos
     */
    public menuCursos() {
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
        jLabel3 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(797, 343));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCrearCurso.setText("Crear");
        jPanel1.add(btnCrearCurso, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 156, -1, -1));

        btnModificarCurso.setText("Modificar");
        jPanel1.add(btnModificarCurso, new org.netbeans.lib.awtextra.AbsoluteConstraints(378, 156, -1, -1));

        btnHorario.setText("Aceptar");
        jPanel1.add(btnHorario, new org.netbeans.lib.awtextra.AbsoluteConstraints(641, 156, -1, -1));

        btnSalir.setText("Salir");
        jPanel1.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(791, 335, -1, -1));

        jLabel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Crear Horario", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 130, 170, 70));

        jLabel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Crear Curso", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 170, 70));

        jLabel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Modificar Curso", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 130, 170, 70));

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrearCurso;
    private javax.swing.JButton btnHorario;
    private javax.swing.JButton btnModificarCurso;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
