package controlador;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import modelo.dao.ClienteDAO;
import modelo.tablas.ClienteTablaModelo;
import modelo.vo.ClienteVO;
import vista.frmClientesModificar;

public class ClienteControladorModificar implements ActionListener{

    private ClienteVO vo;
    private ClienteDAO dao;
    private frmClientesModificar vista;

    //Constructor de la clase
    public ClienteControladorModificar (ClienteVO vo, ClienteDAO dao, frmClientesModificar vista){
        this.vo = vo;
        this.dao = dao;
        this.vista = vista;
        
        this.vista.btnModificar.addActionListener(this);
        
    }


    //Posición y titulo de ventana de windows
    public void iniciar() {
        vista.setLocationRelativeTo(null);
        vista.setTitle("Modificar Cliente");
    }

// ----- ACTUALIZAR REGISTRO AL DAR CLIC EN btnModificar -----
    public void actionPerformed(ActionEvent evn) {
        //Al dar clic en btnModificar, pasa los datos de los campos al vo
        if (evn.getSource() == vista.btnModificar) {
            vo.setCedula(vista.txtDocumento.getText());
            vo.setNombre(vista.txtCliente.getText());
            vo.setCelular(vista.txtCelular.getText());
            vo.setDireccion(vista.txtDireccion.getText());
        }

        if (dao.modificar(vo)) {
            JOptionPane.showMessageDialog(null, "Registro Modificado");

            //Métodos despues de actualizar registro
            limpiar();
            llenarCampos();
            actualizarTabla();

            //Error si no se actualiza el registro
        } else {
            JOptionPane.showMessageDialog(null, "Error al Modificar");

            //Métodos después del mensaje de erro
            limpiar();
            llenarCampos();
        }
    }
// ----- FIN ACTUALIZAR REGISTRO AL DAR CLIC EN btnModificar -----

    //Actualiza la tabla cuando se Modifica o guarda un registro
    public void actualizarTabla() {
        ClienteTablaModelo cliente = new ClienteTablaModelo();
        cliente.mostrarRegistros();
    }

    //Limipian los campos de texto
    public void limpiar() {
        vista.txtDocumento.setText(null);
        vista.txtCliente.setText(null);
        vista.txtCelular.setText(null);
        vista.txtDireccion.setText(null);
    }

    //Llenar los campo al actualizar o guardar un registro
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
