package Ventanas;
import Control.Archivos;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public final class Eliminar extends javax.swing.JFrame{
    Archivos datos=new Archivos();

    public Eliminar(){ 
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
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        Menu = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        BG1 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        boxPlaca = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator1 = new javax.swing.JSeparator();
        Consultar_vehiculo = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        btn_menuback = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        btn_Eliminar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 70, 70));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_menu_consultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FINCAR.png"))); // NOI18N
        btn_menu_consultar.setBorder(null);
        btn_menu_consultar.setBorderPainted(false);
        btn_menu_consultar.setContentAreaFilled(false);
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
        btn_menu_eliminar.setEnabled(false);
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

        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jSeparator2.setMinimumSize(new java.awt.Dimension(10, 310));
        jSeparator2.setPreferredSize(new java.awt.Dimension(50, 30));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 160, 10));

        jSeparator3.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jSeparator3.setMinimumSize(new java.awt.Dimension(10, 310));
        jSeparator3.setPreferredSize(new java.awt.Dimension(50, 30));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 91, 160, 10));

        Menu.setFont(new java.awt.Font("Roboto Medium", 0, 36)); // NOI18N
        Menu.setForeground(new java.awt.Color(255, 255, 255));
        Menu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Menu.setText("MENU");
        Menu.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(Menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 220, -1));

        jPanel3.setBackground(new java.awt.Color(0, 204, 204));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 220, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 275, 220, 70));

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

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel3.setText("PLACA DEL VEHICULO");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(156, 190, -1, -1));

        jSeparator5.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, 240, 10));

        jSeparator6.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator6.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 251, 240, 10));

        boxPlaca.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        boxPlaca.setBorder(null);
        jPanel2.add(boxPlaca, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, 240, 20));

        jSeparator4.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jSeparator4.setMinimumSize(new java.awt.Dimension(10, 310));
        jSeparator4.setPreferredSize(new java.awt.Dimension(50, 30));
        jPanel2.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 101, 380, 10));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jSeparator1.setMinimumSize(new java.awt.Dimension(10, 310));
        jSeparator1.setPreferredSize(new java.awt.Dimension(50, 30));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 380, 10));

        Consultar_vehiculo.setFont(new java.awt.Font("Roboto", 1, 34)); // NOI18N
        Consultar_vehiculo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Consultar_vehiculo.setText("ELIMINAR VEHICULO");
        jPanel2.add(Consultar_vehiculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 560, 40));

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

        btn_Eliminar.setBackground(new java.awt.Color(255, 255, 255));
        btn_Eliminar.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        btn_Eliminar.setText("Eliminar");
        btn_Eliminar.setBorder(null);
        btn_Eliminar.setBorderPainted(false);
        btn_Eliminar.setContentAreaFilled(false);
        btn_Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EliminarActionPerformed(evt);
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
                    .addComponent(btn_Eliminar)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(btn_Eliminar)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 330, -1, 40));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 81, 560, 410));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Bg2.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 580, 500));

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

    private void btn_EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EliminarActionPerformed
        try {
            if(datos.Eliminar(boxPlaca.getText())){
                JOptionPane.showMessageDialog(this, " VEHICULO ELIMINADO ");
            }else{
                JOptionPane.showMessageDialog(this, " ERROR AL ELIMINAR VEHICULO ");
            }
        } catch (IOException ex) {
            Logger.getLogger(Eliminar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_EliminarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Eliminar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BG1;
    private javax.swing.JLabel Consultar_vehiculo;
    private javax.swing.JLabel Menu;
    private javax.swing.JTextField boxPlaca;
    private javax.swing.JButton btn_Eliminar;
    private javax.swing.JButton btn_menu_consultar;
    private javax.swing.JButton btn_menu_eliminar;
    private javax.swing.JButton btn_menu_factura;
    private javax.swing.JButton btn_menu_registrar;
    private javax.swing.JButton btn_menuback;
    private javax.swing.JButton btn_salir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    // End of variables declaration//GEN-END:variables

}
