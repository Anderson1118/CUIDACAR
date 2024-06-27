package Ventanas;

import javax.swing.table.DefaultTableModel;

public final class Factura2 extends javax.swing.JFrame{
    DefaultTableModel model;
    String placa, fecha;
    public Factura2(){
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        model= (DefaultTableModel) tabla.getModel();

    }
    
    public void mostrar(int cedula, String nombre, String placa, String fecha){
        txt_cc.setText(cedula+"");
        txt_name.setText(nombre);
        this.placa=placa;
        this.fecha=fecha;
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
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel4 = new javax.swing.JPanel();
        BG1 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabelname = new javax.swing.JLabel();
        txt_name = new javax.swing.JTextField();
        jLabelCC = new javax.swing.JLabel();
        txt_cc = new javax.swing.JTextField();
        jSeparatorcc = new javax.swing.JSeparator();
        jSeparatorname3 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jLabelvalor = new javax.swing.JLabel();
        txt_precio = new javax.swing.JTextField();
        jSeparatorvalor = new javax.swing.JSeparator();
        jPanel5 = new javax.swing.JPanel();
        btn_registrarpago = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        btn_menuback = new javax.swing.JButton();
        jSeparatorname4 = new javax.swing.JSeparator();
        jSeparatorcc1 = new javax.swing.JSeparator();
        jSeparatorvalor1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 70, 70));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_consultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FINCAR.png"))); // NOI18N
        btn_consultar.setBorder(null);
        btn_consultar.setBorderPainted(false);
        btn_consultar.setContentAreaFilled(false);
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
        btn_factura.setEnabled(false);
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

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jSeparator1.setMinimumSize(new java.awt.Dimension(10, 310));
        jSeparator1.setPreferredSize(new java.awt.Dimension(50, 30));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 160, 10));

        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jSeparator2.setMinimumSize(new java.awt.Dimension(10, 310));
        jSeparator2.setPreferredSize(new java.awt.Dimension(50, 30));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 91, 160, 10));

        jPanel4.setBackground(new java.awt.Color(0, 204, 204));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 220, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 345, 220, 70));

        BG1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Bg1.jpg"))); // NOI18N
        jPanel1.add(BG1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, 490));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 500));

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setForeground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 48)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("CUIDACAR");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, 580, 60));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelname.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabelname.setText("Nombre del propetario");
        jPanel2.add(jLabelname, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        txt_name.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        txt_name.setText("Nombre");
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
        jPanel2.add(txt_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 270, 30));

        jLabelCC.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabelCC.setText("Cedula");
        jPanel2.add(jLabelCC, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 30, -1, -1));

        txt_cc.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        txt_cc.setText("CC");
        txt_cc.setBorder(null);
        txt_cc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_ccMouseClicked(evt);
            }
        });
        jPanel2.add(txt_cc, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 60, 120, 30));

        jSeparatorcc.setBackground(new java.awt.Color(0, 0, 0));
        jSeparatorcc.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparatorcc, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 90, 120, 10));

        jSeparatorname3.setBackground(new java.awt.Color(0, 0, 0));
        jSeparatorname3.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparatorname3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 270, 10));

        jScrollPane1.setBorder(null);

        tabla.setAutoCreateRowSorter(true);
        tabla.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tabla.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "PLACA", "FECHA"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabla);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, -1, 130));

        jLabelvalor.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabelvalor.setText("Valor");
        jPanel2.add(jLabelvalor, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, 50, -1));

        txt_precio.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        txt_precio.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_precio.setText("$$$");
        txt_precio.setBorder(null);
        txt_precio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_precioMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txt_precioMouseReleased(evt);
            }
        });
        txt_precio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_precioActionPerformed(evt);
            }
        });
        jPanel2.add(txt_precio, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, 180, 30));

        jSeparatorvalor.setBackground(new java.awt.Color(0, 0, 0));
        jSeparatorvalor.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparatorvalor, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 100, 10));

        jPanel5.setBackground(new java.awt.Color(204, 204, 204));

        btn_registrarpago.setBackground(new java.awt.Color(255, 255, 255));
        btn_registrarpago.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        btn_registrarpago.setText("Registrar pago");
        btn_registrarpago.setBorder(null);
        btn_registrarpago.setBorderPainted(false);
        btn_registrarpago.setContentAreaFilled(false);
        btn_registrarpago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registrarpagoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(btn_registrarpago, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(btn_registrarpago, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 130, 120, 50));

        jPanel6.setBackground(new java.awt.Color(204, 204, 204));

        btn_menuback.setBackground(new java.awt.Color(255, 255, 255));
        btn_menuback.setFont(new java.awt.Font("Roboto Thin", 0, 14)); // NOI18N
        btn_menuback.setText("Volver a menu");
        btn_menuback.setBorder(null);
        btn_menuback.setBorderPainted(false);
        btn_menuback.setContentAreaFilled(false);
        btn_menuback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_menubackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btn_menuback, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btn_menuback, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 350, -1, 40));

        jSeparatorname4.setBackground(new java.awt.Color(0, 0, 0));
        jSeparatorname4.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparatorname4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 91, 270, 10));

        jSeparatorcc1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparatorcc1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparatorcc1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 91, 120, 10));

        jSeparatorvalor1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparatorvalor1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparatorvalor1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 181, 100, 10));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, 560, 410));

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

    private void txt_nameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_nameMouseClicked
        txt_name.setText("");
    }//GEN-LAST:event_txt_nameMouseClicked

    private void txt_nameMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_nameMouseReleased

    }//GEN-LAST:event_txt_nameMouseReleased

    private void txt_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nameActionPerformed

    private void txt_ccMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_ccMouseClicked
        txt_cc.setText("");
    }//GEN-LAST:event_txt_ccMouseClicked

    private void txt_precioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_precioMouseClicked
        txt_precio.setText("");
    }//GEN-LAST:event_txt_precioMouseClicked

    private void txt_precioMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_precioMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_precioMouseReleased

    private void txt_precioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_precioActionPerformed
    
    }//GEN-LAST:event_txt_precioActionPerformed

    private void btn_registrarpagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registrarpagoActionPerformed
        model.addRow(new Object[]{placa, fecha});
    }//GEN-LAST:event_btn_registrarpagoActionPerformed

    private void btn_menubackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_menubackActionPerformed
        dispose();
        Menu vMenu = new Menu();
        vMenu.setVisible(true);
    }//GEN-LAST:event_btn_menubackActionPerformed

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
            java.util.logging.Logger.getLogger(Factura2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Factura2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Factura2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Factura2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Factura2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BG1;
    private javax.swing.JLabel Menu;
    private javax.swing.JButton btn_consultar;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_factura;
    private javax.swing.JButton btn_menuback;
    private javax.swing.JButton btn_registrar;
    private javax.swing.JButton btn_registrarpago;
    private javax.swing.JButton btn_salir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelCC;
    private javax.swing.JLabel jLabelname;
    private javax.swing.JLabel jLabelvalor;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparatorcc;
    private javax.swing.JSeparator jSeparatorcc1;
    private javax.swing.JSeparator jSeparatorname3;
    private javax.swing.JSeparator jSeparatorname4;
    private javax.swing.JSeparator jSeparatorvalor;
    private javax.swing.JSeparator jSeparatorvalor1;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txt_cc;
    private javax.swing.JTextField txt_name;
    private javax.swing.JTextField txt_precio;
    // End of variables declaration//GEN-END:variables
}
