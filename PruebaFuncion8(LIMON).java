package Funciones;



import static org.junit.jupiter.api.Assertions.*;



import org.junit.jupiter.api.AfterAll;

import org.junit.jupiter.api.AfterEach;

import org.junit.jupiter.api.BeforeAll;

import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.DisplayName;

import org.junit.jupiter.api.Test;



public class Prueba8 {



    static Funciones funcion = null;

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
    
    @DisplayName("Test de Caja Negra con array-limon")

    @Test

    void testFuncion8() {

        assertEquals(true,

                funcion.funcion8({{50,150,100},{250,250,100},{60,110,80},{150,50,200}}, ("Marcos","Oscar","Enrique","Esperanza"));

    }