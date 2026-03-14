package TalonarioConsola.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionMySql {

    private final String user = "root";
    private final String password = "0000";
    private final String url = "jdbc:mysql://127.0.0.1:3306/PruebasLabs";
    private final String driver = "com.mysql.cj.jdbc.Driver";

    private Connection con = null;

    public Connection getConexion() {

        try{
            Class.forName(driver);
            con = DriverManager.getConnection(url, user, password);
            System.out.println("Conexion exitosa");

        }catch(Exception e){
            System.out.println("Error: " + e);
        }

        return con;
    }
}