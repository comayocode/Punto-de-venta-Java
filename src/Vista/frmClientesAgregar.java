package vista;

import java.awt.Color;

public class frmClientesAgregar extends javax.swing.JFrame {

    public frmClientesAgregar() {
        initComponents();
        this.setLocationRelativeTo(null);
        setTitle("Añadir Productos");
    }
    
    // ---- MÉTODOS PARA VACIAR Y LLENAR LOS CAMPOS DE TEXTO ----
    //Método para txtCodigoProveedor
    public void codigoPresionado(){
        if(txtCedula.getText().equals("Cédula")){ //Si el campo tiene "Código"...
            txtCedula.setText(""); //Quita el texto
            txtCedula.setForeground(new Color(0x100F0F)); //Cambia de color la letra
        }
        
        if(txtCliente.getText().isEmpty()){ //Si al dar clic en txtCodigo, txtProveedor está vacío...
            txtCliente.setText("Nombre"); //Llena el campo con "Nombre"
            txtCliente.setForeground(new Color(0x666666)); //Cambia el color del texto
        }
        
        if(txtCelular.getText().isEmpty()){ //Si al dar clic en txtCodigo, txtCelular está vacío...
            txtCelular.setText("Celular"); //Llena el campo con "Celular"
            txtCelular.setForeground(new Color(0x666666)); //Cambia el color del texto
        }
        
        if(txtDireccion.getText().isEmpty()){ //Si al dar clic en txtCodigo, txtDirección está vacío...
            txtDireccion.setText("Dirección"); //Llena el campo con "Dirección"
            txtDireccion.setForeground(new Color(0x666666)); //Cambia el color del texto
        }
    }
    //Método para txtProveedor
    public void proveedorPresionado(){
        if(txtCliente.getText().equals("Nombre")){
            txtCliente.setText("");
            txtCliente.setForeground(new Color(0x100F0F));
        }
        
        if(txtCedula.getText().isEmpty()){
            txtCedula.setText("Cédula");
            txtCedula.setForeground(new Color(0x666666));
        }
        
        if(txtCelular.getText().isEmpty()){
            txtCelular.setText("Celular");
            txtCelular.setForeground(new Color(0x666666));
        }
        
        if(txtDireccion.getText().isEmpty()){
            txtDireccion.setText("Dirección");
            txtDireccion.setForeground(new Color(0x666666));
        }
    }
    //Método para txtCelular
    public void celularPresionado(){
        if(txtCelular.getText().equals("Celular")){
            txtCelular.setText("");
            txtCelular.setForeground(new Color(0x100F0F));
        }
        
        if(txtCedula.getText().isEmpty()){
            txtCedula.setText("Cédula"); 
            txtCedula.setForeground(new Color(0x666666)); 
        }
        
        if(txtCliente.getText().isEmpty()){
            txtCliente.setText("Nombre");
            txtCliente.setForeground(new Color(0x666666));
        }
        
        if(txtDireccion.getText().isEmpty()){
            txtDireccion.setText("Dirección");
            txtDireccion.setForeground(new Color(0x666666));
        }
    }
    //Método para txtDireccion
    public void direccionPresionado(){
        if(txtDireccion.getText().equals("Dirección")){
            txtDireccion.setText("");
            txtDireccion.setForeground(new Color(0x100F0F));
        }
        
        if(txtCedula.getText().isEmpty()){
            txtCedula.setText("Cédula"); 
            txtCedula.setForeground(new Color(0x666666)); 
        }
        
        if(txtCliente.getText().isEmpty()){
            txtCliente.setText("Nombre");
            txtCliente.setForeground(new Color(0x666666));
        }
        
        if(txtCelular.getText().isEmpty()){
            txtCelular.setText("Celular");
            txtCelular.setForeground(new Color(0x666666));
        }
        
    }
    
