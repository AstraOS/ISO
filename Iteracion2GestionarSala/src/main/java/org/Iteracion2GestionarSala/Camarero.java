package org.Iteracion2GestionarSala;

public class Camarero {

	protected int id;
	protected String nombre;
	protected String turno;
	protected long telefono;

	public int getId() {
		return this.id;
		
	}

	
	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return this.nombre;
	}

	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTurno() {
		return this.turno;
	}

	
	public void setTurno(String turno) {
		this.turno = turno;
	}

	public long getTelefono() {
		return this.telefono;
	}

	public void setTelefono(long telefono) {
		this.telefono = telefono;
	}


	public Camarero(String turno, long telefono, int id, String nombre) {
		// TODO - implement Camarero.Camarero
		throw new UnsupportedOperationException();
	}

}