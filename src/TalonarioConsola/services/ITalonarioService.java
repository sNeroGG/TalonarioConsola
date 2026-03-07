package TalonarioConsola.services;

import TalonarioConsola.model.Talonario;

public interface ITalonarioService {
	public void guardar(Talonario talonario);
	public Talonario recuperar(Talonario talonario); //Recuperar talonario en base al objeto dentro del objeto esta el carnet
	public void modificar(Talonario talonario);
	public void eliminar(Talonario talonario);
	
}
