package Funciones;



import static org.junit.jupiter.api.Assertions.*;



import org.junit.jupiter.api.AfterAll;

import org.junit.jupiter.api.AfterEach;

import org.junit.jupiter.api.BeforeAll;

import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.DisplayName;

import org.junit.jupiter.api.Test;



public class PruebaFuncion2 {



    static Funcion2 funcion = null;

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

    @DisplayName("Test de Analisis de valores limites-limon")

    @Test 

    void PruebaFuncion2() {

        assertEquals(true, funcion.funcion2(500));

        assertEquals(false, funcion.funcion2(501));

        assertEquals(true, funcion.funcion2(400));

        assertEquals(false, funcion.funcion2(399));

    }
