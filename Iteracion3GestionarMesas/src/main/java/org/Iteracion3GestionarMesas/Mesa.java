package org.Iteracion3GestionarMesas;

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
    private boolean estado;
    /**
     *
     */
    private String e = "";

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
        // TODO - implement Mesa.setId
        throw new UnsupportedOperationException();
    }

    /**
     * @return
     */
    public final String getEstado() {
        if (!this.estado) {
            e = "libre";
        } else {
            e = "ocupado";
        }
        return this.e;
    }

    /**
     * @param estado
     */
    public final void setEstado(final boolean estado) {
        this.estado = estado;
    }

    /**
     * @param id
     * @param estado
     */
    public Mesa(final int id, final boolean estado) {
        this.id = id;
        this.estado = estado;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    public final String toString() {
        return "MESA " + this.id;
    }

}
