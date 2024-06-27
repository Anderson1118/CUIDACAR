package Ventanas;


import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import Control.Archivos;
import Modelo.Persona;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import Control.tipoCampo;
public final class Registrar extends javax.swing.JFrame{
    tipoCampo tCampo=new tipoCampo();
    Archivos datos=new Archivos();
    public Registrar(){   
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
    }
    
    public static String fechaActual(){  
        Date fecha = new Date();
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/YYYY HH:mm");      
        return formatoFecha.format(fecha);
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
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        BG1 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jLabelRegistro = new javax.swing.JLabel();
        jLabelCC = new javax.swing.JLabel();
        jSeparatorcc = new javax.swing.JSeparator();
        txt_cc = new javax.swing.JTextField();
        jLabeldate = new javax.swing.JLabel();
        jSeparatorname = new javax.swing.JSeparator();
        jSeparatorname6 = new javax.swing.JSeparator();
        txt_name = new javax.swing.JTextField();
        jLabelname = new javax.swing.JLabel();
        txt_cell = new javax.swing.JTextField();
        jSeparatorname1 = new javax.swing.JSeparator();
        jLabelnumber = new javax.swing.JLabel();
        jSeparatorname2 = new javax.swing.JSeparator();
        txarea_date = new javax.swing.JTextArea();
        jLabelPlaca = new javax.swing.JLabel();
        txt_placa = new javax.swing.JTextField();
        jSeparatorname3 = new javax.swing.JSeparator();
        jSeparatorname7 = new javax.swing.JSeparator();
        jLabelPlaca1 = new javax.swing.JLabel();
        txt_modelo = new javax.swing.JTextField();
        jSeparatorname4 = new javax.swing.JSeparator();
        jLabelColor = new javax.swing.JLabel();
        jSeparatorname5 = new javax.swing.JSeparator();
        txt_color = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        btn_menuback = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        btn_registrar = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jSeparatorcc1 = new javax.swing.JSeparator();
        jSeparatorname8 = new javax.swing.JSeparator();
        jSeparatorname9 = new javax.swing.JSeparator();
        jSeparatorname10 = new javax.swing.JSeparator();
        jSeparatorname11 = new javax.swing.JSeparator();
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
        btn_menu_registrar.setEnabled(false);
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

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 205, 220, 70));

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
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, 580, 60));

        jScrollPane1.setBorder(null);
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setPreferredSize(new java.awt.Dimension(50, 100));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setAutoscrolls(true);
        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jPanel2.setFont(new java.awt.Font("Tw Cen MT", 0, 11)); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelRegistro.setFont(new java.awt.Font("Roboto", 1, 22)); // NOI18N
        jLabelRegistro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelRegistro.setText("REGISTRO");
        jPanel2.add(jLabelRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 560, 30));

        jLabelCC.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabelCC.setText("Cedula");
        jPanel2.add(jLabelCC, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 70, -1, -1));

        jSeparatorcc.setBackground(new java.awt.Color(102, 102, 102));
        jSeparatorcc.setForeground(new java.awt.Color(102, 102, 102));
        jPanel2.add(jSeparatorcc, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 130, 120, 10));

        txt_cc.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        txt_cc.setText("CC");
        txt_cc.setBorder(null);
        txt_cc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_ccMouseClicked(evt);
            }
        });
        txt_cc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_ccKeyTyped(evt);
            }
        });
        jPanel2.add(txt_cc, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 100, 120, 30));

        jLabeldate.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabeldate.setText("Fecha de registro");
        jPanel2.add(jLabeldate, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 160, -1, -1));

        jSeparatorname.setBackground(new java.awt.Color(102, 102, 102));
        jSeparatorname.setForeground(new java.awt.Color(102, 102, 102));
        jPanel2.add(jSeparatorname, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 270, 10));

        jSeparatorname6.setBackground(new java.awt.Color(102, 102, 102));
        jSeparatorname6.setForeground(new java.awt.Color(102, 102, 102));
        jPanel2.add(jSeparatorname6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 131, 270, 10));

        txt_name.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        txt_name.setText("Nombre");
        txt_name.setBorder(null);
        txt_name.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txt_nameMouseReleased(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_nameMouseClicked(evt);
            }
        });
        txt_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nameActionPerformed(evt);
            }
        });
        txt_name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_nameKeyTyped(evt);
            }
        });
        jPanel2.add(txt_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 270, 30));

        jLabelname.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabelname.setText("Nombre del propetario");
        jPanel2.add(jLabelname, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        txt_cell.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        txt_cell.setText("Celular");
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
        txt_cell.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_cellKeyTyped(evt);
            }
        });
        jPanel2.add(txt_cell, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 270, 30));

        jSeparatorname1.setBackground(new java.awt.Color(102, 102, 102));
        jSeparatorname1.setForeground(new java.awt.Color(102, 102, 102));
        jPanel2.add(jSeparatorname1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 320, 120, 10));

        jLabelnumber.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabelnumber.setText("Numero de celular");
        jPanel2.add(jLabelnumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        jSeparatorname2.setBackground(new java.awt.Color(102, 102, 102));
        jSeparatorname2.setForeground(new java.awt.Color(102, 102, 102));
        jPanel2.add(jSeparatorname2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 220, 120, 10));

        txarea_date.setColumns(1);
        txarea_date.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        txarea_date.setRows(1);
        txarea_date.setTabSize(1);
        txarea_date.setText("dd/MM/YYYY");
        txarea_date.setBorder(null);
        txarea_date.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txarea_dateMouseClicked(evt);
            }
        });
        jPanel2.add(txarea_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 200, 120, -1));

        jLabelPlaca.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabelPlaca.setText("Placa del vehiculo");
        jPanel2.add(jLabelPlaca, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 250, -1, 30));

        txt_placa.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        txt_placa.setText("Placa");
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
        jPanel2.add(txt_placa, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 290, 120, 30));

        jSeparatorname3.setBackground(new java.awt.Color(102, 102, 102));
        jSeparatorname3.setForeground(new java.awt.Color(102, 102, 102));
        jPanel2.add(jSeparatorname3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 270, 10));

        jSeparatorname7.setBackground(new java.awt.Color(102, 102, 102));
        jSeparatorname7.setForeground(new java.awt.Color(102, 102, 102));
        jPanel2.add(jSeparatorname7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 221, 270, 10));

        jLabelPlaca1.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabelPlaca1.setText("Modelo");
        jPanel2.add(jLabelPlaca1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 60, 30));

        txt_modelo.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        txt_modelo.setText("Modelo");
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
        jPanel2.add(txt_modelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 270, 30));

        jSeparatorname4.setBackground(new java.awt.Color(102, 102, 102));
        jSeparatorname4.setForeground(new java.awt.Color(102, 102, 102));
        jPanel2.add(jSeparatorname4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 270, 10));

        jLabelColor.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabelColor.setText("Color");
        jPanel2.add(jLabelColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 60, 30));

        jSeparatorname5.setBackground(new java.awt.Color(102, 102, 102));
        jSeparatorname5.setForeground(new java.awt.Color(102, 102, 102));
        jPanel2.add(jSeparatorname5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 270, 10));

        txt_color.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        txt_color.setText("Color");
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
        jPanel2.add(txt_color, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 270, 30));

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jPanel4.add(btn_menuback, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 120, 50));

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 450, 120, 50));

        jPanel5.setBackground(new java.awt.Color(204, 204, 204));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_registrar.setFont(new java.awt.Font("Roboto Thin", 0, 14)); // NOI18N
        btn_registrar.setText("Registrar");
        btn_registrar.setBorder(null);
        btn_registrar.setBorderPainted(false);
        btn_registrar.setContentAreaFilled(false);
        btn_registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registrarActionPerformed(evt);
            }
        });
        jPanel5.add(btn_registrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 120, 50));

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 450, 120, 50));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 500, 560, 20));

        jSeparatorcc1.setBackground(new java.awt.Color(102, 102, 102));
        jSeparatorcc1.setForeground(new java.awt.Color(102, 102, 102));
        jPanel2.add(jSeparatorcc1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 131, 120, 10));

        jSeparatorname8.setBackground(new java.awt.Color(102, 102, 102));
        jSeparatorname8.setForeground(new java.awt.Color(102, 102, 102));
        jPanel2.add(jSeparatorname8, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 221, 120, 10));

        jSeparatorname9.setBackground(new java.awt.Color(102, 102, 102));
        jSeparatorname9.setForeground(new java.awt.Color(102, 102, 102));
        jPanel2.add(jSeparatorname9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 321, 270, 10));

        jSeparatorname10.setBackground(new java.awt.Color(102, 102, 102));
        jSeparatorname10.setForeground(new java.awt.Color(102, 102, 102));
        jPanel2.add(jSeparatorname10, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 321, 120, 10));

        jSeparatorname11.setBackground(new java.awt.Color(102, 102, 102));
        jSeparatorname11.setForeground(new java.awt.Color(102, 102, 102));
        jPanel2.add(jSeparatorname11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 411, 270, 10));

        jScrollPane1.setViewportView(jPanel2);
        jPanel2.getAccessibleContext().setAccessibleParent(jPanel2);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, 560, 410));
        jScrollPane1.getAccessibleContext().setAccessibleName("");
        jScrollPane1.getAccessibleContext().setAccessibleDescription("");

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

    private void txt_ccMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_ccMouseClicked
        txt_cc.setText("");
    }//GEN-LAST:event_txt_ccMouseClicked

    private void txt_nameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_nameMouseClicked
        txt_name.setText("");
    }//GEN-LAST:event_txt_nameMouseClicked

    private void txt_cellMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_cellMouseClicked
        txt_cell.setText("");
    }//GEN-LAST:event_txt_cellMouseClicked

    private void txarea_dateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txarea_dateMouseClicked
        txarea_date.setText(fechaActual());
    }//GEN-LAST:event_txarea_dateMouseClicked

    private void txt_cellActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_cellActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_cellActionPerformed

    private void txt_placaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_placaMouseClicked
        txt_placa.setText("");
    }//GEN-LAST:event_txt_placaMouseClicked

    private void txt_placaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_placaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_placaActionPerformed

    private void txt_modeloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_modeloMouseClicked
        txt_modelo.setText("");
    }//GEN-LAST:event_txt_modeloMouseClicked

    private void txt_modeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_modeloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_modeloActionPerformed

    private void txt_nameMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_nameMouseReleased

    }//GEN-LAST:event_txt_nameMouseReleased

    private void txt_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nameActionPerformed

    private void txt_colorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_colorMouseClicked
        txt_color.setText("");
    }//GEN-LAST:event_txt_colorMouseClicked

    private void txt_colorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_colorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_colorActionPerformed

    private void btn_menubackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_menubackActionPerformed
        dispose();
        Menu vMenu = new Menu();
        vMenu.setVisible(true);  
    }//GEN-LAST:event_btn_menubackActionPerformed
     public void limpiar()
            
    {
        txt_placa.setText("");
        txt_cc.setText("");
        txt_cell.setText("");
        txt_color.setText("");
        txarea_date.setText("");
        txt_modelo.setText("");
        txt_name.setText("");
        txt_placa.setText("");
    }
    private void btn_registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registrarActionPerformed
        Persona persona=new Persona();
        persona.setNombre(txt_name.getText());
        persona.setCelular(txt_cell.getText());
        persona.setModelo(txt_modelo.getText());
        persona.setColor(txt_color.getText());
        persona.setCedula(Integer.parseInt(txt_cc.getText()));
        persona.setFechaRegistro(txarea_date.getText());
        persona.setPlaca(txt_placa.getText());
        try {
            if(datos.Agregar(persona, Integer.parseInt(txt_cc.getText()))){
                limpiar();
                JOptionPane.showMessageDialog(this, " VEHICULO REGISTRADO ");
            }else{
                JOptionPane.showMessageDialog(this, " VEHICULO NO REGISTRADO ");
            }
        } catch (IOException ex) {
            Logger.getLogger(Registrar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_registrarActionPerformed

    private void txt_ccKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_ccKeyTyped
        tCampo.soloNumeros(evt);
    }//GEN-LAST:event_txt_ccKeyTyped

    private void txt_cellKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_cellKeyTyped
        tCampo.soloNumeros(evt);
    }//GEN-LAST:event_txt_cellKeyTyped

    private void txt_nameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nameKeyTyped
        tCampo.soloLetras(evt);
    }//GEN-LAST:event_txt_nameKeyTyped

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
            java.util.logging.Logger.getLogger(Registrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registrar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BG1;
    private javax.swing.JLabel BG2;
    private javax.swing.JLabel Menu;
    private javax.swing.JButton btn_menu_consultar;
    private javax.swing.JButton btn_menu_eliminar;
    private javax.swing.JButton btn_menu_factura;
    private javax.swing.JButton btn_menu_registrar;
    private javax.swing.JButton btn_menuback;
    private javax.swing.JButton btn_registrar;
    private javax.swing.JButton btn_salir;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelCC;
    private javax.swing.JLabel jLabelColor;
    private javax.swing.JLabel jLabelPlaca;
    private javax.swing.JLabel jLabelPlaca1;
    private javax.swing.JLabel jLabelRegistro;
    private javax.swing.JLabel jLabeldate;
    private javax.swing.JLabel jLabelname;
    private javax.swing.JLabel jLabelnumber;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparatorcc;
    private javax.swing.JSeparator jSeparatorcc1;
    private javax.swing.JSeparator jSeparatorname;
    private javax.swing.JSeparator jSeparatorname1;
    private javax.swing.JSeparator jSeparatorname10;
    private javax.swing.JSeparator jSeparatorname11;
    private javax.swing.JSeparator jSeparatorname2;
    private javax.swing.JSeparator jSeparatorname3;
    private javax.swing.JSeparator jSeparatorname4;
    private javax.swing.JSeparator jSeparatorname5;
    private javax.swing.JSeparator jSeparatorname6;
    private javax.swing.JSeparator jSeparatorname7;
    private javax.swing.JSeparator jSeparatorname8;
    private javax.swing.JSeparator jSeparatorname9;
    private javax.swing.JTextArea txarea_date;
    private javax.swing.JTextField txt_cc;
    private javax.swing.JTextField txt_cell;
    private javax.swing.JTextField txt_color;
    private javax.swing.JTextField txt_modelo;
    private javax.swing.JTextField txt_name;
    private javax.swing.JTextField txt_placa;
    // End of variables declaration//GEN-END:variables
}
