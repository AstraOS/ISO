package org.Iteracion2GestionarSala;

public class Camarero {

	protected int id;
	protected String nombre;
	protected String turno;
	protected String telefono;
	
	public Camarero(int id, String nombre, String turno, String telefono) {
		
		this.id=id;
		this.nombre=nombre;
		this.turno=turno;
		this.telefono=telefono;
	}

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

	public String getTelefono() {
		return this.telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

}