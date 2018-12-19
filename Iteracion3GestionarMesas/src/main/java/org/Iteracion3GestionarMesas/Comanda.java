package org.Iteracion3GestionarMesas;

/**
 * @author adrii_das
 *
 */
public class Comanda {

    /**
     *
     */
    private int idComanda;
    /**
     *
     */
    private int nPlatos;
    /**
     *
     */
    private int nBedidas;
    /**
     *
     */
    private String nombreCamarero;

    /**
     * @return
     */
    public final int getIdComanda() {
        return this.idComanda;
    }

    /**
     * @param idComanda
     */
    public final void setIdComanda(final int idComanda) {
        this.idComanda = idComanda;
    }

    /**
     * @return
     */
    public final int getNPlatos() {
        return this.nPlatos;
    }

    /**
     * @param nPlatos
     */
    public final void setNPlatos(final int nPlatos) {
        this.nPlatos = nPlatos;
    }

    /**
     * @return
     */
    public final int getNBedidas() {
        return this.nBedidas;
    }

    /**
     * @param nBedidas
     */
    public final void setNBedidas(final int nBedidas) {
        this.nBedidas = nBedidas;
    }

    /**
     * @return
     */
    public final String getNombreCamarero() {
        return this.nombreCamarero;
    }

    /**
     * @param nombreCamarero
     */
    public final void setNombreCamarero(final String nombreCamarero) {
        this.nombreCamarero = nombreCamarero;
    }

    /**
     * @param idComanda
     * @param nPlatos
     * @param nBebidas
     * @param nombreCamarero
     */
    public Comanda(final int idComanda, final int nPlatos, final int nBebidas,
            final String nombreCamarero) {
        // TODO - implement Comanda.Comanda
        this.idComanda = idComanda;
        this.nPlatos = nPlatos;
        this.nBedidas = nBebidas;
        this.nombreCamarero = nombreCamarero;
    }

}
