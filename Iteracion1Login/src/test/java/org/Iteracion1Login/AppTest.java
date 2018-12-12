package org.Iteracion1Login;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase {

	Usuario h = new Usuario("admin", "admin");
	Usuario uC = new Usuario("Santa", "Claus");
	GestorUsuarios g = new GestorUsuarios();

	// Tabien eiste after, que seria lo contrario, se usa para devolver csosas a su
	// estdo original.

	/**
	 * Create the test case
	 *
	 * @param testName
	 *            name of the test case
	 */
	public AppTest(String testName) {
		super(testName);
	}

	public void testGestorUsuarioCorrecto() {
		h.setNombre("admin");
		h.setPass("admin");
		//assertEquals(g.comprobarUsuarioIntroducido(h), true);
	}

	public void testUsuario() {
		uC.setNombre("Pato");
		uC.setPass("donald");
		assertEquals(uC.getPass(), "donald");
		assertEquals(uC.getNombre(), "Pato");
		assertEquals(uC.toString(), "Pato donald");
	}

	public void testGestorUsuarioIncorrecto() {
		assertFalse(g.comprobarUsuarioIntroducido(uC));
	}
	//
}
