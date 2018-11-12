package DOMINIO;

public class CamareroBarra extends Camarero {

	/**
	 * 
	 * @param id
	 * @param nombre
	 * @param turno
	 * @param telefono
	 */
	public CamareroBarra(int id, String nombre, String turno, long telefono) {
		super(turno, telefono, id, turno);
		throw new UnsupportedOperationException();
	}

}