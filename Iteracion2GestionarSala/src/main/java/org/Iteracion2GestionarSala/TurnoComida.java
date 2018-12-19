package org.Iteracion2GestionarSala;

/**
 * @author adrii_das
 *
 */
public class TurnoComida extends Turno {

    /**
     * @param id
     * @param ocupado
     */
    public TurnoComida(final int id, final boolean ocupado) {
        super(id, ocupado);
    }
    /* (non-Javadoc)
     * @see org.Iteracion2GestionarSala.Turno#toString()
     */
    @Override
    public final String toString() {
        return super.toString() + (this.getId() + 1) + " de comida";
    }

}
