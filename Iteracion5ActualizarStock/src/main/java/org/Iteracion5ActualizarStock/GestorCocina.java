package org.Iteracion5ActualizarStock;

/**
 * @author adrii_das
 *
 */
public class GestorCocina {

    /**
     *
     */
    private int nIngredientes;

    /**
     * @param nIngredientes
     */
    public GestorCocina(final int nIngredientes) {
        super();
        this.nIngredientes = nIngredientes;
    }

    /**
     * @return
     */
    public final int getNIngredientes() {
        return this.nIngredientes;
    }

    /**
     * @param nIngredientes
     */
    public final void setNIngredientes(final int nIngredientes) {
        this.nIngredientes = nIngredientes;
    }

    /**
     * @param ingrediente
     * @return
     */
    public final boolean actualizarIngredientes(final Ingrediente ingrediente) {
        return true;
    }

}
