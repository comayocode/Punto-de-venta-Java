package vista;

import java.awt.Color;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;

public class frmMenu extends javax.swing.JFrame {

    //Variables para poder arrastrar la ventana
    int xMouse, yMouse;

    public frmMenu() {
        initComponents();
        this.setLocationRelativeTo(null);
        setTitle("Menú");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        jpBarraSuperior = new javax.swing.JPanel();
        jpExit = new javax.swing.JPanel();
        lbExit = new javax.swing.JLabel();
        jpMinimizar = new javax.swing.JPanel();
        lbMinimizar = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jpHeader = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnHelp = new javax.swing.JPanel();
        lbHelp = new javax.swing.JLabel();
        btnConfig = new javax.swing.JPanel();
        lbConfig = new javax.swing.JLabel();
        jpDecorativo = new javax.swing.JPanel();
        btnProducts = new javax.swing.JPanel();
        iconProducts = new javax.swing.JLabel();
        lbProducts = new javax.swing.JLabel();
        iconVentas = new javax.swing.JLabel();
        btnProveedores = new javax.swing.JPanel();
        iconProveedores = new javax.swing.JLabel();
        lbProveedores = new javax.swing.JLabel();
        btnClientes = new javax.swing.JPanel();
        iconClientes = new javax.swing.JLabel();
        lbClientes = new javax.swing.JLabel();
        btnVentas = new javax.swing.JPanel();
        lbVentas = new javax.swing.JLabel();
        iconVentas1 = new javax.swing.JLabel();
        btnCompras = new javax.swing.JPanel();
        iconCompras = new javax.swing.JLabel();
        lbCompras = new javax.swing.JLabel();
        btnResumen = new javax.swing.JPanel();
        iconResumen = new javax.swing.JLabel();
        lbResumen = new javax.swing.JLabel();
        bgBotonesPrincipales = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        jpBarraSuperior.add(jpExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 0, -1, 32));

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

