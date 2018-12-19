package org.Iteracion3GestionarMesas;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import junit.framework.TestCase;


public class TestGestionarMesas extends TestCase {
	private GestorCamareros gc ;
	private Ingrediente t ;
	private Platos p ;
	private Mesa mesa;
	private Comanda comanda;
	
	@Before
	protected void setUp() throws Exception {
		gc = new GestorCamareros();
		t = new Ingrediente(1, 1, "patatas");
		p = new Platos(1, true, "Patatas con alioli");
		mesa = new Mesa(1, true);
		comanda = new Comanda(1, 1, 1, "Pedro");
		
	}

	@After
	protected void tearDown() throws Exception {
		super.tearDown();
	}

	@Test
	public void testDisponibilidadPlatoCorrecto() {
		assertEquals(true, gc.disponibilidadPlatos(p));
	}

	@Test
	public void testSeleccionarNumeroMesaCorrecto() {
		assertEquals(1, gc.seleccionarNumeroMesa(mesa));
	}

	@Test
	public void testValidarFactibilidadComidaCorrecto() {
		assertEquals(true, gc.validarFactibilidadComida(p, t));
	}

	@Test
	public void testDarPorCerradoMenuCorrecto() {
		assertEquals(true, gc.darPorCerradoMenu(comanda));
	}

	@Test
	public void testImprimirCuentaCorrecto() {
		assertEquals(true, gc.imprimirCuenta(comanda));
	}

	@Test
	public void testAnotarCamandaCorrecto() {
		assertEquals(true, gc.anotarCamanda(comanda));
	}

	@Test
	public void testGestionarMesasCorrecto() {
		assertEquals(1, gc.gestionarMesas(mesa));
	}
}