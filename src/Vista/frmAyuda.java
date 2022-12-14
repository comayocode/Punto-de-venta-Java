package vista;

import java.awt.Color;
import java.io.IOException;
import java.net.URISyntaxException;

public class frmAyuda extends javax.swing.JFrame {

    String url = "youtube.com";
    
    public frmAyuda() {
        initComponents();
        this.setLocationRelativeTo(null);
        
    }

    public void abrirlinkGithub() {
        if(java.awt.Desktop.isDesktopSupported()){
            java.awt.Desktop desktop = java.awt.Desktop.getDesktop();
            
            if(desktop.isSupported(java.awt.Desktop.Action.BROWSE)){
                try {
                    java.net.URI uri = new java.net.URI("https://github.com/comayocode");
                    desktop.browse(uri);
                } catch (URISyntaxException |  IOException ex) {
                }
            }
        }
    }
    
    public void abrirLinkDocumentacion() {
        if(java.awt.Desktop.isDesktopSupported()){
            java.awt.Desktop desktop = java.awt.Desktop.getDesktop();
            
            if(desktop.isSupported(java.awt.Desktop.Action.BROWSE)){
                try {
                    java.net.URI uri = new java.net.URI("https://docs.google.com/document/d/1YO3AvBKh_4uL4sAA0qwbAsyhAS7r95mILukegI1Wbjw/edit?usp=sharing");
                    desktop.browse(uri);
                } catch (URISyntaxException |  IOException ex) {
                }
            }
        }
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnAñadir = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnCargar = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnCerrar = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(241, 241, 241));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(16, 15, 15), 5));
        jPanel2.setFocusable(false);
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(16, 15, 15));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto Medium", 0, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(241, 241, 241));
        jLabel1.setText(".: Sobre el Programa :.");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 5, 210, 23));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 413, 37));

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

        jLabel3.setFont(new java.awt.Font("Roboto Medium", 0, 25)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(241, 241, 241));
        jLabel3.setText("Documentación");
        btnAñadir.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 13, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/help/documentacion.png"))); // NOI18N
        btnAñadir.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 5, 45, 45));

        jPanel2.add(btnAñadir, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 317, 55));

        btnCargar.setBackground(new java.awt.Color(34, 87, 126));
        btnCargar.setForeground(new java.awt.Color(241, 241, 241));
        btnCargar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCargar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCargarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCargarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCargarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnCargarMousePressed(evt);
            }
        });
        btnCargar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Roboto Medium", 0, 25)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(241, 241, 241));
        jLabel5.setText("Desarrollador");
        btnCargar.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 13, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/help/copyright.png"))); // NOI18N
        btnCargar.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 5, 45, 45));

        jPanel2.add(btnCargar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 317, 55));

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

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cofig/cross 1.png"))); // NOI18N
        btnCerrar.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 5, 45, 45));

        jLabel6.setFont(new java.awt.Font("Roboto Medium", 0, 25)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(241, 241, 241));
        jLabel6.setText("Cerrar");
        btnCerrar.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 13, -1, -1));

        jPanel2.add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 317, 55));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 283, Short.MAX_VALUE)
        );

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

    private void btnAñadirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAñadirMouseClicked
        abrirLinkDocumentacion();
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

    private void btnCargarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCargarMouseClicked
        abrirlinkGithub();
        btnCargar.setBackground(new Color(0x2b628c));
    }//GEN-LAST:event_btnCargarMouseClicked

    private void btnCargarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCargarMouseEntered
        btnCargar.setBackground(new Color(0x2b628c));
    }//GEN-LAST:event_btnCargarMouseEntered

    private void btnCargarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCargarMouseExited
        btnCargar.setBackground(new Color(0x22577E));
    }//GEN-LAST:event_btnCargarMouseExited

    private void btnCargarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCargarMousePressed

    }//GEN-LAST:event_btnCargarMousePressed

    private void btnCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarMouseClicked
        btnCerrar.setBackground(new Color(0x2b628c));
        frmMenu menu = new frmMenu();
        menu.setVisible(true);
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
            java.util.logging.Logger.getLogger(frmAyuda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmAyuda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmAyuda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmAyuda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmAyuda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnAñadir;
    private javax.swing.JPanel btnCargar;
    private javax.swing.JPanel btnCerrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