        jpBarraSuperior.add(jpMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 0, 50, 32));

        jLabel1.setFont(new java.awt.Font("Roboto Medium", 0, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(241, 241, 241));
        jLabel1.setText(".: Inicio :.");
        jpBarraSuperior.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 5, 81, 23));

        bg.add(jpBarraSuperior, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 32));

        jpHeader.setBackground(new java.awt.Color(34, 87, 126));
        jpHeader.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/global/logo.png"))); // NOI18N
        jpHeader.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 18, 80, 80));

        jLabel2.setFont(new java.awt.Font("Roboto Medium", 0, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(241, 241, 241));
        jLabel2.setText("CONTROL DE INVENTARIO");
        jpHeader.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 43, -1, -1));

        btnHelp.setBackground(new java.awt.Color(34, 87, 126));
        btnHelp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(241, 241, 241), 2));
        btnHelp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lbHelp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbHelp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/menu/ayuda.png"))); // NOI18N
        lbHelp.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        lbHelp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbHelpMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbHelpMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbHelpMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbHelpMousePressed(evt);
            }
        });

        javax.swing.GroupLayout btnHelpLayout = new javax.swing.GroupLayout(btnHelp);
        btnHelp.setLayout(btnHelpLayout);
        btnHelpLayout.setHorizontalGroup(
            btnHelpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 46, Short.MAX_VALUE)
            .addGroup(btnHelpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(btnHelpLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(lbHelp, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        btnHelpLayout.setVerticalGroup(
            btnHelpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 46, Short.MAX_VALUE)
            .addGroup(btnHelpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(btnHelpLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(lbHelp, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jpHeader.add(btnHelp, new org.netbeans.lib.awtextra.AbsoluteConstraints(534, 33, 50, 50));

        btnConfig.setBackground(new java.awt.Color(34, 87, 126));
        btnConfig.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(241, 241, 241), 2));
        btnConfig.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lbConfig.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbConfig.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/menu/settings 1.png"))); // NOI18N
        lbConfig.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        lbConfig.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbConfigMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbConfigMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbConfigMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbConfigMousePressed(evt);
            }
        });

        javax.swing.GroupLayout btnConfigLayout = new javax.swing.GroupLayout(btnConfig);
        btnConfig.setLayout(btnConfigLayout);
        btnConfigLayout.setHorizontalGroup(
            btnConfigLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbConfig, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
        );
        btnConfigLayout.setVerticalGroup(
            btnConfigLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbConfig, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
        );

        jpHeader.add(btnConfig, new org.netbeans.lib.awtextra.AbsoluteConstraints(595, 33, 50, 50));

        bg.add(jpHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 32, 660, 120));

        jpDecorativo.setBackground(new java.awt.Color(255, 211, 105));

        javax.swing.GroupLayout jpDecorativoLayout = new javax.swing.GroupLayout(jpDecorativo);
        jpDecorativo.setLayout(jpDecorativoLayout);
        jpDecorativoLayout.setHorizontalGroup(
            jpDecorativoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 660, Short.MAX_VALUE)
        );
        jpDecorativoLayout.setVerticalGroup(
            jpDecorativoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        bg.add(jpDecorativo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 152, 660, 25));

        btnProducts.setBackground(new java.awt.Color(34, 87, 126));
        btnProducts.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnProducts.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnProductsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnProductsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnProductsMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnProductsMousePressed(evt);
            }
        });
        btnProducts.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        btnProducts.add(iconProducts, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 10, -1, -1));

        lbProducts.setFont(new java.awt.Font("Roboto Medium", 0, 16)); // NOI18N
        lbProducts.setForeground(new java.awt.Color(241, 241, 241));
        lbProducts.setText("Productos");
        btnProducts.add(lbProducts, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 86, -1, -1));

        iconVentas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/menu/productos.png"))); // NOI18N
        btnProducts.add(iconVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 10, 68, 68));

        bg.add(btnProducts, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 217, 110, 110));

        btnProveedores.setBackground(new java.awt.Color(34, 87, 126));
        btnProveedores.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnProveedores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnProveedoresMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnProveedoresMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnProveedoresMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnProveedoresMousePressed(evt);
            }
        });
        btnProveedores.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        iconProveedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/menu/proveedores.png"))); // NOI18N
        btnProveedores.add(iconProveedores, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 6, 80, 80));

        lbProveedores.setFont(new java.awt.Font("Roboto Medium", 0, 16)); // NOI18N
        lbProveedores.setForeground(new java.awt.Color(241, 241, 241));
        lbProveedores.setText("Proveedores");
        btnProveedores.add(lbProveedores, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 86, -1, -1));

        bg.add(btnProveedores, new org.netbeans.lib.awtextra.AbsoluteConstraints(275, 217, 110, 110));

        btnClientes.setBackground(new java.awt.Color(34, 87, 126));
        btnClientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnClientesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnClientesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnClientesMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnClientesMousePressed(evt);
            }
        });
        btnClientes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        iconClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/menu/clientes.png"))); // NOI18N
        btnClientes.add(iconClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 10, 68, 68));

        lbClientes.setFont(new java.awt.Font("Roboto Medium", 0, 16)); // NOI18N
        lbClientes.setForeground(new java.awt.Color(241, 241, 241));
        lbClientes.setText("Clientes");
        btnClientes.add(lbClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 86, -1, -1));

        bg.add(btnClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(425, 217, 110, 110));

        btnVentas.setBackground(new java.awt.Color(34, 87, 126));
        btnVentas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVentas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVentasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnVentasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnVentasMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnVentasMousePressed(evt);
            }
        });
        btnVentas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbVentas.setFont(new java.awt.Font("Roboto Medium", 0, 16)); // NOI18N
        lbVentas.setForeground(new java.awt.Color(241, 241, 241));
        lbVentas.setText("Ventas");
        btnVentas.add(lbVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 86, -1, -1));

        iconVentas1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/menu/ventas.png"))); // NOI18N
        btnVentas.add(iconVentas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 10, 68, 68));

        bg.add(btnVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 357, 110, 110));

        btnCompras.setBackground(new java.awt.Color(34, 87, 126));
        btnCompras.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCompras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnComprasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnComprasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnComprasMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnComprasMousePressed(evt);
            }
        });
        btnCompras.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        iconCompras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/menu/compras.png"))); // NOI18N
        btnCompras.add(iconCompras, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 11, 65, 68));

        lbCompras.setFont(new java.awt.Font("Roboto Medium", 0, 16)); // NOI18N
        lbCompras.setForeground(new java.awt.Color(241, 241, 241));
        lbCompras.setText("Compras");
        btnCompras.add(lbCompras, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 86, -1, -1));

        bg.add(btnCompras, new org.netbeans.lib.awtextra.AbsoluteConstraints(275, 357, 110, 110));

        btnResumen.setBackground(new java.awt.Color(34, 87, 126));
        btnResumen.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnResumen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnResumenMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnResumenMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnResumenMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnResumenMousePressed(evt);
            }
        });
        btnResumen.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        iconResumen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/menu/estadisticas.png"))); // NOI18N
        btnResumen.add(iconResumen, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 9, 65, 65));

        lbResumen.setFont(new java.awt.Font("Roboto Medium", 0, 16)); // NOI18N
        lbResumen.setForeground(new java.awt.Color(241, 241, 241));
        lbResumen.setText("Resumen");
        btnResumen.add(lbResumen, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 86, -1, -1));

        bg.add(btnResumen, new org.netbeans.lib.awtextra.AbsoluteConstraints(425, 357, 110, 110));

        bgBotonesPrincipales.setBackground(new java.awt.Color(241, 241, 241));
        bgBotonesPrincipales.setForeground(new java.awt.Color(241, 241, 241));

        javax.swing.GroupLayout bgBotonesPrincipalesLayout = new javax.swing.GroupLayout(bgBotonesPrincipales);
        bgBotonesPrincipales.setLayout(bgBotonesPrincipalesLayout);
        bgBotonesPrincipalesLayout.setHorizontalGroup(
            bgBotonesPrincipalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 660, Short.MAX_VALUE)
        );
        bgBotonesPrincipalesLayout.setVerticalGroup(
            bgBotonesPrincipalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 340, Short.MAX_VALUE)
        );

        bg.add(bgBotonesPrincipales, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 177, 660, 340));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
