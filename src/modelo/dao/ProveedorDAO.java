package modelo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.vo.ProveedorVO;
import static vista.frmProveedores.tbListaProveedores;

public class ProveedorDAO extends Conexion {

    public boolean registrar(ProveedorVO pro) {
        PreparedStatement ps = null;
        Connection con = getConexion();

        String consulta = "INSERT INTO proveedor (nit, nombre, celular, direccion) VALUES (?,?,?,?)";

        try {
            ps = con.prepareStatement(consulta);
            ps.setInt(1, pro.getNit());
            ps.setString(2, pro.getNombre());
            ps.setString(3, pro.getCelular());
            ps.setString(4, pro.getDireccion());
            ps.execute();

            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            System.err.println(e);
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }

    public boolean modificar(ProveedorVO pro) {
        PreparedStatement ps = null;
        Connection con = getConexion();

        String consulta = "UPDATE proveedor SET nombre=?, celular=? direccion=? WHERE nit=?";

        try {
            ps = con.prepareStatement(consulta);

            ps.setString(1, pro.getNombre());
            ps.setString(2, pro.getCelular());
            ps.setString(3, pro.getDireccion());
            ps.setInt(4, pro.getNit());
            ps.execute();

            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            System.err.println(e);
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }

    public boolean eliminar(ProveedorVO pro) {
        PreparedStatement ps = null;
        Connection con = getConexion();

        String consulta = "DELETE FROM proveedor WHERE nit=?";

        try {
            ps = con.prepareStatement(consulta);

            ps.setInt(1, pro.getNit());
            ps.execute();

            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            System.err.println(e);
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }

    public boolean buscar(ProveedorVO pro) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();

        String consulta = "SELECT * FROM proveedor WHERE nombre=?";

        try {
            ps = con.prepareStatement(consulta);

            ps.setString(1, pro.getNombre());
            rs = ps.executeQuery();

            while (rs.next()) {
                pro.setNit(Integer.parseInt(rs.getString("nit")));
                pro.setNombre(rs.getString("nombre"));
                pro.setCelular(rs.getString("celular"));
                pro.setDireccion(rs.getString("direccion"));
                return true;
            }

            return false;
        } catch (SQLException e) {
            e.printStackTrace();
            System.err.println(e);
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }

    
    
}
