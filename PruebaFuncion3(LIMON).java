package Funciones;



import static org.junit.jupiter.api.Assertions.*;



import java.beans.Transient;



import org.junit.jupiter.api.AfterAll;

import org.junit.jupiter.api.AfterEach;

import org.junit.jupiter.api.BeforeAll;

import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.DisplayName;

import org.junit.jupiter.api.Test;



public class Prueba3 {



    static Funcion3 funcion = null;

    static int pruebasRealizadas = 0;



    @BeforeAll

    static void prepararPruebas() {

        System.out.println("Iniciando Pruebas");

        funcion = new Funcion();

    }



    @BeforeEach

    private void preparaPruebaEjecutar() {

        pruebasRealizadas++;

        System.out.println("Pruebas realizandose " + pruebasRealizadas);

    }



    @AfterEach

    private void terminadaPrueba() {

        System.out.println("Pruebas realizadas: " + pruebasRealizadas);

    }



    @AfterAll

    static void terminarPruebas() {

        System.out.println("Final de pruebas");

        funcion = null;

    }
    
    @DisplayName("Test de Caja Negra con un valor-limon")

    @Test

    void testFuncion3() {

        assertEquals(0, funcion.funcion3(26, 36));

    }
