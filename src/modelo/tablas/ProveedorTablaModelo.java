package modelo.tablas;

import controlador.ProveedorControlador;
import controlador.ProveedorControladorModificar;
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
import modelo.dao.ProveedorDAO;
import modelo.vo.ProveedorVO;
import utilidades.jtable.pintar_tablas.pintarProveedores;
import static vista.frmProveedores.tbListaProveedores;
import vista.frmProveedoresModificar;

public class ProveedorTablaModelo {

    // ----- MOSTRAR LOS DATOS EN LA TABLA (FUNCIONA A LA PERFECCIÓN)-----
    public void mostrarRegistros() {
        Conexion con = new Conexion();
        Connection conn = con.getConexion();
        PreparedStatement ps = null;
        ResultSet rs = null;
        Statement st;

        String consulta = "SELECT * FROM proveedor";

        DefaultTableModel modelo = new DefaultTableModel();

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
            Logger.getLogger(ProveedorControlador.class.getName()).log(Level.SEVERE, null, ex);
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
}
