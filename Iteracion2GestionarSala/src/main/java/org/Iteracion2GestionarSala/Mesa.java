package org.Iteracion2GestionarSala;

import java.util.ArrayList;

public class Mesa {

	private int Id;
	String e = "";
	ArrayList <Turno> turnos;
	
	public Mesa(int Id, boolean estado) {
		this.Id=Id;
		this.turnos=new ArrayList<Turno>();
		
		for (int i = 0; i <3 ; i++) {
			turnos.add(new TurnoComida(i,false));
			
		}
		
		for(int i=3;i<6;i++) {
			turnos.add(new TurnoCena(i,false));
		}
	}
	

	public int getId() {
		return this.Id;
	}

	/**
	 * 
	 * @param Id
	 */
	public void setId(int Id) {
<<<<<<< HEAD
		// TODO - implement Mesa.setId
		this.Id = Id;
	}

	public String getEstado() {
		if (!this.estado)
			e = "libre";
		else
			e = "ocupado";
		return this.e;
=======
		this.Id=Id;
	}

	public ArrayList<Turno> getTurnos() {
		return turnos;
>>>>>>> 717e8e7c56537ea50e05d7d333a1de385e4ac07e
	}


<<<<<<< HEAD
	/**
	 * 
	 * @param Id
	 * @param estado
	 */
	public Mesa(int Id, boolean estado) {
		this.Id = Id;
		this.estado = estado;

	}

=======
	public void setTurnos(ArrayList<Turno> turnos) {
		this.turnos = turnos;
	}


	
>>>>>>> 717e8e7c56537ea50e05d7d333a1de385e4ac07e
	public String toString() {
		return "MESA " + this.Id;
	}

}