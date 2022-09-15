package controlador;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import modelo.dao.Conexion;
import modelo.dao.ProveedorDAO;
import modelo.vo.ProveedorVO;
import vista.frmProveedoresAgregar;
import vista.frmProductosModificar;
import vista.frmProveedoresModificar;
import modelo.tablas.ProveedorTablaModelo;

public class ProveedorControlador implements ActionListener{

    private ProveedorVO vo;
    private ProveedorDAO dao;
    private frmProveedoresAgregar vista;
    private frmProveedoresModificar mod;

    public ProveedorControlador(ProveedorVO vo, ProveedorDAO dao, frmProveedoresAgregar vista) {
        this.vo = vo;
        this.dao = dao;
        this.vista = vista;

        this.vista.btnGuardar.addActionListener(this);
    }

    public void iniciar() {
        vista.setLocationRelativeTo(null);
        vista.setTitle("Añadir Productos");
    }

    public void actionPerformed(ActionEvent evn) {
        
        if (evn.getSource() == vista.btnGuardar) {
            
            vo.setNit(Integer.parseInt(vista.txtCodigoProveedor.getText()));
            vo.setNombre(vista.txtProveedor.getText());
            vo.setCelular(vista.txtCelular.getText());
            vo.setDireccion(vista.txtDireccion.getText());

            if (dao.registrar(vo)) {
                JOptionPane.showMessageDialog(null, "Registro Guardado");
                limpiar();
                llenarCampos();
            } else {
                JOptionPane.showMessageDialog(null, "Error al Guardar");
                limpiar();
                llenarCampos();
            }
        }
        
        
        if (evn.getSource() == mod.btnModificar) {
            //ESTA FUNCIÓN SE MOVIÓ A: controlador.ProveedoresControladorModificar
        }
    }
    
    
    
    public void limpiar(){
        vista.txtCodigoProveedor.setText(null);
        vista.txtProveedor.setText(null);
        vista.txtCelular.setText(null);
        vista.txtDireccion.setText(null);
    }
    
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


