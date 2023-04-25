package com.example.parcial_2;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {

    @Test
    public void suma() {
        //Calculadora cal = new Calculadora();
        int resultado = Calculadora.sumar(4,4);
        assertEquals(8, resultado, 0.0);
    }

    @Test
    public void resta() {
        //Calculadora cal = new Calculadora();
        int resultado = Calculadora.resta(4,4);
        assertEquals(0, resultado, 0.0);
    }
}