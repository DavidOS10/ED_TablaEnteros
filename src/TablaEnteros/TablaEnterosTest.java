package TablaEnteros;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;



import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TablaEnterosTest {

	TablaEnteros tabla;
	Integer [] numeros = new Integer[5];
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		numeros[0] = 1;
		numeros[1] = 2;
		numeros[2] = 3;
		numeros[3] = 4;
		numeros[4] = 5;
		tabla = new TablaEnteros(numeros);
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testTablaEnterosNull() {
		Integer [] arrayVacio = new Integer [0];
		assertThrows(IllegalArgumentException.class,() ->new TablaEnteros(arrayVacio));
	}
	
	@Test
	void testTablaEnteros() {
		assertEquals(numeros, new TablaEnteros(numeros));
	}
	@Test
	void testSumaTabla() {
		int suma = 15;
		assertEquals(suma, tabla.sumaTabla());
	}
	@Test
	void testMayorTabla1() {
		int max = -999;
		Integer [] numeros2 = new Integer[3];
		numeros2[0] = -4000;
		numeros2[1] = -5000;
		numeros2[2] = -6000;
		
		TablaEnteros tabla2 = new TablaEnteros(numeros2);
		assertEquals(max, tabla2.mayorTabla());
	}
	@Test
	void testMayorTabla2() {
		
	}

	@Test
	void testPosicionTabla1() {
		
	}
	@Test
	void testPosicionTablaNull() {
		
	}

}