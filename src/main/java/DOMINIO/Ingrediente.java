package DOMINIO;

public class Ingrediente {

	private int id;
	private String nombre;
	private int unidades;

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

	public int getUnidades() {
		return this.unidades;
	}

	/**
	 * 
	 * @param unidades
	 */
	public void setUnidades(int unidades) {
		this.unidades = unidades;
	}

	/**
	 * 
	 * @param unidades
	 * @param id
	 * @param nombre
	 */
	public Ingrediente(int unidades, int id, String nombre) {
		// TODO - implement Ingrediente.Ingrediente
		throw new UnsupportedOperationException();
	}

}