package org.Iteracion3GestionarMesas;

public class Comanda {

	private int idComanda;
	private int nPlatos;
	private int nBedidas;
	private String nombreCamarero;

	public int getIdComanda() {
		return this.idComanda;
	}

	
	public void setIdComanda(int idComanda) {
		this.idComanda = idComanda;
	}

	public int getNPlatos() {
		return this.nPlatos;
	}

	
	public void setNPlatos(int nPlatos) {
		this.nPlatos = nPlatos;
	}

	public int getNBedidas() {
		return this.nBedidas;
	}

	
	public void setNBedidas(int nBedidas) {
		this.nBedidas = nBedidas;
	}

	public String getNombreCamarero() {
		return this.nombreCamarero;
	}

	
	public void setNombreCamarero(String nombreCamarero) {
		this.nombreCamarero = nombreCamarero;
	}

	
	public Comanda(int idComanda, int nPlatos, int nBebidas, String nombreCamarero) {
		// TODO - implement Comanda.Comanda
		throw new UnsupportedOperationException();
	}

}