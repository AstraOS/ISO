package org.Iteracion5ActualizarStock;



public class GestorCocina {

	private int nIngredientes;

	
	
	public GestorCocina(int nIngredientes) {
		super();
		this.nIngredientes = nIngredientes;
	}

	public int getNIngredientes() {
		return this.nIngredientes;
	}

	/**
	 * 
	 * @param nIngredientes
	 */
	public void setNIngredientes(int nIngredientes) {
		this.nIngredientes = nIngredientes;
	}

	/**
	 * 
	 * @param Ingrediente
	 */
	public boolean actualizarIngredientes(Ingrediente ingrediente ) {
		return true;
	}

}