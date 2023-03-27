package com.ada.calculadora;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {

    @Test
    public void deveSomarCorretamente() {
        //Given
        Calculadora calculadora = new Calculadora ();

        //When
        int a = 1;
        int b = 6;
        int resultado = calculadora.somar(a,b);

        //Then
        Assertions.assertEquals(7, resultado);
    }

    @Test
    public void deveSubtrairCorretamente() {
        //Given
        Calculadora calculadora = new Calculadora ();

        //When
        int a =20;
        int b = 10;
        int resultado = calculadora.subtrair(a,b);

        //Then
        Assertions.assertEquals(10, resultado);
    }

    @Test
    public void deveMultiplicarCorretamente() {
        //Given
        Calculadora calculadora = new Calculadora ();

        //When
        Integer a = 2;
        Integer b = 2;
        Integer resultado = calculadora.multiplicar(a,b);

        //Then
        Assertions.assertEquals(4, resultado);
    }

    @Test
    public void deveDividirCorretamente() {
        //Given
        Calculadora calculadora = new Calculadora ();

        //When
        Double a = 4.0;
        Double b = 2.0;
        Double resultado = calculadora.dividir(a,b);

        //Then
        Assertions.assertEquals(2.0, resultado);
    }

}
