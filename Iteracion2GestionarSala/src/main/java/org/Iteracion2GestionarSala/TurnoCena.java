package org.Iteracion2GestionarSala;

public class TurnoCena extends Turno {

	public TurnoCena(int id, boolean ocupado) {
		super(id, ocupado);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+(this.id-2)+" de cena";
	}
}
