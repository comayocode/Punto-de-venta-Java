package vista;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import utilidades.jtable.pintar_tablas.pintarComprasBuscar;

public class frmComprasBuscar extends javax.swing.JFrame {

    int xMouse, yMouse;

    public frmComprasBuscar() {
        initComponents();
        this.setLocationRelativeTo(null);
        pintarComprasBuscar.pintar();
        pintarComprasBuscar.editarHeaderJtable();
        inicarpopUpMenuTabla();

    }

    // ----- INICIO CÓDIGO POPUPMENU JTABLE -----
    //Método para editar estilo y acciones del Joption.showConfirmDialog
    public void confirmarEliminar() {

        // --- ESTILOS ---
        //Añadir las opciones a un arreglo
        Object[] botones = {"Confirmar", "Cancelar"};

        //Guardar la selección de opción en una variable
        int opcion = JOptionPane.showOptionDialog(null, //Centrar ventana
                "¿Seguro que quiere eliminar de la lista de Compra?", //Mensaje/Pregunta
                "Eliminar Compra", //Titulo de la ventana
                JOptionPane.YES_NO_OPTION, //Opción Confirmar
                JOptionPane.QUESTION_MESSAGE, //Opción Cancelar
                null, //No usar icono
                botones, //Titulo de los botones
                botones[0]); //Botones

        // --- ACCIONES ---
        //Validar la opción escogida
        if (opcion == JOptionPane.YES_OPTION) { //Si la opción es "Confirmar"...
            //Codigo a ejecutar aquí
            JOptionPane.showMessageDialog(null, "Eliminado", "Compra eliminada", JOptionPane.NO_OPTION);
        } else if (opcion == JOptionPane.YES_NO_OPTION) { //Si la opción es "Cancelar"
            //No hacer nada
            setDefaultCloseOperation(frmMenu.DO_NOTHING_ON_CLOSE);
        }
    }

    //Opciones de menu al dar clic derecho en la tabla
    public void inicarpopUpMenuTabla() {
        JMenuItem eliminar = new JMenuItem("Eliminar", getIcon("/img/clientes/delete.png", 20, 20));

        //Añadir las opciones al popupmenu
        menuTabla.add(eliminar);

        tbBuscarCompras.setComponentPopupMenu(menuTabla); //Le pasamos el popupMenu a la tabla

        // ----- AÑADIR LAS ACCIONES PARA CADA OPCION -----
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
    public Icon getIcon(String ruta, int width, int height) {
        Icon miicono = new ImageIcon(new ImageIcon(getClass().getResource(ruta)).getImage().getScaledInstance(width, height, 0));
        return miicono;

    }
    // ----- FIN CÓDIGO POPUPMENU JTABLE -----

    // ----- INICIO LIMPIAR CAMPOS -----
    public void limpiarCampos(){
        txtCodigo.setText("");
        txtCodigoCompra.setText("");
        txtFechaCompra.setText("");
        txtTotal.setText("$ 0.0");
        txtNitProveedor.setText("");
        txtProveedor.setText("");
    }
    // ----- FIN LIMPIAR CAMPOS -----
    
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
        lbLogo = new javax.swing.JLabel();
        lbTittle = new javax.swing.JLabel();
        body = new javax.swing.JPanel();
        jpBuscarCompra = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtCodigoCompra = new javax.swing.JTextField();
        separador = new javax.swing.JPanel();
        btnBuscar = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        separador1 = new javax.swing.JPanel();
        txtFechaCompra = new javax.swing.JTextField();
        separador4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txtNitProveedor = new javax.swing.JTextField();
        separador5 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txtProveedor = new javax.swing.JTextField();
        separador6 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        btnLimpiar = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        txtGuardarReporte = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jpTabla = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbBuscarCompras = new javax.swing.JTable();
        txtTotal = new javax.swing.JTextField();
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

        jpBarraSuperior.add(jpExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 0, -1, 32));

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

