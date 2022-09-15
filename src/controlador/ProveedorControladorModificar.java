package controlador;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import modelo.dao.ProveedorDAO;
import modelo.tablas.ProveedorTablaModelo;
import modelo.vo.ProveedorVO;
import vista.frmProveedoresModificar;

public class ProveedorControladorModificar implements ActionListener {

    private ProveedorVO vo;
    private ProveedorDAO dao;
    private frmProveedoresModificar vista;

    //Constructor de la clase
    public ProveedorControladorModificar(ProveedorVO vo, ProveedorDAO dao, frmProveedoresModificar vista) {

        this.vo = vo;
        this.dao = dao;
        this.vista = vista;

        this.vista.btnModificar.addActionListener(this);
    }

    //Posición y titulo de ventana de windows
    public void iniciar() {
        vista.setLocationRelativeTo(null);
        vista.setTitle("Modificar Productos");
    }

    public void actionPerformed(ActionEvent evn) {

        //Al dar clic en btnModificar, pasa los datos de los campos al vo
        if (evn.getSource() == vista.btnModificar) {
            vo.setNit(Integer.parseInt(vista.txtCodigoProveedor.getText()));
            vo.setNombre(vista.txtProveedor.getText());
            vo.setCelular(vista.txtCelular.getText());
            vo.setDireccion(vista.txtDireccion.getText());
        }

        if (dao.modificar(vo)) {
            JOptionPane.showMessageDialog(null, "Registro Actualizado");

            //Métodos despues de actualizar registro
            limpiar();
            llenarCampos();
            actualizarTabla();
            
        //Error si no se actualiza el registro
        } else {
            JOptionPane.showMessageDialog(null, "Error al Guardar");
            
            //Métodos después del mensaje de erro
            limpiar();
            llenarCampos();
        }
    }

    //Actualiza la tabla cuando se Modifica o guarda un registro
    public void actualizarTabla() {
        ProveedorTablaModelo proveedor = new ProveedorTablaModelo();
        proveedor.mostrarRegistros();
    }

    //Limipian los campos de texto
    public void limpiar() {
        vista.txtCodigoProveedor.setText(null);
        vista.txtProveedor.setText(null);
        vista.txtCelular.setText(null);
        vista.txtDireccion.setText(null);
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

        if (vista.txtCelular.getText().isEmpty()) {
            vista.txtCelular.setText("Celular");
            vista.txtCelular.setForeground(new Color(0x666666));
        }

        if (vista.txtDireccion.getText().isEmpty()) {
            vista.txtDireccion.setText("Dirección");
            vista.txtDireccion.setForeground(new Color(0x666666));
        }
    }

}
