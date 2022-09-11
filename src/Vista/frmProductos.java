package vista;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import utilidades.jtable.pintar_tablas.pintarProductos;

public class frmProductos extends javax.swing.JFrame {

    int xMouse, yMouse;
    
    public frmProductos() {
        initComponents();
        this.setLocationRelativeTo(null);
        setTitle("Productos");
        
        //Llamar estilos de la tabla
        pintarProductos.editarHeaderJtable();
        pintarProductos.pintar();
        
        inicarpopUpMenuTabla();
    }

    //Método para editar estilo y acciones del Joption.showConfirmDialog
    public void confirmarEliminar() {
        
        // --- ESTILOS ---
        //Añadir las opciones a un arreglo
        Object[] botones = {"Confirmar", "Cancelar"};
        
        //Guardar la selección de opción en una variable
        int opcion = JOptionPane.showOptionDialog(null, //Centrar ventana
                "¿Seguro que quiere eliminar el Producto?", //Mensaje/Pregunta
                "Eliminar Producto", //Titulo de la ventana
                JOptionPane.YES_NO_OPTION, //Opción Confirmar
                JOptionPane.QUESTION_MESSAGE, //Opción Cancelar
                null, //No usar icono
                botones, //Titulo de los botones
                botones[0]); //Botones

        // --- ACCIONES ---
        //Validar la opción escogida
        if (opcion == JOptionPane.YES_OPTION){ //Si la opción es "Confirmar"...
            //Codigo a ejecutar aquí
            JOptionPane.showMessageDialog(null, "Eliminado", "Producto eliminado", JOptionPane.NO_OPTION);
        } else if (opcion == JOptionPane.YES_NO_OPTION) { //Si la opción es "Cancelar"
            //No hacer nada
            setDefaultCloseOperation(frmMenu.DO_NOTHING_ON_CLOSE);
        }
    }
    
    //Opciones de menu al dar clic derecho en la tabla
    public void inicarpopUpMenuTabla(){
        JMenuItem modificar = new JMenuItem("Modificar", getIcon("/img/clientes/edit.png", 20, 20));
        JMenuItem eliminar = new JMenuItem("Eliminar", getIcon("/img/clientes/delete.png", 20, 20));
        
        //Añadir las opciones al popupmenu
        menuTabla.add(modificar);
        menuTabla.add(eliminar);
        
        tbListaProductos.setComponentPopupMenu(menuTabla); //Le pasamos el popupMenu a la tabla
        
        // ----- AÑADIR LAS ACCIONES PARA CADA OPCION -----
        
        //Acción de la opción "editar"
        modificar.addActionListener(new ActionListener() {  //Si la opcion escogida es "Modificar"
            @Override
            public void actionPerformed(ActionEvent e) {
                //Codigo a ejecutar
                frmProductosModificar modificar = new frmProductosModificar();
                modificar.setVisible(true);
            }
        });
        
        //Acción de la opción "Eliminar"
        eliminar.addActionListener(new ActionListener() { //Si la opción escogida es "Eliminar"
            @Override
            public void actionPerformed(ActionEvent e) {
                //Codigo a ejecutar
                confirmarEliminar();
            }
        });
    }
    
