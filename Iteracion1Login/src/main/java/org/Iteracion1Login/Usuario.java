package org.Iteracion1Login;

public class Usuario {
	
	private String nombre;
	private String pass;
	
	public Usuario(String nombre, String pass) {
		super();
		this.nombre = nombre;
		this.pass = pass;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.nombre + " "+ this.pass;
	}

	

}
