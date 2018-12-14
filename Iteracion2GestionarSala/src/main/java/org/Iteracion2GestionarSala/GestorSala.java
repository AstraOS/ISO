package org.Iteracion2GestionarSala;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.Iteracion0ConectarBD.Agente;


public class GestorSala {

	public ArrayList <Mesa> listaMesas=new ArrayList<Mesa>();
	public Agente conexion = new Agente();
	
	public GestorSala() {
		try {
			leerMesas();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	public ArrayList<Mesa> getListaMesas() {
		return listaMesas;
	}

	public void setListaMesas(ArrayList<Mesa> listaMesas) {
		this.listaMesas = listaMesas;
	}


	
	public void leerMesas() throws SQLException {
		boolean estado = false;
		try {
			conexion.conectar();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		ResultSet resultado = conexion.Consultar("Select * from mesas");

		while (resultado.next()) {
			if(resultado.getInt("estado")==0) {
				estado = false;
			}else {
				estado = true;
			}
			Mesa mesa=new Mesa(resultado.getInt("id"),estado);
			listaMesas.add(mesa);
		}
		
	
		
	}
	
	public boolean MarcaMesaOcupada(Mesa Mesa) {
		// TODO - implement GestorSala.MarcaMesaOcupada
		throw new UnsupportedOperationException();
	}

	
	public void AsignarCamarero(Mesa Mesa, CamareroMesa cam) {
		// TODO - implement GestorSala.AsignarCamarero
		throw new UnsupportedOperationException();
	}

}