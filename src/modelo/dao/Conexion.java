package modelo.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexion {
    //?characterEncoding=latin1 ayuda a solucionar el error: "java.sql.SQLException: Unknown initial character set index '255' received from server. Initial client character set can be forced via the 'characterEncoding' property"
    private final String DB = "gestorinverntario?characterEncoding=latin1";
    private final String USER = "root";
    private final String PASSWORD = "5673";
    private final String URL = "jdbc:mysql://localhost:3306/"+DB;
    private Connection con = null;
    
        
    public Connection getConexion(){
        
        System.out.println("Conectando a la base de datos...");
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(this.URL, this.USER, this.PASSWORD);
            System.out.println("Conectado");
        } catch (SQLException e) {
            //System.err.println("No se pudo conectar" + e);
            e.printStackTrace();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
    }
}
