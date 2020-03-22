import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PruebaFuncion6(Javier) {

    static Funcion6 funcion = null;
    static int pruebasRealizadas = 0;

    @BeforeAll
    static void prepararPruebas() {
        System.out.println("Preparando Tests");
        funcion = new Funcion6();
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
    
    @DisplayName ("Prueba de caja negra incorrecta")

    @Test

     void pruebaFuncion6(){
        ArrayList<Double> numeros = new ArrayList <Double> ();
        numeros.add(4);
        numeros.add(2);
        ArrayList<Double> resultado = new ArrayList <Double> ();
        resultado.add(4);
        resultado.add(2);

        assertEquals(resultado ,funcion.funcion6 (numeros));
     }

}