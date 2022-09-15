package controlador;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import modelo.dao.ProveedorDAO;
import modelo.vo.ProveedorVO;
import vista.frmProveedoresModificar;

public class ProveedoresControladorModificar implements ActionListener{
    
    private ProveedorVO vo;
    private ProveedorDAO dao;
    private frmProveedoresModificar vista;
    
    public ProveedoresControladorModificar (ProveedorVO vo, ProveedorDAO dao, frmProveedoresModificar vista){
        
        this.vo = vo;
        this.dao = dao;
        this.vista = vista;
        
        this.vista.btnModificar.addActionListener(this);
        
    }
    
    public void iniciar() {
        vista.setLocationRelativeTo(null);
        vista.setTitle("Añadir Productos");
    }
    
    public void actionPerformed(ActionEvent evn) {
    
        if (evn.getSource() == vista.btnModificar) {
            vo.setNit(Integer.parseInt(vista.txtCodigoProveedor.getText()));
            vo.setNombre(vista.txtProveedor.getText());
            vo.setCelular(vista.txtCelular.getText());
            vo.setDireccion(vista.txtDireccion.getText());
        }
        
        if (dao.modificar(vo)) {
                JOptionPane.showMessageDialog(null, "Registro Guardado");
                limpiar();
                llenarCampos();
            } else {
                JOptionPane.showMessageDialog(null, "Error al Guardar");
                limpiar();
                llenarCampos();
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
