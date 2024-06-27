package Ventanas;

public final class Consultar2 extends javax.swing.JFrame{
    public Consultar2(){
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
    }
    
    public void mostrar(int cedula, String nombre, String celular, String fecha, String modelo, String placa, String color){
        txt_cc.setText(cedula+"");
        txt_name.setText(nombre);
        txt_cell.setText(celular);
        txarea_dateingreso.setText(fecha);
        txt_modelo.setText(modelo);
        txt_placa.setText(placa);
        txt_color.setText(color);
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btn_consultar = new javax.swing.JButton();
        btn_registrar = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();
        btn_factura = new javax.swing.JButton();
        btn_salir = new javax.swing.JButton();
        Menu = new javax.swing.JLabel();
        jSeparatorMenu = new javax.swing.JSeparator();
        jSeparatorMenu1 = new javax.swing.JSeparator();
        jPanelMarcador = new javax.swing.JPanel();
        BG1 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        CUIDACAR = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel7 = new javax.swing.JPanel();
        INFORMACION = new javax.swing.JLabel();
        jLabelCC = new javax.swing.JLabel();
        jSeparatorCC = new javax.swing.JSeparator();
        txt_cc = new javax.swing.JTextField();
        jLabelname = new javax.swing.JLabel();
        jSeparatorname = new javax.swing.JSeparator();
        jSeparatorname1 = new javax.swing.JSeparator();
        txt_name = new javax.swing.JTextField();
        jLabelnumber = new javax.swing.JLabel();
        txt_cell = new javax.swing.JTextField();
        jLabeldate = new javax.swing.JLabel();
        jSeparatorDate = new javax.swing.JSeparator();
        txarea_dateingreso = new javax.swing.JTextArea();
        jLabelPlaca = new javax.swing.JLabel();
        jSeparatorplaca = new javax.swing.JSeparator();
        txt_placa = new javax.swing.JTextField();
        jSeparatorcell = new javax.swing.JSeparator();
        jLabelModelo = new javax.swing.JLabel();
        jSeparatorModelo = new javax.swing.JSeparator();
        txt_modelo = new javax.swing.JTextField();
        jLabelColor1 = new javax.swing.JLabel();
        jSeparatorname11 = new javax.swing.JSeparator();
        txt_color = new javax.swing.JTextField();
        jPanel9 = new javax.swing.JPanel();
        btn_menuback1 = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        jSeparatorCC1 = new javax.swing.JSeparator();
        jSeparatorcell1 = new javax.swing.JSeparator();
        jSeparatorDate1 = new javax.swing.JSeparator();
        jSeparatorModelo1 = new javax.swing.JSeparator();
        jSeparatorplaca1 = new javax.swing.JSeparator();
        jSeparatorname12 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 70, 70));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_consultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FINCAR.png"))); // NOI18N
        btn_consultar.setBorder(null);
        btn_consultar.setBorderPainted(false);
        btn_consultar.setContentAreaFilled(false);
        btn_consultar.setEnabled(false);
        btn_consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_consultarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_consultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        btn_registrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ADDCAR.png"))); // NOI18N
        btn_registrar.setBorder(null);
        btn_registrar.setBorderPainted(false);
        btn_registrar.setContentAreaFilled(false);
        btn_registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registrarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_registrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, -1, -1));

        btn_eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/DELETECAR.png"))); // NOI18N
        btn_eliminar.setBorder(null);
        btn_eliminar.setBorderPainted(false);
        btn_eliminar.setContentAreaFilled(false);
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, -1, -1));

        btn_factura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/INVOICE.png"))); // NOI18N
        btn_factura.setBorder(null);
        btn_factura.setBorderPainted(false);
        btn_factura.setContentAreaFilled(false);
        btn_factura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_facturaActionPerformed(evt);
            }
        });
        jPanel1.add(btn_factura, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 350, -1, -1));

        btn_salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LOGOUTT.png"))); // NOI18N
        btn_salir.setBorder(null);
        btn_salir.setBorderPainted(false);
        btn_salir.setContentAreaFilled(false);
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });
        jPanel1.add(btn_salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, -1, -1));

        Menu.setFont(new java.awt.Font("Roboto Medium", 0, 36)); // NOI18N
        Menu.setForeground(new java.awt.Color(255, 255, 255));
        Menu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Menu.setText("MENU");
        Menu.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(Menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 220, -1));

        jSeparatorMenu.setForeground(new java.awt.Color(255, 255, 255));
        jSeparatorMenu.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jSeparatorMenu.setMinimumSize(new java.awt.Dimension(10, 310));
        jSeparatorMenu.setPreferredSize(new java.awt.Dimension(50, 30));
        jPanel1.add(jSeparatorMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 140, 10));

        jSeparatorMenu1.setForeground(new java.awt.Color(255, 255, 255));
        jSeparatorMenu1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jSeparatorMenu1.setMinimumSize(new java.awt.Dimension(10, 310));
        jSeparatorMenu1.setPreferredSize(new java.awt.Dimension(50, 30));
        jPanel1.add(jSeparatorMenu1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 91, 140, 10));

        jPanelMarcador.setBackground(new java.awt.Color(0, 204, 204));

        javax.swing.GroupLayout jPanelMarcadorLayout = new javax.swing.GroupLayout(jPanelMarcador);
        jPanelMarcador.setLayout(jPanelMarcadorLayout);
        jPanelMarcadorLayout.setHorizontalGroup(
            jPanelMarcadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 220, Short.MAX_VALUE)
        );
        jPanelMarcadorLayout.setVerticalGroup(
            jPanelMarcadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        jPanel1.add(jPanelMarcador, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 135, 220, 70));

        BG1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Bg1.jpg"))); // NOI18N
        jPanel1.add(BG1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, 490));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 500));

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setForeground(new java.awt.Color(255, 255, 255));

        CUIDACAR.setFont(new java.awt.Font("Roboto", 1, 48)); // NOI18N
        CUIDACAR.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CUIDACAR.setText("CUIDACAR");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(CUIDACAR, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(CUIDACAR, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, 580, 60));

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setAutoscrolls(true);
        jPanel7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel7.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jPanel7.setFont(new java.awt.Font("Tw Cen MT", 0, 11)); // NOI18N
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        INFORMACION.setFont(new java.awt.Font("Roboto", 1, 22)); // NOI18N
        INFORMACION.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        INFORMACION.setText("INFORMACIÓN");
        jPanel7.add(INFORMACION, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 560, 30));

        jLabelCC.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabelCC.setText("Cedula");
        jPanel7.add(jLabelCC, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 70, -1, -1));

        jSeparatorCC.setBackground(new java.awt.Color(102, 102, 102));
        jSeparatorCC.setForeground(new java.awt.Color(102, 102, 102));
        jPanel7.add(jSeparatorCC, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 130, 120, 10));

        txt_cc.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        txt_cc.setBorder(null);
        txt_cc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_ccMouseClicked(evt);
            }
        });
        jPanel7.add(txt_cc, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 100, 120, 30));

        jLabelname.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabelname.setText("Nombre del propetario");
        jPanel7.add(jLabelname, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        jSeparatorname.setBackground(new java.awt.Color(102, 102, 102));
        jSeparatorname.setForeground(new java.awt.Color(102, 102, 102));
        jPanel7.add(jSeparatorname, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 127, 270, 10));

        jSeparatorname1.setBackground(new java.awt.Color(102, 102, 102));
        jSeparatorname1.setForeground(new java.awt.Color(102, 102, 102));
        jPanel7.add(jSeparatorname1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 128, 270, 10));

        txt_name.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        txt_name.setBorder(null);
        txt_name.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_nameMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txt_nameMouseReleased(evt);
            }
        });
        txt_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nameActionPerformed(evt);
            }
        });
        jPanel7.add(txt_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 270, 30));

        jLabelnumber.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabelnumber.setText("Numero de celular");
        jPanel7.add(jLabelnumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        txt_cell.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        txt_cell.setBorder(null);
        txt_cell.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_cellMouseClicked(evt);
            }
        });
        txt_cell.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_cellActionPerformed(evt);
            }
        });
        jPanel7.add(txt_cell, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 270, 30));

        jLabeldate.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabeldate.setText("Fecha de registro");
        jPanel7.add(jLabeldate, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 160, -1, -1));

        jSeparatorDate.setBackground(new java.awt.Color(102, 102, 102));
        jSeparatorDate.setForeground(new java.awt.Color(102, 102, 102));
        jPanel7.add(jSeparatorDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 220, 120, 10));

        txarea_dateingreso.setColumns(1);
        txarea_dateingreso.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        txarea_dateingreso.setRows(1);
        txarea_dateingreso.setTabSize(1);
        txarea_dateingreso.setBorder(null);
        txarea_dateingreso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txarea_dateingresoMouseClicked(evt);
            }
        });
        jPanel7.add(txarea_dateingreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 200, 120, -1));

        jLabelPlaca.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabelPlaca.setText("Placa del vehiculo");
        jPanel7.add(jLabelPlaca, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 250, -1, 30));

        jSeparatorplaca.setBackground(new java.awt.Color(102, 102, 102));
        jSeparatorplaca.setForeground(new java.awt.Color(102, 102, 102));
        jPanel7.add(jSeparatorplaca, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 320, 120, 10));

        txt_placa.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        txt_placa.setBorder(null);
        txt_placa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_placaMouseClicked(evt);
            }
        });
        txt_placa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_placaActionPerformed(evt);
            }
        });
        jPanel7.add(txt_placa, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 290, 120, 30));

        jSeparatorcell.setBackground(new java.awt.Color(102, 102, 102));
        jSeparatorcell.setForeground(new java.awt.Color(102, 102, 102));
        jPanel7.add(jSeparatorcell, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 270, 10));

        jLabelModelo.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabelModelo.setText("Modelo");
        jPanel7.add(jLabelModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 60, 30));

        jSeparatorModelo.setBackground(new java.awt.Color(102, 102, 102));
        jSeparatorModelo.setForeground(new java.awt.Color(102, 102, 102));
        jPanel7.add(jSeparatorModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 270, 10));

        txt_modelo.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        txt_modelo.setBorder(null);
        txt_modelo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_modeloMouseClicked(evt);
            }
        });
        txt_modelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_modeloActionPerformed(evt);
            }
        });
        jPanel7.add(txt_modelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 270, 30));

        jLabelColor1.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabelColor1.setText("Color");
        jPanel7.add(jLabelColor1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 60, 30));

        jSeparatorname11.setBackground(new java.awt.Color(102, 102, 102));
        jSeparatorname11.setForeground(new java.awt.Color(102, 102, 102));
        jPanel7.add(jSeparatorname11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 270, 10));

        txt_color.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        txt_color.setBorder(null);
        txt_color.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_colorMouseClicked(evt);
            }
        });
        txt_color.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_colorActionPerformed(evt);
            }
        });
        jPanel7.add(txt_color, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 270, 30));

        jPanel9.setBackground(new java.awt.Color(204, 204, 204));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_menuback1.setBackground(new java.awt.Color(255, 255, 255));
        btn_menuback1.setFont(new java.awt.Font("Roboto Thin", 0, 14)); // NOI18N
        btn_menuback1.setText("Volver a menu");
        btn_menuback1.setBorder(null);
        btn_menuback1.setBorderPainted(false);
        btn_menuback1.setContentAreaFilled(false);
        btn_menuback1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_menuback1ActionPerformed(evt);
            }
        });
        jPanel9.add(btn_menuback1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 120, 50));

        jPanel7.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 450, 120, 50));

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel7.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 500, 560, 20));

        jSeparatorCC1.setBackground(new java.awt.Color(102, 102, 102));
        jSeparatorCC1.setForeground(new java.awt.Color(102, 102, 102));
        jPanel7.add(jSeparatorCC1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 131, 120, 10));

        jSeparatorcell1.setBackground(new java.awt.Color(102, 102, 102));
        jSeparatorcell1.setForeground(new java.awt.Color(102, 102, 102));
        jPanel7.add(jSeparatorcell1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 221, 270, 10));

        jSeparatorDate1.setBackground(new java.awt.Color(102, 102, 102));
        jSeparatorDate1.setForeground(new java.awt.Color(102, 102, 102));
        jPanel7.add(jSeparatorDate1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 221, 120, 10));

        jSeparatorModelo1.setBackground(new java.awt.Color(102, 102, 102));
        jSeparatorModelo1.setForeground(new java.awt.Color(102, 102, 102));
        jPanel7.add(jSeparatorModelo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 321, 270, 10));

        jSeparatorplaca1.setBackground(new java.awt.Color(102, 102, 102));
        jSeparatorplaca1.setForeground(new java.awt.Color(102, 102, 102));
        jPanel7.add(jSeparatorplaca1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 321, 120, 10));

        jSeparatorname12.setBackground(new java.awt.Color(102, 102, 102));
        jSeparatorname12.setForeground(new java.awt.Color(102, 102, 102));
        jPanel7.add(jSeparatorname12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 411, 270, 10));

        jScrollPane1.setViewportView(jPanel7);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, 560, 410));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Bg2.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 580, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_consultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_consultarActionPerformed
        dispose();
        Consultar vConsultar = new Consultar();
        vConsultar.setVisible(true);
    }//GEN-LAST:event_btn_consultarActionPerformed

    private void btn_registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registrarActionPerformed
        dispose();
        Registrar vRegistrar = new Registrar();
        vRegistrar.setVisible(true);
    }//GEN-LAST:event_btn_registrarActionPerformed

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
        dispose();
        Eliminar vEliminar = new Eliminar();
        vEliminar.setVisible(true);
    }//GEN-LAST:event_btn_eliminarActionPerformed

    private void btn_facturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_facturaActionPerformed
        dispose();
        Factura vFactura = new Factura();
        vFactura.setVisible(true);
    }//GEN-LAST:event_btn_facturaActionPerformed

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        dispose();
        Login vLogin = new Login();
        vLogin.setVisible(true);
    }//GEN-LAST:event_btn_salirActionPerformed

    private void txt_ccMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_ccMouseClicked
        
    }//GEN-LAST:event_txt_ccMouseClicked

    private void txt_nameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_nameMouseClicked
        
    }//GEN-LAST:event_txt_nameMouseClicked

    private void txt_nameMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_nameMouseReleased

    }//GEN-LAST:event_txt_nameMouseReleased

    private void txt_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nameActionPerformed
        
    }//GEN-LAST:event_txt_nameActionPerformed

    private void txt_cellMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_cellMouseClicked
        
    }//GEN-LAST:event_txt_cellMouseClicked

    private void txt_cellActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_cellActionPerformed
        
    }//GEN-LAST:event_txt_cellActionPerformed

    private void txarea_dateingresoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txarea_dateingresoMouseClicked
        
    }//GEN-LAST:event_txarea_dateingresoMouseClicked

    private void txt_placaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_placaMouseClicked
        
    }//GEN-LAST:event_txt_placaMouseClicked

    private void txt_placaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_placaActionPerformed
        
    }//GEN-LAST:event_txt_placaActionPerformed

    private void txt_modeloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_modeloMouseClicked
        
    }//GEN-LAST:event_txt_modeloMouseClicked

    private void txt_modeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_modeloActionPerformed
        
    }//GEN-LAST:event_txt_modeloActionPerformed

    private void txt_colorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_colorMouseClicked
        
    }//GEN-LAST:event_txt_colorMouseClicked

    private void txt_colorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_colorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_colorActionPerformed

    private void btn_menuback1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_menuback1ActionPerformed
        dispose();
        Menu vMenu = new Menu();
        vMenu.setVisible(true);
    }//GEN-LAST:event_btn_menuback1ActionPerformed
    
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
            java.util.logging.Logger.getLogger(Consultar2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Consultar2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Consultar2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Consultar2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Consultar2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BG1;
    private javax.swing.JLabel CUIDACAR;
    private javax.swing.JLabel INFORMACION;
    private javax.swing.JLabel Menu;
    private javax.swing.JButton btn_consultar;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_factura;
    private javax.swing.JButton btn_menuback1;
    private javax.swing.JButton btn_registrar;
    private javax.swing.JButton btn_salir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelCC;
    private javax.swing.JLabel jLabelColor1;
    private javax.swing.JLabel jLabelModelo;
    private javax.swing.JLabel jLabelPlaca;
    private javax.swing.JLabel jLabeldate;
    private javax.swing.JLabel jLabelname;
    private javax.swing.JLabel jLabelnumber;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel jPanelMarcador;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparatorCC;
    private javax.swing.JSeparator jSeparatorCC1;
    private javax.swing.JSeparator jSeparatorDate;
    private javax.swing.JSeparator jSeparatorDate1;
    private javax.swing.JSeparator jSeparatorMenu;
    private javax.swing.JSeparator jSeparatorMenu1;
    private javax.swing.JSeparator jSeparatorModelo;
    private javax.swing.JSeparator jSeparatorModelo1;
    private javax.swing.JSeparator jSeparatorcell;
    private javax.swing.JSeparator jSeparatorcell1;
    private javax.swing.JSeparator jSeparatorname;
    private javax.swing.JSeparator jSeparatorname1;
    private javax.swing.JSeparator jSeparatorname11;
    private javax.swing.JSeparator jSeparatorname12;
    private javax.swing.JSeparator jSeparatorplaca;
    private javax.swing.JSeparator jSeparatorplaca1;
    private javax.swing.JTextArea txarea_dateingreso;
    private javax.swing.JTextField txt_cc;
    private javax.swing.JTextField txt_cell;
    private javax.swing.JTextField txt_color;
    private javax.swing.JTextField txt_modelo;
    private javax.swing.JTextField txt_name;
    private javax.swing.JTextField txt_placa;
    // End of variables declaration//GEN-END:variables
}
