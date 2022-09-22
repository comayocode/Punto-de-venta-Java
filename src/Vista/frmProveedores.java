package vista;

import Vista.frmProveedoresEliminar;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import modelo.dao.ProveedorDAO;
import modelo.vo.ProveedorVO;
import utilidades.jtable.pintar_tablas.pintarProveedores;
import controlador.ProveedorControlador;
import controlador.ProveedorControladorEliminar;
import modelo.tablas.ProveedorTablaModelo;

public class frmProveedores extends javax.swing.JFrame {

    //Variables para lograr mover la ventana arrastrando el JPanel
    int xMouse, yMouse;

    //Instanciar la clase ProveedorTablaModelo que se usará en los métodos pasarDatosACampoModificar &  mostrarProveedores
    ProveedorTablaModelo proveedor = new ProveedorTablaModelo();

    public frmProveedores() {
        initComponents();
        this.setLocationRelativeTo(null);
        setTitle("Proveedores");
        pintarProveedores.pintar();
        pintarProveedores.editarHeaderJtable(); //Pone estilos al header de la tabla
        inicarpopUpMenuTabla(); //Inicia el método para ver las opciones al dar clic derecho a la tabla
        mostrarProveedoresDB(); //Muestra los datos de la DB en el JTable

    }

    //Método para editar estilo y acciones del Joption.showConfirmDialog
    public void confirmarEliminar() {

        // --- ESTILOS ---
        //Añadir las opciones a un arreglo
        Object[] botones = {"Confirmar", "Cancelar"};

        //Guardar la selección de opción en una variable
        int opcion = JOptionPane.showOptionDialog(null, //Centrar ventana
                "¿Seguro que quiere eliminar el Proveedor?", //Mensaje/Pregunta
                "Eliminar Proveedor", //Titulo de la ventana
                JOptionPane.YES_NO_OPTION, //Opción Confirmar
                JOptionPane.QUESTION_MESSAGE, //Opción Cancelar
                null, //No usar icono
                botones, //Titulo de los botones
                botones[0]); //Botones
        
        // --- ACCIONES ---
        //Validar la opción escogida
        if (opcion == JOptionPane.YES_OPTION) { //Si la opción es "Confirmar"...
            //Codigo a ejecutar aquí
            JOptionPane.showMessageDialog(null, "Eliminado", "Proveedor eliminado", JOptionPane.NO_OPTION);
        } else if (opcion == JOptionPane.YES_NO_OPTION) { //Si la opción es "Cancelar"
            //No hacer nada
            noHacerNadaAlCerrar();
        }
    }
    
    

    
    public void noHacerNadaAlCerrar() {
        setDefaultCloseOperation(frmMenu.DO_NOTHING_ON_CLOSE);
    }
    
    //Opciones de menu al dar clic derecho en la tabla
    public void inicarpopUpMenuTabla() {
        JMenuItem modificar = new JMenuItem("Modificar", getIcon("/img/clientes/edit.png", 20, 20));
        JMenuItem eliminar = new JMenuItem("Eliminar", getIcon("/img/clientes/delete.png", 20, 20));

        //Añadir las opciones al popupmenu
        menuTabla.add(modificar);
        menuTabla.add(eliminar);

        tbListaProveedores.setComponentPopupMenu(menuTabla); //Le pasamos el popupMenu a la tabla

        // ----- AÑADIR LAS ACCIONES PARA CADA OPCION -----
        //Acción de la opción "editar"
        modificar.addActionListener(new ActionListener() {  //Si la opcion escogida es "Modificar"
            @Override
            public void actionPerformed(ActionEvent e) {
                pasarDatosACampoModificar(); //Llamado del método para pasar los datos a los campos de texto
            }
        });

        //Acción de la opción "Eliminar"
        eliminar.addActionListener(new ActionListener() { //Si la opción escogida es "Eliminar"
            @Override
            public void actionPerformed(ActionEvent e) {
                pasarDatosACampoEliminar(); //Llamado del método para pasar los datos a los campos de texto
            }
        });
    }

    //Método para obtener icono
    public Icon getIcon(String ruta, int width, int height) {
        Icon miicono = new ImageIcon(new ImageIcon(getClass().getResource(ruta)).getImage().getScaledInstance(width, height, 0));
        return miicono;
    }

    public void llenarCampoVacio() {
        //Validar que el campo usuario esté vacío(is.Empty())
        if (txtBuscar.getText().isEmpty()) {
            txtBuscar.setText("Nombre del Proveedor");
            txtBuscar.setForeground(new Color(0x666666));
        }
    }

    // Método para mostrar los datos de la base de datos en el JTable
    public void mostrarProveedoresDB() {
        //Llama el método que se encuentra en la clase ProveedorTablaModelo
        proveedor.mostrarRegistros();
    }

    // Método para pasar los datos de la tabla a los campos de texto de frmProveedoresModificar
    public void pasarDatosACampoModificar() {
        //Llama el método que se encuentra en la clase ProveedorTablaModelo
        proveedor.pasarDatosACampoTextoYIniciarControladorModificar();
    }
    
    public void pasarDatosACampoEliminar(){
        proveedor.pasarDatosACampoTextoEIniciarProveedorControladorEliminar();
    }
    
    public void cerrarFrameEliminar(){
        dispose();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        jPanel2 = new javax.swing.JPanel();
        btnAñadirProducto = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbListaProveedores = new javax.swing.JTable();
        lbBuscar = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        lineaBuscar = new javax.swing.JPanel();
        btnLimpiar = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        lbHeader1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
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

        jpBarraSuperior.add(jpExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 0, -1, 32));

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

