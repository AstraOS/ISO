package org.Iteracion3GestionarMesas;


public class GestorCamareros {

  
  Mesa mesa = new Mesa(1, true);
  Comanda comanda = new Comanda(1, 1, 1, "Pedro");

  
  public int GestionarMesas(Mesa mesa ) {
    return mesa.getId();
  }

  public GestorCamareros() {
    
    // TODO Auto-generated constructor stub
  }

 
  public boolean SecuenciarEstados(Mesa mesa) {
    // TODO - implement GestorCamareros.SecuenciarEstados
    throw new UnsupportedOperationException();
  }

 
  public int SeleccionarNumeroMesa(Mesa mesa) {
    return mesa.getId();
  }

 
  public boolean ValidarFactibilidadComida(Platos plato , Ingrediente Ingredientes) {
    boolean disponible = true;
    return disponible;
  }

  
  public boolean DarPorCerradoMenu(Comanda comanda) {
    boolean cerrado = true;
    return cerrado;
  }

 
  public boolean ImprimirCuenta(Comanda comanda) {
    boolean cerrado = true;
    return cerrado;
  }

 
  public boolean DisponibilidadPlatos(Platos plato ) {
    boolean disponible = true;
    return disponible;
  }

 
  public boolean AnotarCamanda(Comanda com) {
    boolean cerrado = true;
    return cerrado;
  }

}