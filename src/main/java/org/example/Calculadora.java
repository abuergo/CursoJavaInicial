package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Calculadora {
    private static final Logger LOGGER = LogManager.getLogger(Calculadora.class);

    public double sumar(double a, double b){
        LOGGER.info("Suma realizada");
        return a+b;
    }

    public double restar(double a, double b){
        LOGGER.info("Resta realizada");
        return a-b;
    }





}
