package Funciones;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PruebaFuncion1 {

    static Funcion1 funcion = null;
    static int pruebasRealizadas = 0;

    @BeforeAll
    static void prepararPruebas() {
        System.out.println("Preparando las pruebas de las funciones");
        funcion = new Funcion1();
    }

    @BeforeEach
    private void preparaPruebaEjecutar() {
        pruebasRealizadas++;
        System.out.println("Ejecutandolo " + pruebasRealizadas);
    }

    @AfterEach
    private void terminadaPrueba() {
        System.out.println("Se ejecutó: " + pruebasRealizadas);
    }

    @AfterAll
    static void terminarPruebas() {
        System.out.println("Se termino de ejecutar todo ");
        funcion = null;
    }
    @DisplayName("Test de Caja Negra aleatorio (Carlos Villar)")
    @Test
    void testFuncion1() {
    	assertEquals(false, Funcion1.funcion1((int)(Math.random() * 10)));
    }
}