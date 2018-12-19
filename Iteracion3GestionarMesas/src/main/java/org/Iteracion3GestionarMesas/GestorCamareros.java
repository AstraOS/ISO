package org.Iteracion3GestionarMesas;

/**
 * @author adrii_das
 *
 */
public class GestorCamareros {

    /**
     *
     */
    private Mesa mesa = new Mesa(1, true);
    /**
     *
     */
    private Comanda comanda = new Comanda(1, 1, 1, "Pedro");

    /**
     * @param mesa
     * @return
     */
    public final int gestionarMesas(final Mesa mesa) {
        return mesa.getId();
    }

    /**
     * 
     */
    public GestorCamareros() {

        // TODO Auto-generated constructor stub
    }

    /**
     * @param mesa
     * @return
     */
    public final boolean secuenciarEstados(final Mesa mesa) {
        // TODO - implement GestorCamareros.SecuenciarEstados
        throw new UnsupportedOperationException();
    }

    /**
     * @param mesa
     * @return
     */
    public final int seleccionarNumeroMesa(final Mesa mesa) {
        return mesa.getId();
    }

    /**
     * @param plato
     * @param ingredientes
     * @return
     */
    public final boolean validarFactibilidadComida(final Platos plato,
            final Ingrediente ingredientes) {
        boolean disponible = true;
        return disponible;
    }

    /**
     * @param comanda
     * @return
     */
    public final boolean darPorCerradoMenu(final Comanda comanda) {
        boolean cerrado = true;
        return cerrado;
    }

    /**
     * @param comanda
     * @return
     */
    public final boolean imprimirCuenta(final Comanda comanda) {
        boolean cerrado = true;
        return cerrado;
    }

    /**
     * @param plato
     * @return
     */
    public final boolean disponibilidadPlatos(final Platos plato) {
        boolean disponible = true;
        return disponible;
    }

    /**
     * @param com
     * @return
     */
    public final boolean anotarCamanda(final Comanda com) {
        boolean cerrado = true;
        return cerrado;
    }

}
