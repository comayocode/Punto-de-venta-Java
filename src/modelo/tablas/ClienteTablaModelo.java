package modelo.tablas;

import Vista.frmProveedoresEliminar;
import controlador.ClienteControladorAgregar;
import controlador.ProveedorControlador;
import controlador.ProveedorControladorEliminar;
import controlador.ClienteContoladorEliminar;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import modelo.dao.Conexion;
import modelo.dao.ClienteDAO;
import modelo.vo.ClienteVO;
import utilidades.jtable.pintar_tablas.pintarClientes;
import static vista.frmClientes.tbListaClientes;
import Vista.frmClientesEliminar;
import controlador.ClienteControladorModificar;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.RowFilter;
import javax.swing.table.TableRowSorter;
import static vista.frmClientes.tbListaClientes;
import static vista.frmClientes.txtBuscar;
import vista.frmClientesModificar;

public class ClienteTablaModelo {
    DefaultTableModel modelo = new DefaultTableModel();
    //Clasificar filas de latabla
    TableRowSorter trs;
    
    // ----- MOSTRAR LOS DATOS EN LA TABLA (FUNCIONA A LA PERFECCIÓN)-----
    public void mostrarRegistros() {
        Conexion con = new Conexion();
        Connection conn = con.getConexion();
        PreparedStatement ps = null;
        ResultSet rs = null;
        Statement st;

        String consulta = "SELECT * FROM cliente";

        

        modelo.addColumn("Cedula");
        modelo.addColumn("Nombres");
        modelo.addColumn("Celular");
        modelo.addColumn("Dirección");
        tbListaClientes.setModel(modelo);

        String[] datos = new String[5];

        try {
            st = conn.createStatement();
            rs = st.executeQuery(consulta);

            while (rs.next()) {
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                modelo.addRow(datos);

                pintarClientes.pintar();
                pintarClientes.editarHeaderJtable();

            }

        } catch (SQLException ex) {
            Logger.getLogger(ClienteControladorAgregar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
            

    public void pasarDatosACampoTextoEIniciarControladorModificar(){
        
        //Se inicia el controlodor en este lugar porque si se inicia en otro sitio se tendría que abrir 2 veces frmProveedoresModificar
        ClienteVO vo = new ClienteVO();
        ClienteDAO dao = new ClienteDAO();
        frmClientesModificar VistaMod = new frmClientesModificar();
        ClienteControladorModificar controlador = new ClienteControladorModificar(vo, dao, VistaMod);
        controlador.iniciar();
        
        /* Pasa los datos del JTABLE a un campo de texto en 
        otro JFRAME*/
        
        VistaMod.txtDocumento.setText(String.valueOf(tbListaClientes.getValueAt(tbListaClientes.getSelectedRow(), 0)));
        VistaMod.txtCliente.setText(String.valueOf(tbListaClientes.getValueAt(tbListaClientes.getSelectedRow(), 1)));
        VistaMod.txtCelular.setText(String.valueOf(tbListaClientes.getValueAt(tbListaClientes.getSelectedRow(), 2)));
        VistaMod.txtDireccion.setText(String.valueOf(tbListaClientes.getValueAt(tbListaClientes.getSelectedRow(), 3)));
        
        VistaMod.txtDocumento.setForeground(new Color(0x100F0F));
        VistaMod.txtCliente.setForeground(new Color(0x100F0F));
        VistaMod.txtCelular.setForeground(new Color(0x100F0F));
        VistaMod.txtDireccion.setForeground(new Color(0x100F0F));
        
         
        //Muestra los datos que se pasaron
        VistaMod.setVisible(true);
    }
    
    public void pasarDatosACampoTextoEIniciarClienteControladorEliminar(){
        ClienteVO vo  = new ClienteVO();
        ClienteDAO dao = new ClienteDAO();
        frmClientesEliminar VistaEli = new frmClientesEliminar();
        ClienteContoladorEliminar controlador = new ClienteContoladorEliminar(vo, dao, VistaEli);
        controlador.iniciar();
        
        VistaEli.txtCedulaCliente.setText(String.valueOf(tbListaClientes.getValueAt(tbListaClientes.getSelectedRow(), 0)));
        VistaEli.txtCliente.setText(String.valueOf(tbListaClientes.getValueAt(tbListaClientes.getSelectedRow(), 1)));
        
        VistaEli.txtCedulaCliente.setForeground(new Color(0x100F0F));
        VistaEli.txtCliente.setForeground(new Color(0x100F0F));
        
        VistaEli.setVisible(true);
    }
    
    public void buscarCliente(){
        txtBuscar.addKeyListener (new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                trs.setRowFilter(RowFilter.regexFilter("(?i)" + txtBuscar.getText(), 1)); //"(?I)" no toma encuenta las mayúsculas o minúsculas al buscar
            }
        });
        
        trs = new TableRowSorter(modelo);
        tbListaClientes.setRowSorter(trs);
    }
}
