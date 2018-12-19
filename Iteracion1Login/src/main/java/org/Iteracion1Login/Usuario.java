package org.Iteracion1Login;

/**
 * @author adrii_das
 *
 */
public class Usuario {

   /**
 *
 */
private String nombre;
   /**
 *
 */
private String pass;

    /**
     * @param nombre
     * @param pass
     */
    public Usuario(final String nombre, final String pass) {
        super();
        this.nombre = nombre;
        this.pass = pass;
    }

    /**
     * @return
     */
    public final String getNombre() {
        return nombre;
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
    public final String getPass() {
        return pass;
    }

    /**
     * @param pass
     */
    public final void setPass(final String pass) {
        this.pass = pass;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public final String toString() {
        // TODO Auto-generated method stub
        return this.nombre + " " + this.pass;
    }

}
