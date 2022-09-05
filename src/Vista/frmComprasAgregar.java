package vista;

import java.awt.Color;
import java.awt.Insets;
import javax.swing.JTextField;

public class frmComprasAgregar extends javax.swing.JFrame {

    int xMouse, yMouse;
    
    public frmComprasAgregar() {
        initComponents();
        this.setLocationRelativeTo(null);
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
        lbLogo = new javax.swing.JLabel();
        lbTittle = new javax.swing.JLabel();
        txtFechaGenerada = new javax.swing.JTextField();
        txtCodigoGenerado = new javax.swing.JTextField();
        lbFecha = new javax.swing.JLabel();
        lbCodigo = new javax.swing.JLabel();
        body = new javax.swing.JPanel();
        jpAgregarCompra = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtNitProveedor = new javax.swing.JTextField();
        separador = new javax.swing.JPanel();
        btnBuscar = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtCodigoProducto = new javax.swing.JTextField();
        btnBuscar2 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        separador1 = new javax.swing.JPanel();
        txtCantidad = new javax.swing.JTextField();
        separador2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtPrecioVenta = new javax.swing.JTextField();
        separador3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtProveedor = new javax.swing.JTextField();
        separador4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txtProducto = new javax.swing.JTextField();
        separador5 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txtPrecioCompra = new javax.swing.JTextField();
        separador6 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        btnAgregarCompra = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        btnCancelarCompra = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        btnPagarCompras = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jpTabla = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbParaComprar = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

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

        jpBarraSuperior.add(jpExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(594, 0, -1, 32));

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

        jpBarraSuperior.add(jpMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(544, 0, 50, 32));

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

        jpBarraSuperior.add(jpAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(494, 0, 50, 32));

        jLabel1.setFont(new java.awt.Font("Roboto Medium", 0, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(241, 241, 241));
        jLabel1.setText(".: Compras :.");
        jpBarraSuperior.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 5, 150, 23));