    //Método para obtener icono
    public Icon getIcon(String ruta, int width, int height){
        Icon miicono = new ImageIcon(new ImageIcon(getClass().getResource(ruta)).getImage().getScaledInstance(width, height, 0));
        return miicono;
                
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        menuTabla = new javax.swing.JPopupMenu();
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
        lbHeader = new javax.swing.JLabel();
        body = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        btnAñadirProducto = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnGuardarReporte = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lbListaProductos = new javax.swing.JLabel();
        lbBuscar = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        lineaBuscar = new javax.swing.JPanel();
        btnLimpiar = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbListaProductos = new javax.swing.JTable();

        jLabel3.setText("jLabel3");

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
        jLabel1.setText(".: Productos :.");
        jpBarraSuperior.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 5, 130, 23));

        jPanel1.add(jpBarraSuperior, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 32));

        header.setBackground(new java.awt.Color(34, 87, 126));
        header.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbHeader.setFont(new java.awt.Font("Roboto Medium", 0, 25)); // NOI18N
        lbHeader.setForeground(new java.awt.Color(241, 241, 241));
        lbHeader.setText("Lista de Productos");
        header.add(lbHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 15, -1, -1));

        jPanel1.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 32, 1080, 60));

        body.setBackground(new java.awt.Color(241, 241, 241));
        body.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                bodyMousePressed(evt);
            }
        });
        body.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(16, 15, 15));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1046, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        body.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 75, 1046, 2));

        btnAñadirProducto.setBackground(new java.awt.Color(34, 87, 126));
        btnAñadirProducto.setForeground(new java.awt.Color(241, 241, 241));
        btnAñadirProducto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAñadirProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAñadirProductoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAñadirProductoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAñadirProductoMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnAñadirProductoMousePressed(evt);
            }
        });
        btnAñadirProducto.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Roboto Medium", 0, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(241, 241, 241));
        jLabel4.setText("Añadir Producto");
        btnAñadirProducto.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 7, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/productos/btnAñadir.png"))); // NOI18N
        btnAñadirProducto.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 6, 24, 24));

        body.add(btnAñadirProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 20, 242, 35));

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

        jLabel6.setFont(new java.awt.Font("Roboto Medium", 0, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(241, 241, 241));
        jLabel6.setText("Guardar Reporte");
        btnGuardarReporte.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 7, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/productos/Guardar Producto.png"))); // NOI18N
        btnGuardarReporte.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 6, 24, 24));

        body.add(btnGuardarReporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 135, 242, 35));

        lbListaProductos.setFont(new java.awt.Font("Roboto Medium", 0, 20)); // NOI18N
        lbListaProductos.setForeground(new java.awt.Color(16, 15, 15));
        lbListaProductos.setText("Tabla de Productos");
        body.add(lbListaProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 94, -1, -1));

        lbBuscar.setFont(new java.awt.Font("Roboto Medium", 0, 22)); // NOI18N
        lbBuscar.setForeground(new java.awt.Color(16, 15, 15));
        lbBuscar.setText("Buscar:");
        body.add(lbBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(655, 145, -1, -1));

        txtBuscar.setBackground(new java.awt.Color(241, 241, 241));
        txtBuscar.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        txtBuscar.setForeground(new java.awt.Color(102, 102, 102));
        txtBuscar.setText("Nombre del Producto");
        txtBuscar.setBorder(null);
        txtBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtBuscarMousePressed(evt);
            }
        });
        txtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarActionPerformed(evt);
            }
        });
        body.add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 147, -1, -1));

        lineaBuscar.setBackground(new java.awt.Color(16, 15, 15));

        javax.swing.GroupLayout lineaBuscarLayout = new javax.swing.GroupLayout(lineaBuscar);
        lineaBuscar.setLayout(lineaBuscarLayout);
        lineaBuscarLayout.setHorizontalGroup(
            lineaBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 171, Short.MAX_VALUE)
        );
        lineaBuscarLayout.setVerticalGroup(
            lineaBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        body.add(lineaBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 169, 171, 2));

        btnLimpiar.setBackground(new java.awt.Color(34, 87, 126));
        btnLimpiar.setForeground(new java.awt.Color(241, 241, 241));
        btnLimpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLimpiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLimpiarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnLimpiarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnLimpiarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnLimpiarMousePressed(evt);
            }
        });
        btnLimpiar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/productos/btnLimpiar.png"))); // NOI18N
        btnLimpiar.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 6, 24, 24));

        body.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1022, 135, 40, 35));

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

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/productos/btnBuscar.png"))); // NOI18N
        btnBuscar.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 6, 24, 24));

        body.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(962, 135, 40, 35));

        tbListaProductos.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        tbListaProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"001", "Pierna de pollo", "1000", "2000", "12"},
                {"002", "Muslo de pollo", "1000", "2000", "16"},
                {"003", "Cerdo", "1000", "2000", "2"},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Producto", "Precio Compra", "Precio Venta", "Stock"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbListaProductos.setMinimumSize(new java.awt.Dimension(105, 530));
        tbListaProductos.setPreferredSize(new java.awt.Dimension(525, 530));
        tbListaProductos.setRowHeight(25);
        tbListaProductos.setShowGrid(true);
        tbListaProductos.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tbListaProductos);

        body.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 191, 1046, 406));

        jPanel1.add(body, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 92, 1080, 623));

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

    private void btnAñadirProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAñadirProductoMouseClicked
        frmProductosAgregar añadir = new frmProductosAgregar();
        añadir.setVisible(true);
        
        btnAñadirProducto.setBackground(new Color(0x2b628c));
    }//GEN-LAST:event_btnAñadirProductoMouseClicked
    private void btnAñadirProductoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAñadirProductoMouseEntered
        btnAñadirProducto.setBackground(new Color(0x2b628c));
    }//GEN-LAST:event_btnAñadirProductoMouseEntered
    private void btnAñadirProductoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAñadirProductoMouseExited
        btnAñadirProducto.setBackground(new Color(0x22577E));
    }//GEN-LAST:event_btnAñadirProductoMouseExited
    private void btnAñadirProductoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAñadirProductoMousePressed
        btnAñadirProducto.setBackground(new Color(0x2b5574));
    }//GEN-LAST:event_btnAñadirProductoMousePressed

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

    private void txtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarActionPerformed

    private void btnLimpiarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarMouseClicked
        btnLimpiar.setBackground(new Color(0x2b628c));
    }//GEN-LAST:event_btnLimpiarMouseClicked
    private void btnLimpiarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarMouseEntered
        btnLimpiar.setBackground(new Color(0x2b628c));
    }//GEN-LAST:event_btnLimpiarMouseEntered
    private void btnLimpiarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarMouseExited
        btnLimpiar.setBackground(new Color(0x22577E));
    }//GEN-LAST:event_btnLimpiarMouseExited
    private void btnLimpiarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarMousePressed
        btnLimpiar.setBackground(new Color(0x2b5574));
    }//GEN-LAST:event_btnLimpiarMousePressed

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

    private void txtBuscarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtBuscarMousePressed
        if(txtBuscar.getText().equals("Nombre del Producto")){
            txtBuscar.setText(""); //Vaciar el campo
            txtBuscar.setForeground(new Color(0x100F0F)); //Cambiar el color de letra
        }
    }//GEN-LAST:event_txtBuscarMousePressed

    private void bodyMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bodyMousePressed
        llenarCampoVacio();
    }//GEN-LAST:event_bodyMousePressed

    public void llenarCampoVacio(){
        //Validar que el campo usuario esté vacío(is.Empty())
        if(txtBuscar.getText().isEmpty()){
            txtBuscar.setText("Nombre del Producto");
            txtBuscar.setForeground(new Color(0x666666));
        }
    }
    
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
            java.util.logging.Logger.getLogger(frmProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmProductos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel body;
    private javax.swing.JPanel btnAñadirProducto;
    private javax.swing.JPanel btnBuscar;
    private javax.swing.JPanel btnGuardarReporte;
    private javax.swing.JPanel btnLimpiar;
    private javax.swing.JPanel header;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel jpAtras;
    private javax.swing.JPanel jpBarraSuperior;
    private javax.swing.JPanel jpExit;
    private javax.swing.JPanel jpMinimizar;
    private javax.swing.JLabel lbAtras;
    private javax.swing.JLabel lbBuscar;
    private javax.swing.JLabel lbExit;
    private javax.swing.JLabel lbHeader;
    private javax.swing.JLabel lbListaProductos;
    private javax.swing.JLabel lbMinimizar;
    private javax.swing.JPanel lineaBuscar;
    private javax.swing.JPopupMenu menuTabla;
    public static javax.swing.JTable tbListaProductos;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
