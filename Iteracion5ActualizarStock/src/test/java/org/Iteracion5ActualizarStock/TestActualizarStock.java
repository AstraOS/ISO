package org.Iteracion5ActualizarStock;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;


public class TestActualizarStock extends TestCase{
	
	Ingrediente ing;
	GestorCocina gc;
	
	@Before
	protected void setUp() throws Exception {
		ing = new Ingrediente(1, 1, "Cebolla");
		gc = new GestorCocina(ing.getUnidades());
	}

	@After
	protected void tearDown() throws Exception {
		super.tearDown();
	}
	
	@Test
	public void testActualizarIngredientesCorrecto() {	
		assertEquals(true, gc.actualizarIngredientes(ing));
	}
	@Test
	public void testComprobarUnidadesCorrecto() {
		assertEquals(1, gc.getNIngredientes());
	}
	
	
    
}
