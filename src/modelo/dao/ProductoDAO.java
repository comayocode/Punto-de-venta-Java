package modelo.dao;

import modelo.vo.ProductoVO;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.SQLException;

public class ProductoDAO extends Conexion{
    
    public boolean registrar(ProductoVO pro){
        PreparedStatement ps = null;
        Connection con = getConexion();
        
        String consulta = "INSERT INTO producto (nombre) VALUES (?)";
        
        try {
            ps = con.prepareStatement(consulta);
            ps.setString(1, pro.getNombre());
            System.out.println(pro.getNombre());
            ps.executeUpdate();
            
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
    
}
