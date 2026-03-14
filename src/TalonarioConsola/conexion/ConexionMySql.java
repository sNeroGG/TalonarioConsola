package TalonarioConsola.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConexionMySql {
    private final String user = "vroot";
    private final String password = "0000";
    private final String url = "jdbc:mysql://127.0.0.1:3306/talonario";
    private final String driver = "com.mysql.cj.jdbc.Driver";
    private Connection con = null;

    public Connection getConexion() throws SQLException {
        try {
            Class.forName(driver);
            con = DriverManager.getConnection(this.url, this.user, this.password);
            System.out.println("Conexion exitosa");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }
        return con;
    }

    public void close() {
        try {
            if (con != null) {
                con.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(ConexionMySql.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}