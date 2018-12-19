package org.Iteracion2GestionarSala;

import java.util.ArrayList;

/**
 * @author adrii_das
 *
 */
public class Mesa {

    /**
     *
     */
    private int id;
    /**
     *
     */
    private final String e = "";
    /**
     *
     */
    private ArrayList<Turno> turnos;

    /**
     * @param id
     */
    public Mesa(final int id) {
        this.id = id;
        this.turnos = new ArrayList<Turno>();

        for (int i = 0; i < 3; i++) {
            turnos.add(new TurnoComida(i, false));

        }

        for (int i = 3; i < 6; i++) {
            turnos.add(new TurnoCena(i, false));
        }
    }

    /**
     * @return
     */
    public final int getId() {
        return this.id;
    }

    /**
     * @param id
     */
    public final void setId(final int id) {
        this.id = id;
    }

    /**
     * @return
     */
    public final ArrayList<Turno> getTurnos() {
        return turnos;
    }

    /**
     * @param turnos
     */
    public final void setTurnos(final ArrayList<Turno> turnos) {
        this.turnos = turnos;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    public final String toString() {
        return "MESA " + this.id;
    }

}
