package TalonarioConsola;

import java.sql.Connection;
import TalonarioConsola.conexion.ConexionMySql;

public class TalonarioConsola {

    public static void main(String[] args) {

        ConexionMySql conexion = new ConexionMySql();
        Connection con = null;

        try {
            con = conexion.getConexion();

            if (con != null) {
                System.out.println("Conectado correctamente a MySQL");
            } else {
                System.out.println("No se pudo conectar");
            }

        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}