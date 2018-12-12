package org.Iteracion2GestionarSala;

public class Turno {
	
	protected int id;
	protected boolean ocupado;
	String estado;
	
	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Turno(int id, boolean turno) {
		this.setId(id);
		this.setOcupado(ocupado);
		if(this.ocupado)
			estado="Ocupado";
		else
			estado="Libre";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
	
		return "TURNO ";
	}

	public boolean isOcupado() {
		return ocupado;
	}

	public void setOcupado(boolean ocupado) {
		this.ocupado = ocupado;
	}
}
