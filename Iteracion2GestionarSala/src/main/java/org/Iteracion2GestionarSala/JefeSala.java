package org.Iteracion2GestionarSala;

public class JefeSala {

	private int id;
	private String nombre;
	private String turno;
	private long telefono;

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


	public JefeSala(int id, String nombre, String turno, long telefono) {
		this.id=id;
		this.nombre=nombre;
		this.turno=turno;
		this.telefono=telefono;
	}

}