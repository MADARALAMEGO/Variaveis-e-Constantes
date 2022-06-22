package com.company.numeros;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.ParseException;

public class TesteNumeros {
    public static void main(String[] args) {
        DecimalFormat formatador = new DecimalFormat("RS #,##0.00");
          double valorProduto = 13.5;
          System.out.println(valorProduto);
          System.out.println(formatador.format(valorProduto));

          String entrada = "R$ 50,34";
        try {
            double numero = formatador.parse(entrada).doubleValue();
            System.out.println("Numero: " + numero);
        } catch (ParseException e) {
            System.out.println("ENTRADA INVÁLIDA");
        }

        BigDecimal bg = new BigDecimal("685969293578423951500");
        bg = bg.divide(BigDecimal.TEN);
        System.out.println(bg);
    }
}
