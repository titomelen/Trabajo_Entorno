package Funciones;

import static org.junit.Assert.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.concurrent.ThreadLocalRandom;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class PruebaFuncion2 {
	
	static Funcion2 f = null;
	static int pruebasEchas = 0;
	
	@BeforeAll
	static void prepararPruebas() {
		System.out.println("Haciendo la prueba");
		f = new Funcion2();
	}
	
	@BeforeEach
	private void preparaPruebaEjecutar(){
		pruebasEchas++;
		System.out.println("Ejecutando test "+ pruebasEchas);
	}
	
	@DisplayName("Carlos Villar")
	@Test
	void funcion2Test2() {
		assertEquals(false, f.numeroIntervalo(200));
	}
	
	@AfterEach
	private void terminadaPrueba(){
		System.out.println("Se hizo el test: "+pruebasEchas);
	}
	
	@AfterAll
	static void terminarPruebas() {
		System.out.println("Terminadas las pruebas.");
		f = null;
	}
}