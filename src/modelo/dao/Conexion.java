package modelo.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexion {
    //?characterEncoding=latin1 ayuda a solucionar el error: "java.sql.SQLException: Unknown initial character set index '255' received from server. Initial client character set can be forced via the 'characterEncoding' property" (SE ELIMINÓ)
    private final String DB = "gestorinventario";
    private final String USER = "root";
    private final String PASSWORD = "5673";
    private final String URL = "jdbc:mysql://localhost:3306/"+DB;
    private Connection con = null;
    
        
    public Connection getConexion(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(this.URL, this.USER, this.PASSWORD);
        } catch (SQLException e) {
            //System.err.println("No se pudo conectar" + e);
            e.printStackTrace();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
    }
}
