package org.Iteracion2GestionarSala;

public class TurnoComida extends Turno {

	public TurnoComida(int id, boolean ocupado) {
		super(id, ocupado);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + (this.id+1)+ " de comida";
	}

}
