package Funciones;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class PruebaFuncion5 {
	static int contpruebas = 0;
    static Funcion5 func = null;

    @BeforeAll
    static void prepararPruebas() {
        System.out.println("Empezamos las Pruebas.");
        func = new Funcion5();
    }
	@Test
	@DisplayName("Prueba de caja negra para verificar que funciona correctamente")
	void test() {
		int [] res= {27,7,2001};
		assertEquals(2035,func.Funcion5(res));
	}

}