        jPanel1.add(jpBarraSuperior, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 644, 32));

        header.setBackground(new java.awt.Color(34, 87, 126));
        header.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/compras/logo70.png"))); // NOI18N
        header.add(lbLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 15, 70, 70));

        lbTittle.setBackground(new java.awt.Color(241, 241, 241));
        lbTittle.setFont(new java.awt.Font("Roboto Medium", 0, 30)); // NOI18N
        lbTittle.setForeground(new java.awt.Color(241, 241, 241));
        lbTittle.setText("Nueva Compra");
        header.add(lbTittle, new org.netbeans.lib.awtextra.AbsoluteConstraints(196, 32, -1, -1));

        txtFechaGenerada.setEditable(false);
        txtFechaGenerada.setBackground(new java.awt.Color(16, 15, 15));
        txtFechaGenerada.setFont(new java.awt.Font("Roboto Medium", 0, 13)); // NOI18N
        txtFechaGenerada.setForeground(new java.awt.Color(241, 241, 241));
        txtFechaGenerada.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtFechaGenerada.setText("16/08/2022");
        txtFechaGenerada.setBorder(null);
        header.add(txtFechaGenerada, new org.netbeans.lib.awtextra.AbsoluteConstraints(517, 26, 110, 20));

        txtCodigoGenerado.setEditable(false);
        txtCodigoGenerado.setBackground(new java.awt.Color(16, 15, 15));
        txtCodigoGenerado.setFont(new java.awt.Font("Roboto Medium", 0, 13)); // NOI18N
        txtCodigoGenerado.setForeground(new java.awt.Color(241, 241, 241));
        txtCodigoGenerado.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCodigoGenerado.setText("Autogenerado");
        txtCodigoGenerado.setBorder(null);
        header.add(txtCodigoGenerado, new org.netbeans.lib.awtextra.AbsoluteConstraints(517, 54, 110, 20));

        lbFecha.setFont(new java.awt.Font("Roboto Medium", 0, 13)); // NOI18N
        lbFecha.setForeground(new java.awt.Color(241, 241, 241));
        lbFecha.setText("Fecha");
        header.add(lbFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(471, 29, -1, -1));

        lbCodigo.setFont(new java.awt.Font("Roboto Medium", 0, 13)); // NOI18N
        lbCodigo.setForeground(new java.awt.Color(241, 241, 241));
        lbCodigo.setText("Código");
        header.add(lbCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(467, 57, -1, -1));

        jPanel1.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 32, 644, 100));

        body.setBackground(new java.awt.Color(241, 241, 241));
        body.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpAgregarCompra.setBackground(new java.awt.Color(241, 241, 241));
        jpAgregarCompra.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(34, 87, 126), 2));
        jpAgregarCompra.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(16, 15, 15));
        jLabel2.setFont(new java.awt.Font("Roboto Medium", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(16, 15, 15));
        jLabel2.setText("Nit Proveedor");
        jpAgregarCompra.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 21, -1, -1));

        txtNitProveedor.setBackground(new java.awt.Color(217, 217, 217));
        txtNitProveedor.setFont(new java.awt.Font("Roboto Medium", 0, 15)); // NOI18N
        txtNitProveedor.setBorder(null);
        jpAgregarCompra.add(txtNitProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 20, 111, 22));

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

        jpAgregarCompra.add(separador, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 42, 111, 2));

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
        btnBuscar.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 3, 18, 18));

        jpAgregarCompra.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(259, 20, 40, 24));

        jLabel3.setBackground(new java.awt.Color(16, 15, 15));
        jLabel3.setFont(new java.awt.Font("Roboto Medium", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(16, 15, 15));
        jLabel3.setText("Cod. Producto");
        jpAgregarCompra.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 53, -1, -1));

        txtCodigoProducto.setBackground(new java.awt.Color(217, 217, 217));
        txtCodigoProducto.setFont(new java.awt.Font("Roboto Medium", 0, 15)); // NOI18N
        txtCodigoProducto.setBorder(null);
        txtCodigoProducto.setOpaque(true);
        jpAgregarCompra.add(txtCodigoProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 52, 111, 22));

        btnBuscar2.setBackground(new java.awt.Color(34, 87, 126));
        btnBuscar2.setForeground(new java.awt.Color(241, 241, 241));
        btnBuscar2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscar2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscar2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBuscar2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBuscar2MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnBuscar2MousePressed(evt);
            }
        });
        btnBuscar2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/compras/buscar18.png"))); // NOI18N
        btnBuscar2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 3, 18, 18));

        jpAgregarCompra.add(btnBuscar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(259, 52, 40, 24));

        separador1.setBackground(new java.awt.Color(16, 15, 15));

        javax.swing.GroupLayout separador1Layout = new javax.swing.GroupLayout(separador1);
        separador1.setLayout(separador1Layout);
        separador1Layout.setHorizontalGroup(
            separador1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 111, Short.MAX_VALUE)
        );
        separador1Layout.setVerticalGroup(
            separador1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        jpAgregarCompra.add(separador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 74, 111, 2));

        txtCantidad.setBackground(new java.awt.Color(217, 217, 217));
        txtCantidad.setFont(new java.awt.Font("Roboto Medium", 0, 15)); // NOI18N
        txtCantidad.setBorder(null);
        txtCantidad.setOpaque(true);
        jpAgregarCompra.add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 84, 111, 22));

        separador2.setBackground(new java.awt.Color(16, 15, 15));

        javax.swing.GroupLayout separador2Layout = new javax.swing.GroupLayout(separador2);
        separador2.setLayout(separador2Layout);
        separador2Layout.setHorizontalGroup(
            separador2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 111, Short.MAX_VALUE)
        );
        separador2Layout.setVerticalGroup(
            separador2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        jpAgregarCompra.add(separador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 106, 111, 2));

        jLabel4.setBackground(new java.awt.Color(16, 15, 15));
        jLabel4.setFont(new java.awt.Font("Roboto Medium", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(16, 15, 15));
        jLabel4.setText("Cantidad");
        jpAgregarCompra.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 85, -1, -1));

        txtPrecioVenta.setBackground(new java.awt.Color(217, 217, 217));
        txtPrecioVenta.setFont(new java.awt.Font("Roboto Medium", 0, 15)); // NOI18N
        txtPrecioVenta.setBorder(null);
        txtPrecioVenta.setOpaque(true);
        jpAgregarCompra.add(txtPrecioVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 116, 111, 22));

        separador3.setBackground(new java.awt.Color(16, 15, 15));

        javax.swing.GroupLayout separador3Layout = new javax.swing.GroupLayout(separador3);
        separador3.setLayout(separador3Layout);
        separador3Layout.setHorizontalGroup(
            separador3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 111, Short.MAX_VALUE)
        );
        separador3Layout.setVerticalGroup(
            separador3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        jpAgregarCompra.add(separador3, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 138, 111, 2));

        jLabel5.setBackground(new java.awt.Color(16, 15, 15));
        jLabel5.setFont(new java.awt.Font("Roboto Medium", 0, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(16, 15, 15));
        jLabel5.setText("Precio Venta");
        jpAgregarCompra.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 117, -1, -1));

        txtProveedor.setBackground(new java.awt.Color(217, 217, 217));
        txtProveedor.setFont(new java.awt.Font("Roboto Medium", 0, 15)); // NOI18N
        txtProveedor.setBorder(null);
        txtProveedor.setOpaque(true);
        jpAgregarCompra.add(txtProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(432, 20, 158, 22));

        separador4.setBackground(new java.awt.Color(16, 15, 15));

        javax.swing.GroupLayout separador4Layout = new javax.swing.GroupLayout(separador4);
        separador4.setLayout(separador4Layout);
        separador4Layout.setHorizontalGroup(
            separador4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 158, Short.MAX_VALUE)
        );
        separador4Layout.setVerticalGroup(
            separador4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        jpAgregarCompra.add(separador4, new org.netbeans.lib.awtextra.AbsoluteConstraints(432, 42, 158, 2));

        jLabel6.setBackground(new java.awt.Color(16, 15, 15));
        jLabel6.setFont(new java.awt.Font("Roboto Medium", 0, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(16, 15, 15));
        jLabel6.setText("Proveedor");
        jpAgregarCompra.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 21, -1, -1));

        txtProducto.setBackground(new java.awt.Color(217, 217, 217));
        txtProducto.setFont(new java.awt.Font("Roboto Medium", 0, 15)); // NOI18N
        txtProducto.setBorder(null);
        txtProducto.setOpaque(true);
        jpAgregarCompra.add(txtProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(432, 52, 158, 22));

        separador5.setBackground(new java.awt.Color(16, 15, 15));

        javax.swing.GroupLayout separador5Layout = new javax.swing.GroupLayout(separador5);
        separador5.setLayout(separador5Layout);
        separador5Layout.setHorizontalGroup(
            separador5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 158, Short.MAX_VALUE)
        );
        separador5Layout.setVerticalGroup(
            separador5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        jpAgregarCompra.add(separador5, new org.netbeans.lib.awtextra.AbsoluteConstraints(432, 74, 158, 2));

        jLabel7.setBackground(new java.awt.Color(16, 15, 15));
        jLabel7.setFont(new java.awt.Font("Roboto Medium", 0, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(16, 15, 15));
        jLabel7.setText("Producto");
        jpAgregarCompra.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 53, -1, -1));

        txtPrecioCompra.setBackground(new java.awt.Color(217, 217, 217));
        txtPrecioCompra.setFont(new java.awt.Font("Roboto Medium", 0, 15)); // NOI18N
        txtPrecioCompra.setBorder(null);
        txtPrecioCompra.setOpaque(true);
        jpAgregarCompra.add(txtPrecioCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(432, 84, 158, 22));

        separador6.setBackground(new java.awt.Color(16, 15, 15));

        javax.swing.GroupLayout separador6Layout = new javax.swing.GroupLayout(separador6);
        separador6.setLayout(separador6Layout);
        separador6Layout.setHorizontalGroup(
            separador6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 158, Short.MAX_VALUE)
        );
        separador6Layout.setVerticalGroup(
            separador6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        jpAgregarCompra.add(separador6, new org.netbeans.lib.awtextra.AbsoluteConstraints(432, 106, 158, 2));

        jLabel8.setBackground(new java.awt.Color(16, 15, 15));
        jLabel8.setFont(new java.awt.Font("Roboto Medium", 0, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(16, 15, 15));
        jLabel8.setText("Precio Compra");
        jpAgregarCompra.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 85, -1, -1));

        btnAgregarCompra.setBackground(new java.awt.Color(34, 87, 126));
        btnAgregarCompra.setForeground(new java.awt.Color(241, 241, 241));
        btnAgregarCompra.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregarCompra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAgregarCompraMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAgregarCompraMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAgregarCompraMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnAgregarCompraMousePressed(evt);
            }
        });
        btnAgregarCompra.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(241, 241, 241));
        jLabel10.setText("Agregar Compra");
        btnAgregarCompra.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 4, -1, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/compras/agregar18.png"))); // NOI18N
        btnAgregarCompra.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 3, 18, 18));

        jpAgregarCompra.add(btnAgregarCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(432, 116, 158, 24));

        body.add(jpAgregarCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 14, 610, 158));

        btnCancelarCompra.setBackground(new java.awt.Color(240, 84, 84));
        btnCancelarCompra.setForeground(new java.awt.Color(241, 241, 241));
        btnCancelarCompra.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelarCompra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelarCompraMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCancelarCompraMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCancelarCompraMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnCancelarCompraMousePressed(evt);
            }
        });
        btnCancelarCompra.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(16, 15, 15));
        jLabel13.setText("Cancelar Compra");
        btnCancelarCompra.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 5, -1, -1));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/compras/cancelarCompra.png"))); // NOI18N
        btnCancelarCompra.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 3, 20, 20));

        body.add(btnCancelarCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 419, 158, 25));

        btnPagarCompras.setBackground(new java.awt.Color(34, 87, 126));
        btnPagarCompras.setForeground(new java.awt.Color(241, 241, 241));
        btnPagarCompras.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPagarCompras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPagarComprasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnPagarComprasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnPagarComprasMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnPagarComprasMousePressed(evt);
            }
        });
        btnPagarCompras.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(241, 241, 241));
        jLabel15.setText("Pagar Compras");
        btnPagarCompras.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 5, -1, -1));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/compras/PagarCompras.png"))); // NOI18N
        btnPagarCompras.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 3, 20, 20));

        body.add(btnPagarCompras, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 419, 158, 25));

        jpTabla.setBackground(new java.awt.Color(241, 241, 241));
        jpTabla.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(34, 87, 126), 2));
        jpTabla.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbParaComprar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tbParaComprar);

        jpTabla.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 590, 197));

        body.add(jpTabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 192, 610, 217));

        jTextField1.setBackground(new java.awt.Color(16, 15, 15));
        jTextField1.setFont(new java.awt.Font("Roboto Medium", 0, 15)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(241, 241, 241));
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("$ 0.0");
        jTextField1.setBorder(null);
        body.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(517, 419, 110, 25));

        jLabel17.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(16, 15, 15));
        jLabel17.setText("TOTAL");
        body.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(452, 421, -1, -1));

        jPanel1.add(body, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 132, 644, 460));

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

    private void btnBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMouseClicked
        btnBuscar.setBackground(new Color(0x2b628c));
    }//GEN-LAST:event_btnBuscarMouseClicked

    private void btnBuscarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMouseEntered
        btnBuscar.setBackground(new Color(0x2b628c));
    }//GEN-LAST:event_btnBuscarMouseEntered

    private void btnBuscarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMouseExited
        btnBuscar.setBackground(new Color(0x22577E));
    }//GEN-LAST:event_btnBuscarMouseExited

    private void btnBuscarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMousePressed
       btnBuscar.setBackground(new Color(0x2b5574));
    }//GEN-LAST:event_btnBuscarMousePressed

    private void btnBuscar2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscar2MouseClicked
        btnBuscar2.setBackground(new Color(0x2b628c));
    }//GEN-LAST:event_btnBuscar2MouseClicked

    private void btnBuscar2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscar2MouseEntered
        btnBuscar2.setBackground(new Color(0x2b628c));
    }//GEN-LAST:event_btnBuscar2MouseEntered

    private void btnBuscar2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscar2MouseExited
        btnBuscar2.setBackground(new Color(0x22577E));
    }//GEN-LAST:event_btnBuscar2MouseExited

    private void btnBuscar2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscar2MousePressed
        btnBuscar2.setBackground(new Color(0x2b5574));
    }//GEN-LAST:event_btnBuscar2MousePressed

    private void btnAgregarCompraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarCompraMouseClicked
        btnAgregarCompra.setBackground(new Color(0x2b628c));
    }//GEN-LAST:event_btnAgregarCompraMouseClicked

    private void btnAgregarCompraMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarCompraMouseEntered
        btnAgregarCompra.setBackground(new Color(0x2b628c));
    }//GEN-LAST:event_btnAgregarCompraMouseEntered

    private void btnAgregarCompraMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarCompraMouseExited
        btnAgregarCompra.setBackground(new Color(0x22577E));
    }//GEN-LAST:event_btnAgregarCompraMouseExited

    private void btnAgregarCompraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarCompraMousePressed
        btnAgregarCompra.setBackground(new Color(0x2b5574));
    }//GEN-LAST:event_btnAgregarCompraMousePressed

    private void btnCancelarCompraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarCompraMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelarCompraMouseClicked

    private void btnCancelarCompraMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarCompraMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelarCompraMouseEntered

    private void btnCancelarCompraMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarCompraMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelarCompraMouseExited

    private void btnCancelarCompraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarCompraMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelarCompraMousePressed

    private void btnPagarComprasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPagarComprasMouseClicked
        btnPagarCompras.setBackground(new Color(0x2b628c));
    }//GEN-LAST:event_btnPagarComprasMouseClicked

    private void btnPagarComprasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPagarComprasMouseEntered
        btnPagarCompras.setBackground(new Color(0x2b628c));
    }//GEN-LAST:event_btnPagarComprasMouseEntered

    private void btnPagarComprasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPagarComprasMouseExited
        btnPagarCompras.setBackground(new Color(0x22577E));
    }//GEN-LAST:event_btnPagarComprasMouseExited

    private void btnPagarComprasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPagarComprasMousePressed
        btnPagarCompras.setBackground(new Color(0x2b5574));
    }//GEN-LAST:event_btnPagarComprasMousePressed

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
            java.util.logging.Logger.getLogger(frmComprasAgregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmComprasAgregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmComprasAgregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmComprasAgregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmComprasAgregar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel body;
    private javax.swing.JPanel btnAgregarCompra;
    private javax.swing.JPanel btnBuscar;
    private javax.swing.JPanel btnBuscar2;
    private javax.swing.JPanel btnCancelarCompra;
    private javax.swing.JPanel btnPagarCompras;
    private javax.swing.JPanel header;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JPanel jpAgregarCompra;
    private javax.swing.JPanel jpAtras;
    private javax.swing.JPanel jpBarraSuperior;
    private javax.swing.JPanel jpExit;
    private javax.swing.JPanel jpMinimizar;
    private javax.swing.JPanel jpTabla;
    private javax.swing.JLabel lbAtras;
    private javax.swing.JLabel lbCodigo;
    private javax.swing.JLabel lbExit;
    private javax.swing.JLabel lbFecha;
    private javax.swing.JLabel lbLogo;
    private javax.swing.JLabel lbMinimizar;
    private javax.swing.JLabel lbTittle;
    private javax.swing.JPanel separador;
    private javax.swing.JPanel separador1;
    private javax.swing.JPanel separador2;
    private javax.swing.JPanel separador3;
    private javax.swing.JPanel separador4;
    private javax.swing.JPanel separador5;
    private javax.swing.JPanel separador6;
    private javax.swing.JTable tbParaComprar;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtCodigoGenerado;
    private javax.swing.JTextField txtCodigoProducto;
    private javax.swing.JTextField txtFechaGenerada;
    private javax.swing.JTextField txtNitProveedor;
    private javax.swing.JTextField txtPrecioCompra;
    private javax.swing.JTextField txtPrecioVenta;
    private javax.swing.JTextField txtProducto;
    private javax.swing.JTextField txtProveedor;
    // End of variables declaration//GEN-END:variables
}
