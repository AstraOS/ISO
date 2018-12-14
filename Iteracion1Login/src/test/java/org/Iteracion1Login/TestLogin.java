package org.Iteracion1Login;

import static org.junit.Assert.assertNotEquals;

import java.sql.SQLException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;

public class TestLogin extends TestCase {

	private Usuario u;
	private GestorUsuarios gu;
	private GestorUsuarios guFake;
	private Usuario userFake;

	@Before
	protected void setUp() throws Exception {
		u=new Usuario("admin","admin");
		gu=new GestorUsuarios();
		guFake=new GestorUsuarios();
		userFake=new Usuario("Ester", "Exposito");	
	}

	@After
	protected void tearDown() throws Exception {
		super.tearDown();
	}
	
	@Test
	public void testUsuarioCorrecto() {
		Usuario actual=new Usuario("admin","admin");
		assertEquals(u.getNombre()+u.getPass(), actual.getNombre()+actual.getPass());
	}
	
	@Test
	public void testUsuarioIncorrecto() {
		
		assertNotEquals(u.getNombre()+u.getPass(), userFake.getNombre()+userFake.getPass());
	}

	@Test
	public void leerUsuarios() {
		try {
			gu.leerUsuarios();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Usuario obtenido=gu.getListaUsuarios().get(0);
		assertEquals(u.toString(), obtenido.toString());
	}
	
	@Test
	public void testLeerMalUsuarios() {
		guFake.setConexion(null);
		try {
			fail("SQLException");
			gu.leerUsuarios();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testCrearUsuario1() throws Exception {
		Usuario obtenido=new Usuario("admin", "admin");
		assertTrue(u == obtenido);
	}

	
	@Test
	public void testLogin1() throws Exception {
		boolean expected = true;
		boolean obtenido = gu.comprobarUsuarioIntroducido(u);
		assertEquals(expected, obtenido);
	}
	
	
	@Test
	public void testLogin2() throws Exception {
		boolean expected = false;
		boolean obtenido = gu.comprobarUsuarioIntroducido(userFake);
		assertEquals(expected, obtenido);
	}
	

	@Test
	public void testLogin4() throws Exception {
		boolean expected = true;
		boolean obtenido = gu.comprobarUsuarioIntroducido(userFake);
		assertNotEquals(expected, obtenido);
	}
	
	@Test(expected=NullPointerException.class)
	public void testTipo1() throws Exception{
		Usuario u=null;
		fail(u.getNombre());
	}
	
	@Test(expected=NullPointerException.class)
	public void testTipo2() throws Exception{	
		Usuario u=null;
		fail(u.getPass());	
	}
	
	@Test(expected=NullPointerException.class)
	public void testTipo3() throws Exception{	
		Usuario u=null;
		fail(u.toString());
	}
	
	@Test
	public void testTipo4() throws Exception{		
		Usuario u=new Usuario("Blanca", "Suarez");
		String obtenido=u.getPass();
		assertEquals("Suarez", obtenido);
	}
	
	@Test
	public void testTipo5() throws Exception{		
		Usuario u=new Usuario("Blanca", "Suarez");
		String obtenido=u.getNombre();
		assertEquals("Blanca", obtenido);	
	}
	
	@Test
	public void testTipo6() throws Exception{		
		Usuario u=new Usuario("Blanca", "Suarez");
		String obtenido=u.toString();
		assertEquals("Blanca Suarez", obtenido);		
	}
	
	@Test
	public void testComprobarUsuarioIntroducido() {
		gu.comprobarUsuarioIntroducido(u);
	}
	
}