// ---- MÉTODO PARA CONFIRMAR CERRAR SESION ----
    public void confirmacionSalir() {
        //Añadir las opciones a un arreglo
        Object[] botones = {"Confirmar", "Cancelar"};
        
        //Guardar la selección de opción en una variable
        int opcion = JOptionPane.showOptionDialog(null, //Centrar ventana
                "¿Seguro que quiere salir?", //Mensaje/Pregunta
                "Cerrar Sesion", //Titulo de la ventana
                JOptionPane.YES_NO_OPTION, //Opción Confirmar
                JOptionPane.QUESTION_MESSAGE, //Opción Cancelar
                null, //No usar icono
                botones, //Titulo de los botones
                botones[0]); //Botones

        //Validar la opción escogida
        if (opcion == JOptionPane.YES_OPTION){
            frmLogin login = new frmLogin(); //Instanciar frmLogin
            login.setVisible(true); //Mostrar login
            this.dispose(); //Cerrar este JFrmae
        } else if (opcion == JOptionPane.YES_NO_OPTION) {
            setDefaultCloseOperation(frmMenu.DO_NOTHING_ON_CLOSE);
        }
    }
    
// ---- EVENTOS BOTONES HELP Y CONFIGURACION----
    private void lbHelpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbHelpMouseClicked
        btnHelp.setBackground(new Color(0x4c708a));
    }//GEN-LAST:event_lbHelpMouseClicked
    private void lbHelpMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbHelpMouseEntered
        btnHelp.setBackground(new Color(0x4c708a));
    }//GEN-LAST:event_lbHelpMouseEntered
    private void lbHelpMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbHelpMouseExited
        btnHelp.setBackground(new Color(0x22577E));
    }//GEN-LAST:event_lbHelpMouseExited
    private void lbHelpMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbHelpMousePressed
        btnHelp.setBackground(new Color(0x27455b));
    }//GEN-LAST:event_lbHelpMousePressed

    private void lbConfigMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbConfigMouseClicked
        btnConfig.setBackground(new Color(0x4c708a));
    }//GEN-LAST:event_lbConfigMouseClicked
    private void lbConfigMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbConfigMouseEntered
        btnConfig.setBackground(new Color(0x4c708a));
    }//GEN-LAST:event_lbConfigMouseEntered
    private void lbConfigMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbConfigMouseExited
        btnConfig.setBackground(new Color(0x22577E));
    }//GEN-LAST:event_lbConfigMouseExited
    private void lbConfigMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbConfigMousePressed
        btnConfig.setBackground(new Color(0x27455b));
    }//GEN-LAST:event_lbConfigMousePressed
    
