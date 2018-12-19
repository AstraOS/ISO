package org.Iteracion2GestionarSala;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.Iteracion0ConectarBD.Agente;

/**
 * @author adrii_das
 *
 */
public class GestorSala {

    public final ArrayList<Mesa> listaMesas = new ArrayList<Mesa>();
    public final Agente conexion = new Agente();

    public GestorSala() {

    }

    public final ArrayList<Mesa> getListaMesas() {
        return listaMesas;
    }

    public final void setListaMesas(final ArrayList<Mesa> listaMesas) {
        this.listaMesas = listaMesas;
    }

    public final void leerMesas() throws SQLException {
        boolean estado = false;
        try {
            conexion.conectar();
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        ResultSet resultado = conexion.consultar("Select * from mesas");

        while (resultado.next()) {
            if (resultado.getInt("estado") == 0) {
                estado = false;
            } else {
                estado = true;
            }
            Mesa mesa = new Mesa(resultado.getInt("id"));
            listaMesas.add(mesa);
        }
    }

    public final String asignarCamarero(final Mesa mesa, final CamareroMesa cam) {
        return mesa.getId() + "" + cam.getId();
    }

}
