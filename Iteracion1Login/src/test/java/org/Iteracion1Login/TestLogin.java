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

	
	@Before
	protected void setUp() throws Exception {
		u=new Usuario("admin","admin");
		gu=new GestorUsuarios();
		guFake=new GestorUsuarios();
		
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
		Usuario actual=new Usuario("Ester", "Exposito");
		assertNotEquals(u.getNombre()+u.getPass(), actual.getNombre()+actual.getPass());
	}
	
	@Test
	public void testLeerUsuariosbd() {
		try {
			gu.leerUsuarios();
		} catch (SQLException e) {
			e.printStackTrace();
		}
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
	public void testComprobarUsuarioIntroducido() {
		gu.comprobarUsuarioIntroducido(u);
	}

	

}
