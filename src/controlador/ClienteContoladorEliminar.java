package controlador;

import java.awt.event.ActionListener;
import modelo.dao.ClienteDAO;
import modelo.vo.ClienteVO;
import Vista.frmClientesEliminar;
import Vista.frmProveedoresEliminar;
import java.awt.Color;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
import modelo.dao.ProveedorDAO;
import modelo.tablas.ClienteTablaModelo;
import modelo.vo.ProveedorVO;

public class ClienteContoladorEliminar implements ActionListener{
    
    private ClienteVO vo;
    private ClienteDAO dao;
    private frmClientesEliminar vista;
    
    //Constructor de la clase
    public ClienteContoladorEliminar(ClienteVO vo, ClienteDAO dao, frmClientesEliminar vista) {
    
        this.vo = vo;
        this.dao = dao;
        this.vista = vista;
        
        this.vista.btnEliminar.addActionListener(this);
    }
    
    //Posición y titulo de ventana de windows
    public void iniciar() {
        vista.setLocationRelativeTo(null);
        vista.setTitle("Eliminar Clientes");
    }
    
    // ----- ELIMINAR REGISTRO AL DAR CLIC EN btnEliminar -----
    @Override
    public void actionPerformed(ActionEvent evn) {
        if (evn.getSource() == vista.btnEliminar) {
            
            
            vo.setCedula(vista.txtCedulaCliente.getText());
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
    
    //Actualiza la tabla cuando se Modifica o guarda un registro
    public void actualizarTabla() {
        ClienteTablaModelo proveedor = new ClienteTablaModelo();
        proveedor.mostrarRegistros();
    }
    
    //Limipian los campos de texto
    public void limpiar() {
        vista.txtCedulaCliente.setText(null);
        vista.txtCliente.setText(null);
    }

    //Llenar los campo al actualizar o guardar un registro
    public void llenarCampos() {
        if (vista.txtCedulaCliente.getText().isEmpty()) {
            vista.txtCedulaCliente.setText("Cédula");
            vista.txtCedulaCliente.setForeground(new Color(0x666666));
        }

        if (vista.txtCliente.getText().isEmpty()) {
            vista.txtCliente.setText("Nombre");
            vista.txtCliente.setForeground(new Color(0x666666));
        }
    }
    
    
    
}