// ---- EVENTOS BOTONES SECCIONES ----
    private void btnProductsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProductsMouseClicked
        frmProductosMenu menuProductos = new frmProductosMenu();
        //this.setEnabled(false); //Bloquear Menu al abrir las opciones
        menuProductos.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnProductsMouseClicked
    private void btnProductsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProductsMouseEntered
        btnProducts.setBackground(new Color(0x2b628c));
    }//GEN-LAST:event_btnProductsMouseEntered
    private void btnProductsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProductsMouseExited
        btnProducts.setBackground(new Color(0x22577E));
    }//GEN-LAST:event_btnProductsMouseExited
    private void btnProductsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProductsMousePressed
        btnProducts.setBackground(new Color(0x2b5574));
    }//GEN-LAST:event_btnProductsMousePressed

    private void btnProveedoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProveedoresMouseClicked
        frmProveedores proveedor = new frmProveedores();
        proveedor.setVisible(true);
        this.dispose();
        
        btnProveedores.setBackground(new Color(0x2b628c));
    }//GEN-LAST:event_btnProveedoresMouseClicked
    private void btnProveedoresMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProveedoresMouseEntered
        btnProveedores.setBackground(new Color(0x2b628c));
    }//GEN-LAST:event_btnProveedoresMouseEntered
    private void btnProveedoresMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProveedoresMouseExited
        btnProveedores.setBackground(new Color(0x22577E));
    }//GEN-LAST:event_btnProveedoresMouseExited
    private void btnProveedoresMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProveedoresMousePressed
        btnProveedores.setBackground(new Color(0x2b5574));
    }//GEN-LAST:event_btnProveedoresMousePressed

    private void btnClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClientesMouseClicked
        btnClientes.setBackground(new Color(0x2b628c));
    }//GEN-LAST:event_btnClientesMouseClicked
    private void btnClientesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClientesMouseEntered
        btnClientes.setBackground(new Color(0x2b628c));
    }//GEN-LAST:event_btnClientesMouseEntered
    private void btnClientesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClientesMouseExited
        btnClientes.setBackground(new Color(0x22577E));
    }//GEN-LAST:event_btnClientesMouseExited
    private void btnClientesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClientesMousePressed
        btnClientes.setBackground(new Color(0x2b5574));
    }//GEN-LAST:event_btnClientesMousePressed

    private void btnVentasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVentasMouseClicked
        btnVentas.setBackground(new Color(0x2b628c));
    }//GEN-LAST:event_btnVentasMouseClicked
    private void btnVentasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVentasMouseEntered
        btnVentas.setBackground(new Color(0x2b628c));
    }//GEN-LAST:event_btnVentasMouseEntered
    private void btnVentasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVentasMouseExited
        btnVentas.setBackground(new Color(0x22577E));
    }//GEN-LAST:event_btnVentasMouseExited
    private void btnVentasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVentasMousePressed
        btnVentas.setBackground(new Color(0x2b5574));
    }//GEN-LAST:event_btnVentasMousePressed

    private void btnComprasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnComprasMouseClicked
        btnCompras.setBackground(new Color(0x2b628c));
    }//GEN-LAST:event_btnComprasMouseClicked
    private void btnComprasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnComprasMouseEntered
        btnCompras.setBackground(new Color(0x2b628c));
    }//GEN-LAST:event_btnComprasMouseEntered
    private void btnComprasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnComprasMouseExited
        btnCompras.setBackground(new Color(0x22577E));
    }//GEN-LAST:event_btnComprasMouseExited
    private void btnComprasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnComprasMousePressed
        btnCompras.setBackground(new Color(0x2b5574));
    }//GEN-LAST:event_btnComprasMousePressed

    private void btnResumenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnResumenMouseClicked
        btnResumen.setBackground(new Color(0x2b628c));
    }//GEN-LAST:event_btnResumenMouseClicked
    private void btnResumenMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnResumenMouseEntered
        btnResumen.setBackground(new Color(0x2b628c));
    }//GEN-LAST:event_btnResumenMouseEntered
    private void btnResumenMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnResumenMouseExited
        btnResumen.setBackground(new Color(0x22577E));
    }//GEN-LAST:event_btnResumenMouseExited
    private void btnResumenMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnResumenMousePressed
        btnResumen.setBackground(new Color(0x2b5574));
    }//GEN-LAST:event_btnResumenMousePressed
    
