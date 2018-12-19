package org.Iteracion2GestionarSala;

/**
 * @author adrii_das
 *
 */
public class Camarero {

    private int id;
    private String nombre;
    private String turno;
    private String telefono;

    public Camarero(final int id, final String nombre, 
            final String turno, final String telefono) {

        this.id = id;
        this.nombre = nombre;
        this.turno = turno;
        this.telefono = telefono;
    }

    public final int getId() {
        return this.id;

    }

    public final void setId(final int id) {
        this.id = id;
    }

    public final String getNombre() {
        return this.nombre;
    }

    public final void setNombre(final String nombre) {
        this.nombre = nombre;
    }

    public final String getTurno() {
        return this.turno;
    }

    public final void setTurno(final String turno) {
        this.turno = turno;
    }

    public final String getTelefono() {
        return this.telefono;
    }

    public final void setTelefono(final String telefono) {
        this.telefono = telefono;
    }

}
