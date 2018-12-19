package org.Iteracion3GestionarMesas;

import org.Iteracion4ActualizarBDAlmacen.GestorAlmacen;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;

/**
 * Unit test for simple App.
 */
public class TestActualizarAlmacen extends TestCase {
	private GestorAlmacen ga;
	
	@Before
	protected void setUp() throws Exception {
		ga=new GestorAlmacen(10);
	}

	@After
	protected void tearDown() throws Exception {
		super.tearDown();
	}

	@Test
	public void testGestorAlmacenCorrecto() {

		assertEquals(10, ga.getNStockAlmacen());

	}

	@Test
	public void testActualizar() {
		assertEquals(true, ga.actualizarAlmacen());

	}
}
