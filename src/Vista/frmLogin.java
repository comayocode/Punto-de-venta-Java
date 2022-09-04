package vista;

import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

public class frmLogin extends javax.swing.JFrame {

    public frmLogin() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        txtUsuario = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtContraseña = new javax.swing.JPasswordField();
        btnIngresar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(16, 15, 15));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/global/logo.png"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 45, -1, -1));

        jLabel1.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(241, 241, 241));
        jLabel1.setText("Gestor de Inventario");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        jLabel3.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 211, 105));
        jLabel3.setText("ComayanService");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 163, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 215, 250));

        jPanel3.setBackground(new java.awt.Color(241, 241, 241));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(16, 15, 15));
        jPanel5.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 280, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 136, 280, 2));

        jPanel4.setBackground(new java.awt.Color(16, 15, 15));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 280, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 78, 280, 2));

        txtUsuario.setBackground(new java.awt.Color(241, 241, 241));
        txtUsuario.setFont(new java.awt.Font("Roboto Medium", 0, 15)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(102, 102, 102));
        txtUsuario.setText("Ingrese su Usuario");
        txtUsuario.setBorder(null);
        txtUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtUsuarioMousePressed(evt);
            }
        });
        jPanel3.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 53, 280, 25));

        jLabel4.setFont(new java.awt.Font("Roboto Medium", 0, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(16, 15, 15));
        jLabel4.setText("Usuario");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 35, -1, -1));

        jLabel5.setFont(new java.awt.Font("Roboto Medium", 0, 15)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(16, 15, 15));
        jLabel5.setText("Contraseña");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 93, -1, -1));

        txtContraseña.setBackground(new java.awt.Color(241, 241, 241));
        txtContraseña.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        txtContraseña.setForeground(new java.awt.Color(102, 102, 102));
        txtContraseña.setText("**********");
        txtContraseña.setToolTipText("sadsdasd");
        txtContraseña.setBorder(null);
        txtContraseña.setOpaque(true);
        txtContraseña.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtContraseñaMousePressed(evt);
            }
        });
        txtContraseña.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtContraseñaKeyReleased(evt);
            }
        });
        jPanel3.add(txtContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 111, 280, 25));

        btnIngresar.setBackground(new java.awt.Color(34, 87, 126));
        btnIngresar.setFont(new java.awt.Font("Roboto Medium", 0, 15)); // NOI18N
        btnIngresar.setForeground(new java.awt.Color(241, 241, 241));
        btnIngresar.setText("Ingresar");
        btnIngresar.setBorderPainted(false);
        btnIngresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnIngresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIngresarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnIngresarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnIngresarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnIngresarMousePressed(evt);
            }
        });
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });
        jPanel3.add(btnIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 156, 130, 27));

        btnSalir.setBackground(new java.awt.Color(240, 84, 84));
        btnSalir.setFont(new java.awt.Font("Roboto Medium", 0, 15)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(16, 15, 15));
        btnSalir.setText("Salir");
        btnSalir.setBorderPainted(false);
        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalirMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSalirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSalirMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnSalirMousePressed(evt);
            }
        });
        jPanel3.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(192, 156, 130, 27));

        jLabel6.setBackground(new java.awt.Color(16, 15, 15));
        jLabel6.setForeground(new java.awt.Color(16, 15, 15));
        jLabel6.setText("Todos los derechos reservados");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 216, -1, -1));

        jLabel7.setBackground(new java.awt.Color(241, 241, 241));
        jLabel7.setForeground(new java.awt.Color(16, 15, 15));
        jLabel7.setText("© 2022 Ronald Comayan");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 230, -1, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 0, 350, 250));

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
    
    //Validar el acceso de inicio de secion
    private void validacion(){
        String usuario = txtUsuario.getText(); //Obtiene el texto del campo
        String contraseña = String.valueOf(txtContraseña.getPassword()); //Obtener contraseña como objeto char y parsearlo a String
        
        Object[] botones = {"Continuar"};
        
        //Validar
        if(usuario.equals("Admin") & contraseña.equals("0123")){
            frmMenu menu = new frmMenu(); //Instanciar JFrame
            this.dispose(); //Cerrar este JFrame
            JOptionPane.showMessageDialog(null, "¡Bienvenido!", "Bienvenida", JOptionPane.NO_OPTION, null);
            menu.setVisible(true);
        }else{
            //Ventana de mensaje(posicion, mensaje, titulo, opcion)
            JOptionPane.showMessageDialog(null, "Aceeso Denegado", "Inicio de Sesion", JOptionPane.NO_OPTION);
        }
    }
    
    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        //Llamado del método para validar
        validacion();
    }//GEN-LAST:event_btnIngresarActionPerformed

    private void txtContraseñaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContraseñaKeyReleased
        //Condicion si el evento es ENTER, si es = true se valida
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            //Llamado del método para validar
            validacion();
        }
    }//GEN-LAST:event_txtContraseñaKeyReleased

    // ---- VACIAR CAMPOS AL DAR CLIC Y LLENARLOS CUANDO SE QUITE EL CLIC---
    
    //Cuando el mouse se presiona sobre la contraseña
    private void txtUsuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUsuarioMousePressed
        //Validar que el texto del campo sea igual a "Ingrese su Usuario"
        if(txtUsuario.getText().equals("Ingrese su Usuario")){
            txtUsuario.setText(""); //Vaciar el campo
            txtUsuario.setForeground(new Color(0x100F0F)); //Cambiar el color de letra
        }
        //Validar si el texto del campo de contraseña está vacío(isEmpty())
        if(String.valueOf(txtContraseña.getPassword()).isEmpty()){
            txtContraseña.setText("**********"); //Se llena el campo
            txtContraseña.setForeground(new Color(0x666666)); //Cambiar el color de la letra
        }
    }//GEN-LAST:event_txtUsuarioMousePressed
    //Cuando el mouse se presiona sobre la contraseña
    private void txtContraseñaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtContraseñaMousePressed
        //Validar si el texto del campo de contraseña está llenado con "**********"
        if(String.valueOf(txtContraseña.getPassword()).equals("**********")){
            txtContraseña.setText("");
            txtContraseña.setForeground(new Color(0x100F0F));
        }
        //Validar que el campo usuario esté vacío(is.Empty())
        if(txtUsuario.getText().isEmpty()){
            txtUsuario.setText("Ingrese su Usuario");
            txtUsuario.setForeground(new Color(0x666666));
        }
    }//GEN-LAST:event_txtContraseñaMousePressed

    // ---- EVENTOS btnIngresar ----
    private void btnIngresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIngresarMouseClicked
    }//GEN-LAST:event_btnIngresarMouseClicked
    private void btnIngresarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIngresarMouseEntered
    }//GEN-LAST:event_btnIngresarMouseEntered
    private void btnIngresarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIngresarMouseExited
    }//GEN-LAST:event_btnIngresarMouseExited
    private void btnIngresarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIngresarMousePressed
    }//GEN-LAST:event_btnIngresarMousePressed

    // ---- EVENTOS btnSalir
    private void btnSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseClicked
        btnSalir.setBackground(new Color(0xff6969));
        //Cerrar este JFrame
        this.dispose();
    }//GEN-LAST:event_btnSalirMouseClicked
    private void btnSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseEntered
        btnSalir.setBackground(new Color(0xf15b5b));
    }//GEN-LAST:event_btnSalirMouseEntered
    private void btnSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseExited
        btnSalir.setBackground(new Color(0xF05454));
    }//GEN-LAST:event_btnSalirMouseExited
    private void btnSalirMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMousePressed
        btnSalir.setBackground(new Color(0xd15e5e));
    }//GEN-LAST:event_btnSalirMousePressed
    
    
    
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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIngresar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPasswordField txtContraseña;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
