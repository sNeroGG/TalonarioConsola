package TalonarioConsola.services;

import java.util.List;

import TalonarioConsola.model.Talonario;

public interface ITalonarioService {
	public boolean guardar(Talonario talonario);
	public Talonario recuperar(Talonario talonario); //Recuperar talonario en base al objeto dentro del objeto esta el carnet
	public List<Talonario> recuperarTalonarios();
	public void modificar(Talonario talonario);
	public void eliminar(Talonario talonario);
	
}
