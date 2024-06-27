package Ventanas;


import java.awt.Component;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

public final class Login extends javax.swing.JFrame 
{
    private Component confirmation;
    private String user, password;
    
    public Login() 
    {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false); 
        
        txtUsuario.setBackground(new java.awt.Color(0,0,0,1));
        txtPassword.setBackground(new java.awt.Color(0,0,0,1));
    }
    public void datos(String us, String pass)
    {
        user = "Admin";
        password = "admin";
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelBienvenido = new javax.swing.JLabel();
        jLabelLOGO = new javax.swing.JLabel();
        jLabelUser = new javax.swing.JLabel();
        jSeparatorUsuario = new javax.swing.JSeparator();
        jSeparatorUsuario2 = new javax.swing.JSeparator();
        txtUsuario = new javax.swing.JTextField();
        jLabelPadlock = new javax.swing.JLabel();
        jSeparatorPassword = new javax.swing.JSeparator();
        jSeparatorPassword2 = new javax.swing.JSeparator();
        txtPassword = new javax.swing.JPasswordField();
        jPanel4 = new javax.swing.JPanel();
        btn_ingresar = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        btn_salir = new javax.swing.JButton();
        BG1L = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelBienvenido.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        jLabelBienvenido.setForeground(new java.awt.Color(255, 255, 255));
        jLabelBienvenido.setText("BIENVENIDO A");
        getContentPane().add(jLabelBienvenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, -1, -1));

        jLabelLOGO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LOGO.png"))); // NOI18N
        getContentPane().add(jLabelLOGO, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, -1, -1));

        jLabelUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/USER.png"))); // NOI18N
        getContentPane().add(jLabelUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 310, -1, -1));

        jSeparatorUsuario.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jSeparatorUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(143, 341, 210, 10));

        jSeparatorUsuario2.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jSeparatorUsuario2, new org.netbeans.lib.awtextra.AbsoluteConstraints(143, 340, 210, 10));

        txtUsuario.setBackground(new java.awt.Color(0, 102, 102));
        txtUsuario.setFont(new java.awt.Font("Lato", 0, 20)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(255, 255, 255));
        txtUsuario.setBorder(null);
        txtUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtUsuarioMouseClicked(evt);
            }
        });
        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });
        txtUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUsuarioKeyPressed(evt);
            }
        });
        getContentPane().add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 310, 210, 30));

        jLabelPadlock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/PADLOCK.png"))); // NOI18N
        getContentPane().add(jLabelPadlock, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 380, -1, -1));

        jSeparatorPassword.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jSeparatorPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(143, 410, 210, 10));

        jSeparatorPassword2.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jSeparatorPassword2, new org.netbeans.lib.awtextra.AbsoluteConstraints(143, 411, 210, 10));

        txtPassword.setBackground(new java.awt.Color(0, 102, 102));
        txtPassword.setFont(new java.awt.Font("Lato", 0, 18)); // NOI18N
        txtPassword.setForeground(new java.awt.Color(255, 255, 255));
        txtPassword.setBorder(null);
        txtPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtPasswordMouseClicked(evt);
            }
        });
        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });
        txtPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPasswordKeyPressed(evt);
            }
        });
        getContentPane().add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 385, 210, 30));

        jPanel4.setBackground(new java.awt.Color(153, 153, 153));

        btn_ingresar.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        btn_ingresar.setText("Iniciar sesión");
        btn_ingresar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        btn_ingresar.setBorderPainted(false);
        btn_ingresar.setContentAreaFilled(false);
        btn_ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ingresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btn_ingresar, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btn_ingresar, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 440, -1, -1));

        jPanel5.setBackground(new java.awt.Color(153, 153, 153));

        btn_salir.setBackground(new java.awt.Color(255, 255, 255));
        btn_salir.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        btn_salir.setText("Salir");
        btn_salir.setBorder(null);
        btn_salir.setBorderPainted(false);
        btn_salir.setContentAreaFilled(false);
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btn_salir, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btn_salir, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 500, -1, -1));

        BG1L.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/BG1L.png"))); // NOI18N
        getContentPane().add(BG1L, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed

    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed

    private void txtUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUsuarioMouseClicked
        txtUsuario.setText("");
    }//GEN-LAST:event_txtUsuarioMouseClicked

    private void txtPasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPasswordMouseClicked
        txtPassword.setText("");
    }//GEN-LAST:event_txtPasswordMouseClicked

    private void btn_ingresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ingresarActionPerformed
        datos(user, password);
        if (user.equals(txtUsuario.getText()) && password.equals(txtPassword.getText()))
        {
            dispose();
            Menu vMenu = new Menu();
            vMenu.setVisible(true);
        }
        else if(txtUsuario.getText().equals("") && txtPassword.getText().equals(""))
        {
            JOptionPane.showMessageDialog(this,"Usuario y/o Contraseña estan vacios\nIngrese los por favor.");
            txtUsuario.setFocusable(true);
        }
        else if(txtUsuario.getText().equals(""))
        {
            JOptionPane.showMessageDialog(this,"Usuario está vacio\nIngrese lo por favor.");
            txtUsuario.setFocusable(true);
        }
        else if(txtPassword.getText().equals(""))
        {
            JOptionPane.showMessageDialog(this,"Contraseña está vacio\nIngrese lo por favor.");
            txtPassword.setFocusable(true);
        }
        else if(txtUsuario.getText().compareTo(user)!=0 && txtPassword.getText().compareTo(password)!=0)
        {
            JOptionPane.showMessageDialog(this,"Usuario y/o Contraseña no válidos\nIngrese nuevamente.");
            txtUsuario.setFocusable(true);
        }
        else if(txtUsuario.getText().compareTo(user)!=0)
        {
            JOptionPane.showMessageDialog(this,"Usuario no válido\nIngrese nuevamente.");
            txtUsuario.setFocusable(true);
        }
        else if(txtPassword.getText().compareTo(password)!=0)
        {
            JOptionPane.showMessageDialog(this,"Contraseña no válida\nIngrese nuevamente.");
            txtPassword.setFocusable(true);
        }
    }//GEN-LAST:event_btn_ingresarActionPerformed

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btn_salirActionPerformed

    private void txtPasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordKeyPressed
        if (evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
            datos(user, password);
            if (user.equals(txtUsuario.getText()) && password.equals(txtPassword.getText()))
            {
                dispose();
                Menu vMenu = new Menu();
                vMenu.setVisible(true);
            }
            else if(txtUsuario.getText().equals("") && txtPassword.getText().equals(""))
            {
                JOptionPane.showMessageDialog(this,"Usuario y/o Contraseña estan vacios\nIngrese los por favor.");
                txtUsuario.setFocusable(true);
            }
            else if(txtUsuario.getText().equals(""))
            {
                JOptionPane.showMessageDialog(this,"Usuario está vacio\nIngrese lo por favor.");
                txtUsuario.setFocusable(true);
            }
            else if(txtPassword.getText().equals(""))
            {
                JOptionPane.showMessageDialog(this,"Contraseña está vacio\nIngrese lo por favor.");
                txtPassword.setFocusable(true);
            }
            else if(txtUsuario.getText().compareTo(user)!=0 && txtPassword.getText().compareTo(password)!=0)
            {
                JOptionPane.showMessageDialog(this,"Usuario y/o Contraseña no válidos\nIngrese nuevamente.");
                txtUsuario.setFocusable(true);
            }
            else if(txtUsuario.getText().compareTo(user)!=0)
            {
                JOptionPane.showMessageDialog(this,"Usuario no válido\nIngrese nuevamente.");
                txtUsuario.setFocusable(true);
            }
            else if(txtPassword.getText().compareTo(password)!=0)
            {
                JOptionPane.showMessageDialog(this,"Contraseña no válida\nIngrese nuevamente.");
                txtPassword.setFocusable(true);
            }
        }
    }//GEN-LAST:event_txtPasswordKeyPressed

    private void txtUsuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsuarioKeyPressed
        
    }//GEN-LAST:event_txtUsuarioKeyPressed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BG1L;
    private javax.swing.JButton btn_ingresar;
    private javax.swing.JButton btn_salir;
    private javax.swing.JLabel jLabelBienvenido;
    private javax.swing.JLabel jLabelLOGO;
    private javax.swing.JLabel jLabelPadlock;
    private javax.swing.JLabel jLabelUser;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JSeparator jSeparatorPassword;
    private javax.swing.JSeparator jSeparatorPassword2;
    private javax.swing.JSeparator jSeparatorUsuario;
    private javax.swing.JSeparator jSeparatorUsuario2;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
