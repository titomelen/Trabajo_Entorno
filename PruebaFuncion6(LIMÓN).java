package Funciones;



import static org.junit.jupiter.api.Assertions.*;



import org.junit.jupiter.api.AfterAll;

import org.junit.jupiter.api.AfterEach;

import org.junit.jupiter.api.BeforeAll;

import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.DisplayName;

import org.junit.jupiter.api.Test;



public class Prueba6 {



    static Funcion6 funcion = null;

    static int pruebasRealizadas = 0;



    @BeforeAll

    static void prepararPruebas() {

        System.out.println("Iniciando Pruebas");

        funcion = new Funcion();

    }



    @BeforeEach

    private void preparaPruebaEjecutar() {

        pruebasRealizadas++;

        System.out.println("Pruebas realizandose  " + pruebasRealizadas);

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


    @DisplayName("Test de Caja Negra con cadena-limon")

    @Test

    void testFuncion6() {

        assertArrayEquals({6, 72, 12, 1}, funcion.funcion6({1, 2, 2, 1}));

    }

