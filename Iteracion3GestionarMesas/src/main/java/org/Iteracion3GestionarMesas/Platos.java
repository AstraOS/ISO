package org.Iteracion3GestionarMesas;

/**
 * @author adrii_das
 *
 */
public class Platos {

    /**
     *
     */
    private int idPlato;
    /**
     *
     */
    private boolean disponible;
    /**
     *
     */
    private String nombre;

    /**
     * @return
     */
    public final int getIdPlato() {
        return this.idPlato;
    }

    /**
     * @param idPlato
     */
    public final void setIdPlato(final int idPlato) {
        this.idPlato = idPlato;
    }

    /**
     * @return
     */
    public final boolean getDisponible() {
        return this.disponible;
    }

    /**
     * @param disponible
     */
    public final void setDisponible(final boolean disponible) {
        this.disponible = disponible;
    }

    /**
     * @return
     */
    public final String getNombre() {
        return this.nombre;
    }

    /**
     * @param nombre
     */
    public final void setNombre(final String nombre) {
        this.nombre = nombre;
    }

    /**
     * @param idPlato
     * @param disponible
     * @param nombre
     */
    public Platos(final int idPlato, final boolean disponible,
            final String nombre) {
        // TODO - implement Platos.Platos
        this.idPlato = idPlato;
        this.disponible = disponible;
        this.nombre = nombre;
    }

}
