package Funciones;



import static org.junit.jupiter.api.Assertions.*;



import java.beans.Transient;



import org.junit.jupiter.api.AfterAll;

import org.junit.jupiter.api.AfterEach;

import org.junit.jupiter.api.BeforeAll;

import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.DisplayName;

import org.junit.jupiter.api.Test;



public class Prueba4 {



    static Funcion4 funcion = null;

    static int pruebasRealizadas = 0;



    @BeforeAll

    static void prepararPruebas() {

        System.out.println("Preparando Tests");

        funcion = new Funcion();

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



    @DisplayName("Test de Caja Negra con cadenas")

    @Test

    void testFuncion4() {

        assertEquals("nrqpl","scdll","rcsrrs", funcion.funcion4("EnriqueRapela", "OscarPadilla", "MarcosTorres"));

    }

