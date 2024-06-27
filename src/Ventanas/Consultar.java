package Ventanas;
import Control.Archivos;
import Modelo.Persona;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import Control.tipoCampo;
import javax.swing.JOptionPane;
public final class Consultar extends javax.swing.JFrame {
    tipoCampo tCampo=new tipoCampo();
    Archivos archivos=new Archivos();
    public Consultar(){   
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btn_menu_consultar = new javax.swing.JButton();
        btn_menu_registrar = new javax.swing.JButton();
        btn_menu_eliminar = new javax.swing.JButton();
        btn_menu_factura = new javax.swing.JButton();
        btn_salir = new javax.swing.JButton();
        Menu = new javax.swing.JLabel();
        jSeparatorMenu = new javax.swing.JSeparator();
        jSeparatorMenu1 = new javax.swing.JSeparator();
        jPanelMarcador = new javax.swing.JPanel();
        BG1 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        CUIDACAR = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        CEDULADELPROPETARIO = new javax.swing.JLabel();
        jSeparatorcc = new javax.swing.JSeparator();
        jSeparatorcc1 = new javax.swing.JSeparator();
        txt_cc = new javax.swing.JTextField();
        jSeparatorConsultarVehiculo = new javax.swing.JSeparator();
        jSeparatorConsultarVehiculo1 = new javax.swing.JSeparator();
        Consultar_vehiculo = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        btn_menuback = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        btn_buscar = new javax.swing.JButton();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        BG2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 70, 70));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_menu_consultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FINCAR.png"))); // NOI18N
        btn_menu_consultar.setBorder(null);
        btn_menu_consultar.setBorderPainted(false);
        btn_menu_consultar.setContentAreaFilled(false);
        btn_menu_consultar.setEnabled(false);
        btn_menu_consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_menu_consultarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_menu_consultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        btn_menu_registrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ADDCAR.png"))); // NOI18N
        btn_menu_registrar.setBorder(null);
        btn_menu_registrar.setBorderPainted(false);
        btn_menu_registrar.setContentAreaFilled(false);
        btn_menu_registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_menu_registrarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_menu_registrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, -1, -1));

        btn_menu_eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/DELETECAR.png"))); // NOI18N
        btn_menu_eliminar.setBorder(null);
        btn_menu_eliminar.setBorderPainted(false);
        btn_menu_eliminar.setContentAreaFilled(false);
        btn_menu_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_menu_eliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_menu_eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, -1, -1));

        btn_menu_factura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/INVOICE.png"))); // NOI18N
        btn_menu_factura.setBorder(null);
        btn_menu_factura.setBorderPainted(false);
        btn_menu_factura.setContentAreaFilled(false);
        btn_menu_factura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_menu_facturaActionPerformed(evt);
            }
        });
        jPanel1.add(btn_menu_factura, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 350, -1, -1));

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
            .addComponent(CUIDACAR, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, 580, 60));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CEDULADELPROPETARIO.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        CEDULADELPROPETARIO.setText("CEDULA DEL PROPETARIO");
        jPanel2.add(CEDULADELPROPETARIO, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, -1, -1));

        jSeparatorcc.setBackground(new java.awt.Color(0, 0, 0));
        jSeparatorcc.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparatorcc, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, 260, 10));

        jSeparatorcc1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparatorcc1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparatorcc1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 251, 260, 10));

        txt_cc.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        txt_cc.setText("CC");
        txt_cc.setBorder(null);
        txt_cc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_ccMouseClicked(evt);
            }
        });
        txt_cc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_ccActionPerformed(evt);
            }
        });
        txt_cc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_ccKeyTyped(evt);
            }
        });
        jPanel2.add(txt_cc, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, 260, -1));

        jSeparatorConsultarVehiculo.setBackground(new java.awt.Color(0, 0, 0));
        jSeparatorConsultarVehiculo.setForeground(new java.awt.Color(0, 0, 0));
        jSeparatorConsultarVehiculo.setAlignmentX(1.0F);
        jSeparatorConsultarVehiculo.setAlignmentY(1.0F);
        jSeparatorConsultarVehiculo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jSeparatorConsultarVehiculo.setMinimumSize(new java.awt.Dimension(10, 310));
        jSeparatorConsultarVehiculo.setPreferredSize(new java.awt.Dimension(50, 30));
        jPanel2.add(jSeparatorConsultarVehiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 380, 10));

        jSeparatorConsultarVehiculo1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparatorConsultarVehiculo1.setForeground(new java.awt.Color(0, 0, 0));
        jSeparatorConsultarVehiculo1.setAlignmentX(1.0F);
        jSeparatorConsultarVehiculo1.setAlignmentY(1.0F);
        jSeparatorConsultarVehiculo1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jSeparatorConsultarVehiculo1.setMinimumSize(new java.awt.Dimension(10, 310));
        jSeparatorConsultarVehiculo1.setPreferredSize(new java.awt.Dimension(50, 30));
        jPanel2.add(jSeparatorConsultarVehiculo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 101, 380, 10));

        Consultar_vehiculo.setFont(new java.awt.Font("Roboto", 1, 34)); // NOI18N
        Consultar_vehiculo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Consultar_vehiculo.setText("CONSULTAR VEHICULO");
        jPanel2.add(Consultar_vehiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 560, -1));

        jPanel5.setBackground(new java.awt.Color(204, 204, 204));

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

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 132, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(btn_menuback)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(btn_menuback)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 330, -1, 40));

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));

        btn_buscar.setBackground(new java.awt.Color(255, 255, 255));
        btn_buscar.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        btn_buscar.setText("Buscar");
        btn_buscar.setBorder(null);
        btn_buscar.setBorderPainted(false);
        btn_buscar.setContentAreaFilled(false);
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 110, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(btn_buscar)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(btn_buscar)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 330, -1, 40));
        jPanel2.add(filler1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 190, 140, 40));
        jPanel2.add(filler2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 130, 40));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, 560, 410));

        BG2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Bg2.jpg"))); // NOI18N
        getContentPane().add(BG2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 580, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_menu_consultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_menu_consultarActionPerformed
        dispose();
        Consultar vConsultar = new Consultar();
        vConsultar.setVisible(true);
    }//GEN-LAST:event_btn_menu_consultarActionPerformed

    private void btn_menu_registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_menu_registrarActionPerformed
        dispose();
        Registrar vRegistrar = new Registrar();
        vRegistrar.setVisible(true);
    }//GEN-LAST:event_btn_menu_registrarActionPerformed

    private void btn_menu_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_menu_eliminarActionPerformed
        dispose();
        Eliminar vEliminar = new Eliminar();
        vEliminar.setVisible(true);
    }//GEN-LAST:event_btn_menu_eliminarActionPerformed

    private void btn_menu_facturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_menu_facturaActionPerformed
        dispose();
        Factura vFactura = new Factura();
        vFactura.setVisible(true);
    }//GEN-LAST:event_btn_menu_facturaActionPerformed

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        dispose();
        Login vLogin = new Login();
        vLogin.setVisible(true);
    }//GEN-LAST:event_btn_salirActionPerformed

    private void btn_menubackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_menubackActionPerformed
        dispose();
        Menu vMenu = new Menu();
        vMenu.setVisible(true);  
    }//GEN-LAST:event_btn_menubackActionPerformed

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        try {
            Persona persona = archivos.Buscar(Integer.parseInt(txt_cc.getText()));
            if(persona!=null){
                dispose();
                System.out.println(persona.getCedula());
                Consultar2 vConsultar2 = new Consultar2();
                vConsultar2.mostrar(persona.getCedula(), persona.getNombre(), persona.getCelular(), persona.getFechaRegistro(), persona.getModelo(), persona.getPlaca(), persona.getColor());
                vConsultar2.setVisible(true);
            }else{
                 JOptionPane.showMessageDialog(this,"Usuario no registrado.");
            }
            
        } catch (IOException ex) {
            Logger.getLogger(Consultar.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }//GEN-LAST:event_btn_buscarActionPerformed

    private void txt_ccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ccActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ccActionPerformed

    private void txt_ccMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_ccMouseClicked
        txt_cc.setText("");
    }//GEN-LAST:event_txt_ccMouseClicked

    private void txt_ccKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_ccKeyTyped
        tCampo.soloNumeros(evt);
    }//GEN-LAST:event_txt_ccKeyTyped

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
            java.util.logging.Logger.getLogger(Consultar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Consultar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Consultar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Consultar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Consultar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BG1;
    private javax.swing.JLabel BG2;
    private javax.swing.JLabel CEDULADELPROPETARIO;
    private javax.swing.JLabel CUIDACAR;
    private javax.swing.JLabel Consultar_vehiculo;
    private javax.swing.JLabel Menu;
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_menu_consultar;
    private javax.swing.JButton btn_menu_eliminar;
    private javax.swing.JButton btn_menu_factura;
    private javax.swing.JButton btn_menu_registrar;
    private javax.swing.JButton btn_menuback;
    private javax.swing.JButton btn_salir;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanelMarcador;
    private javax.swing.JSeparator jSeparatorConsultarVehiculo;
    private javax.swing.JSeparator jSeparatorConsultarVehiculo1;
    private javax.swing.JSeparator jSeparatorMenu;
    private javax.swing.JSeparator jSeparatorMenu1;
    private javax.swing.JSeparator jSeparatorcc;
    private javax.swing.JSeparator jSeparatorcc1;
    private javax.swing.JTextField txt_cc;
    // End of variables declaration//GEN-END:variables
}
