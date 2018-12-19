package org.Iteracion3GestionarMesas;

/**
 * @author adrii_das
 *
 */
public class Ingrediente {

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
    private int unidades;

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
    public final int getUnidades() {
        return this.unidades;
    }

    /**
     * @param unidades
     */
    public final void setUnidades(final int unidades) {
        this.unidades = unidades;
    }

    /**
     * @param unidades
     * @param id
     * @param nombre
     */
    public Ingrediente(final int unidades, final int id, final String nombre) {
        // TODO - implement Ingrediente.Ingrediente
        this.unidades = unidades;
        this.id = id;
        this.nombre = nombre;
    }

}
