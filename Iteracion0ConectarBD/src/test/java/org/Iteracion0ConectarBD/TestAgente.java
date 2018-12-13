package org.Iteracion0ConectarBD;

import java.sql.SQLException;

import junit.framework.TestCase;

public class TestAgente extends TestCase {
	
	private Agente agente=new Agente();
	
	/**
	 * Test que devuelve verdadero si hay un error de sintaxis de sentencia SQL
	 * 
	 * @throws Exception
	 *             Control de errores
	 */
	public void testSelect1() throws Exception {
		String sql_select = "";
		try {
			agente.Consultar(sql_select);
			fail();
		}catch(Exception e) {
			
		}
	}
	
	/**
	 * Test que de devuelve verdadero si hay SQLException con una sentencia SQL null
	 * 
	 * @throws Exception
	 *             Control de errores
	 */
	public void testSelect2() throws Exception {
		String sql_select = null;
		try {
			agente.Consultar(sql_select);
			fail();
		} catch(Exception e) {
			
		}
	}
	
	/**
	 * Test que devuelve verdadero si hay un error de sintaxis de sentencia SQL
	 * 
	 * @throws Exception
	 *             Control de errores
	 */
	public void testSelect3() throws Exception {
		String sql_select = "Dame los datos";
		try {
			agente.Consultar(sql_select);
			fail();
		} catch(Exception e) {
			
		}
	}
	
	/**
	 * Test para comprobar la conexion con la bd
	 * 
	 * @throws Exception
	 *             Control de errores
	 */
	
	public void testConectarbd() throws Exception {
		
		try {
			agente.conectar();
		} catch(Exception e) {
			
		}
	}
	
	/**
	 * Test para comprobar la desconexion con la bd
	 * 
	 * @throws Exception
	 *             Control de errores
	 */
	
	
	public void testDesconectarbd() throws Exception {
		
		try {
			agente.cerrarConexion();
		} catch(Exception e) {
			
		}
	}


}
