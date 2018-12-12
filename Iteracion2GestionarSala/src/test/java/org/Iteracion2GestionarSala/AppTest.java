package org.Iteracion2GestionarSala;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase {

	Camarero camarero = new Camarero("rg", 0, 0, "x");
	Mesa m = new Mesa(1, false);

	/**
	 * Create the test case
	 *
	 * @param testName
	 *            name of the test case
	 */
	public AppTest(String testName) {
		super(testName);
	}

	public void testApp() {
		assertTrue(true);
	}

	public void TestCamareroBase() {
		camarero.setId(2);
		camarero.setTurno("primero");
		camarero.setNombre("Juan");
		camarero.setTelefono(88);
		assertEquals(camarero.getId(), 2);
		assertEquals(camarero.getTurno(), "primero");
		assertEquals(camarero.getNombre(), "Juan");
		assertEquals(camarero.getTelefono(), 88);
	}

	public void testMesa() {
		m.setEstado(true);
		m.setId(2);
		assertEquals(m.getEstado(), "ocupado");
		assertEquals(m.getId(), 2);
		assertEquals(m.toString(), "MESA 2");
	}
}