// ---- EVENTOS BARRA SUPERIOR ---
    // Arrastrar la ventana
    private void jpBarraSuperiorMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpBarraSuperiorMouseDragged
        int x = evt.getXOnScreen(); //Obtener posición X en la pantalla
        int y = evt.getYOnScreen(); //Obtener posición Y en la pantalla
        this.setLocation(x - xMouse, y - yMouse); //Hacer fluido el movimiento de la ventana
    }//GEN-LAST:event_jpBarraSuperiorMouseDragged
    private void jpBarraSuperiorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpBarraSuperiorMousePressed
        xMouse = evt.getX(); //Obtiene X
        yMouse = evt.getY(); //Obtiene Y
    }//GEN-LAST:event_jpBarraSuperiorMousePressed

    // Eventos botón cerrar
    private void lbExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbExitMouseClicked
        //Llamar método para confirmar cerrar sesión
        confirmacionSalir();
    }//GEN-LAST:event_lbExitMouseClicked
    private void lbExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbExitMouseEntered
        jpExit.setBackground(new Color(0xF05454));
        lbExit.setForeground(new Color(0x100F0F));
    }//GEN-LAST:event_lbExitMouseEntered
    private void lbExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbExitMouseExited
        jpExit.setBackground(new Color(0x100F0F));
        lbExit.setForeground(new Color(0xF1F1F1));
    }//GEN-LAST:event_lbExitMouseExited
    
    //Eventos botón minimizar
    private void lbMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbMinimizarMouseClicked
        setExtendedState(ICONIFIED); //ICONIFIED minimiza la ventana
    }//GEN-LAST:event_lbMinimizarMouseClicked
    private void lbMinimizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbMinimizarMouseEntered
        jpMinimizar.setBackground(new Color(0x4B6587));
        lbMinimizar.setForeground(new Color(0x100F0F));
    }//GEN-LAST:event_lbMinimizarMouseEntered
    private void lbMinimizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbMinimizarMouseExited
        jpMinimizar.setBackground(new Color(0x100F0F));
        lbMinimizar.setForeground(new Color(0xF1F1F1));
    }//GEN-LAST:event_lbMinimizarMouseExited
    
    
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
            java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JPanel bgBotonesPrincipales;
    private javax.swing.JPanel btnClientes;
    private javax.swing.JPanel btnCompras;
    private javax.swing.JPanel btnConfig;
    private javax.swing.JPanel btnHelp;
    private javax.swing.JPanel btnProducts;
    private javax.swing.JPanel btnProveedores;
    private javax.swing.JPanel btnResumen;
    private javax.swing.JPanel btnVentas;
    private javax.swing.JLabel iconClientes;
    private javax.swing.JLabel iconCompras;
    private javax.swing.JLabel iconProducts;
    private javax.swing.JLabel iconProveedores;
    private javax.swing.JLabel iconResumen;
    private javax.swing.JLabel iconVentas;
    private javax.swing.JLabel iconVentas1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jpBarraSuperior;
    private javax.swing.JPanel jpDecorativo;
    private javax.swing.JPanel jpExit;
    private javax.swing.JPanel jpHeader;
    private javax.swing.JPanel jpMinimizar;
    private javax.swing.JLabel lbClientes;
    private javax.swing.JLabel lbCompras;
    private javax.swing.JLabel lbConfig;
    private javax.swing.JLabel lbExit;
    private javax.swing.JLabel lbHelp;
    private javax.swing.JLabel lbMinimizar;
    private javax.swing.JLabel lbProducts;
    private javax.swing.JLabel lbProveedores;
    private javax.swing.JLabel lbResumen;
    private javax.swing.JLabel lbVentas;
    // End of variables declaration//GEN-END:variables
}