        jpBarraSuperior.add(jpMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 0, 50, 32));

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

        jpBarraSuperior.add(jpAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 0, 50, 32));

        jLabel1.setFont(new java.awt.Font("Roboto Medium", 0, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(241, 241, 241));
        jLabel1.setText(".: Compras :.");
        jpBarraSuperior.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 5, 150, 23));

        jPanel1.add(jpBarraSuperior, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 32));

        header.setBackground(new java.awt.Color(34, 87, 126));
        header.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/compras/logo70.png"))); // NOI18N
        header.add(lbLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 15, 70, 70));

        lbTittle.setBackground(new java.awt.Color(241, 241, 241));
        lbTittle.setFont(new java.awt.Font("Roboto Medium", 0, 30)); // NOI18N
        lbTittle.setForeground(new java.awt.Color(241, 241, 241));
        lbTittle.setText("Buscar Compra");
        header.add(lbTittle, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 32, -1, -1));

        jPanel1.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 32, 670, 100));

        body.setBackground(new java.awt.Color(241, 241, 241));
        body.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpBuscarCompra.setBackground(new java.awt.Color(241, 241, 241));
        jpBuscarCompra.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(34, 87, 126), 2));
        jpBuscarCompra.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(16, 15, 15));
        jLabel2.setFont(new java.awt.Font("Roboto Medium", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(16, 15, 15));
        jLabel2.setText("Cod. Compra");
        jpBuscarCompra.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 21, -1, -1));

        txtCodigoCompra.setBackground(new java.awt.Color(217, 217, 217));
        txtCodigoCompra.setFont(new java.awt.Font("Roboto Medium", 0, 15)); // NOI18N
        txtCodigoCompra.setBorder(null);
        jpBuscarCompra.add(txtCodigoCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 20, 117, 25));

        separador.setBackground(new java.awt.Color(16, 15, 15));

        javax.swing.GroupLayout separadorLayout = new javax.swing.GroupLayout(separador);
        separador.setLayout(separadorLayout);
        separadorLayout.setHorizontalGroup(
            separadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 117, Short.MAX_VALUE)
        );
        separadorLayout.setVerticalGroup(
            separadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        jpBuscarCompra.add(separador, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 45, 117, 2));

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

        jpBuscarCompra.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(266, 20, 40, 27));

        jLabel3.setBackground(new java.awt.Color(16, 15, 15));
        jLabel3.setFont(new java.awt.Font("Roboto Medium", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(16, 15, 15));
        jLabel3.setText("Código:");
        jpBuscarCompra.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 93, -1, -1));

        txtCodigo.setBackground(new java.awt.Color(217, 217, 217));
        txtCodigo.setFont(new java.awt.Font("Roboto Medium", 0, 15)); // NOI18N
        txtCodigo.setBorder(null);
        txtCodigo.setOpaque(true);
        jpBuscarCompra.add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 90, 140, 25));

        separador1.setBackground(new java.awt.Color(16, 15, 15));

        javax.swing.GroupLayout separador1Layout = new javax.swing.GroupLayout(separador1);
        separador1.setLayout(separador1Layout);
        separador1Layout.setHorizontalGroup(
            separador1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 140, Short.MAX_VALUE)
        );
        separador1Layout.setVerticalGroup(
            separador1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        jpBuscarCompra.add(separador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 115, 140, 2));

        txtFechaCompra.setBackground(new java.awt.Color(217, 217, 217));
        txtFechaCompra.setFont(new java.awt.Font("Roboto Medium", 0, 15)); // NOI18N
        txtFechaCompra.setBorder(null);
        txtFechaCompra.setOpaque(true);
        jpBuscarCompra.add(txtFechaCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 125, 140, 25));

        separador4.setBackground(new java.awt.Color(16, 15, 15));

        javax.swing.GroupLayout separador4Layout = new javax.swing.GroupLayout(separador4);
        separador4.setLayout(separador4Layout);
        separador4Layout.setHorizontalGroup(
            separador4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 140, Short.MAX_VALUE)
        );
        separador4Layout.setVerticalGroup(
            separador4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        jpBuscarCompra.add(separador4, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 150, 140, 2));

        jLabel6.setBackground(new java.awt.Color(16, 15, 15));
        jLabel6.setFont(new java.awt.Font("Roboto Medium", 0, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(16, 15, 15));
        jLabel6.setText("Fecha Compra:");
        jpBuscarCompra.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 128, -1, -1));

        txtNitProveedor.setBackground(new java.awt.Color(217, 217, 217));
        txtNitProveedor.setFont(new java.awt.Font("Roboto Medium", 0, 15)); // NOI18N
        txtNitProveedor.setBorder(null);
        txtNitProveedor.setOpaque(true);
        jpBuscarCompra.add(txtNitProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 90, 140, 25));

        separador5.setBackground(new java.awt.Color(16, 15, 15));

        javax.swing.GroupLayout separador5Layout = new javax.swing.GroupLayout(separador5);
        separador5.setLayout(separador5Layout);
        separador5Layout.setHorizontalGroup(
            separador5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 140, Short.MAX_VALUE)
        );
        separador5Layout.setVerticalGroup(
            separador5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        jpBuscarCompra.add(separador5, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 115, 140, 2));

        jLabel7.setBackground(new java.awt.Color(16, 15, 15));
        jLabel7.setFont(new java.awt.Font("Roboto Medium", 0, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(16, 15, 15));
        jLabel7.setText("Nit Proveedor");
        jpBuscarCompra.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(328, 93, -1, -1));

        txtProveedor.setBackground(new java.awt.Color(217, 217, 217));
        txtProveedor.setFont(new java.awt.Font("Roboto Medium", 0, 15)); // NOI18N
        txtProveedor.setBorder(null);
        txtProveedor.setOpaque(true);
        jpBuscarCompra.add(txtProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 125, 140, 25));

        separador6.setBackground(new java.awt.Color(16, 15, 15));

        javax.swing.GroupLayout separador6Layout = new javax.swing.GroupLayout(separador6);
        separador6.setLayout(separador6Layout);
        separador6Layout.setHorizontalGroup(
            separador6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 140, Short.MAX_VALUE)
        );
        separador6Layout.setVerticalGroup(
            separador6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        jpBuscarCompra.add(separador6, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 150, 140, 2));

        jLabel8.setBackground(new java.awt.Color(16, 15, 15));
        jLabel8.setFont(new java.awt.Font("Roboto Medium", 0, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(16, 15, 15));
        jLabel8.setText("Proveedor:");
        jpBuscarCompra.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(328, 128, -1, -1));

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

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/compras/limpiar18.png"))); // NOI18N
        btnLimpiar.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 3, 20, 20));

        jpBuscarCompra.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(316, 20, 40, 27));

        jPanel4.setBackground(new java.awt.Color(16, 15, 15));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 595, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jpBuscarCompra.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 68, 595, 2));

        body.add(jpBuscarCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 14, 635, 170));

        txtGuardarReporte.setBackground(new java.awt.Color(34, 87, 126));
        txtGuardarReporte.setForeground(new java.awt.Color(241, 241, 241));
        txtGuardarReporte.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtGuardarReporte.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtGuardarReporteMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtGuardarReporteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtGuardarReporteMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtGuardarReporteMousePressed(evt);
            }
        });
        txtGuardarReporte.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setFont(new java.awt.Font("Roboto Medium", 0, 16)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(241, 241, 241));
        jLabel15.setText("Guardar Reporte");
        txtGuardarReporte.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 5, -1, -1));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/compras/PagarCompras.png"))); // NOI18N
        txtGuardarReporte.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 4, 20, 20));

        body.add(txtGuardarReporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 442, 176, 27));

        jpTabla.setBackground(new java.awt.Color(241, 241, 241));
        jpTabla.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(34, 87, 126), 2));
        jpTabla.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbBuscarCompras.setModel(new javax.swing.table.DefaultTableModel(
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
        tbBuscarCompras.setRowHeight(25);
        tbBuscarCompras.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tbBuscarCompras);

        jpTabla.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 10, 590, 197));

        body.add(jpTabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 205, 635, 217));

        txtTotal.setBackground(new java.awt.Color(16, 15, 15));
        txtTotal.setFont(new java.awt.Font("Roboto Medium", 0, 15)); // NOI18N
        txtTotal.setForeground(new java.awt.Color(241, 241, 241));
        txtTotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTotal.setText("$ 0.0");
        txtTotal.setBorder(null);
        body.add(txtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(542, 442, 110, 27));

        jLabel17.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(16, 15, 15));
        jLabel17.setText("TOTAL");
        body.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(477, 444, -1, -1));

        jPanel1.add(body, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 132, 670, 481));

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

    private void txtGuardarReporteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtGuardarReporteMouseClicked
        txtGuardarReporte.setBackground(new Color(0x2b628c));
    }//GEN-LAST:event_txtGuardarReporteMouseClicked

    private void txtGuardarReporteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtGuardarReporteMouseEntered
        txtGuardarReporte.setBackground(new Color(0x2b628c));
    }//GEN-LAST:event_txtGuardarReporteMouseEntered

    private void txtGuardarReporteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtGuardarReporteMouseExited
        txtGuardarReporte.setBackground(new Color(0x22577E));
    }//GEN-LAST:event_txtGuardarReporteMouseExited

    private void txtGuardarReporteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtGuardarReporteMousePressed
        txtGuardarReporte.setBackground(new Color(0x2b5574));
    }//GEN-LAST:event_txtGuardarReporteMousePressed

    private void btnLimpiarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarMouseClicked
        limpiarCampos();
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
            java.util.logging.Logger.getLogger(frmComprasBuscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmComprasBuscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmComprasBuscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmComprasBuscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmComprasBuscar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel body;
    private javax.swing.JPanel btnBuscar;
    private javax.swing.JPanel btnLimpiar;
    private javax.swing.JPanel header;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel jpAtras;
    private javax.swing.JPanel jpBarraSuperior;
    private javax.swing.JPanel jpBuscarCompra;
    private javax.swing.JPanel jpExit;
    private javax.swing.JPanel jpMinimizar;
    private javax.swing.JPanel jpTabla;
    private javax.swing.JLabel lbAtras;
    private javax.swing.JLabel lbExit;
    private javax.swing.JLabel lbLogo;
    private javax.swing.JLabel lbMinimizar;
    private javax.swing.JLabel lbTittle;
    private javax.swing.JPopupMenu menuTabla;
    private javax.swing.JPanel separador;
    private javax.swing.JPanel separador1;
    private javax.swing.JPanel separador4;
    private javax.swing.JPanel separador5;
    private javax.swing.JPanel separador6;
    public static javax.swing.JTable tbBuscarCompras;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtCodigoCompra;
    private javax.swing.JTextField txtFechaCompra;
    private javax.swing.JPanel txtGuardarReporte;
    private javax.swing.JTextField txtNitProveedor;
    private javax.swing.JTextField txtProveedor;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
