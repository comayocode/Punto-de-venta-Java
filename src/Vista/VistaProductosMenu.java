package Vista;

import java.awt.Color;

public class VistaProductosMenu extends javax.swing.JFrame {
    public VistaProductosMenu() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnAñadir = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnCargar = new javax.swing.JPanel();
        btnLista = new javax.swing.JPanel();
        btnCerrar = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setFocusable(false);
        setUndecorated(true);
        setSize(new java.awt.Dimension(320, 352));

        jPanel2.setBackground(new java.awt.Color(241, 241, 241));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(16, 15, 15), 5));
        jPanel2.setFocusable(false);
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(16, 15, 15));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto Medium", 0, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(241, 241, 241));
        jLabel1.setText(".: Productos :.");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 5, 130, 23));

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 37));

        btnAñadir.setBackground(new java.awt.Color(34, 87, 126));
        btnAñadir.setForeground(new java.awt.Color(241, 241, 241));
        btnAñadir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAñadir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAñadirMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAñadirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAñadirMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnAñadirMousePressed(evt);
            }
        });
        btnAñadir.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/opcionmenu/btnAgregar.png"))); // NOI18N
        btnAñadir.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 5, 45, 45));

        jLabel3.setFont(new java.awt.Font("Roboto Medium", 0, 25)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(241, 241, 241));
        jLabel3.setText("Añadir");
        btnAñadir.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 13, -1, -1));

        jPanel2.add(btnAñadir, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 65, 224, 55));

        btnCargar.setBackground(new java.awt.Color(34, 87, 126));
        btnCargar.setForeground(new java.awt.Color(241, 241, 241));
        btnCargar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(btnCargar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 135, 224, 55));

        btnLista.setBackground(new java.awt.Color(34, 87, 126));
        btnLista.setForeground(new java.awt.Color(241, 241, 241));
        btnLista.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(btnLista, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 205, 224, 55));

        btnCerrar.setBackground(new java.awt.Color(34, 87, 126));
        btnCerrar.setForeground(new java.awt.Color(241, 241, 241));
        btnCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCerrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCerrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCerrarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnCerrarMousePressed(evt);
            }
        });
        btnCerrar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/opcionmenu/btnCerrar.png"))); // NOI18N
        btnCerrar.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 5, 45, 45));

        jLabel5.setFont(new java.awt.Font("Roboto Medium", 0, 25)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(241, 241, 241));
        jLabel5.setText("Cerrar");
        btnCerrar.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 13, -1, -1));

        jPanel2.add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 275, 224, 55));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 365, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // ---- EVENTOS Y ESTILOS btnAñadirProducto ----
    private void btnAñadirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAñadirMouseClicked
        btnAñadir.setBackground(new Color(0x2b628c));
        VistaProductosLista lista = new VistaProductosLista();
        lista.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAñadirMouseClicked
    private void btnAñadirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAñadirMouseEntered
        btnAñadir.setBackground(new Color(0x2b628c));
    }//GEN-LAST:event_btnAñadirMouseEntered
    private void btnAñadirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAñadirMouseExited
        btnAñadir.setBackground(new Color(0x22577E));
    }//GEN-LAST:event_btnAñadirMouseExited
    private void btnAñadirMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAñadirMousePressed
        btnAñadir.setBackground(new Color(0x2b5574));
    }//GEN-LAST:event_btnAñadirMousePressed

    // ---- EVENTOS Y ESTILOS btnCerrar ----
    private void btnCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarMouseClicked
        btnCerrar.setBackground(new Color(0x2b628c));
        VistaMenu menu = new VistaMenu();
        menu.setEnabled(true);
        this.dispose();
    }//GEN-LAST:event_btnCerrarMouseClicked
    private void btnCerrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarMouseEntered
        btnCerrar.setBackground(new Color(0x2b628c));
    }//GEN-LAST:event_btnCerrarMouseEntered
    private void btnCerrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarMouseExited
        btnCerrar.setBackground(new Color(0x22577E));
    }//GEN-LAST:event_btnCerrarMouseExited
    private void btnCerrarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarMousePressed
        btnCerrar.setBackground(new Color(0x2b5574));
    }//GEN-LAST:event_btnCerrarMousePressed


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
            java.util.logging.Logger.getLogger(VistaProductosMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaProductosMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaProductosMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaProductosMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaProductosMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnAñadir;
    private javax.swing.JPanel btnCargar;
    private javax.swing.JPanel btnCerrar;
    private javax.swing.JPanel btnLista;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
