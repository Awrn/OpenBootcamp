package com.alvarowagner;
import java.math.BigDecimal;

public class BigDecimalEx {

    public static void main(String[] args) {

        float num1 = 0.0023131111231f;
        float num2 = 0.0013212311313f;
        float resultado2 =num1 + num2;

        BigDecimal valorA = new BigDecimal(3.14);
        BigDecimal valorB = new BigDecimal(3.15);
        BigDecimal resultado = valorA.add(valorB);

        System.out.println(resultado);

        System.out.println(resultado2);

    }
}
