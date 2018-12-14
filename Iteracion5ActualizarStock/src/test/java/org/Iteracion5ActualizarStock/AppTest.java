package org.Iteracion5ActualizarStock;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase{
	
	Ingrediente ing = new Ingrediente(1, 1, "Cebolla");
	GestorCocina gc = new GestorCocina(ing.getUnidades());
	
	public void testActualizarIngredientesCorrecto() {	
		assertEquals(true, gc.actualizarIngredientes(ing));
	}
	
	public void testComprobarUnidadesCorrecto() {
		assertEquals(1, gc.getNIngredientes());
	}
    
}
