package org.Iteracion2GestionarSala;

import java.util.ArrayList;

public class Mesa {

	private int Id;
	String e = "";
	ArrayList <Turno> turnos;
	
	public Mesa(int Id) {
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

	
	public void setId(int Id) {
		this.Id=Id;
	}

	public ArrayList<Turno> getTurnos() {
		return turnos;
	}


	public void setTurnos(ArrayList<Turno> turnos) {
		this.turnos = turnos;
	}


	
	public String toString() {
		return "MESA "+this.Id;
	}



}