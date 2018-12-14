package org.Iteracion5ActualizarStock;

import org.junit.Test;

import junit.framework.TestCase;


/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase{
	
	Ingrediente ing = new Ingrediente(1, 1, "Cebolla");
	GestorCocina gc = new GestorCocina(ing.getUnidades());
	
	@Test
	public void testActualizarIngredientesCorrecto() {	
		assertEquals(true, gc.actualizarIngredientes(ing));
	}
	@Test
	public void testComprobarUnidadesCorrecto() {
		assertEquals(1, gc.getNIngredientes());
	}
	
	
    
}
