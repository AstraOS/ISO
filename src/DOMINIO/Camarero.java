package DOMINIO;

public class Camarero {

	protected int id;
	protected String nombre;
	protected String turno;
	protected long telefono;

	public int getId() {
		return this.id;
	}

	/**
	 * 
	 * @param id
	 */
	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return this.nombre;
	}

	/**
	 * 
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTurno() {
		return this.turno;
	}

	/**
	 * 
	 * @param turno
	 */
	public void setTurno(String turno) {
		this.turno = turno;
	}

	public long getTelefono() {
		return this.telefono;
	}

	/**
	 * 
	 * @param telefono
	 */
	public void setTelefono(long telefono) {
		this.telefono = telefono;
	}

	/**
	 * 
	 * @param turno
	 * @param telefono
	 * @param id
	 * @param nombre
	 */
	public Camarero(String turno, long telefono, int id, String nombre) {
		// TODO - implement Camarero.Camarero
		throw new UnsupportedOperationException();
	}

}