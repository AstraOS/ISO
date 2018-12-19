package org.Iteracion2GestionarSala;

/**
 * @author adrii_das
 *
 */
public class JefeSala {

    /**
     *
     */
    private int id;
    /**
     *
     */
    private String nombre;
    /**
     *
     */
    private String turno;
    /**
     *
     */
    private long telefono;

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
     * @return
     */
    public final String getTurno() {
        return this.turno;
    }

    /**
     * @param turno
     */
    public final void setTurno(final String turno) {
        this.turno = turno;
    }

    /**
     * @return
     */
    public final long getTelefono() {
        return this.telefono;
    }

    /**
     * @param telefono
     */
    public final void setTelefono(final long telefono) {
        this.telefono = telefono;
    }

    /**
     * @param id
     * @param nombre
     * @param turno
     * @param telefono
     */
    public JefeSala(final int id, final String nombre,
            final String turno, final long telefono) {
        this.id = id;
        this.nombre = nombre;
        this.turno = turno;
        this.telefono = telefono;
    }

}