        jpBarraSuperior.add(jpMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 0, 50, 32));

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

        jpBarraSuperior.add(jpAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 0, 50, 32));

        jLabel1.setFont(new java.awt.Font("Roboto Medium", 0, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(241, 241, 241));
        jLabel1.setText(".: Proveedores :.");
        jpBarraSuperior.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 5, 150, 23));

        jPanel1.add(jpBarraSuperior, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 32));

        header.setBackground(new java.awt.Color(34, 87, 126));
        header.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbHeader.setFont(new java.awt.Font("Roboto Medium", 0, 25)); // NOI18N
        lbHeader.setForeground(new java.awt.Color(241, 241, 241));
        lbHeader.setText("Lista de Proveedores");
        header.add(lbHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 15, -1, -1));

        jPanel1.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 32, 750, 60));

        jPanel2.setBackground(new java.awt.Color(241, 241, 241));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jLabel4.setText("Añadir Proveedor");
        btnAñadirProducto.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 7, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/productos/btnAñadir.png"))); // NOI18N
        btnAñadirProducto.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 6, 24, 24));

        jPanel2.add(btnAñadirProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 25, 245, 35));

        jPanel4.setBackground(new java.awt.Color(16, 15, 15));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 716, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 85, 716, 2));

        tbListaProveedores.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        tbListaProveedores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tbListaProveedores.setMinimumSize(new java.awt.Dimension(105, 530));
        tbListaProveedores.setPreferredSize(new java.awt.Dimension(525, 530));
        tbListaProveedores.setRowHeight(25);
        tbListaProveedores.setShowGrid(false);
        tbListaProveedores.setShowHorizontalLines(true);
        tbListaProveedores.getTableHeader().setReorderingAllowed(false);
        tbListaProveedores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbListaProveedoresMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tbListaProveedoresMouseEntered(evt);
            }
        });
        jScrollPane1.setViewportView(tbListaProveedores);
        tbListaProveedores.getAccessibleContext().setAccessibleParent(null);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 165, 716, 281));

        lbBuscar.setFont(new java.awt.Font("Roboto Medium", 0, 20)); // NOI18N
        lbBuscar.setForeground(new java.awt.Color(16, 15, 15));
        lbBuscar.setText("Buscar:");
        jPanel2.add(lbBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(375, 121, -1, -1));

        txtBuscar.setBackground(new java.awt.Color(241, 241, 241));
        txtBuscar.setFont(new java.awt.Font("Roboto Medium", 0, 16)); // NOI18N
        txtBuscar.setForeground(new java.awt.Color(102, 102, 102));
        txtBuscar.setText("Nombre del Proveedor");
        txtBuscar.setToolTipText("");
        txtBuscar.setBorder(null);
        txtBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtBuscarMousePressed(evt);
            }
        });
        jPanel2.add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(458, 124, 170, -1));

        lineaBuscar.setBackground(new java.awt.Color(16, 15, 15));

        javax.swing.GroupLayout lineaBuscarLayout = new javax.swing.GroupLayout(lineaBuscar);
        lineaBuscar.setLayout(lineaBuscarLayout);
        lineaBuscarLayout.setHorizontalGroup(
            lineaBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 170, Short.MAX_VALUE)
        );
        lineaBuscarLayout.setVerticalGroup(
            lineaBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        jPanel2.add(lineaBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(458, 143, 170, 2));

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

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/proveedores/btnLimpiar.png"))); // NOI18N
        btnLimpiar.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 5, 20, 20));

        jPanel2.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(693, 115, 40, 30));

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

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/proveedores/btnBuscar.png"))); // NOI18N
        btnBuscar.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 5, 20, 20));

        jPanel2.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(643, 115, 40, 30));

        lbHeader1.setBackground(new java.awt.Color(16, 15, 15));
        lbHeader1.setFont(new java.awt.Font("Roboto Medium", 0, 20)); // NOI18N
        lbHeader1.setForeground(new java.awt.Color(16, 15, 15));
        lbHeader1.setText("Tabla de Proveedores");
        jPanel2.add(lbHeader1, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 104, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 92, 750, 470));

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
        // ----- EJECUTAR EL MODELO, LA VISTA Y EL CONTROLADOR -----
        ProveedorVO vo = new ProveedorVO();
        ProveedorDAO dao = new ProveedorDAO();
        frmProveedoresAgregar vista = new frmProveedoresAgregar();
        ProveedorControlador controlador = new ProveedorControlador(vo, dao, vista);
        controlador.iniciar();
        vista.setVisible(true);
        // ----- FIN DE EJECUCIÓN -----

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

    private void txtBuscarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtBuscarMousePressed
        if (txtBuscar.getText().equals("Nombre del Proveedor")) {
            txtBuscar.setText(""); //Vaciar el campo
            txtBuscar.setForeground(new Color(0x100F0F)); //Cambiar el color de letra
        }
    }//GEN-LAST:event_txtBuscarMousePressed

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

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        llenarCampoVacio();
    }//GEN-LAST:event_formMousePressed

    private void tbListaProveedoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbListaProveedoresMouseClicked

    }//GEN-LAST:event_tbListaProveedoresMouseClicked

    private void tbListaProveedoresMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbListaProveedoresMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_tbListaProveedoresMouseEntered

    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(frmProveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmProveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmProveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmProveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmProveedores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnAñadirProducto;
    private javax.swing.JPanel btnBuscar;
    private javax.swing.JPanel btnLimpiar;
    private javax.swing.JPanel header;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
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
    private javax.swing.JLabel lbHeader1;
    private javax.swing.JLabel lbMinimizar;
    private javax.swing.JPanel lineaBuscar;
    private javax.swing.JPopupMenu menuTabla;
    public static javax.swing.JTable tbListaProveedores;
    public javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
