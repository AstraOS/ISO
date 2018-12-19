package org.Iteracion1Login;

public class Usuario {

   private String nombre;
   private String pass;

    public Usuario(final String nombre, final String pass) {
        super();
        this.nombre = nombre;
        this.pass = pass;
    }

    public final String getNombre() {
        return nombre;
    }

    public final void setNombre(final String nombre) {
        this.nombre = nombre;
    }

    public final String getPass() {
        return pass;
    }

    public final void setPass(final String pass) {
        this.pass = pass;
    }

    @Override
    public final String toString() {
        // TODO Auto-generated method stub
        return this.nombre + " " + this.pass;
    }

}
