/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menu;

import configuracion.*;
import usuario.*;
import java.awt.Dimension;

import clases.CambiaPanel;
/**
 *
 * @author jesus
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    
    public static int menuAlumno=0;
    
    String respuesta=null;
    public static Dimension pantalla;
        
    
    public Principal() {
        initComponents();
        this.setLocationRelativeTo(null);
        pantalla=panelPrincipal.getSize();
        
        desactivarPanel();
        Login log=new Login();
        panelPrincipal.add(log);
        log.setVisible(true);
        
        menuAlumno=0;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        escritorio = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        panelPrincipal = new javax.swing.JPanel();
        panelMenu = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnAlumnos = new javax.swing.JButton();
        btnEmpleados = new javax.swing.JButton();
        btnListados = new javax.swing.JButton();
        btnLicencias = new javax.swing.JButton();
        btnCursos = new javax.swing.JButton();
        panelUsuarios = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        panelSubMenu = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        btnCalleNuevo = new javax.swing.JMenuItem();
        btnCalleModificar = new javax.swing.JMenuItem();
        btnCalleConsulta = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem17 = new javax.swing.JMenuItem();
        jMenuItem18 = new javax.swing.JMenuItem();
        jMenuItem19 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem20 = new javax.swing.JMenuItem();
        jMenuItem21 = new javax.swing.JMenuItem();
        jMenuItem22 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem23 = new javax.swing.JMenuItem();
        jMenuItem24 = new javax.swing.JMenuItem();
        jMenuItem25 = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jMenuItem26 = new javax.swing.JMenuItem();
        jMenuItem27 = new javax.swing.JMenuItem();
        jMenuItem28 = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        jMenuItem29 = new javax.swing.JMenuItem();
        jMenuItem30 = new javax.swing.JMenuItem();
        jMenuItem31 = new javax.swing.JMenuItem();
        jMenu9 = new javax.swing.JMenu();
        jMenuItem32 = new javax.swing.JMenuItem();
        jMenuItem33 = new javax.swing.JMenuItem();
        jMenuItem34 = new javax.swing.JMenuItem();
        jMenu10 = new javax.swing.JMenu();
        jMenuItem35 = new javax.swing.JMenuItem();
        jMenuItem36 = new javax.swing.JMenuItem();
        jMenuItem37 = new javax.swing.JMenuItem();
        jMenu11 = new javax.swing.JMenu();
        jMenuItem38 = new javax.swing.JMenuItem();
        jMenuItem39 = new javax.swing.JMenuItem();
        jMenuItem40 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();

        jMenuItem8.setText("jMenuItem8");

        jMenuItem9.setText("jMenuItem9");

        jMenuItem13.setText("jMenuItem13");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        escritorio.setMaximumSize(new java.awt.Dimension(1000, 600));
        escritorio.setMinimumSize(new java.awt.Dimension(1000, 600));
        escritorio.setRequestFocusEnabled(false);

        jPanel1.setBackground(new java.awt.Color(38, 86, 186));
        jPanel1.setMaximumSize(new java.awt.Dimension(1000, 100));
        jPanel1.setMinimumSize(new java.awt.Dimension(1000, 100));

        jLabel1.setFont(new java.awt.Font("Ubuntu", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(254, 238, 238));
        jLabel1.setText("Centro de Formacion Profesional 1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(424, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(24, 24, 24))
        );

        escritorio.add(jPanel1);
        jPanel1.setBounds(0, 0, 1000, 100);

        panelPrincipal.setBackground(new java.awt.Color(239, 238, 240));
        panelPrincipal.setMaximumSize(new java.awt.Dimension(1000, 500));

        panelMenu.setBackground(new java.awt.Color(239, 238, 240));
        panelMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        jLabel2.setText("Menu");
        panelMenu.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 23, -1, -1));

        btnAlumnos.setBackground(new java.awt.Color(239, 238, 240));
        btnAlumnos.setText("Alumnos");
        btnAlumnos.setBorderPainted(false);
        btnAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlumnosActionPerformed(evt);
            }
        });
        panelMenu.add(btnAlumnos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 240, 30));

        btnEmpleados.setBackground(new java.awt.Color(239, 238, 240));
        btnEmpleados.setText("Empleados");
        btnEmpleados.setBorderPainted(false);
        btnEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmpleadosActionPerformed(evt);
            }
        });
        panelMenu.add(btnEmpleados, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 240, -1));

        btnListados.setBackground(new java.awt.Color(239, 238, 240));
        btnListados.setText("Listados");
        btnListados.setBorderPainted(false);
        btnListados.setMaximumSize(new java.awt.Dimension(240, 40));
        btnListados.setMinimumSize(new java.awt.Dimension(240, 40));
        btnListados.setPreferredSize(new java.awt.Dimension(240, 40));
        btnListados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListadosActionPerformed(evt);
            }
        });
        panelMenu.add(btnListados, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 240, 30));

        btnLicencias.setBackground(new java.awt.Color(239, 238, 240));
        btnLicencias.setText("Licencias");
        btnLicencias.setBorderPainted(false);
        btnLicencias.setMaximumSize(new java.awt.Dimension(240, 40));
        btnLicencias.setMinimumSize(new java.awt.Dimension(240, 40));
        btnLicencias.setPreferredSize(new java.awt.Dimension(240, 40));
        btnLicencias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLicenciasActionPerformed(evt);
            }
        });
        panelMenu.add(btnLicencias, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 240, 30));

        btnCursos.setBackground(new java.awt.Color(239, 238, 240));
        btnCursos.setText("Cursos");
        btnCursos.setBorderPainted(false);
        btnCursos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCursosActionPerformed(evt);
            }
        });
        panelMenu.add(btnCursos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 240, -1));

        panelUsuarios.setBackground(new java.awt.Color(239, 238, 240));
        panelUsuarios.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        jLabel3.setText("Usuarios");
        panelUsuarios.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(74, 29, -1, -1));

        jButton5.setBackground(new java.awt.Color(239, 238, 240));
        jButton5.setText("Ver usuarios conectados");
        jButton5.setBorderPainted(false);
        panelUsuarios.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 240, 30));

        jButton6.setBackground(new java.awt.Color(239, 238, 240));
        jButton6.setText("Crear Usuarios");
        jButton6.setBorderPainted(false);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        panelUsuarios.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 240, 30));

        jButton7.setBackground(new java.awt.Color(239, 238, 240));
        jButton7.setText("Modificar Usuario");
        jButton7.setBorderPainted(false);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        panelUsuarios.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 240, 30));

        jButton8.setBackground(new java.awt.Color(239, 238, 240));
        jButton8.setText("Eliminar Usuario");
        jButton8.setBorderPainted(false);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        panelUsuarios.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 240, 30));

        panelSubMenu.setBackground(new java.awt.Color(239, 238, 240));

        javax.swing.GroupLayout panelSubMenuLayout = new javax.swing.GroupLayout(panelSubMenu);
        panelSubMenu.setLayout(panelSubMenuLayout);
        panelSubMenuLayout.setHorizontalGroup(
            panelSubMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 334, Short.MAX_VALUE)
        );
        panelSubMenuLayout.setVerticalGroup(
            panelSubMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelSubMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(420, Short.MAX_VALUE))
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addComponent(panelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(panelUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(panelSubMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        escritorio.add(panelPrincipal);
        panelPrincipal.setBounds(0, 100, 1000, 500);

        jMenu1.setText("Configuración");

        jMenu3.setText("Calle");

        btnCalleNuevo.setText("Nuevo");
        btnCalleNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalleNuevoActionPerformed(evt);
            }
        });
        jMenu3.add(btnCalleNuevo);

        btnCalleModificar.setText("Modificar");
        btnCalleModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalleModificarActionPerformed(evt);
            }
        });
        jMenu3.add(btnCalleModificar);

        btnCalleConsulta.setText("Consulta");
        btnCalleConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalleConsultaActionPerformed(evt);
            }
        });
        jMenu3.add(btnCalleConsulta);

        jMenu1.add(jMenu3);

        jMenu4.setText("Barrio");

        jMenuItem17.setText("Nueva");
        jMenuItem17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem17ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem17);

        jMenuItem18.setText("Modificar");
        jMenuItem18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem18ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem18);

        jMenuItem19.setText("Consulta");
        jMenuItem19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem19ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem19);

        jMenu1.add(jMenu4);

        jMenu5.setText("Localidad");

        jMenuItem20.setText("Nuevo");
        jMenuItem20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem20ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem20);

        jMenuItem21.setText("Modificar");
        jMenuItem21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem21ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem21);

        jMenuItem22.setText("Consulta");
        jMenuItem22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem22ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem22);

        jMenu1.add(jMenu5);

        jMenu6.setText("Cargo");

        jMenuItem23.setText("Nuevo");
        jMenuItem23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem23ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem23);

        jMenuItem24.setText("Modificar");
        jMenuItem24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem24ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem24);

        jMenuItem25.setText("Consulta");
        jMenuItem25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem25ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem25);

        jMenu1.add(jMenu6);

        jMenu7.setText("Titulo");

        jMenuItem26.setText("Nuevo");
        jMenuItem26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem26ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem26);

        jMenuItem27.setText("Modificar");
        jMenuItem27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem27ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem27);

        jMenuItem28.setText("Consulta");
        jMenuItem28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem28ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem28);

        jMenu1.add(jMenu7);

        jMenu8.setText("Plan");

        jMenuItem29.setText("Nuevo");
        jMenuItem29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem29ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem29);

        jMenuItem30.setText("Modificar");
        jMenuItem30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem30ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem30);

        jMenuItem31.setText("Consulta");
        jMenuItem31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem31ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem31);

        jMenu1.add(jMenu8);

        jMenu9.setText("Gremio");

        jMenuItem32.setText("Nuevo");
        jMenuItem32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem32ActionPerformed(evt);
            }
        });
        jMenu9.add(jMenuItem32);

        jMenuItem33.setText("Modificar");
        jMenuItem33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem33ActionPerformed(evt);
            }
        });
        jMenu9.add(jMenuItem33);

        jMenuItem34.setText("Consulta");
        jMenuItem34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem34ActionPerformed(evt);
            }
        });
        jMenu9.add(jMenuItem34);

        jMenu1.add(jMenu9);

        jMenu10.setText("Lugar de cursado");

        jMenuItem35.setText("Nuevo");
        jMenuItem35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem35ActionPerformed(evt);
            }
        });
        jMenu10.add(jMenuItem35);

        jMenuItem36.setText("Modificar");
        jMenuItem36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem36ActionPerformed(evt);
            }
        });
        jMenu10.add(jMenuItem36);

        jMenuItem37.setText("Consulta");
        jMenuItem37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem37ActionPerformed(evt);
            }
        });
        jMenu10.add(jMenuItem37);

        jMenu1.add(jMenu10);

        jMenu11.setText("Trabajo");

        jMenuItem38.setText("Nuevo");
        jMenuItem38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem38ActionPerformed(evt);
            }
        });
        jMenu11.add(jMenuItem38);

        jMenuItem39.setText("Modificar");
        jMenuItem39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem39ActionPerformed(evt);
            }
        });
        jMenu11.add(jMenuItem39);

        jMenuItem40.setText("Consulta");
        jMenuItem40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem40ActionPerformed(evt);
            }
        });
        jMenu11.add(jMenuItem40);

        jMenu1.add(jMenu11);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Salir");

        jMenuItem5.setText("Salir");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(escritorio, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(escritorio, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void centrarPantalla(int medidaHeight,int medidaWidth,int location){
        
        
        panelPrincipal.setLocation((pantalla.width - medidaWidth)/2,(pantalla.height - medidaHeight)/2);
    
        
    }
    
    public static void desactivarPanel(){
        panelMenu.setVisible(false);
        panelUsuarios.setVisible(false);
        panelSubMenu.setVisible(false);
    }
    
    public static void activarPanel(){
        panelMenu.setVisible(true);
        panelUsuarios.setVisible(true);
        panelSubMenu.setVisible(true);
        
        menuAlumno=0;
    }
    
    public static void crearBarrio(){
        Barrio_crear barrio=new Barrio_crear();
        panelPrincipal.add(barrio);
        barrio.setVisible(true);
        
    }
    public static void modificarBarrio(){
        Barrio_modificar barrio=new Barrio_modificar();
        panelPrincipal.add(barrio);
        barrio.setVisible(true);
        
    }
    public static void consultaBarrio(){
        Barrio_consulta barrio=new Barrio_consulta();
        panelPrincipal.add(barrio);
        barrio.setVisible(true);
        
    }
    
    public static void crearCalle(){
        
        Calles_crear nuevo=new Calles_crear();
        panelPrincipal.add(nuevo);
        nuevo.setVisible(true);
        
    }
    public static void modificarCalle(){
        
        Calles_modificar calle=new Calles_modificar();
        panelPrincipal.add(calle);
        calle.setVisible(true);
        
    }
    public static void consultaCalle(){
        Calles_consulta calle=new Calles_consulta();
        panelPrincipal.add(calle);
        calle.setVisible(true);
    }
    
    public static void crearCargo(){
        Cargo_crear cargo=new Cargo_crear();
                
        panelPrincipal.add(cargo);
        cargo.setVisible(true);
        
    }
    public static void modificarCargo(){
        Cargo_modificar cargo=new Cargo_modificar();
                
        panelPrincipal.add(cargo);
        cargo.setVisible(true);
        
    }
    public static void consultaCargo(){
        Cargo_consulta cargo=new Cargo_consulta();
        
        panelPrincipal.add(cargo);
        cargo.setVisible(true);
        
    }
    
    public static void crearCursado(){
         Cursado_crear curso=new Cursado_crear();
        
        panelPrincipal.add(curso);
        curso.setVisible(true);
        
    }
    public static void modificarCursado(){
         Cursado_modificar curso=new Cursado_modificar();
        
        panelPrincipal.add(curso);
        curso.setVisible(true);
        
    }
    public static void consultaCursado(){
        Cursado_consulta curso=new Cursado_consulta();
        
        panelPrincipal.add(curso);
        curso.setVisible(true);
        
    }
    
    public static void crearGremio(){
        Gremio_crear gremio=new Gremio_crear();
        
        panelPrincipal.add(gremio);
        gremio.setVisible(true);
        
    }
    public static void modificarGremio(){
        Gremio_modificar gremio=new Gremio_modificar();
        
        panelPrincipal.add(gremio);
        gremio.setVisible(true);
        
    }
    public static void consultaGremio(){
        Gremio_consulta gremio=new Gremio_consulta();
        
        panelPrincipal.add(gremio);
        gremio.setVisible(true);
        
    }
    
    public static void crearLocalidad(){
        Localidad_crear localidad= new Localidad_crear();
        
        panelPrincipal.add(localidad);
        localidad.setVisible(true);
        
    }
    public static void modificarLocalidad(){
        Localidad_modificar localidad=new Localidad_modificar();
        
        
        panelPrincipal.add(localidad);
        localidad.setVisible(true);
        
    }
    public static void consultaLocalidad(){
        Localidad_consulta localidad=new Localidad_consulta();
        
        panelPrincipal.add(localidad);
        localidad.setVisible(true);
    }
    
    public static void crearNacionalidad(){
        Nacionalidad_crear nacion= new Nacionalidad_crear();
        
        panelPrincipal.add(nacion);
        nacion.setVisible(true);
        
    }
    public static void modificarNacionalidad(){
        Nacionalidad_modificar nacion= new Nacionalidad_modificar();
        
        panelPrincipal.add(nacion);
        nacion.setVisible(true);
        
    }
    public static void consultaNacionalidad(){
        Nacionalidad_consulta nacion= new Nacionalidad_consulta();
        
        panelPrincipal.add(nacion);
        nacion.setVisible(true);
    }
    
    public static void crearPlan(){
        Plan_crear plan=new Plan_crear();
        
        panelPrincipal.add(plan);
        plan.setVisible(true);
        
    }
    public static void modificarPlan(){
        
        Plan_modificar plan=new Plan_modificar();
        
        panelPrincipal.add(plan);
        plan.setVisible(true);
        
    }
    public static void consultaPlan(){
        Plan_consulta plan=new Plan_consulta();
        
        panelPrincipal.add(plan);
        plan.setVisible(true);
        
    }
    
    public static void crearTitulo(){
        Titulo_crear titulo=new Titulo_crear();
             
        panelPrincipal.add(titulo);
        titulo.setVisible(true);
        
    }
    public static void modificarTitulo(){
        Titulo_modificar titulo= new Titulo_modificar();
        
        panelPrincipal.add(titulo);
        titulo.setVisible(true);
        
    }
    public static void consultaTitulo(){
        Titulo_consulta titulo=new Titulo_consulta();
        
        panelPrincipal.add(titulo);
        titulo.setVisible(true);
        
    }
    
    public static void crearTrabajo(){
        Trabajo_crear trabajo=new Trabajo_crear();
        panelPrincipal.add(trabajo);
        trabajo.setVisible(true);
        
    }
    public static void modificarTrabajo(){
        Trabajo_modificar trabajo=new Trabajo_modificar();
        panelPrincipal.add(trabajo);
        trabajo.setVisible(true);
        
    }
    public static void consultaTrabajo(){
        Trabajo_consulta trabajo=new Trabajo_consulta();
        panelPrincipal.add(trabajo);
        trabajo.setVisible(true);
    }
    
    private void btnAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlumnosActionPerformed
        // TODO add your handling code here:
        
        /*desactivarPanel();
        
        MenuAlumno menu1=new MenuAlumno();
        panelPrincipal.add(menu1);
        menu1.setVisible(true);*/
        
        /*AlumnoMenu menu1=new AlumnoMenu();
        panelSubMenu.add(menu1);
        menu1.setVisible(true);*/
        
        // new CambiaPanel(fondo, new InscOpciones());
        
        new CambiaPanel(panelSubMenu, new AlumnoMenu());
    }//GEN-LAST:event_btnAlumnosActionPerformed

    private void btnListadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListadosActionPerformed

        new CambiaPanel(panelSubMenu, new ListadoMenu());
    }//GEN-LAST:event_btnListadosActionPerformed

    private void btnLicenciasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLicenciasActionPerformed

        new CambiaPanel(panelSubMenu, new LicenciaMenu());
    }//GEN-LAST:event_btnLicenciasActionPerformed

    private void btnCursosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCursosActionPerformed
        // TODO add your handling code here:
        /*desactivarPanel();
        MenuCursos curso=new MenuCursos();
        panelPrincipal.add(curso);
        curso.setVisible(true);*/
        
        new CambiaPanel(panelSubMenu, new CursosMenu());
    }//GEN-LAST:event_btnCursosActionPerformed

    private void jMenuItem30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem30ActionPerformed
        // TODO add your handling code here:
       desactivarPanel();
       modificarPlan();
    }//GEN-LAST:event_jMenuItem30ActionPerformed

    private void btnCalleNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalleNuevoActionPerformed
        // TODO add your handling code here:
        desactivarPanel();
        
        crearCalle();
    }//GEN-LAST:event_btnCalleNuevoActionPerformed

    private void btnCalleModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalleModificarActionPerformed
        // TODO add your handling code here:
        desactivarPanel();
        
        modificarCalle();
    }//GEN-LAST:event_btnCalleModificarActionPerformed

    private void btnCalleConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalleConsultaActionPerformed
        // TODO add your handling code here:
        
        desactivarPanel();
        
        consultaCalle();
    }//GEN-LAST:event_btnCalleConsultaActionPerformed

    private void jMenuItem17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem17ActionPerformed
        // TODO add your handling code here:
        desactivarPanel();
        
        crearBarrio();
    }//GEN-LAST:event_jMenuItem17ActionPerformed

    
    private void jMenuItem18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem18ActionPerformed
        // TODO add your handling code here:
        desactivarPanel();
      
        modificarBarrio();
    }//GEN-LAST:event_jMenuItem18ActionPerformed

    private void jMenuItem19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem19ActionPerformed
        // TODO add your handling code here:
        desactivarPanel();
        
        consultaBarrio();
    }//GEN-LAST:event_jMenuItem19ActionPerformed

    private void jMenuItem20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem20ActionPerformed
        // TODO add your handling code here:
       desactivarPanel();
        
       crearLocalidad();
    }//GEN-LAST:event_jMenuItem20ActionPerformed

    private void jMenuItem21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem21ActionPerformed
        // TODO add your handling code here:
        desactivarPanel();
        modificarLocalidad();
    }//GEN-LAST:event_jMenuItem21ActionPerformed

    private void jMenuItem22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem22ActionPerformed
        // TODO add your handling code here:
        desactivarPanel();
        consultaLocalidad();
    }//GEN-LAST:event_jMenuItem22ActionPerformed

    private void jMenuItem23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem23ActionPerformed
        // TODO add your handling code here:
        desactivarPanel();
        
        crearCargo();
    }//GEN-LAST:event_jMenuItem23ActionPerformed

    private void jMenuItem24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem24ActionPerformed
        // TODO add your handling code here:
        desactivarPanel();
        
        modificarCargo();
    }//GEN-LAST:event_jMenuItem24ActionPerformed

    private void jMenuItem25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem25ActionPerformed
        // TODO add your handling code here:
        desactivarPanel();
        
        consultaCargo();
    }//GEN-LAST:event_jMenuItem25ActionPerformed

    private void jMenuItem26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem26ActionPerformed
        // TODO add your handling code here:
        desactivarPanel();
        
        crearTitulo();
    }//GEN-LAST:event_jMenuItem26ActionPerformed

    private void jMenuItem27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem27ActionPerformed
        // TODO add your handling code here:
        desactivarPanel();
        
        modificarTitulo();
    }//GEN-LAST:event_jMenuItem27ActionPerformed

    private void jMenuItem28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem28ActionPerformed
        // TODO add your handling code here:
        desactivarPanel();
        
        consultaTitulo();
    }//GEN-LAST:event_jMenuItem28ActionPerformed

    private void jMenuItem29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem29ActionPerformed
        // TODO add your handling code here:
        desactivarPanel();
        
        crearPlan();
    }//GEN-LAST:event_jMenuItem29ActionPerformed

    private void jMenuItem31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem31ActionPerformed
        // TODO add your handling code here:
        desactivarPanel();
        
        consultaPlan();
    }//GEN-LAST:event_jMenuItem31ActionPerformed

    private void jMenuItem32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem32ActionPerformed
        // TODO add your handling code here:
        desactivarPanel();
        
        crearGremio();
    }//GEN-LAST:event_jMenuItem32ActionPerformed

    private void jMenuItem33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem33ActionPerformed
        // TODO add your handling code here:
        desactivarPanel();
        
        modificarGremio();
    }//GEN-LAST:event_jMenuItem33ActionPerformed

    private void jMenuItem34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem34ActionPerformed
        // TODO add your handling code here:
        desactivarPanel();
        
        consultaGremio();
    }//GEN-LAST:event_jMenuItem34ActionPerformed

    private void jMenuItem35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem35ActionPerformed
        // TODO add your handling code here:
        desactivarPanel();
        
       crearCursado();
    }//GEN-LAST:event_jMenuItem35ActionPerformed

    private void jMenuItem36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem36ActionPerformed
        // TODO add your handling code here:
        desactivarPanel();
        
       modificarCursado();
    }//GEN-LAST:event_jMenuItem36ActionPerformed

    private void jMenuItem37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem37ActionPerformed
        // TODO add your handling code here:
        desactivarPanel();
        
        consultaCursado();
    }//GEN-LAST:event_jMenuItem37ActionPerformed

    private void jMenuItem38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem38ActionPerformed
        // TODO add your handling code here:
        desactivarPanel();
        crearTrabajo();
    }//GEN-LAST:event_jMenuItem38ActionPerformed

    private void jMenuItem39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem39ActionPerformed
        // TODO add your handling code here:
        desactivarPanel();
        modificarTrabajo();
    }//GEN-LAST:event_jMenuItem39ActionPerformed

    private void jMenuItem40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem40ActionPerformed
        // TODO add your handling code here:
        desactivarPanel();
        consultaTrabajo();
    }//GEN-LAST:event_jMenuItem40ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        desactivarPanel();
        CrearUsuario user= new CrearUsuario();
        panelPrincipal.add(user);
        user.setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        new CambiaPanel(panelSubMenu, new UsuarioMenu());
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        desactivarPanel();
        
        EliminarUsuario user= new EliminarUsuario();
        panelPrincipal.add(user);
        user.setVisible(true);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void btnEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmpleadosActionPerformed
        // TODO add your handling code here:
        new CambiaPanel(panelSubMenu, new EmpleadoMenu());
    }//GEN-LAST:event_btnEmpleadosActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlumnos;
    private javax.swing.JMenuItem btnCalleConsulta;
    private javax.swing.JMenuItem btnCalleModificar;
    private javax.swing.JMenuItem btnCalleNuevo;
    private javax.swing.JButton btnCursos;
    private javax.swing.JButton btnEmpleados;
    private javax.swing.JButton btnLicencias;
    private javax.swing.JButton btnListados;
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu11;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem18;
    private javax.swing.JMenuItem jMenuItem19;
    private javax.swing.JMenuItem jMenuItem20;
    private javax.swing.JMenuItem jMenuItem21;
    private javax.swing.JMenuItem jMenuItem22;
    private javax.swing.JMenuItem jMenuItem23;
    private javax.swing.JMenuItem jMenuItem24;
    private javax.swing.JMenuItem jMenuItem25;
    private javax.swing.JMenuItem jMenuItem26;
    private javax.swing.JMenuItem jMenuItem27;
    private javax.swing.JMenuItem jMenuItem28;
    private javax.swing.JMenuItem jMenuItem29;
    private javax.swing.JMenuItem jMenuItem30;
    private javax.swing.JMenuItem jMenuItem31;
    private javax.swing.JMenuItem jMenuItem32;
    private javax.swing.JMenuItem jMenuItem33;
    private javax.swing.JMenuItem jMenuItem34;
    private javax.swing.JMenuItem jMenuItem35;
    private javax.swing.JMenuItem jMenuItem36;
    private javax.swing.JMenuItem jMenuItem37;
    private javax.swing.JMenuItem jMenuItem38;
    private javax.swing.JMenuItem jMenuItem39;
    private javax.swing.JMenuItem jMenuItem40;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JPanel panelMenu;
    public static javax.swing.JPanel panelPrincipal;
    public static javax.swing.JPanel panelSubMenu;
    public static javax.swing.JPanel panelUsuarios;
    // End of variables declaration//GEN-END:variables

}
