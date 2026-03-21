package TalonarioConsola;

import java.sql.Connection;
import TalonarioConsola.conexion.ConexionMySql;
import TalonarioConsola.model.Talonario;
import TalonarioConsola.services.TalonarioServiceImpl;

public class TalonarioConsola{

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

        Talonario talonario = new Talonario();
        talonario.setId(1);
        talonario.setCarnet("MU100224");
        talonario.setDescripcion("Matricula, Cuota 1");
        talonario.setFecha("10-01-2026");
        talonario.setEstado("A");

        talonario.guardar(talonario);
    }
}