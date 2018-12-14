package org.Iteracion5ActualizarStock;

public class Ingrediente {

	private int id;
	private String nombre;
	private int unidades;

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

	public int getUnidades() {
		return this.unidades;
	}

	
	public void setUnidades(int unidades) {
		this.unidades = unidades;
	}

	
	public Ingrediente(int unidades, int id, String nombre) {
		this.unidades=unidades;
		this.id=id;
		this.nombre=nombre;
	}

}