    // ---- MÉTODO PARA LLENAR CAMPO AL DAR CLIC EN BG ----
    public void llenarClicBg(){
        if(txtCedula.getText().isEmpty()){
            txtCedula.setText("Cédula"); 
            txtCedula.setForeground(new Color(0x666666)); 
        }
        
        if(txtCliente.getText().isEmpty()){
            txtCliente.setText("Nombre");
            txtCliente.setForeground(new Color(0x666666));
        }
        
        if(txtCelular.getText().isEmpty()){
            txtCelular.setText("Celular");
            txtCelular.setForeground(new Color(0x666666));
        }
        
        if(txtDireccion.getText().isEmpty()){
            txtDireccion.setText("Dirección");
            txtDireccion.setForeground(new Color(0x666666));
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        body = new javax.swing.JPanel();
        txtDireccion = new javax.swing.JTextField();
        separado3 = new javax.swing.JPanel();
        txtCelular = new javax.swing.JTextField();
        separado2 = new javax.swing.JPanel();
        txtCliente = new javax.swing.JTextField();
        separado = new javax.swing.JPanel();
        txtCedula = new javax.swing.JTextField();
        separador = new javax.swing.JPanel();
        btnGuardar = new javax.swing.JButton();
        topMenu = new javax.swing.JPanel();
        lbTopMenu = new javax.swing.JLabel();
        btnExit = new javax.swing.JPanel();
        lbExit = new javax.swing.JLabel();
        header = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        bg.setBackground(new java.awt.Color(241, 241, 241));
        bg.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(16, 15, 15), 5));
        bg.setPreferredSize(new java.awt.Dimension(270, 350));
        bg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                bgMousePressed(evt);
            }
        });
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        body.setBackground(new java.awt.Color(241, 241, 241));
        body.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtDireccion.setBackground(new java.awt.Color(241, 241, 241));
        txtDireccion.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        txtDireccion.setForeground(new java.awt.Color(102, 102, 102));
        txtDireccion.setText("Dirección");
        txtDireccion.setBorder(null);
        txtDireccion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtDireccionMousePressed(evt);
            }
        });
        body.add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 163, 190, 20));

        separado3.setBackground(new java.awt.Color(16, 15, 15));

        javax.swing.GroupLayout separado3Layout = new javax.swing.GroupLayout(separado3);
        separado3.setLayout(separado3Layout);
        separado3Layout.setHorizontalGroup(
            separado3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 190, Short.MAX_VALUE)
        );
        separado3Layout.setVerticalGroup(
            separado3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        body.add(separado3, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 189, 190, 2));

        txtCelular.setBackground(new java.awt.Color(241, 241, 241));
        txtCelular.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        txtCelular.setForeground(new java.awt.Color(102, 102, 102));
        txtCelular.setText("Celular");
        txtCelular.setBorder(null);
        txtCelular.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtCelularMousePressed(evt);
            }
        });
        body.add(txtCelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 117, 190, 20));

        separado2.setBackground(new java.awt.Color(16, 15, 15));

        javax.swing.GroupLayout separado2Layout = new javax.swing.GroupLayout(separado2);
        separado2.setLayout(separado2Layout);
        separado2Layout.setHorizontalGroup(
            separado2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 190, Short.MAX_VALUE)
        );
        separado2Layout.setVerticalGroup(
            separado2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        body.add(separado2, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 143, 190, 2));

        txtCliente.setBackground(new java.awt.Color(241, 241, 241));
        txtCliente.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        txtCliente.setForeground(new java.awt.Color(102, 102, 102));
        txtCliente.setText("Nombre");
        txtCliente.setBorder(null);
        txtCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtClienteMousePressed(evt);
            }
        });
        body.add(txtCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 71, 190, 21));

        separado.setBackground(new java.awt.Color(16, 15, 15));

        javax.swing.GroupLayout separadoLayout = new javax.swing.GroupLayout(separado);
        separado.setLayout(separadoLayout);
        separadoLayout.setHorizontalGroup(
            separadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 190, Short.MAX_VALUE)
        );
        separadoLayout.setVerticalGroup(
            separadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        body.add(separado, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 97, 190, 2));

        txtCedula.setBackground(new java.awt.Color(241, 241, 241));
        txtCedula.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        txtCedula.setForeground(new java.awt.Color(102, 102, 102));
        txtCedula.setText("Cédula");
        txtCedula.setBorder(null);
        txtCedula.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtCedulaMousePressed(evt);
            }
        });
        body.add(txtCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 25, 190, 21));

        separador.setBackground(new java.awt.Color(16, 15, 15));

        javax.swing.GroupLayout separadorLayout = new javax.swing.GroupLayout(separador);
        separador.setLayout(separadorLayout);
        separadorLayout.setHorizontalGroup(
            separadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 190, Short.MAX_VALUE)
        );
        separadorLayout.setVerticalGroup(
            separadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        body.add(separador, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 51, 190, 2));

        btnGuardar.setBackground(new java.awt.Color(34, 87, 126));
        btnGuardar.setFont(new java.awt.Font("Roboto Medium", 0, 20)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(241, 241, 241));
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/productos/Guardar Producto.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.setBorderPainted(false);
        btnGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardar.setFocusable(false);
        btnGuardar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnGuardar.setIconTextGap(15);
        btnGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGuardarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnGuardarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnGuardarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnGuardarMousePressed(evt);
            }
        });
        body.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 190, 35));

        bg.add(body, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 100, 284, 290));

        topMenu.setBackground(new java.awt.Color(16, 15, 15));
        topMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbTopMenu.setFont(new java.awt.Font("Roboto Medium", 0, 20)); // NOI18N
        lbTopMenu.setForeground(new java.awt.Color(241, 241, 241));
        lbTopMenu.setText(".: Clientes :.");
        topMenu.add(lbTopMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 5, 160, 23));

        btnExit.setBackground(new java.awt.Color(16, 15, 15));
        btnExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExit.setPreferredSize(new java.awt.Dimension(50, 50));

        lbExit.setBackground(new java.awt.Color(241, 241, 241));
        lbExit.setFont(new java.awt.Font("Roboto Light", 1, 28)); // NOI18N
        lbExit.setForeground(new java.awt.Color(241, 241, 241));
        lbExit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbExit.setText("X");
        lbExit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lbExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbExitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbExitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbExitMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnExitLayout = new javax.swing.GroupLayout(btnExit);
        btnExit.setLayout(btnExitLayout);
        btnExitLayout.setHorizontalGroup(
            btnExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnExitLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lbExit, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        btnExitLayout.setVerticalGroup(
            btnExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnExitLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lbExit, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        topMenu.add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(244, 0, -1, 32));

        bg.add(topMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 294, 37));

        header.setBackground(new java.awt.Color(34, 87, 126));
        header.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Roboto Medium", 0, 25)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(241, 241, 241));
        jLabel2.setText("Añadir Cliente");
        header.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 17, -1, -1));

        bg.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 37, 284, 63));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, 395, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtClienteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtClienteMousePressed
        proveedorPresionado();
    }//GEN-LAST:event_txtClienteMousePressed

    private void lbExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbExitMouseClicked
        this.dispose();
    }//GEN-LAST:event_lbExitMouseClicked

    private void lbExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbExitMouseEntered
        btnExit.setBackground(new Color(0xF05454));
        lbExit.setForeground(new Color(0x100F0F));
    }//GEN-LAST:event_lbExitMouseEntered

    private void lbExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbExitMouseExited
        btnExit.setBackground(new Color(0x100F0F));
        lbExit.setForeground(new Color(0xF1F1F1));
    }//GEN-LAST:event_lbExitMouseExited
    
    private void txtCedulaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCedulaMousePressed
        codigoPresionado();
    }//GEN-LAST:event_txtCedulaMousePressed

    private void bgMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bgMousePressed
        llenarClicBg();
    }//GEN-LAST:event_bgMousePressed

    // ---- EVENTOS btnGuardar ----
    private void btnGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarMouseClicked
        btnGuardar.setBackground(new Color(0x2b628c));
    }//GEN-LAST:event_btnGuardarMouseClicked
    private void btnGuardarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarMouseEntered
        btnGuardar.setBackground(new Color(0x2b628c));        
    }//GEN-LAST:event_btnGuardarMouseEntered
    private void btnGuardarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarMouseExited
        btnGuardar.setBackground(new Color(0x22577E));
    }//GEN-LAST:event_btnGuardarMouseExited
    private void btnGuardarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarMousePressed
        btnGuardar.setBackground(new Color(0x2b5574));
    }//GEN-LAST:event_btnGuardarMousePressed

    private void txtCelularMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCelularMousePressed
        celularPresionado();
    }//GEN-LAST:event_txtCelularMousePressed

    private void txtDireccionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtDireccionMousePressed
        direccionPresionado();
    }//GEN-LAST:event_txtDireccionMousePressed

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
            java.util.logging.Logger.getLogger(frmClientesAgregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmClientesAgregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmClientesAgregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmClientesAgregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmClientesAgregar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JPanel body;
    private javax.swing.JPanel btnExit;
    public javax.swing.JButton btnGuardar;
    private javax.swing.JPanel header;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lbExit;
    private javax.swing.JLabel lbTopMenu;
    private javax.swing.JPanel separado;
    private javax.swing.JPanel separado2;
    private javax.swing.JPanel separado3;
    private javax.swing.JPanel separador;
    private javax.swing.JPanel topMenu;
    public javax.swing.JTextField txtCedula;
    public javax.swing.JTextField txtCelular;
    public javax.swing.JTextField txtCliente;
    public javax.swing.JTextField txtDireccion;
    // End of variables declaration//GEN-END:variables
}
