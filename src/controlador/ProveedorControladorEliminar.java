package controlador;

import Vista.frmProveedoresEliminar;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import modelo.dao.ProveedorDAO;
import modelo.tablas.ProveedorTablaModelo;
import modelo.vo.ProveedorVO;
import vista.frmMenu;
import vista.frmProveedores;

public class ProveedorControladorEliminar implements ActionListener {

    private ProveedorVO vo;
    private ProveedorDAO dao;
    private frmProveedoresEliminar vista;

    //Constructor de la clase
    public ProveedorControladorEliminar(ProveedorVO vo, ProveedorDAO dao, frmProveedoresEliminar vista) {
        this.vo = vo;
        this.dao = dao;
        this.vista = vista;

        this.vista.btnEliminar.addActionListener(this);
    }

    //Posición y titulo de ventana de windows
    public void iniciar() {
        vista.setLocationRelativeTo(null);
        vista.setTitle("Modificar Productos");
    }

    // ----- ELIMINAR REGISTRO AL DAR CLIC EN btnEliminar -----
    @Override
    public void actionPerformed(ActionEvent evn) {
        if (evn.getSource() == vista.btnEliminar) {
            
            
            vo.setNit(Integer.parseInt(vista.txtCodigoProveedor.getText()));
            if (dao.eliminar(vo)) {
                JOptionPane.showMessageDialog(null, "Registro Eliminado");
                limpiar();
                llenarCampos();
                actualizarTabla(); //Actualiza/refresca la tabla al eliminar un registro

            } else {
                JOptionPane.showMessageDialog(null, "Error al Eliminar");
                limpiar();
                llenarCampos();
            }
        }
    }
    
    /* METODO PARA VALIDAR ELIMINAR Y CERRAR FRAME (NO FUNCIONÓ, PROBAR DESPUES)
    public void cerrarFrame() {
        // --- ESTILOS ---
            //Añadir las opciones a un arreglo
            Object[] botones = {"Confirmar", "Cancelar"};

            frmProveedores pro = new frmProveedores();

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
                //JOptionPane.showMessageDialog(null, "Eliminado", "Proveedor eliminado", JOptionPane.NO_OPTION);

                vo.setNit(Integer.parseInt(vista.txtCodigoProveedor.getText()));
                if (dao.eliminar(vo)) {
                    actualizarTabla(); //Actualiza/refresca la tabla al eliminar un registro
                    JOptionPane.showMessageDialog(null, "Registro Eliminado");
                    limpiar();
                    llenarCampos();
                    //pro.cerrarFrameEliminar();

                } else {
                    JOptionPane.showMessageDialog(null, "Error al Eliminar");
                    limpiar();
                    llenarCampos();
                    //pro.cerrarFrameEliminar();
                }
            } else if (opcion == JOptionPane.YES_NO_OPTION) { //Si la opción es "Cancelar"
                //No hacer nada
                pro.noHacerNadaAlCerrar();
            }
    }
    */

    // ----- FIN ACTUALIZAR REGISTRO AL DAR CLIC EN btnModificar -----
    //Actualiza la tabla cuando se Modifica o guarda un registro
    public void actualizarTabla() {
        ProveedorTablaModelo proveedor = new ProveedorTablaModelo();
        proveedor.mostrarRegistros();
    }

    /* NO CIERRA LA VENTANA AL HACER EL LLAMADO
    //Cerrar Frame
    public void cerrarFrameEliminar() {
        frmProveedoresEliminar eliminar = new frmProveedoresEliminar();
        eliminar.dispose();
    }
     */
    //Limipian los campos de texto
    public void limpiar() {
        vista.txtCodigoProveedor.setText(null);
        vista.txtProveedor.setText(null);
    }

    //Llenar los campo al actualizar o guardar un registro
    public void llenarCampos() {
        if (vista.txtCodigoProveedor.getText().isEmpty()) {
            vista.txtCodigoProveedor.setText("Código");
            vista.txtCodigoProveedor.setForeground(new Color(0x666666));
        }

        if (vista.txtProveedor.getText().isEmpty()) {
            vista.txtProveedor.setText("Nombre");
            vista.txtProveedor.setForeground(new Color(0x666666));
        }
    }
}
