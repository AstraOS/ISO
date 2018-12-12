package org.Iteracion3GestionarMesas;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase {
	Comanda c = new Comanda(1, 2, 8, "Juan");
	Mesa m = new Mesa(1, false);
	Platos p = new Platos(1, true, "patatas");
	Ingrediente i = new Ingrediente(8, 1, "patata");

	/**
	 * Create the test case
	 *
	 * @param testName
	 *            name of the test case
	 */
	public AppTest(String testName) {
		super(testName);
	}

	/**
	 * @return the suite of tests being tested
	 */
	public static Test suite() {
		return new TestSuite(AppTest.class);
	}

	/**
	 * Rigourous Test :-)
	 */
	public void testApp() {
		assertTrue(true);
	}

	public void testComanda() {
		c.setIdComanda(2);
		c.setNPlatos(4);
		c.setNBebidas(16);
		c.setNombreCamarero("Paco");
		assertEquals(c.getIdComanda(), 2);
		assertEquals(c.getNPlatos(), 4);
		assertEquals(c.getNBedidas(), 16);
		assertEquals(c.getNombreCamarero(), "Paco");
	}

	public void testIngrediente() {
		i.setId(2);
		i.setUnidades(16);
		i.setNombre("coliflor");
		assertEquals(i.getId(), 2);
		assertEquals(i.getUnidades(), 16);
		assertEquals(i.getNombre(), "coliflor");
	}

	public void testMesa() {
		m.setEstado(true);
		m.setId(2);
		assertEquals(m.getEstado(), "ocupado");
		assertEquals(m.getId(), 2);
		assertEquals(m.toString(), "MESA 2");
	}

	public void testPlato() {
		p.setDisponible(false);
		p.setIdPlato(2);
		p.setNombre("coliflores");
		assertEquals(p.getDisponible(), false);
		assertEquals(p.getIdPlato(), 2);
		assertEquals(p.getNombre(), "coliflores");
	}
}
