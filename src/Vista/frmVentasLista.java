package vista;

import java.awt.Color;
import utilidades.jtable.pintar_tablas.pintarVentasLista;

public class frmVentasLista extends javax.swing.JFrame {

    int xMouse, yMouse;

    public frmVentasLista() {
        initComponents();
        this.setLocationRelativeTo(null);
        pintarVentasLista.pintar();
        pintarVentasLista.editarHeaderJtable();
    }
   
    //Método para llenar el campo al dar clic en BG
    public void llenarCampoVacio(){
        //Validar que el campo usuario esté vacío(is.Empty())
        if(txtBuscar.getText().isEmpty()){
            txtBuscar.setText("Ingrese Código");
            txtBuscar.setForeground(new Color(0x666666));
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jpBarraSuperior = new javax.swing.JPanel();
        jpExit = new javax.swing.JPanel();
        lbExit = new javax.swing.JLabel();
        jpMinimizar = new javax.swing.JPanel();
        lbMinimizar = new javax.swing.JLabel();
        jpAtras = new javax.swing.JPanel();
        lbAtras = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        header = new javax.swing.JPanel();
        lbTittle = new javax.swing.JLabel();
        body = new javax.swing.JPanel();
        btnGuardarReporte = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        separador = new javax.swing.JPanel();
        txtFechaInicio = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        separador2 = new javax.swing.JPanel();
        btnBuscar1 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        separador1 = new javax.swing.JPanel();
        txtFechaFinal = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbListaVentas = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpBarraSuperior.setBackground(new java.awt.Color(16, 15, 15));
        jpBarraSuperior.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jpBarraSuperiorMouseDragged(evt);
            }
        });
        jpBarraSuperior.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jpBarraSuperiorMousePressed(evt);
            }
        });
        jpBarraSuperior.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        jpBarraSuperior.add(jpExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 0, -1, 32));

        jpMinimizar.setBackground(new java.awt.Color(16, 15, 15));
        jpMinimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jpMinimizar.setPreferredSize(new java.awt.Dimension(50, 50));
        jpMinimizar.setVerifyInputWhenFocusTarget(false);

        lbMinimizar.setBackground(new java.awt.Color(241, 241, 241));
        lbMinimizar.setFont(new java.awt.Font("Roboto Medium", 0, 28)); // NOI18N
        lbMinimizar.setForeground(new java.awt.Color(241, 241, 241));
        lbMinimizar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbMinimizar.setText("—");
        lbMinimizar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lbMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbMinimizarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbMinimizarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbMinimizarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jpMinimizarLayout = new javax.swing.GroupLayout(jpMinimizar);
        jpMinimizar.setLayout(jpMinimizarLayout);
        jpMinimizarLayout.setHorizontalGroup(
            jpMinimizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpMinimizarLayout.createSequentialGroup()
                .addComponent(lbMinimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jpMinimizarLayout.setVerticalGroup(
            jpMinimizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpMinimizarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lbMinimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jpBarraSuperior.add(jpMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 0, 50, 32));

        jpAtras.setBackground(new java.awt.Color(16, 15, 15));
        jpAtras.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jpAtras.setPreferredSize(new java.awt.Dimension(50, 50));
        jpAtras.setVerifyInputWhenFocusTarget(false);

        lbAtras.setBackground(new java.awt.Color(241, 241, 241));
        lbAtras.setFont(new java.awt.Font("Roboto Medium", 0, 28)); // NOI18N
        lbAtras.setForeground(new java.awt.Color(241, 241, 241));
        lbAtras.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbAtras.setText("<");
        lbAtras.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lbAtras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbAtrasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbAtrasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbAtrasMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jpAtrasLayout = new javax.swing.GroupLayout(jpAtras);
        jpAtras.setLayout(jpAtrasLayout);
        jpAtrasLayout.setHorizontalGroup(
            jpAtrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpAtrasLayout.createSequentialGroup()
                .addComponent(lbAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jpAtrasLayout.setVerticalGroup(
            jpAtrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpAtrasLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lbAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jpBarraSuperior.add(jpAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 0, 50, 32));

        jLabel1.setFont(new java.awt.Font("Roboto Medium", 0, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(241, 241, 241));
        jLabel1.setText(".: Ventas :.");
        jpBarraSuperior.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 5, 150, 23));

        jPanel1.add(jpBarraSuperior, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 32));

        header.setBackground(new java.awt.Color(34, 87, 126));
        header.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbTittle.setBackground(new java.awt.Color(241, 241, 241));
        lbTittle.setFont(new java.awt.Font("Roboto Medium", 0, 30)); // NOI18N
        lbTittle.setForeground(new java.awt.Color(241, 241, 241));
        lbTittle.setText("Lista de Ventas");
        header.add(lbTittle, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jPanel1.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 32, 1080, 80));

        body.setBackground(new java.awt.Color(241, 241, 241));
        body.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnGuardarReporte.setBackground(new java.awt.Color(34, 87, 126));
        btnGuardarReporte.setForeground(new java.awt.Color(241, 241, 241));
        btnGuardarReporte.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardarReporte.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGuardarReporteMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnGuardarReporteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnGuardarReporteMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnGuardarReporteMousePressed(evt);
            }
        });
        btnGuardarReporte.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setFont(new java.awt.Font("Roboto Medium", 0, 20)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(241, 241, 241));
        jLabel15.setText("Guardar Reporte");
        btnGuardarReporte.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 6, -1, -1));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/compras/GuardarLista.png"))); // NOI18N
        btnGuardarReporte.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 6, 24, 24));

        body.add(btnGuardarReporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 135, 242, 35));

        separador.setBackground(new java.awt.Color(16, 15, 15));

        javax.swing.GroupLayout separadorLayout = new javax.swing.GroupLayout(separador);
        separador.setLayout(separadorLayout);
        separadorLayout.setHorizontalGroup(
            separadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 111, Short.MAX_VALUE)
        );
        separadorLayout.setVerticalGroup(
            separadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        body.add(separador, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 81, 111, -1));

        txtFechaInicio.setBackground(new java.awt.Color(217, 217, 217));
        txtFechaInicio.setFont(new java.awt.Font("Roboto Medium", 0, 15)); // NOI18N
        txtFechaInicio.setBorder(null);
        body.add(txtFechaInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 56, 111, 25));

        jLabel5.setBackground(new java.awt.Color(16, 15, 15));
        jLabel5.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(16, 15, 15));
        jLabel5.setText("Código Venta:");
        body.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 147, -1, -1));

        separador2.setBackground(new java.awt.Color(16, 15, 15));

        javax.swing.GroupLayout separador2Layout = new javax.swing.GroupLayout(separador2);
        separador2.setLayout(separador2Layout);
        separador2Layout.setHorizontalGroup(
            separador2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 140, Short.MAX_VALUE)
        );
        separador2Layout.setVerticalGroup(
            separador2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        body.add(separador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 168, 140, -1));

        btnBuscar1.setBackground(new java.awt.Color(34, 87, 126));
        btnBuscar1.setForeground(new java.awt.Color(241, 241, 241));
        btnBuscar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscar1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBuscar1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBuscar1MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnBuscar1MousePressed(evt);
            }
        });
        btnBuscar1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/compras/buscar18.png"))); // NOI18N
        btnBuscar1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 5, 18, 18));

        body.add(btnBuscar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 142, 40, 27));

        txtBuscar.setBackground(new java.awt.Color(241, 241, 241));
        txtBuscar.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        txtBuscar.setForeground(new java.awt.Color(102, 102, 102));
        txtBuscar.setText("Ingrese Código");
        txtBuscar.setBorder(null);
        txtBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtBuscarMousePressed(evt);
            }
        });
        body.add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 145, 140, 22));

        btnBuscar.setBackground(new java.awt.Color(34, 87, 126));
        btnBuscar.setForeground(new java.awt.Color(241, 241, 241));
        btnBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBuscarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBuscarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnBuscarMousePressed(evt);
            }
        });
        btnBuscar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/compras/buscar18.png"))); // NOI18N
        btnBuscar.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 5, 18, 18));

        body.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(505, 56, 40, 27));

        jLabel2.setBackground(new java.awt.Color(16, 15, 15));
        jLabel2.setFont(new java.awt.Font("Roboto Medium", 0, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(16, 15, 15));
        jLabel2.setText("Rango de Fecha");
        body.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jPanel4.setBackground(new java.awt.Color(16, 15, 15));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1040, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        body.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 106, 1040, 2));

        jLabel3.setBackground(new java.awt.Color(16, 15, 15));
        jLabel3.setFont(new java.awt.Font("Roboto Medium", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(16, 15, 15));
        jLabel3.setText("Fecha Inicio");
        body.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 62, -1, -1));

        jLabel4.setBackground(new java.awt.Color(16, 15, 15));
        jLabel4.setFont(new java.awt.Font("Roboto Medium", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(16, 15, 15));
        jLabel4.setText("Fecha Final");
        body.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 62, -1, -1));

        separador1.setBackground(new java.awt.Color(16, 15, 15));

        javax.swing.GroupLayout separador1Layout = new javax.swing.GroupLayout(separador1);
        separador1.setLayout(separador1Layout);
        separador1Layout.setHorizontalGroup(
            separador1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 117, Short.MAX_VALUE)
        );
        separador1Layout.setVerticalGroup(
            separador1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        body.add(separador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(372, 80, -1, -1));

        txtFechaFinal.setBackground(new java.awt.Color(217, 217, 217));
        txtFechaFinal.setFont(new java.awt.Font("Roboto Medium", 0, 15)); // NOI18N
        txtFechaFinal.setBorder(null);
        body.add(txtFechaFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(372, 56, 117, 25));

        tbListaVentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Pollo", "45", "1200", "120000"},
                {"Carne", "23", "2000", "120000"},
                {"Cerdo", "12", "1350", "120000"},
                {"Pescado", "33", "1700", "120000"}
            },
            new String [] {
                "Producto", "Cantidad", "Precio Compra", "Sub Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbListaVentas.setRowHeight(25);
        tbListaVentas.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tbListaVentas);

        body.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 191, 1040, 415));

        jPanel1.add(body, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 113, 1080, 623));

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

    private void lbMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbMinimizarMouseClicked
        setExtendedState(ICONIFIED);
    }//GEN-LAST:event_lbMinimizarMouseClicked

    private void lbMinimizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbMinimizarMouseEntered
        jpMinimizar.setBackground(new Color(0x4B6587));
        lbMinimizar.setForeground(new Color(0x100F0F));
    }//GEN-LAST:event_lbMinimizarMouseEntered

    private void lbMinimizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbMinimizarMouseExited
        jpMinimizar.setBackground(new Color(0x100F0F));
        lbMinimizar.setForeground(new Color(0xF1F1F1));
    }//GEN-LAST:event_lbMinimizarMouseExited

    private void lbAtrasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbAtrasMouseClicked
        frmMenu menu = new frmMenu();
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lbAtrasMouseClicked

    private void lbAtrasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbAtrasMouseEntered
        jpAtras.setBackground(new Color(0xFFD369));
        lbAtras.setForeground(new Color(0x100F0F));
    }//GEN-LAST:event_lbAtrasMouseEntered

    private void lbAtrasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbAtrasMouseExited
        jpAtras.setBackground(new Color(0x100F0F));
        lbAtras.setForeground(new Color(0xF1F1F1));
    }//GEN-LAST:event_lbAtrasMouseExited

    private void jpBarraSuperiorMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpBarraSuperiorMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_jpBarraSuperiorMouseDragged

    private void jpBarraSuperiorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpBarraSuperiorMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_jpBarraSuperiorMousePressed

    private void btnGuardarReporteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarReporteMouseClicked
        btnGuardarReporte.setBackground(new Color(0x2b628c));
    }//GEN-LAST:event_btnGuardarReporteMouseClicked

    private void btnGuardarReporteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarReporteMouseEntered
        btnGuardarReporte.setBackground(new Color(0x2b628c));
    }//GEN-LAST:event_btnGuardarReporteMouseEntered

    private void btnGuardarReporteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarReporteMouseExited
        btnGuardarReporte.setBackground(new Color(0x22577E));
    }//GEN-LAST:event_btnGuardarReporteMouseExited

    private void btnGuardarReporteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarReporteMousePressed
        btnGuardarReporte.setBackground(new Color(0x2b5574));
    }//GEN-LAST:event_btnGuardarReporteMousePressed

    private void btnBuscarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMousePressed
        btnBuscar.setBackground(new Color(0x2b5574));
    }//GEN-LAST:event_btnBuscarMousePressed

    private void btnBuscarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMouseExited
        btnBuscar.setBackground(new Color(0x22577E));
    }//GEN-LAST:event_btnBuscarMouseExited

    private void btnBuscarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMouseEntered
        btnBuscar.setBackground(new Color(0x2b628c));
    }//GEN-LAST:event_btnBuscarMouseEntered

    private void btnBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMouseClicked
        btnBuscar.setBackground(new Color(0x2b628c));
    }//GEN-LAST:event_btnBuscarMouseClicked

    private void btnBuscar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscar1MouseClicked
        btnBuscar1.setBackground(new Color(0x2b628c));
    }//GEN-LAST:event_btnBuscar1MouseClicked

    private void btnBuscar1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscar1MouseEntered
        btnBuscar1.setBackground(new Color(0x2b628c));
    }//GEN-LAST:event_btnBuscar1MouseEntered

    private void btnBuscar1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscar1MouseExited
        btnBuscar1.setBackground(new Color(0x22577E));
    }//GEN-LAST:event_btnBuscar1MouseExited

    private void btnBuscar1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscar1MousePressed
        btnBuscar1.setBackground(new Color(0x2b5574));
    }//GEN-LAST:event_btnBuscar1MousePressed

    private void txtBuscarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtBuscarMousePressed
        if(txtBuscar.getText().equals("Ingrese Código")){
            txtBuscar.setText(""); //Vaciar el campo
            txtBuscar.setForeground(new Color(0x100F0F)); //Cambiar el color de letra
        }
    }//GEN-LAST:event_txtBuscarMousePressed

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        llenarCampoVacio();
    }//GEN-LAST:event_jPanel1MousePressed

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
            java.util.logging.Logger.getLogger(frmVentasLista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmVentasLista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmVentasLista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmVentasLista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new frmVentasLista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel body;
    private javax.swing.JPanel btnBuscar;
    private javax.swing.JPanel btnBuscar1;
    private javax.swing.JPanel btnGuardarReporte;
    private javax.swing.JPanel header;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel jpAtras;
    private javax.swing.JPanel jpBarraSuperior;
    private javax.swing.JPanel jpExit;
    private javax.swing.JPanel jpMinimizar;
    private javax.swing.JLabel lbAtras;
    private javax.swing.JLabel lbExit;
    private javax.swing.JLabel lbMinimizar;
    private javax.swing.JLabel lbTittle;
    private javax.swing.JPanel separador;
    private javax.swing.JPanel separador1;
    private javax.swing.JPanel separador2;
    public static javax.swing.JTable tbListaVentas;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtFechaFinal;
    private javax.swing.JTextField txtFechaInicio;
    // End of variables declaration//GEN-END:variables
}
