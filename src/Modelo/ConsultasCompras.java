package Modelo;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.ResultSet;


public class ConsultasCompras extends Conexion{
    
    public boolean registrar(AddCompras com){
        PreparedStatement ps = null;
        Connection con = getConexion();
        
        String consulta = "INSERT INTO compras (fecha, add_products_codigo, entrada_kg, observaciones) VALUES (?,?,?,?)";
        
        try {
            ps = con.prepareStatement(consulta);
            ps.setString(1, com.getFecha());
            ps.setInt(2, com.getCodigo_producto());
            ps.setDouble(3, com.getCompra_kg());
            ps.setString(4, com.getObservaciones());
            ps.execute();
            
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
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
    
    public boolean modificar(AddCompras com){
        PreparedStatement ps = null;
        Connection con = getConexion();
        
        String consulta = "UPDATE compras SET fecha=?, entrada_kg=?, observaciones=? WHERE codigo=?" ;
        
        try {
            ps = con.prepareStatement(consulta);
            ps.setString(1, com.getFecha());
            ps.setDouble(2, com.getCompra_kg());
            ps.setString(3, com.getObservaciones());
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
    
    public boolean eliminar(AddCompras com){
        PreparedStatement ps = null;
        Connection con = getConexion();
        
        String consulta = "DELETE FROM compras WHERE codigo=?" ;
        
        try {
            ps = con.prepareStatement(consulta);
            ps.setInt(1, com.getCodigo());
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
    
    public boolean buscar(AddCompras com){
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();
        
        //RECOMENDABLE LLAMAR A LAS COLUMNAS NECESARIAS, NO A TODAS
        String consulta = "SELECT codigo, fecha, add_products_codigo, entrada_kg, observaciones FROM compras WHERE codigo=?";
        
        try {
            ps = con.prepareStatement(consulta);
            ps.setInt(1, com.getCodigo());
            rs = ps.executeQuery();
            
            while(rs.next()){
                com.setCodigo(rs.getInt("codigo"));
                com.setFecha(rs.getString("fecha"));
                com.setCodigo_producto(rs.getInt("add_products_codigo"));
                com.setCompra_kg(rs.getDouble("entrada_kg"));
                com.setObservaciones(rs.getString("observaciones"));
                //com.setPrecio_compra(Integer.parseInt(rs.getString("precio_compra")));
                //com.setPrecio_venta(Integer.parseInt(rs.getString("precio_venta")));
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
