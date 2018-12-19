package org.Iteracion2GestionarSala;

/**
 * @author adrii_das
 *
 */
public class Turno {

    /**
     *
     */
    private int id;
    /**
     *
     */
    private boolean ocupado;
    /**
     *
     */
    private String estado;

    /**
     * @return
     */
    public final String getEstado() {
        return estado;
    }

    /**
     * @param estado
     */
    public final void setEstado(final String estado) {
        this.estado = estado;
    }

    /**
     * @param id
     * @param turno
     */
    public Turno(final int id, final boolean turno) {
        this.setId(id);
        this.setOcupado(ocupado);
        if (this.ocupado) {
            estado = "Ocupado";
        } else {
            estado = "Libre";
        }
    }

    /**
     * @return
     */
    public final int getId() {
        return id;
    }

    /**
     * @param id
     */
    public final void setId(final int id) {
        this.id = id;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "TURNO ";
    }

    /**
     * @return
     */
    public final boolean isOcupado() {
        return ocupado;
    }

    /**
     * @param ocupado
     */
    public final void setOcupado(final boolean ocupado) {
        this.ocupado = ocupado;
    }
}
