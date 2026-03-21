package TalonarioConsola.services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLClientInfoException;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import TalonarioConsola.conexion.ConexionMySql;
import TalonarioConsola.model.Talonario;

public class TalonarioServiceImpl implements ITalonarioService{

	
	//Comando Lista
	List<Talonario> talonarios = null;

	public TalonarioServiceImpl() {
		talonarios = new LinkedList<>();
	}
	@Override
	public boolean guardar(Talonario talonario) {
		boolean hecho = false;
		ConexionMySql conexion = new ConexionMySql();
		Connection con = null;
		PreparedStatement ps;
		String slq "INSERT INTO estudiante(carnet,nombres,apellidos) values(?,?,?)";
		try{
			con = conexion.getConexion();
			ps = con.prepareStatement(slq);
			ps.setString(1, talonario.getCarnet());

		} finally {
			try{
				con.close();
				catch (SQLException e){
					e.printStackTrace();
				}
			}
			return hecho
		}
		
		talonarios.add(talonario);
		return true;
		
	}
	@Override
	public Talonario recuperar(Talonario talonario) {
		Talonario tal = new Talonario();
		return tal;
	}

	@Override
	public void eliminar(Talonario talonario) {
		// TODO Auto-generated method stub
		
	}
	@Override 
	public void modificar(Talonario talonario) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public List<Talonario> recuperarTalonarios() {
		// TODO Auto-generated method stub
		List<Talonario>talonarios 
		return talonarios;
	}
}
