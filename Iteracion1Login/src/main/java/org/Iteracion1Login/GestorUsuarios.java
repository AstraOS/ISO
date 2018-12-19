package org.Iteracion1Login;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.Iteracion0ConectarBD.Agente;

/**
 * @author adrii_das
 *
 */
public class GestorUsuarios {
    private ArrayList<Usuario> listaUsuarios = new ArrayList<Usuario>();
    private Agente conexion = new Agente();

    public GestorUsuarios() {
        super();
    }

    public final void leerUsuarios() throws SQLException {

        try {
            conexion.conectar();
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        ResultSet resultado = conexion.consultar("Select * from usuarios");

        while (resultado.next()) {
            Usuario u = new Usuario(resultado.getString("nombre"),
                    resultado.getString("password"));
            getListaUsuarios().add(u);
        }
    }

    public final boolean comprobarUsuarioIntroducido(final Usuario u) {

        boolean encontrado = false;
        for (int i = 0; i < getListaUsuarios().size() && !encontrado; i++) {
            if (getListaUsuarios().get(i).
                    getNombre().equals(u.getNombre())
                    && getListaUsuarios().get(i).getPass().
                    equals(u.getPass())) {
                encontrado = true;
            }
        }
        return encontrado;
    }

    public final ArrayList<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    public final void setConexion(final Agente conexion) {
        this.conexion = conexion;
    }

}
