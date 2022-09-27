package modelo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import modelo.vo.ClienteVO;

public class ClienteDAO extends Conexion{
    
    public boolean registrar(ClienteVO pro) {
        PreparedStatement ps = null;
        Connection con = getConexion();

        String consulta = "INSERT INTO cliente (cedula, nombre, celular, direccion) VALUES (?,?,?,?)";

        try {
            ps = con.prepareStatement(consulta);
            ps.setString(1, pro.getCedula());
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

    public boolean modificar(ClienteVO pro) {
        PreparedStatement ps = null;
        Connection con = getConexion();

        String consulta = "UPDATE cliente SET nombre=?, celular=?, direccion=? WHERE cedula=?";

        try {
            ps = con.prepareStatement(consulta);

            ps.setString(1, pro.getNombre());
            ps.setString(2, pro.getCelular());
            ps.setString(3, pro.getDireccion());
            ps.setString(4, pro.getCedula());
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

    public boolean eliminar(ClienteVO pro) {
        PreparedStatement ps = null;
        Connection con = getConexion();

        String consulta = "DELETE FROM cliente WHERE cedula=?";

        try {
            ps = con.prepareStatement(consulta);

            ps.setString(1, pro.getCedula());
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

    public boolean buscar(ClienteVO pro) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();

        String consulta = "SELECT * FROM cliente WHERE nombre=?";

        try {
            ps = con.prepareStatement(consulta);

            ps.setString(1, pro.getNombre());
            rs = ps.executeQuery();

            while (rs.next()) {
                pro.setCedula(rs.getString("cedula"));
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
