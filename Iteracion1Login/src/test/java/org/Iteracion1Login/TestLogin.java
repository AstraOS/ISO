package org.Iteracion1Login;

import junit.framework.TestCase;

public class TestLogin extends TestCase {
	
	Usuario uEsperado=new Usuario("admin","admin");
	Usuario uIncorrecto=new Usuario("Ester","Exposito");
	GestorUsuarios g=new GestorUsuarios();
	
	public void testUsuarioCorrecto() {
		
	}

}
