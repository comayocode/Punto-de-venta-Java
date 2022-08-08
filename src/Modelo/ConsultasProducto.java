package Modelo;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.ResultSet;

public class ConsultasProducto extends Conexion{
    public boolean registrar(AddProducto pro){
        PreparedStatement ps = null;
        Connection con = getConexion();
        
        String consulta = "INSERT INTO add_products (nombre, precio_compra, precio_venta) VALUES (?,?,?)";
        
        try {
            ps = con.prepareStatement(consulta);
            //ps.setInt(1, pro.getCodigo());
            ps.setString(1, pro.getNombre());
            ps.setDouble(2, pro.getPrecio_compra());
            ps.setInt(3, pro.getPrecio_venta());
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        }finally{
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }
    
    public boolean modificar(AddProducto pro){
        PreparedStatement ps = null;
        Connection con = getConexion();
        
        String consulta = "UPDATE add_products SET nombre=?, precio_compra=?, precio_venta=? WHERE codigo=?" ;
        
        try {
            ps = con.prepareStatement(consulta);
            ps.setString(1, pro.getNombre());
            ps.setDouble(2, pro.getPrecio_compra());
            ps.setInt(3, pro.getPrecio_venta());
            ps.setInt(4, pro.getCodigo());
            //ps.setInt(3, pro.getCantidad());
            //ps.setString(4, pro.getNombre());
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        }finally{
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }
    
    public boolean eliminar(AddProducto pro){
        PreparedStatement ps = null;
        Connection con = getConexion();
        
        String consulta = "DELETE FROM add_products WHERE codigo=?" ;
        
        try {
            ps = con.prepareStatement(consulta);
            ps.setInt(1, pro.getCodigo());
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        }finally{
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }
    
    public boolean buscar(AddProducto pro){
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();
        
        //RECOMENDABLE LLAMAR A LAS COLUMNAS NECESARIAS, NO A TODAS
        String consulta = "SELECT codigo, nombre, precio_compra, precio_venta FROM add_products WHERE nombre=?" ;
        
        try {
            ps = con.prepareStatement(consulta);
            ps.setString(1, pro.getNombre());
            rs = ps.executeQuery();
            
            while(rs.next()){
                pro.setCodigo(rs.getInt("codigo"));
                pro.setNombre(rs.getString("nombre"));
                pro.setPrecio_compra(Integer.parseInt(rs.getString("precio_compra")));
                pro.setPrecio_venta(Integer.parseInt(rs.getString("precio_venta")));
                return true;
            }
            
            return false;
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        }finally{
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }
    
    
}
