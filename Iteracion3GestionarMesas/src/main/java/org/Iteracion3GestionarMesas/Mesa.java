package org.Iteracion3GestionarMesas;

public class Mesa {

	private int Id;
	private boolean estado;
	String e = "";

	public int getId() {
		return this.Id;
	}

	/**
	 * 
	 * @param Id
	 */
	public void setId(int Id) {
		this.Id = Id;
	}

	public String getEstado() {
		if (!this.estado)
			e = "libre";
		else
			e = "ocupado";
		return this.e;
	}

	/**
	 * 
	 * @param estado
	 */
	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	/**
	 * 
	 * @param Id
	 * @param estado
	 */
	public Mesa(int Id, boolean estado) {
		this.Id = Id;
		this.estado = estado;
	}

	public String toString() {
		return "MESA " + this.Id;
	}

}