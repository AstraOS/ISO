package DOMINIO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import PERSISTENCIA.Agente;

public class GestorUsuarios {
	public static ArrayList <Usuario> listaUsuarios=new ArrayList<Usuario>();
	public static Agente conexion = new Agente();

	public GestorUsuarios() {
		super();
	}

	public void leerUsuarios() throws SQLException {

		try {
			conexion.conectar();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		ResultSet resultado = conexion.Consultar("Select * from usuarios");

		while (resultado.next()) {
			Usuario u=new Usuario(resultado.getString("nombre"),resultado.getString("password"));
			listaUsuarios.add(u);
		}
	}

	public boolean comprobarUsuarioIntroducido(Usuario u) {
		
		boolean encontrado = false;
		for (int i = 0; i < listaUsuarios.size() && !encontrado; i++) {
			if (listaUsuarios.get(i).getNombre().equals(u.getNombre()) && listaUsuarios.get(i).getPass().equals(u.getPass())) {
				encontrado = true;
			}
		}
		return encontrado;
	}

}
