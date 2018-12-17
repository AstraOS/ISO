package org.Iteracion0ConectarBD;

import org.junit.After;
import org.junit.Before;
import junit.framework.TestCase;
import org.junit.Test;

public class TestAgente extends TestCase {
	
	private Agente agente;
	
	@Before
	protected void setUp() throws Exception {
		agente=new Agente();
	}
	
	@Test
	public void testSelect1() throws Exception {
		String sql_select = "";
		try {
			agente.Consultar(sql_select);
			fail();
		}catch(Exception e) {
			
		}
	}
	
	@Test
	public void testSelect2() throws Exception {
		String sql_select = null;
		try {
			agente.Consultar(sql_select);
			fail();
		} catch(Exception e) {
			
		}
	}
	

	@Test
	public void testSelect3() throws Exception {
		String sql_select = "Dame los datos";
		try {
			agente.Consultar(sql_select);
			fail();
		} catch(Exception e) {
			
		}
	}
	

	@Test
	public void testConectarbd() throws Exception {
		
		try {
			agente.conectar();
		} catch(Exception e) {
			
		}
	}
	

	
	@Test
	public void testDesconectarbd() throws Exception {
		
		try {
			agente.cerrarConexion();
		} catch(Exception e) {
			
		}
	}
	

	@After
	protected void tearDown() throws Exception {
		super.tearDown();
	}
	
}
