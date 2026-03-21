package TalonarioConsola.services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import TalonarioConsola.conexion.ConexionMySql;
import TalonarioConsola.model.Talonario;

public class TalonarioServiceImpl implements ITalonarioService{
	
	@Override
	public boolean guardar(Talonario talonario) {
		
		
	      boolean hecho = false;

	        ConexionMySql conexion = new ConexionMySql();
	        Connection con = null;
	        PreparedStatement ps;

	        String sql = "INSERT INTO talonario(carnet, descripcion, fecha, estado) VALUES (?,?,?,?)";

	        try {
	            con = conexion.getConexion();
	            ps = con.prepareStatement(sql);

	            ps.setString(1, talonario.getCarnet());
	            ps.setString(2, talonario.getDescripcion());
	            ps.setString(3, talonario.getFecha());
	            ps.setString(4, talonario.getEstado());

	            ps.execute();
	            hecho = true;

	        } catch (SQLException e) {
	            System.out.println(e);
	        } finally {
	            try {
	                con.close();
	            } catch (SQLException e) {
	                e.printStackTrace();
	            }
	        }

	        return hecho;
	    }

	@Override
	public Talonario recuperar(Talonario talonario) {
		// TODO Auto-generated method stub
		Talonario tal = new Talonario();
		return tal;
	}
	
	@Override
	public List<Talonario> recuperarTalonarios() {
		// TODO Auto-generated method stub
		List<Talonario> talonarios = null;
		return talonarios;
	}

			//Parte 2 del parcial 2 - Metodo de Modificar
	@Override
	public boolean modificar(Talonario talonario) {
		// TODO Auto-generated method stub
	      boolean hecho = false;

	        ConexionMySql conexion = new ConexionMySql();
	        Connection con = null;
	        PreparedStatement ps;

	        String sql = "UPDATE talonario SET descripcion =?, fecha=?, estado=? WHERE carnet = ?";

	        try {
	            con = conexion.getConexion();
	            ps = con.prepareStatement(sql);

	            ps.setString(1, talonario.getDescripcion());
	            ps.setString(2, talonario.getFecha());
	            ps.setString(3, talonario.getEstado());
				ps.setString(4, talonario.getCarnet());

	            hecho = ps.execute();
	            

	        } catch (SQLException e) {
	            System.out.println(e);
	        } finally {
	            try {
	                con.close();
	            } catch (SQLException e) {
	                e.printStackTrace();
	            }
	        }

	        return hecho;
	}

	@Override
	public boolean eliminar(Talonario talonario) {
		// TODO Auto-generated method stub
		return false;
	}





}