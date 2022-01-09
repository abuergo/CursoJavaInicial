package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import static org.junit.Assert.*;


public class CalculadoraTest {
    private static final Logger LOGGER = LogManager.getLogger(CalculadoraTest.class);

    @Test
    public void probarSuma(){
        Calculadora calc = new Calculadora();

        LOGGER.info("Se ejecutaron los test de la funcion sumar");
        assertEquals(10, calc.sumar(5,5), 0.001);
        assertEquals(4, calc.sumar(2,2), 0.001);
    }


    @Test
    public void probarResta(){
        Calculadora calc = new Calculadora();

        LOGGER.info("Se ejecutaron los test de la funcion restar");
        assertEquals(5, calc.restar(10,5), 0.001);
        assertEquals(10,calc.restar(20,10), 0.1);
    }



}
