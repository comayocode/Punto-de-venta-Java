package controlador;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import modelo.vo.ClienteVO;
import modelo.dao.ClienteDAO;
import modelo.tablas.ClienteTablaModelo;
import vista.frmClientesAgregar;


public class ClienteControladorAgregar implements ActionListener{
    
    private ClienteVO vo;
    private ClienteDAO dao;
    private frmClientesAgregar vista;
    
    public ClienteControladorAgregar(ClienteVO vo, ClienteDAO dao, frmClientesAgregar vista){
        this.vo = vo;
        this.dao = dao;
        this.vista = vista;
        
        vista.btnGuardar.addActionListener(this);
    }
    
    public void iniciar(){
        vista.setLocationRelativeTo(null);
        vista.setTitle("Añadir Productos");
    }
    
    public void actionPerformed(ActionEvent evn){
        
        if (evn.getSource() == vista.btnGuardar) {
            vo.setCedula(vista.txtDocumento.getText());
            vo.setNombre(vista.txtCliente.getText());
            vo.setCelular(vista.txtCelular.getText());
            vo.setDireccion(vista.txtDireccion.getText());
        
            if (dao.registrar(vo)) {
                JOptionPane.showMessageDialog(null, "Registro Guardado");
                limpiar();
                llenarCampos();
                actualizarTabla();
            } else {
                JOptionPane.showMessageDialog(null, "Error al Guardar");
                limpiar();
                llenarCampos();
            }
        }
        
    }
    
    //Actualiza la tabla cuando se Modifica o guarda un registro
    public void actualizarTabla() {
        ClienteTablaModelo cliente = new ClienteTablaModelo();
        cliente.mostrarRegistros();
        
        
    }
    
    public void limpiar(){
        vista.txtDocumento.setText(null);
        vista.txtCliente.setText(null);
        vista.txtCelular.setText(null);
        vista.txtDireccion.setText(null);
    }
    
    public void llenarCampos() {
        if (vista.txtDocumento.getText().isEmpty()) {
            vista.txtDocumento.setText("Código");
            vista.txtDocumento.setForeground(new Color(0x666666));
        }

        if (vista.txtCliente.getText().isEmpty()) {
            vista.txtCliente.setText("Nombre");
            vista.txtCliente.setForeground(new Color(0x666666));
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
