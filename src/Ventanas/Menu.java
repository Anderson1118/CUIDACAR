package Ventanas;

import java.text.SimpleDateFormat;
import java.util.Date;

public final class Menu extends javax.swing.JFrame {

    public Menu() 
    {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
    }
    public static String fechaActual()
    {
        Date fecha = new Date();
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/YYYY");
        
        return formatoFecha.format(fecha);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jFormattedTextField2 = new javax.swing.JFormattedTextField();
        Fondo = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        btn_menu_consultar = new javax.swing.JButton();
        btn_menu_registrar = new javax.swing.JButton();
        btn_menu_eliminar = new javax.swing.JButton();
        btn_menu_factura = new javax.swing.JButton();
        btn_salir = new javax.swing.JButton();
        Menu = new javax.swing.JLabel();
        jSeparatorMenu = new javax.swing.JSeparator();
        jSeparatorMenu1 = new javax.swing.JSeparator();
        BG1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        CUIDACAR = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ADT = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        BG2 = new javax.swing.JLabel();

        jFormattedTextField1.setText("jFormattedTextField1");

        jFormattedTextField2.setText("jFormattedTextField2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        Fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jPanel1.add(jSeparatorMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 160, 10));

        jSeparatorMenu1.setForeground(new java.awt.Color(255, 255, 255));
        jSeparatorMenu1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jSeparatorMenu1.setMinimumSize(new java.awt.Dimension(10, 310));
        jSeparatorMenu1.setPreferredSize(new java.awt.Dimension(50, 30));
        jPanel1.add(jSeparatorMenu1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 91, 160, 10));

        BG1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Bg1.jpg"))); // NOI18N
        jPanel1.add(BG1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, 490));

        Fondo.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 500));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setForeground(new java.awt.Color(255, 255, 255));

        jScrollPane2.setBorder(null);
        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTextArea2.setColumns(1);
        jTextArea2.setFont(new java.awt.Font("Roboto", 0, 20)); // NOI18N
        jTextArea2.setRows(1);
        jTextArea2.setText("Hoy es dd/mm/yyyy       HH:mm");
        jTextArea2.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextArea2.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        jTextArea2.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jTextArea2AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane2.setViewportView(jTextArea2);

        CUIDACAR.setFont(new java.awt.Font("Roboto", 1, 48)); // NOI18N
        CUIDACAR.setText("CUIDACAR");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CUIDACAR)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(228, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(CUIDACAR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(12, 12, 12)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel2.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 15, 580, 120));

        jLabel2.setFont(new java.awt.Font("Roboto", 0, 10)); // NOI18N
        jLabel2.setText("POWERED BY");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(453, 480, -1, -1));

        ADT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ADT.png"))); // NOI18N
        jPanel2.add(ADT, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 450, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LOGO.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 260, -1, -1));

        BG2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Bg2.jpg"))); // NOI18N
        jPanel2.add(BG2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 500));

        Fondo.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 580, 500));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_menu_consultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_menu_consultarActionPerformed
        dispose();
        Consultar vConsultar = new Consultar();
        vConsultar.setVisible(true);
    }//GEN-LAST:event_btn_menu_consultarActionPerformed

    private void jTextArea2AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jTextArea2AncestorAdded
        jTextArea2.setText("Hoy es : "+fechaActual());
    }//GEN-LAST:event_jTextArea2AncestorAdded

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

    public static void main(String args[]) {
 
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            @Override
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ADT;
    private javax.swing.JLabel BG1;
    private javax.swing.JLabel BG2;
    private javax.swing.JLabel CUIDACAR;
    private javax.swing.JPanel Fondo;
    private javax.swing.JLabel Menu;
    private javax.swing.JButton btn_menu_consultar;
    private javax.swing.JButton btn_menu_eliminar;
    private javax.swing.JButton btn_menu_factura;
    private javax.swing.JButton btn_menu_registrar;
    private javax.swing.JButton btn_salir;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JFormattedTextField jFormattedTextField2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparatorMenu;
    private javax.swing.JSeparator jSeparatorMenu1;
    private javax.swing.JTextArea jTextArea2;
    // End of variables declaration//GEN-END:variables
}
