import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PruebaFuncion8Test(Javier) {

    static Funcion8 funcion = null;
    static int pruebasRealizadas = 0;

    @BeforeAll
    static void prepararPruebas() {
        System.out.println("Preparando Tests");
        funcion = new Funcion8();
    }

    @BeforeEach
    private void preparaPruebaEjecutar() {
        pruebasRealizadas++;
        System.out.println("Ejecutando test " + pruebasRealizadas);
    }

    @AfterEach
    private void terminadaPrueba() {
        System.out.println("Se ha ejecutado el test: " + pruebasRealizadas);
    }

    @AfterAll
    static void terminarPruebas() {
        System.out.println("Se ha terminado de ejecutar todas las pruebas");
        funcion = null;
    }
    
    @DisplayName ("Prueba de caja negra correcta: ")
	@Test
	void pruebaFuncion8(){

		ArrayList <String> alumnos = new ArrayList <String> ();
		alumnos.add("alberto");
		alumnos.add("alfonso");
		alumnos.add("maria");

		int [][] tiempos = {{500,500,500}, {100,100,100}, {500,500,500}};

		assertEquals(true, funcion.funcion8 (tiempos, alumnos));
	}

}