package vista;

import java.awt.Color;

public class frmProductosModificar extends javax.swing.JFrame {

    public frmProductosModificar() {
        initComponents();
        this.setLocationRelativeTo(null);
        setTitle("Modificar Producto");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        topMenu = new javax.swing.JPanel();
        lbTopMenu = new javax.swing.JLabel();
        jpExit = new javax.swing.JPanel();
        lbExit = new javax.swing.JLabel();
        header = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtCodigoProducto = new javax.swing.JTextField();
        separador = new javax.swing.JPanel();
        txtProducto = new javax.swing.JTextField();
        separado = new javax.swing.JPanel();
        btnGuardar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

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

        topMenu.setBackground(new java.awt.Color(16, 15, 15));
        topMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbTopMenu.setFont(new java.awt.Font("Roboto Medium", 0, 20)); // NOI18N
        lbTopMenu.setForeground(new java.awt.Color(241, 241, 241));
        lbTopMenu.setText(".: Productos :.");
        topMenu.add(lbTopMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 5, 130, 23));

        jpExit.setBackground(new java.awt.Color(16, 15, 15));
        jpExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jpExit.setPreferredSize(new java.awt.Dimension(50, 50));

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

        javax.swing.GroupLayout jpExitLayout = new javax.swing.GroupLayout(jpExit);
        jpExit.setLayout(jpExitLayout);
        jpExitLayout.setHorizontalGroup(
            jpExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpExitLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lbExit, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jpExitLayout.setVerticalGroup(
            jpExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpExitLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lbExit, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        topMenu.add(jpExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(244, 0, -1, 32));

        bg.add(topMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 294, 37));

        header.setBackground(new java.awt.Color(34, 87, 126));
        header.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Roboto Medium", 0, 25)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(241, 241, 241));
        jLabel2.setText("Modificar Producto");
        header.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 17, -1, -1));

        bg.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 37, 284, 63));

        txtCodigoProducto.setEditable(false);
        txtCodigoProducto.setBackground(new java.awt.Color(241, 241, 241));
        txtCodigoProducto.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        txtCodigoProducto.setForeground(new java.awt.Color(102, 102, 102));
        txtCodigoProducto.setText("Código Automático");
        txtCodigoProducto.setBorder(null);
        txtCodigoProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtCodigoProductoMousePressed(evt);
            }
        });
        bg.add(txtCodigoProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 158, 190, 20));

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

        bg.add(separador, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 180, 190, 2));

        txtProducto.setBackground(new java.awt.Color(241, 241, 241));
        txtProducto.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        txtProducto.setForeground(new java.awt.Color(102, 102, 102));
        txtProducto.setText("Nuevo Nombre");
        txtProducto.setBorder(null);
        txtProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtProductoMousePressed(evt);
            }
        });
        bg.add(txtProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 228, 190, 20));

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

        bg.add(separado, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 250, 190, 2));

        btnGuardar.setBackground(new java.awt.Color(34, 87, 126));
        btnGuardar.setFont(new java.awt.Font("Roboto Medium", 0, 20)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(241, 241, 241));
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/productos/Guardar Producto.png"))); // NOI18N
        btnGuardar.setText("Modificar");
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
        bg.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 280, 190, 35));

        jLabel5.setFont(new java.awt.Font("Roboto Medium", 0, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(16, 15, 15));
        jLabel5.setText("Producto");
        bg.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 200, -1, -1));

        jLabel6.setFont(new java.awt.Font("Roboto Medium", 0, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(16, 15, 15));
        jLabel6.setText("Codigo");
        bg.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 130, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtProductoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtProductoMousePressed
        //Validar que el texto del campo sea igual a "Ingrese el Producto"
        if(txtProducto.getText().equals("Ingrese el Producto")){
            txtProducto.setText(""); //Vaciar el campo
            txtProducto.setForeground(new Color(0x100F0F)); //Cambiar el color de letra
        }
    }//GEN-LAST:event_txtProductoMousePressed

    private void lbExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbExitMouseClicked
        this.dispose();
    }//GEN-LAST:event_lbExitMouseClicked

    private void lbExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbExitMouseEntered
        jpExit.setBackground(new Color(0xF05454));
        lbExit.setForeground(new Color(0x100F0F));
    }//GEN-LAST:event_lbExitMouseEntered

    private void lbExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbExitMouseExited
        jpExit.setBackground(new Color(0x100F0F));
        lbExit.setForeground(new Color(0xF1F1F1));
    }//GEN-LAST:event_lbExitMouseExited

    // Método para llenar el campo txtProducto
    public void llenarCampoVacio(){
        //Validar que el campo usuario esté vacío(is.Empty())
        if(txtProducto.getText().isEmpty()){
            txtProducto.setText("Ingrese el Producto");
            txtProducto.setForeground(new Color(0x666666));
        }
    }
    
    private void txtCodigoProductoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCodigoProductoMousePressed
        //Llamado del método
        llenarCampoVacio();
    }//GEN-LAST:event_txtCodigoProductoMousePressed

    private void bgMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bgMousePressed
        //Llamado del método
        llenarCampoVacio();
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
            java.util.logging.Logger.getLogger(frmProductosModificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmProductosModificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmProductosModificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmProductosModificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmProductosModificar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JPanel header;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jpExit;
    private javax.swing.JLabel lbExit;
    private javax.swing.JLabel lbTopMenu;
    private javax.swing.JPanel separado;
    private javax.swing.JPanel separador;
    private javax.swing.JPanel topMenu;
    private javax.swing.JTextField txtCodigoProducto;
    private javax.swing.JTextField txtProducto;
    // End of variables declaration//GEN-END:variables
}
