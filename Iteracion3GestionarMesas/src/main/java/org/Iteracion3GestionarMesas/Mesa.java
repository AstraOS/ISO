package org.Iteracion3GestionarMesas;


public class Mesa {

	private int Id;
	private boolean estado;
	String e = "";

	public int getId() {
		return this.Id;
	}

	
	public void setId(int Id) {
		// TODO - implement Mesa.setId
		throw new UnsupportedOperationException();
	}

	public String getEstado() {
		if(!this.estado)
			e="libre";
		else
			e="ocupado";
		return this.e;
	}

	
	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	
	public Mesa(int Id, boolean estado) {
		this.Id=Id;
		this.estado=estado;
	}
	
	public String toString() {
		return "MESA "+this.Id;
	}

}