package DOMINIO;

public class JefeSala {

	private int id;
	private String nombre;
	private String turno;
	private long telefono;

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
	 * @param id
	 * @param nombre
	 * @param turno
	 * @param unidades
	 */
	public JefeSala(int id, String nombre, String turno, int unidades) {
		// TODO - implement JefeSala.JefeSala
		throw new UnsupportedOperationException();
	}

}