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

    /**
     *
     */
    private ArrayList<Mesa> listaMesas = new ArrayList<Mesa>();
    /**
     *
     */
    private Agente conexion = new Agente();

    public GestorSala() {

    }

    /**
     * @return
     */
    public final ArrayList<Mesa> getListaMesas() {
        return listaMesas;
    }

    /**
     * @param listaMesas
     */
    public final void setListaMesas(final ArrayList<Mesa> listaMesas) {
        this.listaMesas = listaMesas;
    }

    /**
     * @throws SQLException
     */
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

    /**
     * @param mesa
     * @param cam
     * @return
     */
    public final String asignarCamarero(final
            Mesa mesa, final CamareroMesa cam) {
        return mesa.getId() + "" + cam.getId();
    }

}
