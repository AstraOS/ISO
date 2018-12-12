package org.Iteracion3GestionarMesas;

public class Platos {

	private int idPlato;
	private boolean disponible;
	private String nombre;

	public int getIdPlato() {
		return this.idPlato;
	}

	/**
	 * 
	 * @param idPlato
	 */
	public void setIdPlato(int idPlato) {
		this.idPlato = idPlato;
	}

	public boolean getDisponible() {
		return this.disponible;
	}

	/**
	 * 
	 * @param disponible
	 */
	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
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

	/**
	 * 
	 * @param idPlato
	 * @param disponible
	 * @param nombre
	 */
	public Platos(int idPlato, boolean disponible, String nombre) {
		// TODO - implement Platos.Platos
		this.idPlato = idPlato;
		this.disponible = disponible;
		this.nombre = nombre;
	}

}