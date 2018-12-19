package org.Iteracion2GestionarSala;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;

import junit.framework.TestCase;

import org.junit.*;

public class TestGestionarSala extends TestCase {
	ArrayList<Mesa> listaMesas;
	Mesa mesa;
	Mesa mesaFake;
	GestorSala gs;
	GestorSala gsFake;
	CamareroMesa cam;;
	JefeSala js;
	CamareroMesa camFake;
	JefeSala jsFake;
	TurnoComida t1c;
	TurnoComida t2c;
	TurnoComida t3c;
	TurnoCena t1cc;
	TurnoCena t2cc;
	TurnoCena t3cc;
	Turno tFake;
	
	@Before
	protected void setUp() throws Exception {
		listaMesas = new ArrayList<Mesa>();
		mesa = new Mesa(1);
		mesaFake = null;
		gs = new GestorSala();
		gsFake=null;
		cam = new CamareroMesa(1, "Gabi", "Mañana", "66592161");
		js=new JefeSala(0, "AndreaDuro", "Noche", 2);
		camFake=null;
		jsFake=null;
		t1c=new TurnoComida(0,false);
		t2c=new TurnoComida(1,false);
		t3c=new TurnoComida(2,false);
		t1cc=new TurnoCena(3,false);
		t2cc=new TurnoCena(4,false);
		t3cc=new TurnoCena(5,false);
		tFake=null;
	}

	@After
	protected void tearDown() throws Exception {
		super.tearDown();
	}

	@Test
	public void testAsignarCamareroCorrecto() {
		assertEquals("11", gs.asignarCamarero(mesa, cam));
	}

	@Test
	public void testCamarero1() {
		assertEquals(1, cam.getId());
	}

	@Test
	public void testCamarero2() {
		assertEquals("Gabi", cam.getNombre());
	}

	@Test
	public void testCamarero3() {
		assertEquals("Mañana", cam.getTurno());
	}

	@Test
	public void testCamarero4() {
		assertEquals("66592161", cam.getTelefono());
	}
	
	@Test(expected=NullPointerException.class)
	public void testCamarero5() {
		try {
			camFake.getId();
			fail("NullPointer");
		} catch(Exception NullPointer) {
			
		}
	}
	
	@Test(expected=NullPointerException.class)
	public void testCamarero6() {
		try {
			camFake.getNombre();
			fail("NullPointer");
		} catch(Exception NullPointer) {
			
		}
	}
	
	@Test(expected=NullPointerException.class)
	public void testCamarero7() {
		try {
			camFake.getTelefono();
			fail("NullPointer");
		} catch(Exception NullPointer) {
			
		}
	}
	
	@Test(expected=NullPointerException.class)
	public void testCamarero8() {
		try {
			camFake.getTurno();
			fail("NullPointer");
		} catch(Exception NullPointer) {
			
		}
	}
	
	@Test
	public void testGestorSala() {
		assertNotNull(gs.getListaMesas());
	}
	
	@Test
	public void GestorSala1() {
		assertNotSame(listaMesas, gs.getListaMesas());
	}
	
	@Test
	public void GestorSala2() {
		try {
			gs.leerMesas();
		}catch(Exception SQLException) {
			
		}
	}
	
	@Test(expected=NullPointerException.class)
	public void GestorSala3() {
		
		try {
			gsFake.leerMesas();
			fail("NullPointerException");
		} catch (Exception NullPointer){
			
		}
	}

	@Test
	public void testJS1() {
		assertEquals(0, js.getId());
	}

	@Test
	public void testJS2() {
		assertEquals("AndreaDuro", js.getNombre());
	}

	@Test
	public void testJS3() {
		assertEquals("Noche", js.getTurno());
	}

	@Test
	public void testJS4() {
		assertEquals(2, js.getTelefono());
	}
	
	@Test(expected=NullPointerException.class)
	public void testJS5() {
		try {
			jsFake.getId();
			fail("NullPointer");
		} catch(Exception NullPointer) {
			
		}
	}
	
	@Test(expected=NullPointerException.class)
	public void testJS6() {
		try {
			jsFake.getNombre();
			fail("NullPointer");
		} catch(Exception NullPointer) {
			
		}
	}
	
	@Test(expected=NullPointerException.class)
	public void testJS7() {
		try {
			jsFake.getTelefono();
			fail("NullPointer");
		} catch(Exception NullPointer) {
			
		}
	}
	
	@Test(expected=NullPointerException.class)
	public void testJS8() {
		try {
			jsFake.getTurno();
			fail("NullPointer");
		} catch(Exception NullPointer) {
			
		}
	}
	
	@Test
	public void testMesa1() {
		assertEquals(1, mesa.getId());
	}
	
	@Test
	public void testMesa2() {
		assertNotNull(mesa.getTurnos());
	}
	
	@Test
	public void testMesa3() {
		assertEquals("MESA 1", mesa.toString());
	}
	
	@Test(expected=NullPointerException.class)
	public void testMesa4() {
		try {
			mesaFake.getId();
			fail("NullPointer");
		} catch(Exception NullPointer) {
			
		}
	}
	
	@Test(expected=NullPointerException.class)
	public void testMesa5() {
		try {
			mesaFake.getTurnos();
			fail("NullPointer");
		} catch(Exception NullPointer) {
			
		}
	}
	
	@Test(expected=NullPointerException.class)
	public void testMesa6() {
		try {
			mesaFake.toString();
			fail("NullPointer");
		} catch(Exception NullPointer) {
			
		}
	}
	
	@Test
	public void testTurno1() {
		assertEquals(0, t1c.getId());
	}
	
	@Test
	public void testTurno2() {
		assertEquals("Libre", t1c.getEstado());
		
	}
	
	@Test(expected=NullPointerException.class)
	public void testTurno3() {
		try {
			tFake.getId();
			fail("NullPointer");
		} catch(Exception NullPointer) {
			
		}
	}
	
	@Test(expected=NullPointerException.class)
	public void testTurno4() {
		try {
			tFake.getEstado();
			fail("NullPointer");
		} catch(Exception NullPointer) {
			
		}
	}
	
	@Test
	public void testTurno5() {
		ArrayList<Turno> turnos=new ArrayList<Turno>();
		turnos.add(t1c);
		turnos.add(t2c);
		turnos.add(t3c);
		turnos.add(t1cc);
		turnos.add(t2cc);
		turnos.add(t3cc);
		assertEquals(mesa.getTurnos().toString(), turnos.toString());
	}
}
