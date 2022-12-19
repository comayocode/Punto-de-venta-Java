package modelo.tablas;

import Vista.frmProveedoresEliminar;
import controlador.ProveedorControlador;
import controlador.ProveedorControladorAgregar;
import controlador.ProveedorControladorEliminar;
import controlador.ProveedorControladorModificar;
import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import modelo.dao.Conexion;
import modelo.dao.ProveedorDAO;
import modelo.vo.ProveedorVO;
import utilidades.jtable.pintar_tablas.pintarProveedores;
import static vista.frmProveedores.tbListaProveedores;
import vista.frmProveedoresModificar;
import static vista.frmProveedores.txtBuscar;

public class ProveedorTablaModelo {

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

        String consulta = "SELECT * FROM proveedor";

        modelo.addColumn("Nit/Código");
        modelo.addColumn("Nombre");
        modelo.addColumn("Celular");
        modelo.addColumn("Dirección");
        tbListaProveedores.setModel(modelo);

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

                pintarProveedores.pintar();
                pintarProveedores.editarHeaderJtable();

            }

        } catch (SQLException ex) {
            Logger.getLogger(ProveedorControladorAgregar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
            

    public void pasarDatosACampoTextoYIniciarControladorModificar(){
        
        //Se inicia el controlodor en este lugar porque si se inicia en otro sitio se tendría que abrir 2 veces frmProveedoresModificar
        ProveedorVO vo = new ProveedorVO();
        ProveedorDAO dao = new ProveedorDAO();
        frmProveedoresModificar VistaMod = new frmProveedoresModificar();
        ProveedorControladorModificar controlador = new ProveedorControladorModificar(vo, dao, VistaMod);
        controlador.iniciar();
        
        /* Pasa los datos del JTABLE a un campo de texto en 
        otro JFRAME*/
        
        VistaMod.txtCodigoProveedor.setText(String.valueOf(tbListaProveedores.getValueAt(tbListaProveedores.getSelectedRow(), 0)));
        VistaMod.txtProveedor.setText(String.valueOf(tbListaProveedores.getValueAt(tbListaProveedores.getSelectedRow(), 1)));
        VistaMod.txtCelular.setText(String.valueOf(tbListaProveedores.getValueAt(tbListaProveedores.getSelectedRow(), 2)));
        VistaMod.txtDireccion.setText(String.valueOf(tbListaProveedores.getValueAt(tbListaProveedores.getSelectedRow(), 3)));
        
        VistaMod.txtCodigoProveedor.setForeground(new Color(0x100F0F));
        VistaMod.txtProveedor.setForeground(new Color(0x100F0F));
        VistaMod.txtCelular.setForeground(new Color(0x100F0F));
        VistaMod.txtDireccion.setForeground(new Color(0x100F0F));
        
         
        //Muestra los datos que se pasaron
        VistaMod.setVisible(true);
    }
    
    public void pasarDatosACampoTextoEIniciarProveedorControladorEliminar(){
        ProveedorVO vo = new ProveedorVO();
        ProveedorDAO dao = new ProveedorDAO();
        frmProveedoresEliminar VistaEli = new frmProveedoresEliminar();
        ProveedorControladorEliminar controlador = new ProveedorControladorEliminar(vo, dao, VistaEli);
        controlador.iniciar();
        
        VistaEli.txtCodigoProveedor.setText(String.valueOf(tbListaProveedores.getValueAt(tbListaProveedores.getSelectedRow(), 0)));
        VistaEli.txtProveedor.setText(String.valueOf(tbListaProveedores.getValueAt(tbListaProveedores.getSelectedRow(), 1)));
        
        VistaEli.txtCodigoProveedor.setForeground(new Color(0x100F0F));
        VistaEli.txtProveedor.setForeground(new Color(0x100F0F));
        
        VistaEli.setVisible(true);
    }
    
    public void buscarProeedor(){
        txtBuscar.addKeyListener (new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                trs.setRowFilter(RowFilter.regexFilter("(?i)" + txtBuscar.getText(), 1)); //"(?I)" no toma encuenta las mayúsculas o minúsculas al buscar
            }
        });
        
        trs = new TableRowSorter(modelo);
        tbListaProveedores.setRowSorter(trs);
    }
}
